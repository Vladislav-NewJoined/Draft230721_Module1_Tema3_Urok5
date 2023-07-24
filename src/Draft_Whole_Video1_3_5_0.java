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






