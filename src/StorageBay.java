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

}
