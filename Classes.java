
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