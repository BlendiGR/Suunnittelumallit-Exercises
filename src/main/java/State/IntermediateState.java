package State;

public class IntermediateState implements State {

    private Character character;


    public IntermediateState(Character character) {
        this.character = character;
    }

    @Override
    public void train() {
        character.setExperiencePoints(1.5);
        System.out.println("Training....");
        System.out.println("Increasing XP");
        System.out.println("Points left for level up: " + character.getExperiencePoints() + " / " + "20");
    }

    @Override
    public void meditate() {
        character.setHealthPoints(5);
        System.out.println("Meditating....");
        System.out.println("Increasing Health");
    }

    @Override
    public void fight() {
        System.out.println("Progress To Next Level to Unlock This Action!");
    }

    @Override
    public void action() {
        System.out.println("\nLevel: Intermediate  XP: " + character.getExperiencePoints() + "  Health: " + character.getHealthPoints());
        String[] options = {"[1] Train", "[2] Meditate"};

        int choice = character.readUserChoice(options);
        if (choice == 1) {
            train();
        } else if (choice == 2) {
            meditate();
        }

        if (character.getExperiencePoints() >= 20) {
            System.out.println("Congratulations! You've reached Expert level.");
            character.setLevel(3);
            character.setState(new ExpertState(character));
        }
    }
}
