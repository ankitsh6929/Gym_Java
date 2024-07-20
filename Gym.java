import java.util.ArrayList;
import java.util.List;

public class Gym {
    private List<Member> members;

    public Gym() {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member);
    }

    public void removeMember(String id) {
        members.removeIf(member -> member.getId().equals(id));
        System.out.println("Member removed with ID: " + id);
    }

    public Member getMember(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public void displayAllMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        Gym gym = new Gym();

        // Adding members
        Member member1 = new Member("1", "John Doe", "Premium");
        Member member2 = new Member("2", "Jane Smith", "Basic");
        gym.addMember(member1);
        gym.addMember(member2);

        // Display all members
        System.out.println("All Members:");
        gym.displayAllMembers();

        // Get a member
        System.out.println("Get Member with ID 1:");
        System.out.println(gym.getMember("1"));

        // Remove a member
        gym.removeMember("1");

        // Display all members after removal
        System.out.println("All Members after removal:");
        gym.displayAllMembers();
    }
}
