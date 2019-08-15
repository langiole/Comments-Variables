class Student {
    // stuednt ID
    protected String id = "";

    // returns ID
    public String getID() {
        return id;
    }

    // generates ID
    public void generateID(int id) {
        this.id = id;
    }
}

class GraduateStudent extends Student {
    // generates ID
    public void generateID(int id) {
        this.id = "g" + id;
    }
}

class UndergraduateStudent extends Student {
    // generates ID
    public void generateID(int id) {
        this.id = "u" + id;
    }
}

public class AerobicCodingDemo1 {
    public static void main(String[] args) {
        // initialize empty roster
        Student[] roster = new Student[3];

        // initialize roster elements
        roster[0] = new UndergraduateStudent();
        roster[1] = new GraduateStudent();
        roster[2] = new UndergraduateStudent();

        // generate IDs
        for (int i = 0; i < 3; i++) {
            roster[i].generateID(i);
        }
        
        // print IDs and student's status
        for (Student s : roster) {
            System.out.print("Student " + s.getID() + " is an ");
            if (s instanceof UndergraduateStudent) {
                System.out.println("undergraduate student");
            }
            else {
                System.out.println("graduate student");
            }
        }
    }
}