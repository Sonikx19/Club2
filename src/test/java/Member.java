import java.util.UUID;

public class Member {

    String name;
    String secondName;
    char gender;
    int age;
    int wallet;
    String password;

    public Member(String name, String secondName, char gender,
                  int age, int wallet, String password) {
        this.name = name;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.wallet = wallet;
        this.password = password;
    }

    public Member() {
        System.out.println("Hello our new member!");
        System.out.print("What is your name? - ");
        name = Main.scanner.nextLine();
        System.out.println("Nice to meet you " + name + "! How old are you?");
        age = Main.scanner.nextInt();
        if (age < 18) {
            System.out.println("You so young little kitty");
            System.exit(0);
        }
        System.out.println("What's your gender?");
        String temp = Main.scanner.nextLine().toLowerCase();
        temp = Main.scanner.nextLine().toLowerCase();
        gender = temp.charAt(0);
        password = UUID.randomUUID().toString().substring(0,5);
        System.out.println("Welcome to our club!\nYour password is: " + password);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


