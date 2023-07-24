import java.io.File;
import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП
//  Пример с классом FileInformation2 взят отсюда:
//  видео мин 16 57  Урок 1. Введение в классы. Поля класса. Процедурное программирование, ООП,
//  организация кода Module1_Tema3_Urok1
public class Draft_Task1_3_5_11 {
    public static void main(String[] args) {
        System.out.println("Задание: \n11.  Пусть пользователь вводит поля класса FileInformation2, " +
                "\nно в одну строку; формат придумайте сами. Считайте ввод пользователя и из него " +
                "\nсоздайте экземпляр класса.\n\nРешение: ");

        File file = new File("test2.txt");
//        String absolutePath = file.getAbsolutePath();
//        String fileName = file.getName();
//        long size = file.length();

        FileInformation2 info2 = new FileInformation2(); // видео мин 18 12 Так у нас объявляется экземпляр класса
        // видео мин 19 15 Теперь мы можем уже обращться к полям:
        info2.absolutePath = file.getAbsolutePath();
        info2.fileName = file.getName();
        info2.size = file.length();





//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите поля класса FileInformation2 в одну строку: ");
//        StringBuilder builder = new StringBuilder(scanner.nextLine());
//
//        String resultString = builder.toString();
//        System.out.println("Результат: \"" + resultString.trim() + "\"");
    }
}
//        Конец Примера _ КККККККККККККККК