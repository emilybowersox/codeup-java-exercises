public class ServerNameGenerator {



//    private static getNumber {
//        int randomNumber = (int) Math.floor(Math.random() * 50);
//    }


    public static void main(String[] args){
        String[] adjectives = {"cool", "fun", "funny", "nice", "smart"};
        String[] nouns = {"shoes", "purse", "satchel", "sweater", "cardigan"};

        int randomNumber = (int) Math.floor(Math.random() * 5);
        System.out.println("Here is your server name: ");
        System.out.println(adjectives[randomNumber] + " " + nouns[randomNumber]);
    }







}
