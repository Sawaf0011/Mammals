public class Cat extends Mammals{

    private String sound;
    public Cat(String furColour) {
        super(furColour);
    }


    private void setSound(String sound) {
        this.sound = "meow";
    }
    public String getSound() {
        return sound;
    }


}
