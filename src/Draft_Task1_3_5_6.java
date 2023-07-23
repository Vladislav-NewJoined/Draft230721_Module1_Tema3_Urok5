import java.util.Scanner;
import java.util.logging.Logger;

//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft_Task1_3_5_6 {
    public static void main(String[] args) {
        System.out.println("Задание: \n6.  ППользователь вводит число, любое. 237, например. " +
                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
                "\n2 программиста, и так далее\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Вводите число: ");
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        System.out.println("Исходная строка: \"" + builder + "\"");

//        System.out.println("Итоговая строка: \"" + builderNew + "\"");
    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 2 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов
//public class Draft_Task1_3_5_6 {
////    private static final Logger LOG = Logger.getLogger(Draft_Task1_3_5_6.class.getName());
//
//    public static void main(String[] args) {
//        String text = "%s - %s - %s";
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "пользователь", "пользователя", "пользователей"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "год", "года", "лет"))
//            );
//        }
//
//        for (int number = 0; number < 15; number++) {
//            System.out.println(
//                    String.format(text,
//                            getName(number, "остался", "осталось", "осталось"),
//                            number,
//                            getName(number, "символ", "символа", "символов"))
//            );
//        }
//    }
//
//    public static String getName(int count, String firststr, String secondstr, String thirdstr) {
//        int ost = count % 100;
//        if (ost > 9 && ost < 20)
//        {
//            return thirdstr;
//        } else {
//            ost = ost % 10;
//            if (ost == 1)
//            {
//                return firststr;
//            } else if (ost > 1 && ost < 5)
//            {
//                return secondstr;
//            } else
//            {
//                return thirdstr;
//            }
//        }
//    }
//}
////        Конец Примера 2 КККККККККККККККК






////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_6 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  ППользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Вводите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходная строка: \"" + builder + "\"");
//
//        MyClass myClass = new MyClass();
//        myClass.days();
//
//
////        System.out.println("Итоговая строка: \"" + builderNew + "\"");
//    }
//}
//
//class MyClass {
//
//    static String days() {
//        int builder = 1;
//        int preLastDigit = builder % 100 / 10;
//
//        if (preLastDigit == 1) {
//            System.out.println("дней");
//            return "дней";
//        }
//
//        switch (builder % 10) {
//            case 1:
//                System.out.println("день");
//                return "день";
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("дня");
//                return "дня";
//            default:
//                System.out.println("дней");
//                return "дней";
//        }
//    }
//}
////        Конец Примера 1 КККККККККККККККК






