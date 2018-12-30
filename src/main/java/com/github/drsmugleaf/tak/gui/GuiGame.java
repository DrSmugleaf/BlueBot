package com.github.drsmugleaf.tak.gui;

import com.github.drsmugleaf.tak.Game;
import com.github.drsmugleaf.tak.board.Preset;
import com.github.drsmugleaf.tak.board.Square;
import com.github.drsmugleaf.tak.pieces.Type;
import com.github.drsmugleaf.tak.player.Player;
import com.github.drsmugleaf.tak.player.PlayerInformation;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.function.Function;

/**
 * Created by DrSmugleaf on 25/12/2018
 */
public class GuiGame extends Game {

    @NotNull
    private final BoardPanel BOARD_PANEL;

    @NotNull
    private final JFrame FRAME;

    public GuiGame(@NotNull Preset preset, @NotNull String playerName1, @NotNull String playerName2, @NotNull Function<PlayerInformation, Player> playerMaker1, @NotNull Function<PlayerInformation, Player> playerMaker2) {
        super(preset, playerName1, playerName2, playerMaker1, playerMaker2);
        BOARD_PANEL = new BoardPanel(preset);
        FRAME = setupFrame();
    }

    @NotNull
    private JFrame setupFrame() {
        JFrame frame = new JFrame("Tak");

        SwingUtilities.invokeLater(() -> {
            frame.add(BOARD_PANEL.gui);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.setLocationByPlatform(true);

            frame.pack();

            frame.setMinimumSize(frame.getSize());
            frame.setVisible(true);

            start();
        });

        return frame;
    }

    @NotNull
    @Override
    public Square place(@NotNull Player player, @NotNull Type type, int row, int column) {
        Square square = super.place(player, type, row, column);
        BOARD_PANEL.pieces[row][column].update(square);
        return square;
    }

}