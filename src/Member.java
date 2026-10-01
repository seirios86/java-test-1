public class Member {

    private final String name;
    private final Grade grade;

    public Member(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

}
