public class PetRock {
    private String name;
    private boolean happy = false;
    private PetRock obj;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public String getHappyMessage() {
        if(!happy) {
            throw new IllegalStateException();
        }
        else {
            return "I am Happy!";
        }
    }

    public PetRock getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "PetRock{" +
                "name='" + name + '\'' +
                ", happy=" + happy +
                '}';
    }
}
