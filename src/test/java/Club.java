import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Club {
    List<Member> memberList = new LinkedList<>();
    List<Admin> adminList = new LinkedList<>();
    List<PublicProgram> publicProgramList = new ArrayList<>();
    String price = "" +
            "1) Season ticket by one months - 2500p\n" +
            "2) Season ticket by one year - 25000\n";

    public void createAdmins(){
        adminList.add(new Admin("John","Smith",23,UUID.randomUUID().toString().substring(0,5)));
        adminList.add(new Admin("Lasly","Blanket",19,UUID.randomUUID().toString().substring(0,5)));
    }
    public void createMembers(){
        memberList.add(new Member("Jack","Nicolson",'m',45,12345,UUID.randomUUID().toString().substring(0,5)));
        memberList.add(new Member("Nickol","Kidman",'f',34,3214,UUID.randomUUID().toString().substring(0,5)));
    }
    Director director = new Director("qweret","qweasd",62,UUID.randomUUID().toString().substring(0,5));
}
