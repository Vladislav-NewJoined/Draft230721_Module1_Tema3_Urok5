public class Draft_Whole_Video1_3_5_0 {
    public static void main(String[] args) {
        //  Урок 5. StringBuilder, обработка строк
        //  закончил мин 39 40

        //  видео мин 03 38 - метод insert
        //  видео мин 05 20 - метод delete и deleteCharAt
        //  видео мин 07 59 - метод replace
        //  видео мин 08 24 - зАбОрЧиКоМ
        //  видео мин 08 44 - input
        //  видео мин 13 45 - слова в обратном порядке
        //  видео мин 16 10 - ищем json terminator
        //  видео мин 36 40 - CTRL + ALT + M - создает новый метод

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