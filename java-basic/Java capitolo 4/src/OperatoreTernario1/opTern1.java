package OperatoreTernario1;

public class opTern1 {
    public static void main(String[] args){

        String luca = "Luca savini re di Roma";

        System.out.println(checkString(luca));

    }

    static String checkString(String value) {
        return value.length() >= 10?
                "Lunghezza maggiore o uguale di 10":
                "Lunghezza minore di 10";
    }
}


