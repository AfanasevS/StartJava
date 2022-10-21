public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfCores = 8;
        short mainMemory = 16000;
        int pixels = 2_073_600;
        long hardMemory = 1_578_156_156L;
        float cpuFrequency = 1.42f;
        double performance = 3.187_864_654;
        char versionOfProcessor = 55;
        boolean active = true;

        System.out.println("numberOfCores = " + numberOfCores);
        System.out.println("mainMemory = " + mainMemory);
        System.out.println("pixels = " + pixels);
        System.out.println("hardMemory = " + hardMemory);
        System.out.println("cpuFrequency = " + cpuFrequency);
        System.out.println("performance = " + performance);
        System.out.println("versionOfProcessor = " + (char) versionOfProcessor);
        System.out.println("active = " + active + "\n ");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;

        System.out.println("Сумма скидки " + discount + " % или " + (((pricePen + priceBook) * discount) / 100)
                + "рубля.");
        System.out.println("Общая сумма товаров со скидкой " + (((pricePen + priceBook) * (100 - discount)) / 100)
                + "\n ");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   j    a  v     v  a    ");
        System.out.println("   j   a a  v   v  a a    ");
        System.out.println("j  j  aaaaa  V V  aaaaa  ");
        System.out.println(" jj  a     a  V  a     a " + "\n ");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte costTicket = 127;
        short costInn = 32767;
        int distance = 2_147_483_647;
        long squareMetres = 9_223_372_036_854_775_807L;

        System.out.println("Первоначальное значение " + costTicket + ", значение после инкремента " + (++costTicket)
                + ", значение после декремента " + (--costTicket));
        System.out.println("Первоначальное значение " + costInn + ", значение после инкремента "
                + (++costInn) + ", значение после декремента " + (--costInn));
        System.out.println("Первоначальное значение " + distance + ", значение после инкремента" + (++distance)
                + ", значение после декремента " + (--distance));
        System.out.println("Первоначальное значение " + squareMetres + ", значение после инкремента" + (++squareMetres)
                + ", значение после декремента " + (--squareMetres) + "\n ");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int temp = 0;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("С помощью третьей переменной");
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("С помощью арифметических операций");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("С помощью побитовой операции");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b + "\n ");

        System.out.println("6. Вывод символов и их кодов");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;

        System.out.println("Код символа 35 в системе ASCII-таблицы - " + (char) codeChar1 + ".");
        System.out.println("Код символа 38 в системе ASCII-таблицы - " + (char) codeChar2 + ".");
        System.out.println("Код символа 64 в системе ASCII-таблицы - " + (char) codeChar3 + ".");
        System.out.println("Код символа 94 в системе ASCII-таблицы - " + (char) codeChar4 + ".");
        System.out.println("Код символа 95 в системе ASCII-таблицы - " + (char) codeChar5 + "." + "\n ");


        System.out.println("7. Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int decade = (number / 10) % 10;
        int unit = number % 10;
        System.out.println("Число " + number + " состоит из " + hundred + " сотни " + decade + " десятков" + " и "
                + unit + " единиц." + "\n");

        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        char slash = '\\';
        char backSlash = '/';
        char openBraket = '(';
        char closeBraket = ')';
        char underline = '_';
        System.out.println("    " + backSlash + slash + "    " + "\n" + "   " + backSlash + "  " + slash + "   "
                + "\n" + "  " + backSlash + underline + openBraket + " " + closeBraket + slash + "   " + "\n"
                + " " + backSlash + "      " + slash + "  " + "\n" + backSlash + underline + underline + underline
                + underline + backSlash + slash + underline + underline + slash + "\n ");

        System.out.println("9. Произведение и сумма цифр числа");
        int number9 = 345;
        int firstNumber = number9 / 100;
        int secondNumber = (number9 % 100) / 10;
        int thirdNumber = number9 % 10;
        int sum = firstNumber + secondNumber + thirdNumber;
        int multiply = firstNumber * secondNumber * thirdNumber;
        System.out.println("Сумма цифр числа " + number9 + " - " + sum + " .");
        System.out.println("Произведение цифр числа " + number9 + " - " + multiply + " ." + "\n ");

        System.out.println("10. Преобразование секунд");
        int sourceSeconds = 86399;
        int hours = sourceSeconds / 3600;
        int minutes = (sourceSeconds / 60) % 60;
        int seconds = sourceSeconds % 60;
        System.out.println(hours + " : " + minutes + " : " + seconds + "\n ");
    }
}
