package com.example.pro;

public class Rook extends Piece {
    public Rook(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_ROOK);
        }
        else{
            setSprite(App.WHITE_ROOK);
        }
    }

    public boolean isValid(int x, int y, boolean black) {
        boolean move = false;
        if (SchachController.board[x][y] != null) {
            Piece Töten = SchachController.board[x][y];
            for(int i = 0; i < SchachController.board.length; i++) {
                if (Töten.getBlack() && !black || !Töten.getBlack() && black) {
                    if (x == getX()+i && y == getY()) {
                        for(int j = 1; j < i; j++) {
                            if(SchachController.board[getX()+j][getY()] == null) {
                                if (j == i-1) {
                                    move = (x == getX() + i && y == getY());
                                    return move;
                                }
                            }
                            else{
                                return move;
                            }
                        }
                        if(x == getX()+1 && y == getY()){
                            move = (x == getX()+1 && y == getY());
                        }
                    }
                    if (x == getX() - i && y == getY()) {
                        for(int j = 1; j < i; j++) {
                            if(SchachController.board[getX()-j][getY()] == null) {
                                if (j == i-1) {
                                    move = (x == getX() - i && y == getY());
                                    return move;
                                }
                            }
                            else{
                                return move;
                            }
                        }
                        if(x == getX()-1 && y == getY()){
                            move = (x == getX()-1 && y == getY());
                        }
                    }
                    if (x == getX() && y == getY() + i) {
                        for(int j = 1; j < i; j++) {
                            if(SchachController.board[getX()][getY()+j] == null) {
                                if (j == i-1) {
                                    move = (x == getX() && y == getY() + i);
                                    return move;
                                }
                            }
                            else{
                                return move;
                            }
                        }
                        if(x == getX() && y == getY()+1){
                            move = (x == getX() && y == getY()+1);
                        }
                    }
                    if (x == getX() && y == getY() - i) {
                        for(int j = 1; j < i; j++) {
                            if(SchachController.board[getX()][getY()-j] == null) {
                                if (j == i-1) {
                                    move = (x == getX() && y == getY() - i);
                                    return move;
                                }
                            }
                            else{
                                return move;
                            }
                        }
                        if(x == getX() && y == getY()-1){
                            move = (x == getX() && y == getY()-1);
                        }
                    }
                } else {
                    return move;
                }
            }


        } else {
            for(int i = 0; i < SchachController.board.length; i++) {
                if (x == getX() + i && y == getY()) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()+j][getY()] == null) {
                            if (j == i) {
                                move = (x == getX() + i && y == getY());
                                return move;
                            }
                        }
                        else {
                            return move;
                        }
                    }
                }
                if (x == getX() - i && y == getY()) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()-j][getY()] == null) {
                            if (j == i) {
                                move = (x == getX()-i && y == getY());
                                return move;
                            }
                        }
                        else{
                            return move;
                        }
                    }
                }
                if (x == getX() && y == getY() + i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()][getY()+j] == null) {
                            if (j == i) {
                                move = (x == getX() && y == getY()+i);
                                return move;
                            }
                        }
                        else{
                            return move;
                        }
                    }
                }
                if (x == getX() && y == getY() - i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()][getY()-j] == null) {
                            if (j == i) {
                                move = (x == getX() && y == getY()-i);
                                return move;
                            }
                        }
                        else{
                            return move;
                        }
                    }
                }
            }
        }
        return move;
    }
}
