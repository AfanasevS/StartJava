public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 20;
        String sex = "man";
        double height = 1.74;
        String name = "Sergey";

        if (age > 20) {
            System.out.println("Вы допущены к этому сайту.");
        } else {
            System.out.println("Доступ запрещён.");
        }

        if (sex != "man") {
            System.out.println("Вы мужчина!");
        } else {
            System.out.println("Вы женщина!");
        }

        if (height < 1.80) {
            System.out.println("Вы не можете быть моделью.");
        } else {
            System.out.println("Вы можете быть моделью.");
        }

        char firstLetterOfName = name.charAt(0);
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
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("Число положительное и чётное.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Число положительное и нечётное.");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("Число отрицательное  и чётное.");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("Число отрицательное  и нечётное.");
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

        System.out.println("Нам даны 2 числа - " + number1 + " и " + number2);
        if (hundredNumber1 == hundredNumber2) {
            System.out.println("Найдены одинаковые числа в 3 разряде: "
                    + hundredNumber1 + " = " + hundredNumber2);
        } else {
            System.out.println("Нет одинаковых чисел в 3 разряде.");
        }
        if (dozenNumber1 == dozenNumber2) {
            System.out.println("Найдены одинаковые числа во 2 разряде: "
                    + dozenNumber1 + " = " + dozenNumber2);
        } else {
            System.out.println("Нет одинаковых чисел во 2 разряде.");
        }
        if (onesNumber1 == onesNumber2) {
            System.out.println("Найдены одинаковые числа в 1 разряде: "
                    + onesNumber1 + " = " + onesNumber2);
        } else {
            System.out.println("Нет одинаковых чисел в 1 разряде.");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = 'W';

        if (symbol >= '\u0061' && symbol <= '\u007A') {
            System.out.println("Символ " + symbol + " - маленькая буква.");
        } else if (symbol >= '\u0041' && symbol <= '\u005A') {
            System.out.println("Символ " + symbol + " - большая буква.");
        } else if (symbol >= '\u0030' && symbol <= '\u0039') {
            System.out.println("Символ " + symbol + " - число.");
        } else {
            System.out.println("Символ " + symbol + " - не число и не буква.");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int income;

        if (deposit < 100000) {
            income = (deposit * 5) / 100;
        } else if (deposit <= 300000) {
            income = (deposit * 7) / 100;
        } else {
            income = (deposit * 10) / 100;
        }
        System.out.println("Сумма вклада - " + deposit);
        System.out.println("Начисленно процентов - " + income);
        System.out.println("Итоговая сумма с учетом % - " + (deposit + income));

        System.out.println("\n7. Определение оценки по предметам");
        double scoreHistory = 59;
        double scoreProgramming = 91;
        int gradeProgramming = 5;
        int gradeHistory = 5;

        if (scoreHistory <= 60) {
            gradeHistory = 2;
        } else if (scoreHistory <= 73) {
            gradeHistory = 3;
        } else if (scoreHistory <= 91) {
            gradeHistory = 4;
        }
        if (scoreProgramming <= 60) {
            gradeProgramming = 2;
        } else if (scoreProgramming <= 73) {
            gradeProgramming = 3;
        } else if (scoreProgramming <= 91) {
            gradeProgramming = 4;
        }
        System.out.println(gradeHistory + " - оценка по истории");
        System.out.println(gradeProgramming + " - оценка по программированию");
        System.out.println("Средний балл по успеваемости - " + ((gradeHistory + gradeProgramming) / 2));
        System.out.println("средний % по предметам - " + ((scoreProgramming + scoreHistory) / 2));

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
        int cash = 567;
        int availableBanknote100 = 10;
        int availableBanknote10 = 5;
        int availableBanknote1 = 50;
        int nominalBanknote100 = 100;
        int nominalBanknote10 = 10;
        int nominalBanknote1 = 1;
        int requiredBanknote100 = 0;
        int requiredBanknote10 = 5;
        int requiredBanknote1 = 0;

        if (cash / 100 <= availableBanknote100) {
            requiredBanknote100 = cash / 100;
            cash -= requiredBanknote100 * nominalBanknote100;
            if (cash / 10 >= availableBanknote10) {
                requiredBanknote10 = availableBanknote10;
                cash -= requiredBanknote10 * nominalBanknote10;
                if (cash >= 0) {
                    requiredBanknote1 = cash;
                }
            }
        }
        System.out.println("В банкомате есть банкноты нескольких номиналов: "
                + nominalBanknote100 + ", " + nominalBanknote10 + ", " + nominalBanknote1);
        System.out.println("Для того,чтобы выдать 567 $ необходимо " + requiredBanknote100 + " банкнот по "
                + nominalBanknote100 + "$, " + requiredBanknote10 + " банкнот по " + nominalBanknote10
                + " $ и " + requiredBanknote1 + " банкнот по " + nominalBanknote1);
        System.out.println("Исходная сумма - " + (requiredBanknote100 * nominalBanknote100
                + requiredBanknote10 * nominalBanknote10 + requiredBanknote1 * nominalBanknote1));
    }
}

