public class ScienceOlympiad extends Student {
 
    double Scienciness = 8;

    public double getScienciness() {
        return Scienciness;
    }
    
    public void setScienciness() {
        Scienciness++;

    }

    public void test() {
        System.out.println("I test");
    }

    public void win() {
        System.out.println("The Science Olympiad team wins the national competition");
    }

    @Override
    public void run() {
        System.out.println("I run between events");
    }


}
