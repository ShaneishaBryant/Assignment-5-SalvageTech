public class CargoPod {
    private  int id;
    private String contents;
    private boolean salvaged;

    //constructor
    public CargoPod(int id, String contents){
        this.id = id;
        this.contents = contents;
        this.salvaged = false;
    }

    //marks the pod as salvaged when the time comes
    public void salvage(){
        this.salvaged = true;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getContents(){
        return contents;
    }

    public boolean isSalvaged(){
        return salvaged;
    }

}
