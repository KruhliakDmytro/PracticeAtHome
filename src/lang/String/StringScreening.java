package lang.String;

public class StringScreening {

    private String s = "new line";
    public static void main(String[] args) {


        System.out.println("Hello I'm trying to s.out \"this String\"");
        System.out.println("C:\\programing\\java\\home\b"); // \b + \r in console gives empty line
        System.out.println('\r');
        System.out.println("\"x\" \f");
        System.out.println("\u16A6 \u16C1 \u16D6 \u16DC \u16BA");
        System.out.println("\u041c\u0430\u0301\u043e " +
                "\u0426\u0437\u044d\u0434\u0443\u0301\u043d " +
                "\u0028\u043a\u0438\u0442\u002e \u0442\u0440\u0430\u0434\u002e " +
                "\u6bdb\u6fa4\u6771\u002c \u0443\u043f\u0440\u002e " +
                "\u6bdb\u6cfd\u4e1c\u002c \u043f\u0438\u043d\u044c\u0438\u043d\u044c\u003a " +
                "\u004d\u00e1\u006f \u005a\u00e9\u0064\u014d\u006e\u0067\u0029 " +
                "\u2014 \u043a\u0438\u0442\u0430\u0439\u0441\u043a\u0438\u0439 " +
                "\u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0439 " +
                "\u0438 \u043f\u043e\u043b\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 " +
                "\u0434\u0435\u044f\u0442\u0435\u043b\u044c \u0058\u0058 \u0432\u0435\u043a\u0430\u002c " +
                "\u0433\u043b\u0430\u0432\u043d\u044b\u0439 \u0442\u0435\u043e\u0440\u0435\u0442\u0438\u043a " +
                "\u043c\u0430\u043e\u0438\u0437\u043c\u0430\u002e");

        System.out.printf("Процент жира в организме : %d%%", 415,45345,555,65);
        System.out.println("1 + 2 " + 1 + 2);
    }
}
