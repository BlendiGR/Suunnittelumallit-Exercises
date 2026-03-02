package State;


public class MasterState implements State {

    private Character character;


    public MasterState(Character character) {
        this.character = character;
    }

    @Override
    public void train() {
        return;
    }

    @Override
    public void meditate() {
        return;
    }

    @Override
    public void fight() {
        return;

    }

    @Override
    public void action() {
        System.out.println("\nLevel: Master  XP: " + character.getExperiencePoints() + "  Health: " + character.getHealthPoints());
        System.out.println("You have reached the maximum level. The game ends here.....");
        character.setGameRunning(false);
    }
}

