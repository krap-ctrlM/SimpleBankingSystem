
import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        while (true) {
            System.out.println("\nТекущий баланс: " + balance);
            System.out.print("Выберите операцию (1: Проверить баланс, 2: Пополнить, 3: Снять, 4: Выйти): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ваш баланс: " + balance);
                    break;
                case 2:
                    System.out.print("Введите сумму для пополнения: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Баланс обновлен.");
                    break;
                case 3:
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Снятие выполнено.");
                    } else {
                        System.out.println("Недостаточно средств.");
                    }
                    break;
                case 4:
                    System.out.println("Выход из системы.");
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
