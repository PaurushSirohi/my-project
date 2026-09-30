class ConstructorStudents {
    String name;
    int rollNo;
    String branch;

    ConstructorStudents(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    void display() {
        System.out.println("Student name:" + name);
        System.out.println("Roll Number:" + rollNo);
        System.out.println("Branch:" + branch);
    }

    public static void main(String[] args) {
        ConstructorStudents s = new ConstructorStudents("Paurush", 101, "CSIT");
        ConstructorStudents s2 = new ConstructorStudents("Praneeth", 102, "CSIT");
        s.display();
        s2.display();
    }
}
