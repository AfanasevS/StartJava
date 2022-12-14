public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int number = -10;
        int x = 0;
        int y = 0;
        do {
            if (number % 2 == 0) {
                x += number;
            } else {
                y += number;
            }
            System.out.println("В промежутке [-10, " + number + "] сумма четных чисел = " + x
                    + ", а нечетных = " + y);
            number++;
        } while (number < 22);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = -1;
        int number2 = 5;
        int number3 = 10;
        int startRange = 0;
        int endRange = 0;
        if (number1 > number2 && number2 > number3) {
            startRange = number1;
            endRange = number3;
        } else if (number1 > number2 && number2 < number3) {
            startRange = number1;
            endRange = number2;
        } else if (number2 > number1 && number1 > number3) {
            startRange =number2;
            endRange = number3;
        } else if (number2 > number1 && number1 < number3) {
            startRange = number3;
            endRange = number1;
        } else if (number3 > number1 && number2 < number1) {
            startRange = number3;
            endRange = number2;
        } else if (number3 > number1 && number2 > number1) {
            startRange = number3;
            endRange = number1;
        }
        for (int i = startRange; i >=endRange ; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        number = 1234;
        int revNumber = 0;
        int sum = 0;

        System.out.println("Нам дано число " + number);
        while (number != 0) {
            int digit = number % 10;
            revNumber = revNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(revNumber + " реверсивное число.");
        while (revNumber != 0) {
            sum = sum + (revNumber % 10);
            revNumber /= 10;
        }
        System.out.println("Сумма цифр реверсивного числа равна " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i += 2) {
            for (int k = 0; k < 5; k++) {
                if (i < 24) {
                    System.out.printf("%4d", i);
                } else {
                    System.out.printf("%4d", 0);
                }
                i += 2;
            }
            i -=2;
            System.out.println();
        }


        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int ones = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 1) {
                ones++;
            }
            number /= 10;
        }
        if (ones % 2 == 0) {
            System.out.println("Число " + number + " содержит " + ones + " (чётное) количество единиц.");
        } else {
            System.out.println("Число " + number + " содержит "
                    + ones + " (нечётное) количество единиц.");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        int numberLines = 5;
        int numberOfSigns = 1;
        char codeChar1 = 35;
        char codeChar2 = 36;
        int i = 1;
        int sign = 1;

        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        while (numberLines > 0) {
            while (numberOfSigns < 6) {
                System.out.print(codeChar1);
                numberOfSigns++;
            }
            System.out.println();
            numberLines--;
        }

        do{
            System.out.print (codeChar2);
            i++;
            if (i == 3) {
                do{
                    System.out.print (codeChar2);
                    i--;
                } while (i >= 1);
            }
        } while (i < 2);

        System.out.println("\n7. Отображение ASCII-символов");
        for (int j = 0; j < 47; j++) {
            char ch = (char) j;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", j, ch, tempOct, tempHex);
        }
        for (int j = 97; j < 123; j++) {
            char ch = (char) j;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", j, ch, tempOct, tempHex);
        }


        System.out.println("\n8. Проверка, является ли число палиндромом");
        x = 1234321;
        int num = x;
        int revX = 0;
        int reverse = 0;

        while (num > 0) {
            reverse = num % 10;
            revX = revX * 10 + reverse;
            num /= 10;
            if (revX == x) {
                System.out.println("Число " + x + " является палиндромом.");
            }
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 145_910;
        int numberFirst = number / 1000;
        int numberSecond = number % 1000;
        int sum1 = 0;
        int sum2 = 0;
        int copyNumber = number;

        for (int j = 1; j <= 3; j++) {
            sum1 += numberFirst % 10;
            numberFirst /= 10;
        }
        for (int j = 1; j <= 3; j++) {
            sum2 += numberSecond % 10;
            numberSecond /= 10;
        }
            System.out.println("Сумма первой тройки чисел - "
          + sum1 + "." + "\nСумма второй тройки чисел - " + sum2);
            if (sum1 == sum2) {
                System.out.println("Число " + number  + " счастливое.");
            } else {
                System.out.println("Число " + number  + " несчастливое.");
            }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int mult = 0;

        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                mult = i * j;
                System.out.print(mult + " | ");
            }
            System.out.println();
        }

    }
}
