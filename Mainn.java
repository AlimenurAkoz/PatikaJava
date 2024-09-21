public class Mainn {
    public static void main(String[] args) {
        Course course1 = new Course("Matematik", "MAT101", "MAT");
        Course course2 = new Course("Edebiyat", "EDB102", "EDB");
        Course course3 = new Course("Fizik", "FIZ103", "FIZ");

        Teacher teacher1 = new Teacher("Ayşe Hanım", "500", "MAT");
        Teacher teacher2 = new Teacher("Gözde Hanım", "522", "EDB");
        Teacher teacher3 = new Teacher("Ali Bey", "511", "FIZ");

        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher3);

        Student student1 = new Student("Fatih", "3", "201", course1, course2, course3);
        student1.addBulkExamNote(80,60,40,50, 25,90);
        student1.isPass();

        Student student2 = new Student("Feyza", "3", "202", course1, course2, course3);
        student2.addBulkExamNote(60,85,97,80,65,100);
        student2.isPass();

    }
}