package croc.education.ws2023spb.knightsmove;

/**
 * Исключение невозможной позиции фигуры на шахматной доске для теста
 * @author Daniil Kodintsev
 */
public class IllegalPositionException extends Exception {

    /**
     * Конструктор исключения {@link IllegalPositionException} <br>
     * Сообщение по умолчанию - "Такой позиции нет на шахматной доске!"
     */
    public  IllegalPositionException(){
        super("Такой позиции нет на шахматной доске!");
    }
}
