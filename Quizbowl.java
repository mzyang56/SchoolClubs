public class Quizbowl extends Student {

    int seat = 1;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int a) {
        seat = a;
    }

    public void quiz() {
        System.out.println("Quizzing in progress");
    }

    public void bowl() {
        System.out.println("Bowling in progress");
    }

}