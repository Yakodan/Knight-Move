package croc.education.ws2023spb.knightsmove;

/**
 * Класс, описывающий позицию на шахматной доске, реализующий интерфейс {@link ChessPosition}
 */
public class Position implements ChessPosition{

    private int x;
    private int y;

    /**
     * Конструктор класса {@link Position}
     * @param x горизонтальная позиция (0-7)
     * @param y верткальная позиция (0-7)
     */
    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает позицию фигуры по горизонтали.
     * <p/>
     * Возможные значения: 0 - 7.
     *
     * @return позицию фигуры по горизонтали
     */
    @Override
    public int x() {
        return x;
    }

    /**
     * Возвращает позицию фигуры по вертикали.
     * <p/>
     * Возможные значения: 0 - 7.
     *
     * @return позицию фигуры по вертикали
     */
    @Override
    public int y() {
        return y;
    }

    /**
     * Возвращает наименование клетки шахматной доски, на которой находится фигура, в
     * <a href="https://w.wiki/7pFN">шахматной нотации</a>.
     *
     * @return наименование клетки шахматной доски, на которой находится фигура, в шахматной нотации
     */
    @Override
    public String toString(){
       String[] xCoordinates = {"a","b","c","d","e","f","g","h"};
       String xCoordinate = xCoordinates[x];
       int yCoordinate = y + 1;
       String position = xCoordinate + yCoordinate;
       return position;
    }
}
