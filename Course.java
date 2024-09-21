public class Course {
    String name;
    String code;
    String prefix;
    int[] note;
    Teacher teacher;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = new int[]{0, 0};
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println(teacher.name + " , " + this.name + " dersini verebilir!");
        }else
            System.out.println(teacher.name + " , " + this.name + " dersini veremez!");
    }

    public void printTeacher(){
        if (teacher != null){
            System.out.println(this.name + " dersinin akademisyeni: " + teacher.name);
        }else
            System.out.println(this.name + " dersine akademisyen atanmamıştır!");
    }

}
