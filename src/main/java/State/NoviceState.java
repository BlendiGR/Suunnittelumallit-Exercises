package State;

public class NoviceState implements State {

    private Character character;


    public NoviceState(Character character) {
        this.character = character;
    }

    @Override
    public void train() {
        character.setExperiencePoints(1.5);
        System.out.println("Training....");
        System.out.println("Points left for level up: " + character.getExperiencePoints() + " / " + "10");
    }

    @Override
    public void meditate() {
        System.out.println("Progress To Next Level to Unlock This Action!");
    }

    @Override
    public void fight() {
        System.out.println("Progress To Next Level to Unlock This Action!");
    }

    @Override
    public void action() {
        System.out.println("\nLevel: Novice  XP: " + character.getExperiencePoints() + "  Health: " + character.getHealthPoints());
        String[] options = {"[1] Train"};

        if (character.readUserChoice(options) == 1) {
            train();
        }

        if (character.getExperiencePoints() >= 10) {
            System.out.println("Congratulations! You've reached Intermediate level.");
            character.setLevel(2);
            character.setState(new IntermediateState(character));
        }
    }
}
