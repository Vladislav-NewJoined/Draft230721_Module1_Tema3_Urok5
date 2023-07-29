import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft_Task1_3_5_3 {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.  Пользователь вводит слово. Добавьте к нему в начало «вы говорите" +
                ":» ... слово пользователя. И в конец: «.. и что?»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");

        StringBuilder inputBuilder = new StringBuilder(scanner.nextLine());
        inputBuilder.insert(0, "вы говорите, ");

        String str = inputBuilder.toString();
        inputBuilder = inputBuilder.append(", и что?");
        String str2 = inputBuilder.toString();
        System.out.println("Результат: " + str2);
    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_3 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.  Пользователь вводит пять слов, соберите из них целую строку, между " +
//                "каждым словом вставьте «, и»\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пять слов поочередно: ");
//
//        String containerStr = "";
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Введите слово " + (i + 1) + ": ");
//            StringBuilder builder = new StringBuilder(scanner.nextLine());
//            containerStr = containerStr + builder + " ";
//        }
//
//        System.out.println("Исходная строка: " + containerStr);
//
//
//
//        StringBuilder builderInput = new StringBuilder(containerStr);
//        StringBuilder builderResult = new StringBuilder(containerStr);
////        builderResult = builderInput.replaceAll("\\s", "");
//
//        for (int i = 0; i < containerStr.length(); i++) {
//            if (containerStr.charAt(i) == ' ') {
//                builderResult.insert(i + 1, ", и ");
//                builderResult.deleteCharAt(i);
//            }
//
//        }
//        System.out.println("Результат: " + builderResult);
//    }
//}
////        Конец Примера 3 КККККККККККККККК







////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_3 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.  Пользователь вводит пять слов, соберите из них целую строку, между " +
//                "каждым словом вставьте «, и»\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пять слов поочередно: ");
//
//        String containerStr = "";
//        for (int i =0; i < 5; i++) {
//            System.out.print("Введите слово " + (i + 1) + ": ");
//            StringBuilder builder = new StringBuilder(scanner.nextLine());
//            containerStr = containerStr + builder + " ";
//        }
//
//        System.out.println("Исходная строка: " + containerStr);
//    }
//}
////        Конец Примера 2 КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_3 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.  Пользователь вводит пять слов, соберите из них целую строку, между " +
//                "каждым словом вставьте «, и»\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите три слова разделяя клавишей 'пробел' или 'enter': ");
//        StringBuilder builder = new StringBuilder(/*scanner.nextLine()*/);
//
//        for (int i = 0; i < 3; i++) {
//            String word = scanner.next();
//            builder.insert(0, word + " ");
//        }
//
//        String resultString = builder.toString();
//        System.out.println("Итоговая строка: \"" + resultString.trim() + "\"");
//    }
//}
////        Конец Примера 1 КККККККККККККККК







