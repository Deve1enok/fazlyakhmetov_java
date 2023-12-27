import java.util.Scanner;

public class AlgorithmsWork {
    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);

        String msg = "Привет";
        String helper = "Введите другое число";

        System.out.println("Введите целое число");
        while (true) {
            int i = scanner.nextInt();
            if (i > 7) {
                System.out.println(msg);
                break;
            }else{
                System.out.println(helper);
            }
        }
    }
    public void inputName() {
        Scanner scanner = new Scanner(System.in);

        String name = "Вячеслав";
        String msg = "Привет, Вячеслав";
        String badMsg = "Нет такого имени";
        String i;

        System.out.println("Введите случайное имя");

        while (true) {
            i = scanner.nextLine();
            if (i.equals(name)) {
                System.out.println(msg);
                break;
            } else {
                System.out.println(badMsg);
            }
        }
    }
    public void printNumbersMultiplesThree() {
        int[] num = new int[15];

        System.out.println("Длина массива " + num.length);
        System.out.println();
        System.out.println("Числа кратные 3: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*100);
            if ((num[i] % 3 == 0) && (num[i] != 0)) {
                System.out.println(num[i]);
            }
        }
    }
}
