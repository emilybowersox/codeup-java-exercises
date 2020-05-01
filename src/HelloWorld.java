public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 4;
        x += 5;
        System.out.println(x);

        int z = 3;
        int y = 4;
        y *= z;
        System.out.println(y);

        int a = 10;
        int b = 2;
        a /= b;
        b -= a;
        System.out.println(a);
        System.out.println(b);

        int aBigNumber = 75;
        aBigNumber *= 2;
        System.out.println(aBigNumber);

        x = Integer.MAX_VALUE;
        x++;
        System.out.println(x);
        //when you put ++ to the max value it flips- goes from a positive number to the
        //negative version of that number- it broke but technically still works

        //You cannot cast strings- only numbers
        //if you're tryign to cast string with a number in it
        //- you'd have to do Integer.parseInt- parsing it but also have to declare the class type (Integer)
    }
}
