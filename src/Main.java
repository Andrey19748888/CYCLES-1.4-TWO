public class Main {
    public static void main(String[] args) {



        // 2.1 задача


        int money = 15000;
        int total = 0;
        for ( int i = 0; total <= 12000000; i++) {
            total = total + total / 100 * 7;
            total =  total + money;
            System.out.println("Месяц " + i + " сумма " + total + " рублей ");
        }


    }
}