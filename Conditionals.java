import java.sql.SQLOutput;

void main(){
    //IF Statement
    int Age=19;
    if (Age>18){
        System.out.println("Ready to Apply for driving lience");
    }

    //IF-ELSE Statement
    int Total_mark_per = 85;
    if (Total_mark_per>70){
        System.out.println("B+");
    }
    else {
        System.out.println("B");
    }

    //IF-ELSE_IF
    int math_mark=94;
    if(math_mark>90) {
        System.out.println("BEST IN MATH");
    } else if (math_mark>70) {
        System.out.println("GOOD IN MATH");

    }
    else {
        System.out.println("Average in math");
    }

    //NESTED IF-ELSE
    int Student_age=20;
    if(Student_age>18){

        if(Student_age>19){
            System.out.println("Apply for Scholarship");
        }
        else {
            System.out.println("Not Allowed");
        }
    }

    //TERNARY OPERATOR
    String gender="Male";
    String Gender =(gender =="Male" )? "male":"not male{Female}";
    System.out.println(Gender);

    //SWITCH CASE
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the week of day for meeting");
    int Day=sc.nextInt();
    switch (Day){
        case 1:
            System.out.println("Mon");
            break;
        case 2:
            System.out.println("Tues");
            break;
        case 3:
            System.out.println("wed");
            break;
        case 4:
            System.out.println("Thrues");
            break;
        case 5:
            System.out.println("Fri");
            break;
        case 6:
            System.out.println("Sat");
            break;
        default:
            System.out.println("Sunday");
    }






}
