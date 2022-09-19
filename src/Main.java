public class Main {
    public static void main(String[] args) {



        // ИСПРАВЛЕНИЕ ОШИБОК

        // task 2.1 Заменил переменную i на month.


        int money = 15000;
        int total = 0;
        int month = 1;
        for ( month = 0; total <= 12000000; month++) {
            total = total + total / 100 * 7;
            total =  total + money;
            System.out.println("Месяц " + month + " сумма " + total + " рублей ");
        }

        System.out.println();
        System.out.println();
        System.out.println();



        // task 2.2 Убрал " ; " после if.


        int money2 = 15000;
        int total2 = 0;
        int i = 0;
        for (; total2 <= 12000000; i++) {
            total2 = total2 + total2 / 100 * 7;
            total2 = total2 + money2;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма " + total2 + " рублей ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // task 3.1 незделаная задача

        int year = 1896;
        for ( ; year >= 1822 && year <= 2022; year = year +79) {
            System.out.println("Комета подлетала к Земле " + year + " годах");
        }
        for ( ;year >= 2022 && year <= 2122; year = year +79) {
            System.out.println("Комета подлетит к Земле " + year + " году");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // task 3.2 незделаная задача

        int number = 2;
        for (; number <= 20; number+= 2) {
            System.out.println("число " +number);
        }









    }
}