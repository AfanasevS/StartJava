public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfCores = 8;
        short mainMemory = 16000;
        int pixels = 2_073_600;
        long hardMemory = 1_578_156_156L;
        float cpuFrequency = 1.42f;
        double perfomance = 3.187_864_654;
        char a = 'a';
        boolean active = true;

        System.out.println("numberOfCores = " + numberOfCores);
        System.out.println("mainMemory = " + mainMemory);
        System.out.println("pixels = " + pixels);
        System.out.println("hardMemory = " + hardMemory);
        System.out.println("cpuFrequency = " + cpuFrequency);
        System.out.println("perfomance = " + perfomance);
        System.out.println("a = " + a);
        System.out.println("active = " + active);

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int discount = 11;

        System.out.println("Сумма скидки " + discount + "%");
        System.out.println("Общая сумма товаров со скидкой " + (((pen + book) * (100 - discount)) / 100));

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   j    a  v     v  a    ");
        System.out.println("   j   a a  v   v  a a    ");
        System.out.println("j  j  aaaaa  V V  aaaaa  ");
        System.out.println(" jj  a     a  V  a     a ");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte cash = 127;
        mainMemory = 32767;
        pixels = 2_147_483_647;
        hardMemory = 9_223_372_036_854_775_807L;

        System.out.println("Первоначальное значение " + cash + ", значение после инкремента " + (++cash)
                + ", значение после декремента " + (--cash));
        System.out.println("Первоначальное значение " + mainMemory + ", значение после инкремента "
                + (++mainMemory) + ", значение после декремента " + (--mainMemory));
        System.out.println("Первоначальное значение " + pixels + ", значение после инкремента" + (++pixels)
                + ", значение после декремента " + (--pixels));
        System.out.println("Первоначальное значение " + hardMemory + ", значение после инкремента" + (++hardMemory)
                + ", значение после декремента " + (--hardMemory));

        System.out.println("5. Перестановка значений переменных");
        int d = 2;
        int e = 5;
        int f = 0;

        System.out.println("d =" + d + "e = " + e);
        System.out.println("С помощью третьей переменной");
        d = f;
        d = e;
        e = f;
        System.out.println("d =" + d + ", e = " + e);

        System.out.println("С помощью арифметических операций");
        d = e + 3;
        e = a - 3;
        System.out.println("d =" + d + ", e = " + e);

        System.out.println("С помощью побитовой операции");
        //d^e;
        System.out.println("d =" + d + ", e = " + e);

        System.out.println("6. Вывод символов и их кодов");
        char MyChar1 = '\u0035';
        char MyChar2 = '\u0038';
        char MyChar3 = '\u0064';
        char MyChar4 = '\u0094';
        char MyChar5 = '\u0095';

        System.out.println("Код символа 35 в системе ASCII-таблицы - " + MyChar1 + ".");
        System.out.println("Код символа 38 в системе ASCII-таблицы - " + MyChar2 + ".");
        System.out.println("Код символа 64 в системе ASCII-таблицы - " + MyChar3 + ".");
        System.out.println("Код символа 94 в системе ASCII-таблицы - " + MyChar4 + ".");
        System.out.println("Код символа 95 в системе ASCII-таблицы - " + MyChar5 + ".");

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
                + underline + backSlash + slash + underline + underline + slash);

        System.out.println("9. Произведение и сумма цифр числа");
        int number9 = 345;
        int firstNumber = number9 / 100;
        int secondNumber = (number9 % 100) / 10;
        int thirdNumber = number9 % 10;
        int sum = firstNumber + secondNumber + thirdNumber;
        int multiply = firstNumber * secondNumber * thirdNumber;
        System.out.println("Сумма цифр числа " + number9 + " - " + sum + " .");
        System.out.println("Произведение цифр числа " + number9 + " - " + multiply + " .");

        System.out.println("10. Преобразование секунд");
        int sourceSeconds = 86399;
        int hours = sourceSeconds / 3600;
        int minutes = (sourceSeconds / 60) % 60;
        int seconds = sourceSeconds % 60;
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
