package OperatoreTernario2;

public class opTern2 {

        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Valore: " + i);
                System.out.println(checkValue(i));
            }
        }

        public static String checkValue (int val){
            return val % 5 == 0 ?
                    "fizzBuzz":
                    "buzz";
        }
}
