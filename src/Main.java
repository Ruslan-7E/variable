public class Main {
    public static void main(String[] args) {
        // task 1
        int stickers = 7;
        byte pens = 2;
        short erasers = 3;
        long pins = 15567L;

//        System.out.println(stickers);
//        System.out.println(pens);
//        System.out.println(erasers);
//        System.out.println(pins);

        float penWeight = 15.4f;
        double boxWeight = 25.7;
        boolean javaIsCool = true;
        char firstNameLetter = 'R';

//        System.out.println(penWeight);
//        System.out.println(boxWeight);
//        System.out.println(javaIsCool);
//        System.out.println(firstNameLetter);

        // task 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double commonWeight = firstBoxerWeight + secondBoxerWeight;
        double weightDifference = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Общий вес бойцов равен " + commonWeight + " кг.");
        System.out.println("Второй боксер тяжелее первого на " + weightDifference + " кг.");

        // task 3
        int bananaWeight = 80;
        int milkWeightOf100ml = 105;
        int icecreamWeight = 100;
        int eggWeight = 70;

        int recipeWeightInGram = 5 * bananaWeight + 2 * milkWeightOf100ml + 2 * icecreamWeight + 4 * eggWeight;

        System.out.println("Вес спорт-завтрака в граммах равен " + recipeWeightInGram + " гр.");

        int recipeWeightInKilo = recipeWeightInGram / 1000;

        System.out.println("Вес спорт-завтрака в килограммах равен " + recipeWeightInKilo + " кг.");

        // task 4
        int tipOne = 250;
        int tipTwo = 500;
        int weightToLose = 7000;

        int numOfDaysTip1 = weightToLose / tipOne;
        System.out.println("При первом рационе потребуется " + numOfDaysTip1 + " дней.");

        int numOfDaysTip2 = weightToLose / tipTwo;
        System.out.println("При втором рационе потребуется " + numOfDaysTip2 + " дней.");
        System.out.println("В среднем потребуется " + (numOfDaysTip1 + numOfDaysTip2) / 2 + " день.");

        // task 5
        int salaryMasha = 67_760;
        int salaryChristina = 76_230;
        int salaryDenis = 83_690;

//        int yearMashaIncome = salaryMasha * 12;
//        int yearChristinaIncome = salaryChristina * 12;
//        int yearDenisIncome = salaryDenis * 12;

        double coef = 0.1;

        int salaryNewMasha = (int) (salaryMasha + salaryMasha * coef);
        int salaryNewChristina = (int) (salaryChristina + salaryChristina * coef);
        int salaryNewDenis = (int) (salaryDenis + salaryDenis * coef);

        int mashaDiff = (salaryNewMasha - salaryMasha) * 12;
        int christinaDiff = (salaryNewChristina - salaryChristina) * 12;
        int denisDiff = (salaryNewDenis - salaryDenis) * 12;

        System.out.println("Маша теперь получает " + salaryNewMasha + " рублей. Годовой доход вырос на " + mashaDiff + " рублей.");
        System.out.println("Кристина теперь получает " + salaryNewChristina + " рублей. Годовой доход вырос на " + christinaDiff + " рублей.");
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
    }

    // homework is made
}