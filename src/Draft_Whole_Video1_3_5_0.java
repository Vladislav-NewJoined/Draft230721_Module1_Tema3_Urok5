import java.io.*;
import java.net.URL;
import java.net.URLConnection;
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





//  ЦИТАТА ИЗ BREAKING BAG с помощью StringBuilder
//import java.util.Scanner;
//        import java.io.*;
//        import java.net.URL;
//        import java.net.URLConnection;

////        Пример _ ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_5_9 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.  Скачайте цитату из breaking bad и замените все плохие слова звёздочками\n\nРешение: ");
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
////        Конец Примера _ ККККККККККККККК






//  ЦИТАТА ИЗ BREAKING BAG с помощью StringBuilder
////        Пример 1 ППППППППППППППППППППППППППППППППППП
///* 4. Научимся получать случайную цитату из сериала в java.*/
///* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ
//ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
//// Перейдем на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитату из фильма.
////  Печатаем данный код (рис.6). ( ниже )
//public class Draft_Task1_3_5_9 {
//
//    public static void main(String[] args) throws IOException {
//        File myFile = new File("quotes.txt");
//        try {
//
//            System.out.println("Задание: \n9. Скачайте цитату из breaking bad и замените все плохие слова звёздочками" +
//                    "\n\nРешение: ");
//            System.out.println("ПРИМЕЧАНИЕ: К сожалению, взятая в качестве альтернативы для получения случайных цитат, " +
//                    "\nстраница не перезагружается при получении следующего запроса от IDE, и выдает цитату, аналогичную " +
//                    "\nпредыдущей. Перезагрузка производится только  вручную непосредственно на веб странице.");
//            System.out.println("Переходим на сайт https://breakingbadapi.com/api/quote/random, это API который выдает случайные цитаты из фильма. " +
//                    "\n(в действительности при решении была взята другая страница ( https://text-box.ru/quotes/source/breaking-bad ), поскольку предложенная страница " +
//                    "\nна момент обращения к ней не работала.)");
//            System.out.println();  // Это перенос строки
//            String page = downloadWebPage("https://breakingbadquotes.xyz/");
//            int quoteStart = page.indexOf("<blockquote class=\"main-quote\" id=\"main-quote\">");
//            int quoteEnd = page.indexOf("<cite>");
//            int signatureStart = page.indexOf("<cite>");
//            int signatureEnd = page.indexOf("</cite>");
//
//            System.out.println("Создаем класс QuotesPage с полями 'Цитата' и 'Подпись', используем его для сохранения цитат и подписей.");
//            System.out.println("Выведено в консоль для примера две цитаты, остальные сохранены в файле 'quotes.txt' в корневом каталоге проекта.");
//
//            QuotesPage quotesPage1 = new QuotesPage();
//            quotesPage1.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage1.signature = page.substring(signatureStart + 6, signatureEnd);
//            System.out.println("Цитата1: \n" + quotesPage1.quote);
//            System.out.println("Подпись1: \n" + quotesPage1.signature + "\n");
//            PrintWriter writer1 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer1.println("Цитата1: \n" + quotesPage1.quote + "\n" + "Подпись1: \n" + quotesPage1.signature + "\n");
//            writer1.flush();
//            writer1.close();
//
//            QuotesPage quotesPage2 = new QuotesPage();
//            quotesPage2.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage2.signature = page.substring(signatureStart + 6, signatureEnd);
//            System.out.println("Цитата2: \n" + quotesPage2.quote);
//            System.out.println("Подпись2: \n" + quotesPage2.signature + "\n");
//            PrintWriter writer2 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer2.println("Цитата2: \n" + quotesPage2.quote + "\n" + "Подпись2: \n" + quotesPage2.signature + "\n");
//            writer2.flush();
//            writer2.close();
//
//            QuotesPage quotesPage3 = new QuotesPage();
//            quotesPage3.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage3.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer3 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer3.println("Цитата3: \n" + quotesPage3.quote + "\n" + "Подпись3: \n" + quotesPage3.signature + "\n");
//            writer3.flush();
//            writer3.close();
//
//            QuotesPage quotesPage4 = new QuotesPage();
//            quotesPage4.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage4.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer4 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer4.println("Цитата4: \n" + quotesPage4.quote + "\n" + "Подпись4: \n" + quotesPage4.signature + "\n");
//            writer4.flush();
//            writer4.close();
//
//            QuotesPage quotesPage5 = new QuotesPage();
//            quotesPage5.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage5.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer5 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer5.println("Цитата5: \n" + quotesPage5.quote + "\n" + "Подпись5: \n" + quotesPage5.signature + "\n");
//            writer5.flush();
//            writer5.close();
//
//            QuotesPage quotesPage6 = new QuotesPage();
//            quotesPage6.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage6.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer6 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer6.println("Цитата6: \n" + quotesPage6.quote + "\n" + "Подпись6: \n" + quotesPage6.signature + "\n");
//            writer6.flush();
//            writer6.close();
//
//            QuotesPage quotesPage7 = new QuotesPage();
//            quotesPage7.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage7.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer7 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer7.println("Цитата7: \n" + quotesPage7.quote + "\n" + "Подпись7: \n" + quotesPage7.signature + "\n");
//            writer7.flush();
//            writer7.close();
//
//            QuotesPage quotesPage8 = new QuotesPage();
//            quotesPage8.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage8.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer8 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer8.println("Цитата8: \n" + quotesPage8.quote + "\n" + "Подпись8: \n" + quotesPage8.signature + "\n");
//            writer8.flush();
//            writer8.close();
//
//            QuotesPage quotesPage9 = new QuotesPage();
//            quotesPage9.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage9.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer9 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer9.println("Цитата9: \n" + quotesPage9.quote + "\n" + "Подпись9: \n" + quotesPage9.signature + "\n");
//            writer9.flush();
//            writer9.close();
//
//            QuotesPage quotesPage10 = new QuotesPage();
//            quotesPage10.quote = page.substring(quoteStart + 55, quoteEnd - 6);
//            quotesPage10.signature = page.substring(signatureStart + 6, signatureEnd);
//            PrintWriter writer10 =
//                    new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer10.println("Цитата10: \n" + quotesPage10.quote + "\n" + "Подпись10: \n" + quotesPage10.signature + "\n");
//            writer10.flush();
//            writer10.close();
//
//            // сюда всавлять catch
//        } catch (IOException ex) {
//            ex.printStackTrace();
//
//        }
//    }
//
//    /*}*/
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//    private static class QuotesPage {
//        public String quote;
//        public String signature;
//    }
//}
////        Конец Примера 1 ККККККККККККККК








