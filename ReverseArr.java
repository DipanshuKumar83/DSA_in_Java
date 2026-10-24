

 static void  Reverse(int arr[]) {
     int n = arr.length;
     int i = 0;
     int j = n - 1;
     while (i <= j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;

     }
     for (int val : arr) {
         IO.println(val);

     }
 }
 static void main(){
     int arr[]={1,2,3,5};
     Reverse(arr);
 }

