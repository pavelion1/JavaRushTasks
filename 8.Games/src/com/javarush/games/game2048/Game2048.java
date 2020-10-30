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
        while (!getCellValue(x, y).equals(""));
        int a = getRandomNumber(0, 99);
        if (a>=10) {
            updateCell(x, y, 2);
        } else
            updateCell(x, y, 4);
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
            case 16:
                color = Color.ORANGE;
                break;
            default:
                color = Color.BLUE;
        }
        setCellColor(x, y, color);
        setCellTextColor(x, y, Color.BLACK);
    }

    public void resetCell(int x, int y) {
        setCellValue(x, y, "");
        setCellColor(x, y, Color.BLACK);
    }

    public int getCellIntValue(int x, int y) {
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
        boolean a = false;
        String cellValue1 = null;
        int cellX = 0;
        int cellY = 0;
        switch (key) {
            case UP:
                for (int x = 0; x < xSize; x++) {
                    for (int y = 0; y < ySize; y++) {
                        if (getCellValue(x, y).equals("")) continue;
                        if (cellValue1 == null) {
                            cellValue1 = getCellValue(x, y);
                            cellX = x;
                            cellY = y;

                        } else {
                            if (cellValue1.equals(getCellValue(x, y))) {
                                updateCell(cellX, cellY, getCellIntValue(cellX, cellY) * 2);
                                a = true;
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
                                updateCell(x, tempY, getCellIntValue(x, tempY + 1));
                                a = true;
                                resetCell(x, tempY + 1);
                                tempY--;
                            }
                        }
                    }
                }
                break;
            case LEFT:
                for (int y = 0; y < ySize; y++) {
                    for (int x = 0; x < xSize; x++) {
                        if (getCellValue(x, y).equals("")) continue;
                        if (cellValue1 == null) {
                            cellValue1 = getCellValue(x, y);
                            cellX = x;
                            cellY = y;

                        } else {
                            if (cellValue1.equals(getCellValue(x, y))) {
                                updateCell(cellX, cellY, getCellIntValue(cellX, cellY) * 2);
                                a = true;
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
                    for (int x = 1; x < xSize; x++) {
                        if (!getCellValue(x, y).equals("")) {
                            int tempX = x - 1;
                            while (tempX >= 0 && getCellValue(tempX, y).equals("")) {
                                updateCell(tempX, y, getCellIntValue(tempX + 1, y));
                                a = true;
                                resetCell(tempX + 1, y);
                                tempX--;
                            }
                        }
                    }
                }
                break;
            case DOWN:
                for (int x = xSize-1; x >= 0; x--) {
                    for (int y = ySize-1; y >= 0; y--) {
                        if (getCellValue(x, y).equals("")) continue;
                        if (cellValue1 == null) {
                            cellValue1 = getCellValue(x, y);
                            cellX = x;
                            cellY = y;

                        } else {
                            if (cellValue1.equals(getCellValue(x, y))) {
                                updateCell(cellX, cellY, getCellIntValue(cellX, cellY) * 2);
                                a = true;
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
                    for (int y = ySize - 2; y >= 0; y--) {
                        if (!getCellValue(x, y).equals("")) {
                            int tempY = y + 1;
                            while (tempY < ySize && getCellValue(x, tempY).equals("")) {
                                updateCell(x, tempY, getCellIntValue(x, tempY - 1));
                                a = true;
                                resetCell(x, tempY - 1);
                                tempY++;
                            }
                        }
                    }
                }
            case RIGHT:
                for (int y = ySize-1; y >= 0; y--) {
                    for (int x = xSize-1; x >= 0; x--) {
                        if (getCellValue(x, y).equals("")) continue;
                        if (cellValue1 == null) {
                            cellValue1 = getCellValue(x, y);
                            cellX = x;
                            cellY = y;

                        } else {
                            if (cellValue1.equals(getCellValue(x, y))) {
                                updateCell(cellX, cellY, getCellIntValue(cellX, cellY) * 2);
                                a = true;
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
                    for (int x = xSize - 2; x >= 0; x--) {
                        if (!getCellValue(x, y).equals("")) {
                            int tempX = x + 1;
                            while (tempX < xSize && getCellValue(tempX, y).equals("")) {
                                updateCell(tempX, y, getCellIntValue(tempX - 1, y));
                                a = true;
                                resetCell(tempX - 1, y);
                                tempX++;
                            }
                        }
                    }
                }
        }


        if (a) {
            createRandomCell();
        }
    }
}

