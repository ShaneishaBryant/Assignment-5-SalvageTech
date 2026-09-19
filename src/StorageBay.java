class StorageBay {
    private CargoPod[] pods;

    //constructor that initializes
    public StorageBay(){
        this.pods = new CargoPod[5];

        //for loop through array with new CargoPods
        for (int i = 0; i < pods.length; i++){
            //assign each pod with a switch
            String contents = switch (i) {
                case 1 -> "Power Cell";
                case 2 -> "Hazardous Material";
                case 3 -> "Atomic Dirt";
                default -> "Empty";
            };
            //new cargoPod into the array slot
            pods[i] = new CargoPod(i, contents);
        }
    }

    //method for displaying storage pods
    public void displayManifest() {
        System.out.println("===STORAGE BAY INVENTORY===");
        //for each loop to iterate through array
        for (CargoPod pod : pods) {
            if (pod != null) {
                System.out.println("Pod " + pod.getId() + ": " +  " [" + pod.getContents() + "]");
            }else {
                System.out.println("[NO CONTENTS]");
            }
        }
    }


    //method for salvagePod
    public void salvagePod(int index){

        //check if index is within array bounds
        if(index < 0 || index >= pods.length){
            System.out.println("Error: Index " + index + " is out of of bounds.");
            return;
        }

        //reference variable
        CargoPod targetPod = pods[index];

        //if valid index
        if(targetPod.isSalvaged()) {
            System.out.println("Pod " + index + "has already been salvaged.");
            return;
        }
        //mark pod salvaged
        targetPod.salvage();

        //switch for outcome
        switch (targetPod.getContents()){
            case "Power Cell" -> System.out.println("ACQUIRED: Technician has recovered a functioning Power Cell.");
            case "Hazardous Material" -> System.out.println("WARNING: Hazard triggered! Bio/chemical contamination detected.");
            case "Atomic Dirt" -> System.out.println("Technician retrieved Atomic Dirty sample.");
            default -> System.out.println("Pod " + index + " was empty. No useful resources found.");
        }
    }

    //getter
    public CargoPod[]getPods(){
        return pods;
    }

}
