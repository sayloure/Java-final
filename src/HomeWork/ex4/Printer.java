package HomeWork.ex4;
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder whereClause = new StringBuilder();
        String[] params = PARAMS.split("\"");

        for (int i = 1; i < params.length; i += 4) {
            String key = params[i];
            String value = params[i + 2];
            if (!"null".equals(value)) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append(" ='").append(value).append("'");
            }
        }

        StringBuilder result = new StringBuilder(QUERY);
        if (whereClause.length() > 0) {
            result.append(whereClause.insert(0, ""));
        }

        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
