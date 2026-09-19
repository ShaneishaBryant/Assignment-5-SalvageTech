import java.util.Scanner;

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

        //instantiate scanner
        Scanner scanner = new Scanner(System.in);

        //interactive mission loop
        while (!suit.isDepleted()){
            //provide oxygen status
            System.out.println("Current Oxygen Level: " + suit.getCurrentOxygen());
            //prompt user to enter pod index
            System.out.println("Enter the pod index to breach (0 - 4): ");

            //read user input
            int choice = scanner.nextInt();

            //store pod to check contents
            CargoPod targetPod = null;
            if(choice >= 0 && choice < bay.getPods().length){
                targetPod = bay.getPods()[choice];
            }

            //salvage pod
            bay.salvagePod(choice);

            //consume oxygen and display remaining supply
            suit.consumeOxygen();

            //check for Power Cell
            if(targetPod != null && "Power Cell".equals(targetPod.getContents())){
                System.out.println("SUCCESS: Power Cell recovered. Mission complete.");
                break;
            }

            //check if finish because suit ran out of oxygen
            if(suit.isDepleted()){
                System.out.println("CRITICAL FAILURE: Life support has failed! Oxygen deleted. Re-connect space suit.");
            }

        }

    }


}
