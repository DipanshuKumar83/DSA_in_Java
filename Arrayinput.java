void main(){
    int arr[][]=new int[3][4];
    Scanner sc=new Scanner(System.in);
    for (int i = 0; i <=arr.length-1; i++) {
        for (int j = 0; j <=arr[i].length; j++) {
            System.out.println("Row"+i + "column"+j);
            arr[i][j]=sc.nextInt();

        }

    }
}
