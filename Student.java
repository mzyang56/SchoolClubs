public class Student {
    
    int grade = 9;
    public static void main(String[] args) {
        Debate debater = new Debate();
        debater.speak();

        FermiQuestions aricWang = new FermiQuestions();
        System.out.println("Fermi Questioning...My guess is " + aricWang.makeGuess() + "!");
        aricWang.speak();

        DynamicPlanet maxYang = new DynamicPlanet();
        maxYang.speak();
        maxYang.openBinder(3);
        maxYang.makeMap();
    }

    public void speak() {
        System.out.println("I am a student");
    }

    public void run() {
        System.out.println("I run between classes");
    }

    public int grow() {
        grade++;
        return grade;
    }

}