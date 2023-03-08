public class FermiQuestions extends ScienceOlympiad {
    
    double guessingSkill = 10;

    public double getGuessingSkill() {
        return guessingSkill;
    }

    public void setGuessingSkill(int a) {
        guessingSkill = a * 2;
    }

    public int makeGuess() {
        int guess = (int)(Math.random()*10);
        return guess;
    }

    public void checkAnswer() {
        System.out.println("Checking guess with answer...");
    }

    @Override
    public void speak() {
        System.out.println("Exquisite guess!");
    }

}
