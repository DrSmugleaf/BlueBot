package com.github.drsmugleaf.tak.bot;

import com.github.drsmugleaf.tak.Game;
import com.github.drsmugleaf.tak.board.*;
import com.github.drsmugleaf.tak.pieces.Color;
import com.github.drsmugleaf.tak.pieces.Piece;
import com.github.drsmugleaf.tak.pieces.Type;
import com.github.drsmugleaf.tak.player.Player;
import com.github.drsmugleaf.tak.player.PlayerInformation;
import javafx.util.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by DrSmugleaf on 26/12/2018
 */
public class MinimaxFlatBot extends Player {

    public MinimaxFlatBot(@NotNull String name, @NotNull Game game, @NotNull Color color, @NotNull Preset preset) {
        super(name, game, color, preset);
    }

    @NotNull
    public static Player from(@NotNull PlayerInformation information) {
        return new MinimaxFlatBot(information.NAME, information.GAME, information.COLOR, information.PRESET);
    }

    @Override
    public void nextTurn() {
        Coordinates bestCoordinates = getBestCoordinates(getGame().getBoard(), Integer.MIN_VALUE, Integer.MAX_VALUE, 2);
        if (!getHand().has(Type.FLAT_STONE) || bestCoordinates == null) {
            surrender();
            return;
        }

        bestCoordinates.place(this, Type.FLAT_STONE);
    }

    @Nullable
    private Coordinates getBestCoordinates(@NotNull Board board, int alpha, int beta, int depth) {
        return getMax(board, getGame().getNextPlayer().getHand().getColor(), alpha, beta, depth).getKey();
    }

    private boolean isTerminal(@NotNull Board board) {
        return board.hasRoad() != null;
    }

    private int getScore(@NotNull Board board) {
        Color winner = board.hasRoad();
        if (winner != null) {
            if (winner == getHand().getColor()) {
                return Integer.MAX_VALUE;
            } else if (winner == getHand().getColor().getOpposite()) {
                return Integer.MIN_VALUE;
            } else {
                throw new IllegalArgumentException("Unrecognized color: " + winner);
            }
        }

        int score = 0;

        for (Row row : board.getRows()) {
            for (Square square : row.getSquares()) {
                Piece topPiece = square.getTopPiece();
                if (topPiece == null) {
                    continue;
                }

                Color topColor = topPiece.getColor();
                if (topColor == getHand().getColor()) {
                    score++;
                } else if (topColor == getHand().getColor().getOpposite()) {
                    score--;
                } else {
                    throw new IllegalArgumentException("Unrecognized piece color: " + topColor);
                }
            }
        }

        score += board.countAdjacent(getHand().getColor());
        score -= board.countAdjacent(getHand().getColor().getOpposite());

        return score;
    }

    @NotNull
    private Pair<Coordinates, Integer> getMax(@NotNull Board board, @NotNull Color nextPlayer, int alpha, int beta, int depth) {
        depth--;
        Coordinates bestMove = null;
        int score = 0;

        for (Coordinates coordinates : getAvailableFlatMoves(board)) {
            Board copy = board.copy();
            Piece piece = new Piece(nextPlayer, Type.FLAT_STONE);
            copy.place(piece, coordinates.getRow(), coordinates.getColumn());

            if (depth >= 1 && !isTerminal(copy)) {
                score = getMax(copy, nextPlayer.getOpposite(), alpha, beta, depth).getValue();
            } else {
                score = getScore(copy);
            }

            if (nextPlayer == getHand().getColor()) {
                if (score > alpha) {
                    alpha = score;
                    bestMove = coordinates;
                }
            } else if (nextPlayer.getOpposite() == getHand().getColor()) {
                if (score < beta) {
                    beta = score;
                    bestMove = coordinates;
                }
            } else {
                throw new IllegalArgumentException("Unrecognized color: " + nextPlayer);
            }

            if (alpha >= beta) {
                break;
            }
        }

        return new Pair<>(bestMove, score);
    }

}