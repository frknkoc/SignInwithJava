import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz...");
        userName = input.nextLine();
        System.out.println("Lütfen kullanıcı şifrenizi giriniz...");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("Giriş bilgileriniz Doğru");
        } else if (!userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("Username bilginiz Hatalı!!!");
        } else if (userName.equals("patika") && !password.equals("patika1234")) {
            System.out.println("Password bilginiz Hatalı!!!");
        } else {
            System.out.println("Giriş bilgileriniz Hatalı!!!");
        }
    }
}