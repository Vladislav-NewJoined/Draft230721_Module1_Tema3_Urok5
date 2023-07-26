import java.util.Scanner;

public class Draft_Whole_Video1_3_5_0 {
    public static void main(String[] args) {
        //  Урок 5. StringBuilder, обработка строк
        //  закончил мин 06 31 00

        //  видео мин 03 38 - метод insert
        //  видео мин 05 20 - метод delete и deleteCharAt
        //  видео мин 07 59 - метод replace
        //  видео мин 08 24 - зАбОрЧиКоМ
        //  видео мин 08 44 - input
        //  видео мин 13 45 - слова в обратном порядке
        //  видео мин 16 10 - ищем json terminator
        //  видео мин 36 40 - CTRL + ALT + M - создает новый метод
        //  видео мин 52 25 - четыре метода StringBuilder, append, unsert, delete, deleteCharAt
        //      (ещё replace и др.)

// 1. wrapperType ->
//  - track
// 2. kind:
//	- song
//	- artistName - trockName
//	- feature-movie
//	- trackName - longDescription
//  - audiobook
//	- artistName - collectionName - description\

        StringBuilder builder = new StringBuilder();

        builder.append("В лесу родилась елочка\n");
        builder.append("В лесу она росла");

        String str = builder.toString();
        System.out.println(str);
    }
}


//import java.util.Scanner;
//
////        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
////  Пример взят отсюда: https://www.sourcetrail.com/ru/java/java-get-class-by-string/
//
////  Создание класса и объекта Гоша Дударь: https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=13
////  Создание класса и объекта selfedu: https://www.youtube.com/watch?v=eL4tJFvaH2g
////  Здесь видео мин 08 38 ВАЖНО! Как sout в качестве объекта класса в main класс вывести
////  https://www.youtube.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNbK&index=14
//public class Draft_Task1_3_5_11 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation, " +
//                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
//                "\nсоздайте экземпляр класса.\n\nРешение: ");
//
//        FileInformation scanStrings;
//        scanStrings = new FileInformation();
//        scanStrings.getScanner();
//        FileInformation getObjects;
//        getObjects = new FileInformation();
//        getObjects.getInstances();
//
//    }
//}
//
//class FileInformation {
//    public static Scanner getScanner() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите через пробел, в качестве переменных (или полей класса) String, три слова, например " +
//                "\"Один\", \"Два\", \"Три\", \nзакончите ввод нажатием клавиши Enter: ");
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        String str3 = scanner.next();
//
//        getInstances(str1, str2, str3);
//        return scanner;
//    }
//    public static void getInstances(String str1, String str2, String str3) {
//        System.out.println();
//        System.out.println("Используя три введенных переменных, создаем экземпляр класса FileInformation и " +
//                "обращаемся к этим трём переменным, \nимя экземпляра класса \"getInstances\": ");
//        String object1 = str1;
//        String object2 = str2;
//        String object3 = str3;
//        System.out.println("Экземпляр класса 1: " + object1 + "\nЭкземпляр класса 2: " + object2 +
//                "\nЭкземпляр класса 3: " + object3);
//    }
//
//    public void getInstances() {
//    }
//}
////        Конец Примера _ КККККККККККККККК
//


////        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
////  Пример взят отсюда: https://gist.github.com/ezhov-da/1544cb56555f6319f5bc25dc804700e1
//public class Draft_Whole_Video1_3_5_0 {
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходное число: " + builder);
//
//        int ost = Integer.parseInt(builder.toString()) % 100;
//        int ost2 = ost % 10;
//
//        StringBuilder builder1 = new StringBuilder(builder + " программист");
//        StringBuilder builder2 = new StringBuilder(builder + " программиста");
//        StringBuilder builder3 = new StringBuilder(builder + " программистов");
//
//        if (ost > 9 && ost < 20) {
//            System.out.println("Результат: " + builder3);
//        } else {
//            if (ost2 == 1) {
//                System.out.println("Результат: " + builder1);
//
//            } else if (ost2 > 1 && ost < 5) {
//                System.out.println("Результат: " + builder2);
//
//            } else {
//                System.out.println("Результат: " + builder3);
//
//            }
//        }
//    }
//}
////        Конец Примера _ КККККККККККККККК





////        Пример 7 ППППППППППППППППППППППППППППППППППП осталось - 14 - символов
////  Пример взят отсюда: https://gist.github.com/ezhov-da/1544cb56555f6319f5bc25dc804700e1
//public class Draft_Whole_Video1_3_5_0 {
//
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Пользователь вводит число, любое. 237, например. " +
//                "\nВыведите: 237 программистов, окончание должно зависеть от числа. 1 программист, " +
//                "\n2 программиста, и так далее\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//        System.out.println("Исходное число: " + builder);
//
//        String text = "%s %s";
//
//        System.out.println("Результат: " +
//                String.format(text,
//                        builder,
//                        getName(builder, "программист", "программиста", "программистов"))
//        );
//    }
//
//    public static String getName(StringBuilder countOrigin, String firststr, String secondstr, String thirdstr) {
//        int count = Integer.parseInt(countOrigin.toString());
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
////        Конец Примера 7 КККККККККККККККК






