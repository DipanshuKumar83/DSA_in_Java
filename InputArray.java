void main(){

    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    int n=arr.length;

    for (int i = 0; i <= n-1 ; i++) {
        System.out.println(i);
        arr[i]=sc.nextInt();

        for(int val:arr){
            System.out.println(val);
        }

    }
    //Sum 
    int arr1[]={2,3,4,65,89};
    int sum=0;
    int N= arr1.length;
    for (int i = 0; i <=N-1; i++) {
        int value=arr1[i];
        System.out.println(value);
        sum=sum+value;
        System.out.println(sum);

    }

}
