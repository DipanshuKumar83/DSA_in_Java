void main(){
    //Creation of String
    String str="Java is best language for DSA";
    System.out.println(str);

    //2_method
    String str1=new String("Java is best language for DSA");
    System.out.println(str1);
    //Access
    System.out.println(str.length());
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(1));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(4));
    
// Comparing Strings 
String firstname="DIPANSHU";
    String lastname="DIPANSHU";
    if(firstname==lastname){
        System.out.println("Both are equals");

    }
else{
        System.out.println("Both are not equal");
    }


    if(firstname.equals(lastname)){
        System.out.println("Both are equals");

    }
    else{
        System.out.println("Both are not equal");
    }
    //input String
    Scanner sc=new Scanner(System.in);
    System.out.println("Define a JAVA");
    String Java=sc.nextLine();
    System.out.println("ABOUT JAVA: " +Java);

    //Replace
     String Name="sahash";
    Name=Name.replace('s','l');
    System.out.println(Name);

}
