public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 24));
        System.out.println("--------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("--------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("--------------");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean havliyormu, int saat) {
        if (saat < 0 || saat > 23) {
            return false;
        }
        if (havliyormu) {
            if (saat >= 8 && saat <= 20) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double ilkKenar, double ikinciKenar) {
        if (ilkKenar < 0 || ikinciKenar < 0) {
            return -1;
        } else {
            return ilkKenar * ikinciKenar;
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2.0);
    }
}
