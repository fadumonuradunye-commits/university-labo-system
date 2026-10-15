public class StudentNew {
    String studentId;
    String studentName;
    String studentDept;


    public StudentNew(String studentId, String studentName , String studentDept){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
    }



    public void displayStudentNew(){
        System.out.println("Id: " + studentId);
        System.out.println("Name :" + studentName);
        System.out.println("dept :" + studentDept);
    }
}
