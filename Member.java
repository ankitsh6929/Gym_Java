public class Member {
    private String id;
    private String name;
    private String membershipType;

    public Member(String id, String name, String membershipType) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Member ID: " + id + ", Name: " + name + ", Membership Type: " + membershipType;
    }
}
