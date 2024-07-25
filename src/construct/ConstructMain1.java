package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("rudgh", 26, 90);
        MemberConstruct member2 = new MemberConstruct("dons", 28);

        MemberConstruct[] members = new MemberConstruct[]{member1, member2};
        for (MemberConstruct member : members) {
            System.out.println(member.name + ":" + member.age + ":" + member.grade);
        }
    }
}
