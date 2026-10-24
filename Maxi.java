public int getmaximum(int arr []){
    int maxi=arr[0];
    for (int i=0;i<arr.length;i++){
        if (arr[i]>maxi){
            maxi=arr[i];
        }
    }
    return maxi;
}
void main(){
    int arr [] ={1,4,6,3,5};

    IO.println(getmaximum(arr));
}
