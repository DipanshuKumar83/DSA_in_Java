//Linear Search

 public boolean Findtarget(int [] arr, int target) {
     for (int j : arr) {
         if (j == target) {
             return true;
         }

     }
     return false;
 }


void main() {
    int [] arr ={1,3,55,6,8};
    boolean ans=Findtarget(arr,90);
    IO.println(ans);
}