package com.example.pro;

public class Bishop extends Piece{
    public Bishop(int x, int y, boolean black) {
        super(x, y, black);
        if(getBlack()){
            setSprite(App.BLACK_BISHOP);
        }
        else{
            setSprite(App.WHITE_BISHOP);
        }
    }
    public boolean isValid(int x, int y, boolean black) {
        boolean move = false;
        Piece töten = SchachController.board[x][y];
        if (SchachController.board[x][y] != null) {
            for (int i = 0; i < SchachController.board.length; i++) {
                if(töten.getBlack()&&!getBlack()||!töten.getBlack()&&getBlack()) {
                    if(x == getX()+i && y == getY()+i){
                        for(int j = 1; j < i; j++) {
                            if (SchachController.board[getX() + j][getY() + j] == null) {
                                if (j == i - 1) {
                                    move = (x == getX() + i && y == getY() + i);
                                    return move;
                                }
                            } else {
                                return move;
                            }
                        }
                        if(x == getX()+1 && y == getY()+1){
                            move = (x == getX()+1 && y == getY()+1);
                        }
                    }
                    if(x == getX()+i && y == getY()-i){
                        for(int j = 1; j < i; j++) {
                            if(SchachController.board[getX()+j][getY()-j] == null) {
                                if (j == i-1) {
                                    move = (x == getX() + i && y == getY()-i);
                                    return move;
                                }
                            }
                            else{
                                return move;
                            }
                        }
                        if(x == getX()+1 && y == getY()-1){
                            move = (x == getX()+1 && y == getY()-1);
                        }
                    }
                    if(x == getX()-i && y == getY()+i) {
                        for (int j = 1; j < i; j++) {
                            if (SchachController.board[getX() - j][getY() + j] == null) {
                                if (j == i - 1) {
                                    move = (x == getX() - i && y == getY() + i);
                                    return move;
                                }
                            } else {
                                return move;
                            }
                        }
                        if(x == getX()-1 && y == getY()+1){
                            move = (x == getX()-1 && y == getY()+1);
                        }
                    }
                    if(x == getX()-i && y == getY()-i) {
                        for (int j = 1; j < i; j++) {
                            if (SchachController.board[getX() - j][getY() - j] == null){
                                if (j == i - 1) {
                                    move = (x == getX() - i && y == getY() - i);
                                    return move;
                                }
                            } else {
                                return move;
                            }
                        }
                        if(x == getX()-1 && y == getY()-1){
                            move = (x == getX()-1 && y == getY()-1);
                        }
                    }
                }
                else{
                    return move;
                }
            }
        }
        else{
            for (int i = 0; i < 7; i++) {
                if (x == getX() + i && y == getY()+i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()+j][getY()+j] == null) {
                            if (j == i) {
                                move = (x == getX() + i && y == getY()+i);
                                return move;
                            }
                        }
                        else {
                            return move;
                        }
                    }
                }
                if (x == getX() + i && y == getY()-i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()+j][getY()-j] == null) {
                            if (j == i) {
                                move = (x == getX() + i && y == getY()-i);
                                return move;
                            }
                        }
                        else {
                            return move;
                        }
                    }
                }
                if (x == getX() - i && y == getY()+i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()-j][getY()+j] == null) {
                            if (j == i) {
                                move = (x == getX() - i && y == getY()+i);
                                return move;
                            }
                        }
                        else {
                            return move;
                        }
                    }
                }
                if (x == getX() - i && y == getY()-i) {
                    for(int j = 1; j <= i; j++) {
                        if(SchachController.board[getX()-j][getY()-j] == null) {
                            if (j == i) {
                                move = (x == getX() - i && y == getY()-i);
                                return move;
                            }
                        }
                        else {
                            return move;
                        }
                    }
                }
            }
        }
        return move;
    }
}
