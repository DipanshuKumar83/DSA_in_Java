public class Basicmath {
    static int countdigit(int num){
        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;
            num=num/10;

        }
        return count;
    }
    static void main(){
        int num =28763;
        int ans=countdigit(num);
        System.out.println(ans);

    }
}
