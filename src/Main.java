public class Main {
    public static void main(String[] args) {


       // 3 задание


        int population = 12000000;
       int fertility = population / 1000 * 17;
       int mortality = population / 1000 * 8;
       int years = 0;
       int populationGrowthInOneYear = fertility - mortality;
       for (years = 1; years <= 10; years++) {
            population = population + populationGrowthInOneYear;
            System.out.println("Год " + years + " численность населения состовляет " + population);
        }


    }
}