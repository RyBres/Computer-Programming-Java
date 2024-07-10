public class Main {
    public static void main(String[] args) {
        // Create Plant object
        Plant plant = new Plant("Plantus", "Plant", "Seeds", 6, 12.0);
        System.out.println("Plant details:");
        System.out.println(plant);
        System.out.println();

        // Create Flower object
        Flower flower = new Flower("Rosa", "Rose", "Seeds", 8, 15.0, 5.0, 2.0, 10.0, 20.0, "Red");
        flower.setPetalLength(6.0);
        flower.setPetalWidth(2.5);
        System.out.println("Flower details:");
        System.out.println(flower);
        flower.Grow();
        flower.Photosynthesis();
        flower.Respiration();
        flower.Transpiration();
        flower.windyConditions();
        System.out.println();

        // Create Tree object
        Tree tree = new Tree("Quercus", "Oak", "Acorns", 10, 300.0, 50.0, 100);
        tree.setTrunkRadius(60.0);
        tree.setAgeYears(120);
        System.out.println("Tree details:");
        System.out.println(tree);
        tree.Grow();
        tree.Photosynthesis();
        tree.Respiration();
        tree.Transpiration();
        tree.windyConditions();
        System.out.println();

        // Create farmPlot object with a plant
        farmPlot plot = new farmPlot(plant);
        System.out.println("FarmPlot with a Plant:");
        System.out.println(plot.toString());
        System.out.println();

        // Update farmPlot object to hold a flower
        plot.setPlant(flower);
        System.out.println("FarmPlot with a Flower:");
        System.out.println(plot);
        System.out.println();

        // Update farmPlot object to hold a tree
        plot.setPlant(tree);
        System.out.println("FarmPlot with a Tree:");
        System.out.println(plot);
        System.out.println();

        // Show farmPlot info using static method
        System.out.println("Plant info using static method:");
        farmPlot.showPlantInfo(plant);
        System.out.println();

        // Demonstrate polymorphism - this references a Plant superclass in order to reference a subclass Flower object.
        Plant polymorphicPlant = new Flower("Lilium", "Lily", "Bulbs", 7, 25.0, 6.0, 2.5, 12.0, 25.0, "White");
        System.out.println("Polymorphic Plant (Flower) details:");
        System.out.println(polymorphicPlant.toString());
        polymorphicPlant.windyConditions();
        System.out.println();
    }
}