import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String k_adi,parola;
        System.out.print("Kullanıcı adını giriniz");
        k_adi = scan.nextLine();
        System.out.print("Parolayı giriniz");
        parola = scan.nextLine();
        if (k_adi.equals( "java") && parola.equals(1234)) {
            System.out.print("başarılı bir şekilde giriş yaptınız");
        }else {
            System.out.print("parola veya şifreniz yanlış lütfen bir daha tekrar deneyiniz veya sitemize üye olunuz");
        }
    }
    }
