import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student1.print();

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";
    Student student2 = new Student();
    student2.setName("Jacob Schloemer");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems"); 

    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();

    int size = 2;
    gpas.add(4.0);
    gpas.add(4.3);

    Double sum = 0.0;

    for(int i=0; i<gpas.size(); i++){
      sum += gpas.get(i);
    }
    System.out.println("The average GPA is " + sum/size);

// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  }
}