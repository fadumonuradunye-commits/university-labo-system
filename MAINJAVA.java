public class MAINJAVA {
 public    static  void main(String[] args) {
     System.out.println("university laboratory system");
     StudentNew s1 = new StudentNew("707" , "fatma", "software engineer");
     StudentNew s2 = new StudentNew("708", "Hanad", "doctor");
     StudentNew s3 = new StudentNew("709"," Kamil","lab");
     StudentNew s4 = new StudentNew("710","hani","political");

     Equipment e1 = new Equipment("eq101", "cisco Router",3);
     Equipment e2 = new Equipment("eq102", "fiber-optic",2);
     Equipment e3 = new Equipment("eq103", "laptop",1);
     Equipment e4 = new Equipment("eq104", "mouse",5);
     Equipment e5 = new Equipment("eq105", "keyboard",4);


     System.out.println("\nStudent Information:");
     s1.displayStudentNew();
     s2.displayStudentNew();
     s3.displayStudentNew();

     System.out.println("\nEquipment Information:");
     e1.displayEquipment();
     e2.displayEquipment();
     e4.displayEquipment();


     System.out.println("\n BORROW EQUIPMENT");
     System.out.println("Student: " + s1.studentName);
     System.out.println("Equipment: " + e1.equipmentName);
     e1.borrowOneItem();

     System.out.println("\n BORROW UNAVAILABLE EQUIPMENT");
     System.out.println("Equipment: " + e4.equipmentName);
     e4.borrowOneItem();


     System.out.println("\n===== RETURN EQUIPMENT =====");
     System.out.println("Equipment: " + e1.equipmentName);
     e1.returnoneItem();

     System.out.println("\n===== UPDATED EQUIPMENT INFORMATION =====");
     e1.displayEquipment();
     e2.displayEquipment();
     e3.displayEquipment();
     e4.displayEquipment();
    }
}
