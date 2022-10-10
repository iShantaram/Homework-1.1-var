public class Main {
    public static void main(String[] args) {
        // HW1
        // Task 1
        System.out.println("\nTask 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog: " + dog + "\nCat: " + cat + "\nPaper: " + paper);

        // Task 2
        System.out.println("\nTask 2");
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("Dog: " + dog + "\nCat: " + cat + "\nPaper: " + paper);

        // Task 3
        System.out.println("\nTask 3");
        //dog = (int) (dog - 3.5);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Dog: " + dog + "\nCat: " + cat + "\nPaper: " + paper);

        // HW2
        // Task 4
        System.out.println("\nTask 4");
        var friend = 19;
        System.out.println("Friend: " + friend);
        System.out.println(friend += 2);
        System.out.println(friend = friend/7);

        // Task 5
        System.out.println("\nTask 5");
        var frog = 3.5;
        System.out.println("Frog: " + frog);
        System.out.println(frog *= 10);
        System.out.println(frog /= 3.5);
        System.out.println(frog += 4);

        // HW3
        // Task 6
        System.out.println("\nTask 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров = " + summaryWeight);
        var diffWeight = abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Разница в весе двух боксеров = " + diffWeight);

        // Task 7
        System.out.println("\nTask 7");
        var diffWeightDif = 0.0;
        var diffWeightDiv = 0.0;
        var smallerWeight = firstBoxerWeight > secondBoxerWeight ? secondBoxerWeight : firstBoxerWeight;
        var biggerWeight= firstBoxerWeight > secondBoxerWeight ? firstBoxerWeight : secondBoxerWeight;

        diffWeightDif = biggerWeight - smallerWeight;
        diffWeightDiv = biggerWeight % smallerWeight;

        System.out.println("Разница в весе двух боксеров (вычитание): " + diffWeightDif);
        System.out.println("Разница в весе двух боксеров (остаток от деления): " + diffWeightDiv);

        // Task 8
        System.out.println("\nTask 8");

        var allWorkHours = 640;
        var hoursForOneWorker = 8;
        var countWorkers = allWorkHours / hoursForOneWorker;
        System.out.println("Всего сотрудников в комнпании - " + countWorkers + " человек!");

        var moreWorkers = countWorkers + 94;
        var newAllWorkHours = hoursForOneWorker * moreWorkers;
        System.out.println("Если в компании работает " + moreWorkers + " человек, то всего " +
                newAllWorkHours + " часов работы может быть поделено между сотрудниками!");

        System.out.println("\n ~ ~ ~ ~ ~ The end ~ ~ ~ ~ ~ \n");
    }

    private static double abs(double v) {
        return v > 0 ? v : -v;
    }

}