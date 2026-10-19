void main(){
    Scanner sc=new Scanner(System.in);
    IO.println("Enter the Number");
    int n= sc.nextInt();
    if((n&1)==0){
        IO.println("Even number");
    }
    else {
        IO.println("odd number");
    }

    IO.println("Enter the vale of m");
    int m=sc.nextInt();
    if((m&(m-1))==0){
        IO.println("power of 2");
    }
    else{
        IO.println("not power of 2");
    }
}