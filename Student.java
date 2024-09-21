public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    public Student(String name, String classes, String stuNo, Course course1,
                   Course course2, Course course3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note1_1, int note2, int note2_1, int note3, int note3_1) {
        if ((note1 >= 0 && note1 <= 100) || (note1_1 >= 0 && note1_1 <= 100)) {
            course1.note = new int[]{note1, note1_1};
        }
        if ((note2 >= 0 && note2 <= 100) || (note2_1 >= 0 && note2_1 <= 100)) {
            course2.note = new int[]{note2, note2_1};
        }
        if ((note3 >= 0 && note3 <= 100) || (note1_1 >= 0 && note1_1 <= 100)) {
            course3.note = new int[]{note3, note3_1};
        }

    }

    public boolean isPass() {
        double[] avarages = calcAvarage();
        Course[] courses = {course1, course2, course3};

        for (int i = 0; i < avarages.length; i++) {
            if (avarages[i] < 55) {
                System.out.println(this.name + ", " + courses[i].name + " dersinin ortalaması: " + avarages[i] + " --> GEÇEMEDİ!");
            } else {
                System.out.println(this.name + ", " + courses[i].name + " dersinin ortalaması: " + avarages[i] + " --> GEÇTİ!");

            }
        }
        return true;
    }

    public double[] calcAvarage() {
        double avarage1 = this.course1.note[0] * (0.20) + this.course1.note[1] * (0.80);
        double avarage2 = this.course2.note[0] * (0.20) + this.course2.note[1] * (0.80);
        double avarage3 = this.course3.note[0] * (0.20) + this.course3.note[1] * (0.80);
        double[] avarages = {avarage1, avarage2, avarage3};
        return avarages;
    }

    public void printNote() {
        System.out.println("===========================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik notu: " + this.course1.note);
        System.out.println("Edebiyat notu: " + this.course2.note);
        System.out.println("Fizik notu: " + this.course3.note);
        System.out.println("Genel Ortalama: " + this.avarage);
    }
}
