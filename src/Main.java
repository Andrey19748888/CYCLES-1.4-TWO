public class Main {
    public static void main(String[] args) {



        // tack 2.3

        int money = 15000;
        int total = 0;
        int i = 0;
        for (; i <= 108; i++) {
            total = total + total / 100 * 7;
            total =  total + money;
            if (i % 6 == 0);
            System.out.println("Месяц " + i + " сумма " + total + " рублей ");
        }









    }
}