// Method Overloading 
void main(){
    sum(1,3,5);
    sum(9,8);

}
void sum(int a,int b,int c){
    System.out.println("Sum of three numbers:" +(a+b+c));
}
void sum(int a,int b){
    System.out.println("Sum of two numbers:" +(a+b));
}