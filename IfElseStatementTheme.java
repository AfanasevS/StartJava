public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Перевод псевдокода на язык Java");
        int age = 20;
        String sex = "man";
        double height = 1.74;
        String name = "Сергей";
        char firstLetterOfName;

        if (age > 20) {
            System.out.println("Вы допущены к этому сайту");
        } else {
            System.out.println("Доступ запрещён.");
        }

        if (sex != "man") {
            System.out.println("Вы мужчина!");
        } else {
            System.out.println("Вы женщина!");
        }

        if (height < 1.80) {
            System.out.println("Вы не можете быть моделью");
        } else {
            System.out.println("Вы можете быть моделью");
        }

        firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Возможно, вас зовут Максим");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Возможно, вас зовут Иван");
        } else {
            System.out.println("Так мы будем долго угадывать ваше имя!");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 5;
        int number2 = 7;
        if (number1 > number2) {
            System.out.println("Число " + number1 + " больше, чем число " + number2);
        } else if (number1 < number2) {
            System.out.println("Число " + number1 + " меньше, чем число " + number2);
        } else {
            System.out.println("Число " + number1 + " и число " + number2 + " равны.");
        }

        System.out.println("\n3. Работа с числом.");
        int number = 5;
        System.out.println("Нам дано число " + number + ".");
        if (number == 0) {
            System.out.println("Число является нулем.");
        } else if (number % 2 == 0) {
            System.out.println("Число четное.");
            if (number > 0) {
                System.out.println("Число положительное.");
            } else {
                System.out.println("Число отрицательное.");
            }
        } else {
            System.out.println("Число нечетное");
            if (number > 0) {
                System.out.println("Число положительное.");
            } else {
                System.out.println("Число отрицательное.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        number1 = 145;
        number2 = 175;
        int hundredNumber1 = number1 / 100;
        int dozenNumber1 = (number1 / 10) % 10;
        int onesNumber1 = number1 % 10;
        int hundredNumber2 = number2 / 100;
        int dozenNumber2 = (number2 / 10) % 10;
        int onesNumber2 = number2 % 10;
        int class1= 3;
        int class2 = 2;
        int class3 = 1;

        System.out.println(" Нам даны 2 числа - " + number1 + " и " + number2);
        if (hundredNumber1 == hundredNumber2) {
            System.out.println("Найдены одинаковые числа в " + class1 + " разряде: " + hundredNumber1 + " = "
                    + hundredNumber2);
        } else {
            System.out.println("Нет одинаковых чисел в " + class2 + " разряде.");
        }
        if (dozenNumber1 == dozenNumber2) {
            System.out.println("Найдены одинаковые числа в " + class2 + " разряде: " + dozenNumber1 + " = "
                    + dozenNumber2);
        } else {
            System.out.println("Нет одинаковых чисел в " + class2 + " разряде.");
        }
        if (onesNumber1 == onesNumber2) {
            System.out.println("Найдены одинаковые числа в " + class3 + " разряде: " + onesNumber1 + " = "
                    + onesNumber2);
        } else {
            System.out.println("Нет одинаковых чисел в " + class3 + " разряде.");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch1 = '\u0057';

        if (ch1 >= '\u0061' && ch1 <= '\u007A' ) {
            System.out.println("Символ " + ch1 + " - маленькая буква.");
        } else if (ch1 >= '\u0041' && ch1 <= '\u005A' ) {
            System.out.println("Символ " + ch1 + " - большая буква.");
        } else if (ch1 >= '\u0030' && ch1 <= '\u0039' ){
            System.out.println("Символ " + ch1 + " - число.");
        } else {
            System.out.println("Символ " + ch1 + " - не число и не буква.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double income;
        if (deposit < 100000) {
            income = deposit * 0.05;
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Начисленно процентов - " + income);
            System.out.println("Итоговая сумма с учетом % - " + (deposit + income));
        } else if (deposit < 300000) {
            income = deposit * 0.07;
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Начисленно процентов - " + income);
            System.out.println("Итоговая сумма с учетом % - " + (deposit + income));
        } else {
            income = deposit * 0.10;
            System.out.println("Сумма вклада - " + deposit);
            System.out.println("Начисленно процентов - " + income);
            System.out.println("Итоговая сумма с учетом % - " + (deposit + income));
        }

        System.out.println("\n7. Определение оценки по предметам");
        double scoreHistory = 0.59;
        double scoreProgramming = 0.91;
        int markProgramming;
        int markHistory;

        if (scoreHistory <= 0.60) {
            markHistory = 2;
        } else if (scoreHistory <= 0.73) {
            markHistory = 3;
        } else if (scoreHistory <= 0.91) {
            markHistory = 4;
        } else {
            markHistory = 5;
        }
        if (scoreProgramming <= 0.60) {
            markProgramming = 2;
        } else if (scoreProgramming <= 0.73) {
            markProgramming = 3;
        } else if (scoreProgramming <= 0.91) {
            markProgramming = 4;
        } else {
            markProgramming = 5;
        }
        System.out.println(markHistory + " - оценка по истории");
        System.out.println(markProgramming + " - оценка по программированию");
        System.out.println("Средний балл по успеваемости - " + ((markHistory+markProgramming)/2));
        System.out.println("средний % по предметам - " + ((scoreProgramming+scoreHistory)/2));

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int revenue = 13000;
        int cost = 9000;
        int yearRevenue = (revenue - rent - cost) * 12;
        if (yearRevenue > 0) {
            System.out.println("Прибыль за год +" + yearRevenue);
        } else {
            System.out.println("Прибыль за год " + yearRevenue);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int dollars = 567;
        int banknote100 = dollars / 100;
        int banknote10 = 5;
        int nominalBanknote100 = 100;
        int nominalBanknote10 = 10;
        int nominalBanknote1 = 1;
        int banknote1 = (dollars - (banknote100 * nominalBanknote100) - (banknote10 * nominalBanknote10))
                / nominalBanknote1;

        System.out.println("В банкомате есть банкноты нескольких номиналов: " + nominalBanknote100 + ", "
                + nominalBanknote10 + ", " + nominalBanknote1);
        System.out.println("Для того,чтобы выдать 567 $ необходимо " + banknote100 + " банкнот по "
                + nominalBanknote100 + "$, " + banknote10 + " банкнот по " + nominalBanknote10 + " $ и " + banknote1
                + " банкнот по " + nominalBanknote1);
        System.out.println("Исходная сумма - " + (banknote100 * nominalBanknote100 + banknote10 * nominalBanknote10
                + banknote1 * nominalBanknote1));
    }
}

