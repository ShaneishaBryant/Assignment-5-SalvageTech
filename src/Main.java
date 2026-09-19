public class Main {
    public static void main(String[] args) {

        //instantiate StorageBay
        StorageBay bay = new StorageBay();
        System.out.println("Storage bay has been successfully initialized.");


        //instantiate SpaceSuit
        SpaceSuit suit = new SpaceSuit();
        System.out.println("Spacesuit has been successfully initialized.");

        //calling displayManifest()
        bay.displayManifest();

    }


}
