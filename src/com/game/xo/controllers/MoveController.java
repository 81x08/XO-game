package com.game.xo.controllers;

import com.game.xo.model.Field;
import com.game.xo.model.Figure;
import com.game.xo.model.exception.AlreadyOccupiedException;
import com.game.xo.model.exception.InvalidPointException;

import java.awt.Point;

public class MoveController {

    public void applyFigure(Field field, Point point, Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);
    }
}
