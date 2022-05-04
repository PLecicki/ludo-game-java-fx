package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.ImageView;

public interface allPawnsColors {

    ImageView setImage();
    void setActualPosition(int x, int y);
    PawnPosition getActualPosition();
}
