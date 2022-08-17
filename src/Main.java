import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию (1-добавить, 2-показать, 3-удалить, 4-найти):");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            int operationNumber = Integer.parseInt(inputString);
            if (operationNumber == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String inputProduct = scanner.nextLine();
                list.add(inputProduct);
                System.out.println("Итого в списке покупок: " + list.size());
            } else if (operationNumber == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
            } else if (operationNumber == 3) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                System.out.println("Какую хотите удалить? (Введите номер или название)");
                String removeProduct = scanner.nextLine();

                try {
                    int removeInput = Integer.parseInt(removeProduct);
                    list.remove(removeInput - 1);
                    System.out.println("Покупка: " + (removeInput - 1) + " удалена.");
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                } catch (NumberFormatException e) {
                    list.remove(removeProduct);
                    System.out.println("Покупка: " + removeProduct + " удалена.");
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }

                }
            } else if (operationNumber == 4) {
                System.out.println("Введите текст для поиска");
                String searchProduct = scanner.nextLine();
                System.out.println("Найдено:");
                String queryLower = searchProduct.toLowerCase();
                for (int i = 0; i < list.size(); i++) {
                    String itemLower = list.get(i).toLowerCase();
                    if (itemLower.contains(queryLower)) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
            }
        }
    }
}