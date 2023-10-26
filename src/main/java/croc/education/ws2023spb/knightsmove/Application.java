package croc.education.ws2023spb.knightsmove;

/**
 * Приложение, проверяющее возможность прохождения последовательности клеток на шахматной доске ходом коня.
 */
public final class Application {

    /**
     * Основной метод приложения.
     *
     * @param args аргументы
     */
    public static void main(final String[] args) {
        int i = 0;
        try {
            for (i = 0; i < args.length - 1; i++) {
                KnightsMoveCheckerFactory.get().check(new String[]{args[i], args[i + 1]});
            }
            System.out.print("OK");
        } catch (IllegalMoveException e) {
            System.out.print(e.getMessage());
        }
    }
}
