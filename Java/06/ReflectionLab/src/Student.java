public class Student {
 // Статик методы не выводятся
    private static String name;
    private  int group;

    private int numOfCurse;

    public Student(String valname, int valgroup, int valnum){
        this.group = valgroup;
        name = valname;
        this.numOfCurse = valnum;
    }

    private Student(String valname){
        this.group = 0;
        name = valname;
        this.numOfCurse = 0;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getGroup() {
        return group;
    }

    protected void setGroup(int group) {
        this.group = group;
    }

    private static final void HandUp(){
        System.out.println("I want to answer!");
    }

    public void AnsExam(String ans){
        System.out.println("Student " + name + ": " + ans);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group + '\'' +
                ", numOfCurse=" + numOfCurse +
                '}';
    }

}
