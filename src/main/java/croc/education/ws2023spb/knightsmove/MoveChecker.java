package croc.education.ws2023spb.knightsmove;

/**
 * Обработчик, проверяющий, что последовательность клеток на шахматной доске может быть пройдена ходом коня.<br>
 * Реализует интерфейс {@link KnightsMoveChecker}
 */
public class MoveChecker implements KnightsMoveChecker{

    /**
     * Проверяет, что указанная последовательность клеток на шахматной доске может быть пройдена ходом шахматного коня.
     * @param positions
     *            последовательность клеток на шахматной доске, которую надо обойти от предыдущей клетки к следующей
     * @throws IllegalMoveException
     */
    @Override
    public void check(String[] positions) throws IllegalMoveException {
        for(int i=0;i<positions.length-1;i++){
            Position start = null;
            Position end = null;
            try{
                start = (Position) ChessPositionParser.parse(positions[i]);
                end = (Position) ChessPositionParser.parse(positions[i+1]);
            }
            catch (IllegalPositionException e){
                throw new IllegalMoveException("конь так не ходит: " + start.toString() + " -> " + end.toString());
            }

            int xDifference = Math.abs((start.x()-end.x()));
            int yDifference = Math.abs((start.y()-end.y()));

            if(!((xDifference==1 && yDifference==2) || (xDifference==2 && yDifference==1))){
                throw new IllegalMoveException("конь так не ходит: " + start.toString() + " -> " + end.toString());
            }

        }
    }
}
