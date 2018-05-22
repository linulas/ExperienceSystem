public class ExperienceSystem {
    private static final double growthModifier = (1 + Math.sqrt(5)) / 2; //Golden ratio
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int level = 1; level <= 60; level++) {
            System.out.println("Level " + level + ": " + (level * 50) * (level * growthModifier));
        }
    }
}