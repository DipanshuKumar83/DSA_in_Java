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
    // Find the min

    int arr[]={2,4,7,-5,10};
    int N=arr.length;
    int minValue=arr[0];
    for (int i = 0; i<=N-1; i++) {
        if(arr[i]<minValue){
             minValue=arr[i];
            System.out.println(minValue);

        }
        
        // 2-D
    int [][] arr;
    arr =new int[3][3];
    int[][] bar={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    System.out.println(bar[0][0]);
    System.out.println(bar[1][2]);
    System.out.println(bar[1][1]);
}

}

