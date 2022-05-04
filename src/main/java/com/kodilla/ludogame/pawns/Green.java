package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Green implements allPawnsColors {

    private Image imageGreenPawn = new Image("file:src/main/resources/pawns/green-pawn.png");
    private PawnPosition actualPosition;

    public ImageView setImage() {
        ImageView greenPawn = new ImageView(imageGreenPawn);
        greenPawn.setFitHeight(40);
        greenPawn.setFitWidth(40);
        return greenPawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int x, int y) {
        this.actualPosition = new PawnPosition(x, y);
    }
}
