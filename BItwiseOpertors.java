void main() {
    int a = 5;
    int b = 6;
    //AND
    IO.println(a & b);
    //OR
    IO.println(a | b);
    //NOT
    IO.println(~a);
    //XOR
    IO.println(a ^ b);
    //Left Shift
    int n = 5;
    for (int i = 0; i <= 10; i++) {
        n = n << 1;

        IO.println(n);
        IO.println();

    }
    //Right Shift
    int m=10;
    for (int i = 1; i <=10 ; i++)
    {
       m= m>>1;
        IO.println(m);
        IO.println();
    }
}
