import java.util.ArrayList;

public class TotalPointsGradebook implements Gradebook {
private ArrayList<Assignment> myGrades;

public TotalPointsGradebook() {
    myGrades = new ArrayList<Assignment>();
}

public void add(Assignment assign) {
    myGrades.add(assign);
}

public double calculateGrade() {
    int sumPointsEarned = 0;
    int sumPointsPossible = 0;
    Assignment assign;
    
    for (int i = 0; i < myGrades.size(); i++) {
        assign = myGrades.get(i);
        sumPointsEarned += assign.getPointsEarned();
        sumPointsPossible += assign.getPointsPossible();
    }
    
    return (sumPointsEarned / (double)sumPointsPossible) * 100;
}
}

