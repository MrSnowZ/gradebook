public class Assignment {
    private String name;
    private int pointsPossible;
    private int pointsEarned;
    
    public Assignment(String name, int pointsPossible, int pointsEarned) {
        this.name = name;
        this.pointsPossible = pointsPossible;
        this.pointsEarned = pointsEarned;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPointsPossible() {
        return pointsPossible;
    }
    
    public int getPointsEarned() {
        return pointsEarned;
    }
    }