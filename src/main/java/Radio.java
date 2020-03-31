public class Radio {

    private String name;

    public Radio(String name){
        this.name = name;
    }


    public String tune(){
        return "You are being tuned to " + this.name + ". Thank you for listening.";
    }

}
