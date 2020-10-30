package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

public class Game2048 extends Game {

    int xSize = 4;
    int ySize = 4;

    public void createRandomCell() {
        int x;
        int y;
        do {
            x = getRandomNumber(0, xSize);
            y = getRandomNumber(0, ySize);
        }
        while (getCellValue(x, y) != "");
//        setCellValueEx(x, y, Color.AQUA, "2", Color.BLACK);
        updateCell(x, y, 2);
    }

    public void updateCell(int x, int y, int value) {
        setCellValue(x, y, Integer.toString(value));
        Color color = null;
        switch (value) {
            case 2:
                color = Color.GRAY;
                break;
            case 4:
                color = Color.LIGHTYELLOW;
                break;
            case 8:
                color = Color.YELLOW;
                break;
            case 16: color = Color.ORANGE;
            break;
            default: color = Color.BLUE;
        }
        setCellColor(x, y, color);
        setCellTextColor(x,y, Color.BLACK);
    }

    public void resetCell(int x, int y){
        setCellValue(x, y, "");
        setCellColor(x, y, Color.BLACK);
    }

    public int getCellIntValue(int x, int y){
        return Integer.parseInt(getCellValue(x, y));
    }

    @Override
    public void initialize() {
        setScreenSize(xSize, ySize);
        showGrid(true);
        // setCellValueEx(1, 1, Color.AQUA, "2", Color.BLACK);
        createRandomCell();
        createRandomCell();

    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case UP:
                String cellValue1 = null;
                int cellX = 0;
                int cellY = 0;
                for (int x = 0; x < xSize; x++) {
                    for (int y = 0; y < ySize; y++) {
                        if (getCellValue(x, y).equals("")) continue;
                        if (cellValue1 == null) {
                            cellValue1 = getCellValue(x, y);
                            cellX = x;
                            cellY = y;

                        } else {
                            if (getCellValue(x, y).equals("")) continue;
                            if (cellValue1.equals(getCellValue(x, y))) {
                                updateCell(cellX, cellY, getCellIntValue(cellX, cellY)*2);
                                resetCell(x, y);
                                cellValue1 = null;
                            } else {
                                cellValue1 = getCellValue(x, y);
                                cellX = x;
                                cellY = y;
                            }
                        }
                    }
                    cellValue1 = null;
                    for (int y = 1; y < ySize; y++) {
                        if (!getCellValue(x, y).equals("")) {
                            int tempY = y - 1;
                            while (tempY >= 0 && getCellValue(x, tempY).equals("")) {
                                updateCell(x, tempY, getCellIntValue(x,tempY+1));
                                resetCell(x, tempY+1);
                                tempY--;
                            }
                        }
                    }
                }
        }
        createRandomCell();
    }
}
