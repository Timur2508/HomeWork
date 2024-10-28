public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        var dog1 = 8.0 + 4;
        System.out.println(dog1);
        var cat1 = 3.6 + 4;
        System.out.println(cat1);
        var paper1 = 763789 + 4;
        System.out.println(paper1);

        System.out.println("Задача 3");
        var dog2 = 8.0 + 4 - 3.5;
        System.out.println(dog2);
        var cat2 = 3.6 + 4 - 1.6;
        System.out.println(cat2);
        var paper2 = 763789 + 4 - 7639;
        System.out.println(paper2);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        var increaseBy = 19 + 2;
        System.out.println("increaseBy");
        var divisionBy = increaseBy /7;
        System.out.println(divisionBy);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        var anIncreaseOf10 = 3.5 * 10;
        System.out.println(anIncreaseOf10);
        var divisionBy3WithHalf   = anIncreaseOf10 / 3.5;
        System.out.println(divisionBy3WithHalf);
        var increaseBy4 =  divisionBy3WithHalf + 4;
        System.out.println(increaseBy4);

        System.out.println("Задача 6");
        var oneBoxer = 78.2;
        System.out.println(oneBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);
        var totalWeightOfTwoFighters = oneBoxer + secondBoxer;
        System.out.println(totalWeightOfTwoFighters);
        var differenceBetweenTheWeightsOfTheFighters = secondBoxer - oneBoxer;
        System.out.println(differenceBetweenTheWeightsOfTheFighters);

        System.out.println("Задача 7");
        var differenceInTheWeightsOfAthletesFirstWay = secondBoxer - oneBoxer;
        var differenceInTheWeightsOfAthletesSecondWay = secondBoxer % oneBoxer;
        System.out.println(differenceInTheWeightsOfAthletesFirstWay);
        System.out.println(differenceInTheWeightsOfAthletesSecondWay);

        System.out.println("Задача 8");
        var totalNumberOfHours = 640;
        var timeOfEachEmployee = 8;
        var totalEmployees = totalNumberOfHours / timeOfEachEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + "  человек");

        System.out.println("Задание 8 (2)");
        var increaseBy94TotalEmployees =  totalEmployees  + 94;
        var totalTimeIfIncreaseBy94Employees =  increaseBy94TotalEmployees * timeOfEachEmployee;
        System.out.println(increaseBy94TotalEmployees);
        System.out.println("Если в компании работает - " + increaseBy94TotalEmployees + "  человека," + " то всего " + totalTimeIfIncreaseBy94Employees +  " часов работы может быть поделено между сотрудниками"
        );

    }
}