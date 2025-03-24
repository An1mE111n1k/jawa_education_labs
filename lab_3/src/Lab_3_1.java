public class Lab_3_1 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int degit = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    degit += j;
                }
            }
            if (degit % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

