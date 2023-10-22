import java.util.Objects;

public class Site extends Club {


    public void greeting() {

        System.out.println("Members:");
        for (int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i).name + "   " + memberList.get(i).password);
        }
        System.out.println();
        System.out.println("Admins");
        for (int i = 0; i < adminList.size(); i++) {
            System.out.println(adminList.get(i).name + "   " + adminList.get(i).password);
        }
        System.out.println();
        System.out.println("Director");
        System.out.println(director.name + "   " + director.password);


        System.out.println("We glad to see you on out site!");
        System.out.println("\'Description\'");
        menu();
    }

    public void menu() {
        System.out.println("" +
                "Menu:\n" +
                "1) Become a new member\n" +
                "2) Look at public programs\n" +
                "3) Look at price\n" +
                "4) Sign in like a Member\n" +
                "5) Sign in like a Administrator\n" +
                "6) Sign in like a Director\n" +
                "7) Exit from site");
        logistic();
    }

    public void logistic() {
        int answer = Main.scanner.nextInt();
        switch (answer) {

            case 1:
                memberList.add(new Member());
                break;
            case 2:
                for (int i = 0; i < publicProgramList.size(); i++) {
                    System.out.println(publicProgramList.get(i).name);
                }
                menu();
                break;
            case 3:
                System.out.println(price);
                menu();
                break;
            case 4:
                System.out.print("Please enter the password: ");
                String memberPassword = Main.scanner.nextLine();
                memberPassword = Main.scanner.nextLine();
                int index = -1;
                for (int i = 0; i < memberList.size(); i++) {
                    if (Objects.equals(memberPassword, memberList.get(i).password)) {
                        index = i;
                    }
                }
                if (index != -1) {
                    System.out.println("Congratulation!");
                    System.out.println(memberList.get(index).name);
                } else {
                    System.out.println("Wrong password");
                    menu();
                }
                break;
            case 5:
                System.out.print("Please enter the password: ");
                String adminPassword = Main.scanner.nextLine();
                adminPassword = Main.scanner.nextLine();
                for (int i = 0; i < adminList.size(); i++) {
                    if (Objects.equals(adminPassword, memberList.get(i).password)) {
                        System.out.println("Congratulation!");
                    } else {
                        System.out.println("Wrong password");
                        menu();
                    }
                }
                break;
            case 6:
                System.out.print("Please enter the password: ");
                String directorPassword = Main.scanner.nextLine();
                directorPassword = Main.scanner.nextLine();
                if (Objects.equals(directorPassword, director.password)) {
                    System.out.println("Congratulation!");
                } else {
                    System.out.println("Wrong password");
                    System.out.println(directorPassword + "  " + director.password);

                    menu();
                }
                break;
            case 7:
                System.exit(0);

        }
    }
}
