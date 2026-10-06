import static java.lang.Long.sum;

void main(){
    Solve();
    Sum(2,3);
    Sum2();
    int result=add(19,18);
    System.out.println(result);
}
void Solve(){
    System.out.println("DSA WITH JAVA");
}

// parameters
void Sum(int a , int b){
    System.out.println(a+b);
}
//No parameters
void Sum2(){
    int A=2;
    int B=10;
    System.out.println("Sum -> " + (A+B));
}

//NON-VOID
int add(int p, int q){
    int sum3=p+q;
    return sum3;
}