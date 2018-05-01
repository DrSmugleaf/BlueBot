package com.github.drsmugleaf.blackjack;

import com.github.drsmugleaf.blackjack.decks.Cards;
import com.github.drsmugleaf.blackjack.decks.Suits;

import javax.annotation.Nonnull;

/**
 * Created by DrSmugleaf on 01/05/2018.
 */
public class Card {

    final Cards CARD;
    final Suits SUIT;

    Card(@Nonnull Cards card, @Nonnull Suits suit) {
        CARD = card;
        SUIT = suit;
    }

}