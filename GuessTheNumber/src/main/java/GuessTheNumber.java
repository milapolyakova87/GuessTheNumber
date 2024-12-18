import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Загадываем случайное число от 1 до 100
        int targetNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("(づ ◕‿◕ )づ Привет! Ты в волшебной игре 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");

        // Основной цикл игры
        while (userGuess != targetNumber) {
            System.out.print("Введи своё предположение: ");

            // Проверка на корректность ввода
            try {
                userGuess = scanner.nextInt();
                attempts++;

                // Проверяем, больше или меньше загаданное число
                if (userGuess < targetNumber) {
                    System.out.println("Загаданное число больше");
                } else if (userGuess > targetNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Поздравляю! (´｡• ᵕ •｡`) ♡ Ты угадал число " + targetNumber + " за " + attempts + " попыток!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ты ввёл не число, я не умею так играть (ಥ﹏ಥ) Пожалуйста, введи целое число.");
                scanner.next(); // Очищаем буфер сканера
            }
        }

        scanner.close();
    }
}
