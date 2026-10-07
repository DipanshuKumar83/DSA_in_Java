void main(){
    //declaration
    int arr[];
    //Allocation
    arr=new int[5];
    //Initialisation
    int code[]={2,4,6,8,10};
    System.out.println( "Index of Array(0) " + code[0]);
    System.out.println( "Index of Array(1) " + code[1]);
    System.out.println( "Index of Array(2) " + code[2]);
    System.out.println( "Index of Array(3) " + code[3]);

    //for Each loop
    int n=code.length;
    for (int val:code){
        System.out.println(val);
    }

}

