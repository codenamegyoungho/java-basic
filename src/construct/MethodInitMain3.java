package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("rudgh",26,90);
        MemberInit member2 = new MemberInit();
        member2.initMember("dons",28,100);

        MemberInit[] members = new MemberInit[]{member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + ":" + member.age + ":" + member.grade);
        }
    }
}
