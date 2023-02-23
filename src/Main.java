public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
    }

    public static void task1() {
        System.out.println("Задача №1:");

        int human = 17;
        if (human >= 18) {
            System.out.println("Человек совершеннолетний.");
        } else {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача №2:");
        int temperature = 8;
        if (temperature < 6) {
            System.out.println(" На улице " + temperature + " градуса(ов), нужно надеть шапку. ");
        } else {
            System.out.println(" На улице " + temperature + " градуса(ов), можно идти без шапки.");

        }
    }

    public static void task3() {
        System.out.println("Задача №3:");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Cкорость, " + speed + " км/ч, придется заплатить штраф.");
        } else {
            System.out.println(" Можно ездить спокойно, скорость " + speed + " км/ч.");

        }
    }

    public static void task4() {
        System.out.println("Задача №4:");
        int human = 14;
        if (human >= 2 && human < 6) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад.");
        }
        if (human >= 7 && human <= 18) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу.");
        }
        if (human > 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + ", то его место в университете.");
        }
        if (human > 24) {
            System.out.println("Если возраст человека равен " + human + ", то его место в университете.");
        }
    }

    public static void task5() {
        System.out.println("Задача №5:");
        int Kid = 14;
        if (Kid < 5) {
            System.out.println("Если возраст ребенка равен" + Kid + ", то ему нельзя кататься на аттракционе.");
        }
        if (Kid >= 5 && Kid < 14) {
            System.out.println("Если возраст ребенка равен " + Kid + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (Kid >= 14) {
            System.out.println("Если возраст ребенка равен " + Kid + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }

    public static void task6() {
        System.out.println("Задача №6:");
        //int van = 102;
        int seating = 60;
        int StandingPlaces = 42;

        if (seating < 60) {
            System.out.println("В вагоне есть сидячие места.");
        }
        if (StandingPlaces < 42) {
            System.out.println("В вагоне есть стоячие места.");
        } else if (seating >= 60 && StandingPlaces >= 42) {
            System.out.println("Вагон уже полностью забит.");
        }

    }

    public static void task7() {
        System.out.println("Задача №7:");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println(one + " - большее число.");
        } else if (two >=one && two >= three) {
            System.out.println(two + " - большее число.");
         }  else {System.out.println(three + " - большее число.");

        }

    }
}




       // С помощью условного оператора и конструкции else напишите программу,
       // которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.









