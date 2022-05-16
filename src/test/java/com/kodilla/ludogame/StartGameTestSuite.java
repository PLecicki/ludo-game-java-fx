package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StartGameTestSuite {

    private Red[] redP;
    private Green[] greenP;
    private Yellow[] yellowP;
    private Blue[] blueP;

    @DisplayName("When red pawns are at start's positions" +
    "then they should be unmovable when dice status doesn't" +
    "equal six")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusDoesntEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        throwDice.setDiceIndex(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        throwDice.setDiceIndex(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        throwDice.setDiceIndex(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        throwDice.setDiceIndex(5);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        throwDice.setDiceIndex(6);
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
    }

    @DisplayName("When green pawns are at start's positions" +
            "then they should be unmovable when dice status doesn't" +
            "equal six")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusDoesntEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        throwDice.setDiceIndex(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        throwDice.setDiceIndex(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        throwDice.setDiceIndex(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        throwDice.setDiceIndex(5);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        throwDice.setDiceIndex(6);
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            "then they should be unmovable when dice status doesn't" +
            "equal six")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusDoesntEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        throwDice.setDiceIndex(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        throwDice.setDiceIndex(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        throwDice.setDiceIndex(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        throwDice.setDiceIndex(5);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        throwDice.setDiceIndex(6);
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
    }

    @DisplayName("When blue pawns are at start's positions" +
            "then they should be unmovable when dice status doesn't" +
            "equal six")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusDoesntEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
        throwDice.setDiceIndex(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
        throwDice.setDiceIndex(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
        throwDice.setDiceIndex(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
        throwDice.setDiceIndex(5);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
        throwDice.setDiceIndex(6);
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
    }

    @DisplayName("Pawns should be movable in correct order" +
            "and should be unmovable when other player/computer" +
            "moving")
    @Test
    void pawnsShouldBeUnmovableWhenIsOthersPlayerTurn() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        for (int i=0; i<=3; i++) {
            onClickPawn.setWhoseTurn(1);
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(2);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(3);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(4);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
        }
    }

    @DisplayName("Pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void pawnsShouldBeUnmovableBeforeClickingDiceButton() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(false);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        onClickPawn.setWhoseTurn(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        onClickPawn.setWhoseTurn(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        onClickPawn.setWhoseTurn(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
    }

    void fillingTablesWithPawnsAtStartPositions() {
        Red[] reds = {new Red(), new Red(), new Red(), new Red()};
        Green[] greens = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellows = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blues = {new Blue(), new Blue(), new Blue(), new Blue()};

        redP = reds;
        greenP = greens;
        yellowP = yellows;
        blueP = blues;

        for (int i = 0; i <= 3; i++) {
            redP[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redP[i].setActualPositionIndex(i);

            greenP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenP[i].setActualPositionIndex(i + 4);

            yellowP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowP[i].setActualPositionIndex(i + 8);

            blueP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            blueP[i].setActualPositionIndex(i + 12);
        }
    }
}