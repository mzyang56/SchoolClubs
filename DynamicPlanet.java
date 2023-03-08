public class DynamicPlanet extends ScienceOlympiad {
    
    double treeHugginess = 10;

    public double getTreeHugginess() {
        return treeHugginess;
    }

    public void setTreeHugginess(int a) {
        treeHugginess = a + 10;
    }

    public void makeMap() {
        System.out.println("Creating a topographic map of Jacob Jagodzinski's head");
    }

    public void openBinder(int a) {
        System.out.println("Opening the binder to page " + a + ".");
    }
}
