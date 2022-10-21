public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfCores = 8;
        short mainMemory = 16000;
        int pixels = 2_073_600;
        long hardMemory = 1_578_156_156L;
        float cpuFrequency = 1.42f;
        double performance = 3.187_864_654;
        char versionOfProcessor = '7';
        boolean active = true;

        System.out.println("numberOfCores = " + numberOfCores);
        System.out.println("mainMemory = " + mainMemory);
        System.out.println("pixels = " + pixels);
        System.out.println("hardMemory = " + hardMemory);
        System.out.println("cpuFrequency = " + cpuFrequency);
        System.out.println("performance = " + performance);
        System.out.println("versionOfProcessor = " + versionOfProcessor);
        System.out.println("active = " + active);

        System.out.println("\n " + "2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;

        System.out.println("Сумма скидки " + discount + " % или " +
                (((pricePen + priceBook) * discount) / 100) + " рубля.");
        System.out.println("Общая сумма товаров со скидкой " +
                (((pricePen + priceBook) * (100 - discount)) / 100));

        System.out.println("\n " + "3. Вывод на консоль слова JAVA");
        System.out.println("   j    a  v     v  a    ");
        System.out.println("   j   a a  v   v  a a    ");
        System.out.println("j  j  aaaaa  V V  aaaaa  ");
        System.out.println(" jj  a     a  V  a     a ");

        System.out.println("\n " + "4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;

        System.out.println("Первоначальное значение " + byteMax
                + ", значение после инкремента " + (++byteMax)
                + ", значение после декремента " + (--byteMax));
        System.out.println("Первоначальное значение " + shortMax
                + ", значение после инкремента " + (++shortMax)
                + ", значение после декремента " + (--shortMax));
        System.out.println("Первоначальное значение " + intMax
                + ", значение после инкремента" + (++intMax)
                + ", значение после декремента " + (--intMax));
        System.out.println("Первоначальное значение " + longMax
                + ", значение после инкремента" + (++longMax)
                + ", значение после декремента " + (--longMax));

        System.out.println("\n " + "5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int temp = a;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("С помощью третьей переменной");
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
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("\n " + "6. Вывод символов и их кодов");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;

        System.out.println("Код символа 35 в системе ASCII-таблицы - " + (char) codeChar1 + ".");
        System.out.println("Код символа 38 в системе ASCII-таблицы - " + (char) codeChar2 + ".");
        System.out.println("Код символа 64 в системе ASCII-таблицы - " + (char) codeChar3 + ".");
        System.out.println("Код символа 94 в системе ASCII-таблицы - " + (char) codeChar4 + ".");
        System.out.println("Код символа 95 в системе ASCII-таблицы - " + (char) codeChar5 + ".");


        System.out.println("\n " + "7. Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int decade = (number / 10) % 10;
        int ones = number % 10;
        System.out.println("Число " + number + " состоит из " + hundred + " сотни "
                + decade + " десятков" + " и " + ones + " единиц.");

        System.out.println("\n " + "8. Вывод на консоль ASCII-арт Дюка");
        char slash = '\\';
        char backSlash = '/';
        char openBraket = '(';
        char closeBraket = ')';
        char underline = '_';
        System.out.println("    " + backSlash + slash + "    " + "\n" + "   " + backSlash
                + "  " + slash + "   " + "\n" + "  " + backSlash + underline + openBraket
                + " " + closeBraket + slash + "   " + "\n" + " " + backSlash + "      "
                + slash + "  " + "\n" + backSlash + underline + underline + underline
                + underline + backSlash + slash + underline + underline + slash);

        System.out.println("\n " + "9. Произведение и сумма цифр числа");
        number = 345;
        hundred = number / 100;
        decade = (number % 100) / 10;
        ones = number % 10;
        int sumDigits = hundred + decade + ones;
        int multDigits = hundred * decade * ones;
        System.out.println("Сумма цифр числа " + number + " - " + sumDigits + " .");
        System.out.println("Произведение цифр числа " + number + " - " + multDigits + " .");

        System.out.println("\n " + "10. Преобразование секунд");
        int sourceSeconds = 86399;
        int hours = sourceSeconds / 3600;
        int minutes = (sourceSeconds / 60) % 60;
        int seconds = sourceSeconds % 60;
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
