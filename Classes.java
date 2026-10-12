
//Students Detail
class Student{
    String name;
    int age;
    double mark;

    void myStudent(){
        System.out.println("Name:"+ name +" Age:"+age + " Mark:"+mark);
    }
}
void main(){
    Student mydetail =new Student();
    mydetail.name="Dipanshu Yadav";
    mydetail.age=20;
    mydetail.mark=900;

    mydetail.myStudent();
}
// Parameterized Constructor 
class Dipanshu{
    String Name;
    int Age;
    double Mark;

    Dipanshu(String Full_Name , int Student_Age , double Student_Marks){
        Name=Full_Name;
        Age=Student_Age;
        Mark=Student_Marks;
    }

    void mydetail(){
        System.out.println("Name :"+Name+ " Age: "+ Age +" Mark: "+ Mark);
    }

}
void main(){
    Dipanshu student1=new Dipanshu("Aman Yadav",20,900);
    Dipanshu student2=new Dipanshu("Avi Yadav",21,930);

    student1.mydetail();
    student2.mydetail();
}
