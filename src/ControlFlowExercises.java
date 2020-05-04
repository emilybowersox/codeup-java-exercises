public class ControlFlowExercises {
    public static void main(String[] args) {

//        //while loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }
//

//        //do-while loop
//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i = " + i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println("i = " + i);
//            i*=i;
//        } while (i < 1000000L);
//        //it breaks at exactly 65,536: which is 256*256
//        // ^so can't let it calculate it with i = 65536 cause then the answer will be a long
//        //65,536 squared is like 4 billion which is a long not an int
//      // the solution is just to use long instead of int!!!
//
//// refactoring as for-loops
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 2; i < 1000000L; i*=i) {
//            System.out.println("i is " + i);
//        }
//        //just have to use long instead of int!!


//Fizzbuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Fizzbuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }






    }
}
