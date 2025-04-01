class Recurssion {
    public static void main(String[] args) {
        System.out.println(recurssion1(1));
        System.out.println(recurssion2(9, 4));
        System.out.println(recurssion3(9));
    }

    public static int recurssion1(int x) {
        if (x < 6) {
            return x + recurssion1(x + 2);
        } else {
            return x - 1;
        }
    }

    public static int recurssion2(int x, int y) {
        if (x > 6) {
            return recurssion2(x - 2, 2 * y) + 1;
        } else if (x > 2) {
            return recurssion2(x - 3, y - 1) + 2;
        } else {
            return 2 * x - y;
        }
    }

    public static int recurssion3(int x) {
        if (x >= 4) {
            return recurssion3(recurssion3(x - 2) + 1);
        } else if (x >= 2) {
            return recurssion3(x - 1) - 1;
        } else {
            return x + 3;
        }
    }
}