import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!
// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
public class Draft_Task1_3_5_8 {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
                "Используйте StringBuilder." +
                "\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате 'yyyy-MM-dd', например, 2011-01-18: ");
        StringBuilder inputDate = new StringBuilder(scanner.nextLine());
        System.out.println("Исходная дата: " + inputDate);

        String inStr = inputDate.toString();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inStr);
        String outStr = new SimpleDateFormat("dd/MM/yyyy").format(date);
        System.out.println("Дата, полученная в результате: " + outStr); // 18/01/2011

        StringBuilder inputPageURL = new StringBuilder("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
        String inputPageStr = inputPageURL.toString();

        int startIndexInputPageURL1 = inputPageURL.lastIndexOf("date_req1=") + 10;
        int endIndexInputPageURL1 = inputPageURL.lastIndexOf("&date_req2=");
        System.out.println(startIndexInputPageURL1);
        System.out.println(endIndexInputPageURL1);
        String substring1 = inputPageStr.substring(startIndexInputPageURL1, endIndexInputPageURL1);
        System.out.println(substring1);

        int startIndexInputPageURL2 = inputPageURL.lastIndexOf("&date_req2=") + 11;
        int endIndexInputPageURL2 = inputPageURL.lastIndexOf("&VAL");
        System.out.println(startIndexInputPageURL2);
        System.out.println(endIndexInputPageURL2);
        String substring2 = inputPageStr.substring(startIndexInputPageURL2, endIndexInputPageURL2);
        System.out.println(substring2);

        StringBuilder outputPageURL1 = inputPageURL.replace(startIndexInputPageURL1, endIndexInputPageURL1, outStr);
        StringBuilder outputPageURLFinish = outputPageURL1.replace(startIndexInputPageURL2, endIndexInputPageURL2, outStr);
        System.out.println(outputPageURLFinish);

        String page = downloadWebPage(outputPageURLFinish.toString());

        if (page.contains("<Value>")) {
            int startIndex = page.lastIndexOf("<Value>");
            int endIndex = page.lastIndexOf("</Value>");
            String courseStr = page.substring(startIndex + 7, endIndex);
            System.out.println(courseStr);
        } else {
            System.out.println("На введённую дату курс не установлен.");
        }
    }
    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
//        Конец Примера _ ККККККККККККККК







////        Пример 5 ППППППППППППППППППППППППППППППППППП
//// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
//// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//public class Draft_Task1_3_5_8 {
//// Надо, чтобы дата была: 12/11/2021
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
//                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
//                "Используйте StringBuilder." +
//                "\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите дату в формате 'yyyy-MM-dd', например, 2011-01-18: ");
//        StringBuilder inputDate = new StringBuilder(scanner.nextLine());
////        System.out.println("Исходная строка: \"" + inputDate + "\"");
//        System.out.println("Исходная дата: " + inputDate);
//
//        String inStr = inputDate.toString();
////        System.out.println("Было: " + inStr);
//        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inStr);
//        String outStr = new SimpleDateFormat("dd/MM/yyyy").format(date);
//        System.out.println("Дата, полученная в результате: " + outStr); // 18/01/2011
//
//        StringBuilder inputPageURL = new StringBuilder("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
//        String inputPageStr = inputPageURL.toString();
//
//        int startIndexInputPageURL1 = inputPageURL.lastIndexOf("date_req1=") + 10;
//        int endIndexInputPageURL1 = inputPageURL.lastIndexOf("&date_req2=");
//        System.out.println(startIndexInputPageURL1);
//        System.out.println(endIndexInputPageURL1);
//        String substring1 = inputPageStr.substring(startIndexInputPageURL1, endIndexInputPageURL1);
//        System.out.println(substring1);
//
//        int startIndexInputPageURL2 = inputPageURL.lastIndexOf("&date_req2=") + 11;
//        int endIndexInputPageURL2 = inputPageURL.lastIndexOf("&VAL");
//        System.out.println(startIndexInputPageURL2);
//        System.out.println(endIndexInputPageURL2);
//        String substring2 = inputPageStr.substring(startIndexInputPageURL2, endIndexInputPageURL2);
//        System.out.println(substring2);
//
//        StringBuilder outputPageURL1 = inputPageURL.replace(startIndexInputPageURL1, endIndexInputPageURL1, outStr);
////        System.out.println(outputPageURL1);
//        StringBuilder outputPageURLFinish = outputPageURL1.replace(startIndexInputPageURL2, endIndexInputPageURL2, outStr);
//        System.out.println(outputPageURLFinish);
//
//        String page = downloadWebPage(outputPageURLFinish.toString());
//
//        if (page.contains("<Value>")) {
////        System.out.println(page);
//            int startIndex = page.lastIndexOf("<Value>");
//            int endIndex = page.lastIndexOf("</Value>");
////        System.out.println(startIndex);
////        System.out.println(endIndex);
////        System.out.println(page.substring(startIndex + 7, endIndex));
//            String courseStr = page.substring(startIndex + 7, endIndex);
//            System.out.println(courseStr);
//        } else {
//            System.out.println("На введённую дату курс не установлен.");
//        }
//    }
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
//}
////        Конец Примера 5 ККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП  РАБОТАЕТ!!!
//// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
//// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//public class Draft_Task1_3_5_8 {
//// Надо, чтобы дата была: 12/11/2021
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
//                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
//                "ИспользуйтеStringBuilder." +
//                "\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите дату в формате 'yyyy-MM-dd', например, 2011-01-18: ");
//        StringBuilder inputDate = new StringBuilder(scanner.nextLine());
////        System.out.println("Исходная строка: \"" + inputDate + "\"");
//        System.out.println("Исходная дата: " + inputDate);
//
//        String inStr = inputDate.toString();
////        System.out.println("Было: " + inStr);
//        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inStr);
//        String outStr = new SimpleDateFormat("dd/MM/yyyy").format(date);
//        System.out.println("Дата, полученная в результате: " + outStr); // 18/01/2011
//
//        StringBuilder inputPageURL = new StringBuilder("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
//        String inputPageStr = inputPageURL.toString();
//
//        int startIndexInputPageURL1 = inputPageURL.lastIndexOf("date_req1=") + 10;
//        int endIndexInputPageURL1 = inputPageURL.lastIndexOf("&date_req2=");
//        System.out.println(startIndexInputPageURL1);
//        System.out.println(endIndexInputPageURL1);
//        String substring1 = inputPageStr.substring(startIndexInputPageURL1, endIndexInputPageURL1);
//        System.out.println(substring1);
//
//        int startIndexInputPageURL2 = inputPageURL.lastIndexOf("&date_req2=") + 11;
//        int endIndexInputPageURL2 = inputPageURL.lastIndexOf("&VAL");
//        System.out.println(startIndexInputPageURL2);
//        System.out.println(endIndexInputPageURL2);
//        String substring2 = inputPageStr.substring(startIndexInputPageURL2, endIndexInputPageURL2);
//        System.out.println(substring2);
//
//
//
//
//        StringBuilder outputPageURL1 = inputPageURL.replace(startIndexInputPageURL1, endIndexInputPageURL1, outStr);
////        System.out.println(outputPageURL1);
//        StringBuilder outputPageURLFinish = outputPageURL1.replace(startIndexInputPageURL2, endIndexInputPageURL2, outStr);
//        System.out.println(outputPageURLFinish);
//
//        String page = downloadWebPage(outputPageURLFinish.toString());
////        System.out.println(page);
//        int startIndex = page.lastIndexOf("<Value>");
//        int endIndex = page.lastIndexOf("</Value>");
////        System.out.println(startIndex);
////        System.out.println(endIndex);
////        System.out.println(page.substring(startIndex + 7, endIndex));
//        String courseStr = page.substring(startIndex + 7, endIndex);
//        System.out.println(courseStr);
//
////// видео мин 0 54 10 - Теперь давайте выведем курс за два разных дня
////        String page1 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
//////        System.out.println(page);
////        int startIndex1 = page.lastIndexOf("<Value>");
////        int endIndex1 = page.lastIndexOf("</Value>");
//////        System.out.println(startIndex);
//////        System.out.println(endIndex);
//////        System.out.println(page.substring(startIndex + 7, endIndex));
////        String courseStr1 = page.substring(startIndex1 + 7, endIndex1);
////
////        String page2 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2020&date_req2=13/11/2020&VAL_NM_RQ=R01235");
//////        System.out.println(page);
////        int startIndex2 = page.lastIndexOf("<Value>");
////        int endIndex2 = page.lastIndexOf("</Value>");
//////        System.out.println(startIndex);
//////        System.out.println(endIndex);
//////        System.out.println(page.substring(startIndex + 7, endIndex));
////        String courseStr2 = page.substring(startIndex2 + 7, endIndex2);
//
//    }
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
//
//
//    }
//}
////        Конец Примера 4 ККККККККККККККК







////        Пример 3 ППППППППППППППППППППППППППППППППППП  Переформатирование с помощью SimpleDateFormat
//// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
//// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//public class Draft_Task1_3_5_8 {
//// Надо, чтобы дата была: 12/11/2021
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
//                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
//                "ИспользуйтеStringBuilder." +
//                "\n\nРешение: ");
//
////        String oldstring = "2011-01-18";
////        System.out.println("Было: " + oldstring);
////        LocalDateTime datetime = LocalDateTime.parse(oldstring, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
////        String newstring = datetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
////        System.out.println("Стало: " + newstring); // 18/01/2011
////        System.out.println(); //  перенос строки
//
//        String oldstring2 = "2011-01-18";
//        System.out.println("Было: " + oldstring2);
//        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring2);
//        String newstring2 = new SimpleDateFormat("dd/MM/yyyy").format(date);
//        System.out.println("Стало: " + newstring2); // 18/01/2011
//    }
//}
////        Конец Примера 3 ККККККККККККККК







////        Пример 2 ППППППППППППППППППППППППППППППППППП Работает, доделать надо
//// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
//// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//public class Draft_Task1_3_5_8 {
//// Надо, чтобы дата была: 12/11/2021
//
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
//                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
//                "ИспользуйтеStringBuilder." +
//                "\n\nРешение: ");
//
//        String input = "20120514045300.0Z";
//
//        DateFormat inputDF  = new SimpleDateFormat("yyyyMMddHHmmss'.0Z'");
////        DateFormat outputDF = new SimpleDateFormat("yyyy-MM-dd'-T'HHmmss.'0Z'");
//        DateFormat outputDF = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date = inputDF.parse(input);
//        String output = outputDF.format(date);
//
//        System.out.println(input);  // Prints 2012-05-14-T045300.0Z as expected.
//        System.out.println(output);  // Prints 2012-05-14-T045300.0Z as expected.
//
////        DateFormat inputDF  = new SimpleDateFormat("EEE, d MMM yyyy H:m:s z");
////        DateFormat outputDF = new SimpleDateFormat("d MMM yyyy");
////
////        String input = "Mon, 14 May 2012 13:56:38 GMT";
////        Date date;
////        date = inputDF.parse(input);
////        String output = outputDF.format(date);
////
////        System.out.println(output);
//    }
//}
////        Конец Примера 2 ККККККККККККККК








////        Пример 1 ППППППППППППППППППППППППППППППППППП
//// Инфо здесь: Модуль 1, Тема 1, Урок 6. Как найти анализ курса валют за определенную дату. Урок 6 Видео мин 0.44.56
//// https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//public class Draft_Task1_3_5_8 {
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n8. Вернитесь к программе, которая запрашивает курс валют. Напишите " +
//                "генератор даты для запроса к апи, на основе даты, \nвведенной пользователем. " +
//                "ИспользуйтеStringBuilder." +
//                "\n\nРешение: ");
//// https://cbr.ru/scripts/XML_dynamic.asp?date_req1=12/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235
//// видео мин 0 54 10 - Давайте выведем курс за два разных дня
//        String page = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
////        System.out.println(page);
//        int startIndex = page.lastIndexOf("<Value>");
//        int endIndex = page.lastIndexOf("</Value>");
////        System.out.println(startIndex);
////        System.out.println(endIndex);
////        System.out.println(page.substring(startIndex + 7, endIndex));
//        String courseStr = page.substring(startIndex + 7, endIndex);
//
//// видео мин 0 54 10 - Теперь давайте выведем курс за два разных дня
//        String page1 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2021&date_req2=13/11/2021&VAL_NM_RQ=R01235");
////        System.out.println(page);
//        int startIndex1 = page.lastIndexOf("<Value>");
//        int endIndex1 = page.lastIndexOf("</Value>");
////        System.out.println(startIndex);
////        System.out.println(endIndex);
////        System.out.println(page.substring(startIndex + 7, endIndex));
//        String courseStr1 = page.substring(startIndex1 + 7, endIndex1);
//
//        String page2 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/11/2020&date_req2=13/11/2020&VAL_NM_RQ=R01235");
////        System.out.println(page);
//        int startIndex2 = page.lastIndexOf("<Value>");
//        int endIndex2 = page.lastIndexOf("</Value>");
////        System.out.println(startIndex);
////        System.out.println(endIndex);
////        System.out.println(page.substring(startIndex + 7, endIndex));
//        String courseStr2 = page.substring(startIndex2 + 7, endIndex2);
//
//    }
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
//}
////        Конец Примера 1 ККККККККККККККК









