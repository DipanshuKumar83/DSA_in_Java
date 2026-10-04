void main() {
    //FOR LOOPS
//    for (int i = 0; i <=5 ; i++) {
//        System.out.println(i);
//    }

//    for (int i = 0; i <=10; i+=2) {
//        System.out.println(i);
//    }
//}
    for (int b = 1; b<=3 ; b++) { // outer loop
        for(int j = 1; j <=3 ; j++) { // inner loop
            System.out.print("*");

        }
        System.out.println();

    }
    for (int i = 1; i <=10; i++) {
        if(i==6){
            break;
        }
        System.out.println("i : " +i);
    }
// WHILE_LOOPS
    int a=1;
    while(a<=10){
        System.out.println("a:"+ a);
        a++;
    }
    // DO_WHILE

    int i=1;
    do {
        System.out.println("DIPANSHU YADAV");
        i++;

    }while(i<=2);

    int d=1;
    do {
        System.out.println("YADAV");
        d++;

    }while(i<=0);

}
