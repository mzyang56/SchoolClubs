public class Debate extends Student {
    double toxicity = 100;

    public double getToxicity() {
        return toxicity;
    }

    public void setToxicitiy(double a) {
        toxicity = a;
    }

    public void debate() {
        System.out.println("Cross-examination...spreading...public forum...[insert more jargon]");
    }

    public void selfPromotion() {
        System.out.println("Lincoln-Douglas is the best. Change my mind.");
    }

    @Override
    public void speak() {
        System.out.println("Heyyy do you debate? Great, because I do!");
    }

}
