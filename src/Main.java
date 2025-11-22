import model.Worker;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Worker createWorker(Scanner sc) {
        Worker worker = new Worker();

        System.out.println("Вкажіть прізвище співробітника: ");
        String lastName = sc.nextLine();
        worker.setLastName(lastName);

        System.out.println("Вкажіть ім'я співробітника: ");
        String firstName = sc.nextLine();
        worker.setFirstName(firstName);

        System.out.println("Вкажіть по батькові співробітника: ");
        String middleName = sc.nextLine();
        worker.setMiddleName(middleName);

        System.out.println("Вкажіть посаду співробітника: ");
        String position  = sc.nextLine();
        worker.setPosition(position);

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Вкажіть рік надходження на роботу: ");
                String inputValue = sc.nextLine();
                worker.setHireDateYear(Integer.parseInt(inputValue));
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат року! Спробуйте ще раз.");
            }
        }
        return worker;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] group = new Worker[5];
        for (int i = 0; i < 5; i++) {
            group[i] = createWorker(scanner);
            System.out.println();
        }

        Arrays.sort(group, Comparator.comparing(Worker::getLastName));

        System.out.println("Список введених співробітників після сортування:");
        for (Worker worker : group) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("Вкажіть мінімальний стаж для виведення: ");
        int minWorkExperience = Integer.parseInt(scanner.nextLine());
        int currentYear = LocalDate.now().getYear();

        System.out.println();
        System.out.println("Список співробітників зі стажем, що перевищує значення: " + minWorkExperience);
        for (Worker worker : group) {
            int workExperience = worker.getExperience(currentYear);
            if (workExperience > minWorkExperience) {
                System.out.println(worker + ", стаж: " + workExperience + " років");
            }
        }
        scanner.close();
    }
}