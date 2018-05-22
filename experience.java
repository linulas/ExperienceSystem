public class ExperienceSystem {

    private double growthModifier = (1 + Math.Sqrt(5)) / 2; //Golden ratio
    private int toNextLevel = 0;

    private int ComputeExperiencePoints(int level)
    {
        return (int)((level * 50) * (level * growthModifier));
    }

    public static void main (String[] args) {
        
    }
}