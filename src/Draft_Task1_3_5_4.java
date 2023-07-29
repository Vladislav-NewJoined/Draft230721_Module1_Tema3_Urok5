import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft_Task1_3_5_4 {
    public static void main(String[] args) {
        System.out.println("Задание: \n4.  Пользователь вводит пять слов, соберите из них целую строку, между " +
                "каждым словом вставьте «, и»\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять слов поочередно: ");

        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            inputBuilder = new StringBuilder(inputBuilder + scanner.nextLine() + " ");
        }

        String inputPr = String.valueOf(inputBuilder);
        String input = inputPr.trim();
        System.out.println("Исходная строка: " + input);

        String result = input.replaceAll("\\s", ", и ");
        System.out.println("Результат: " + result);
    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_4 {
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
//public class Draft_Task1_3_5_4 {
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
//public class Draft_Task1_3_5_4 {
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







