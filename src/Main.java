public class Main {
    public static void main(String[] args) {



        // 2 задача, 2 задание

        int money2 = 15000;
        int total2 = 0;
        int i = 0;
        for (; total2 <= 12000000; i++) {
            total2 = total2 + total2 / 100 * 7;
            total2 =  total2 + money2;
            if (i % 6 == 0);
            System.out.println("Месяц " + i + " сумма " + total2 + " рублей ");
        }









    }
}