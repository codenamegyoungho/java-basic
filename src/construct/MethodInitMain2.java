package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user1";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = new MemberInit[]{member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + ":" + member.age + ":" + member.grade);
        }
    }

}
