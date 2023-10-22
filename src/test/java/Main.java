import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Site site = new Site();
        site.createAdmins();
        site.createMembers();
        site.greeting();
    }
}
