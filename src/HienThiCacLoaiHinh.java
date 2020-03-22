import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Danh Sách:");
        System.out.println("1. Hình Chữ Nhật");
        System.out.println("2. Tam Giác Vuông (4 types)");
        System.out.println("3. Tam Giác Đều");
        System.out.println("0. Exit");
        System.out.print("Chọn hình muỗn vẽ: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j <= 6; j++) {
                    System.out.print("* ");
                }
            }
        }

        if (choice == 2) {
            for (int i = 1; i <= 6; i++) {
                System.out.println();
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

            for (int i = 6; i >= 1; i--) {
                System.out.println();
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    if (j < i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 1; i <= 6; i++) {
                for (int j = 6; j >= 1; j--) {
                    if (j <= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        if (choice == 3) {
            for (int i = 1; i < 6; i++) {
                for (int j = 6; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        if (choice == 0) {
            System.out.println("Tạm Biệt");
        }
    }
}
