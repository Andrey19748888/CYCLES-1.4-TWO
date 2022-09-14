public class Main {
    public static void main(String[] args) {



        // 1 задача


       int savings = 200000;
       int objective = 2459000;
       int month = 1;
       while (savings < objective) {
           System.out.println("");
           System.out.println("1%: " + savings/100);
           savings = savings + savings/100;     // savings += savings/100
           System.out.println("Месяц " + month + " сумма накоплений равна " + savings + " рублей");
           month++;


       }






    }
}