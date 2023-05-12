public class Dog extends Mammals{
    private String play;

    public Dog(String furColour) {
        super(furColour);
    }

    private void setPlay(String play) {
        this.play = "fetch ball";
    }

    public String getPlay() {
        return play;
    }


}
