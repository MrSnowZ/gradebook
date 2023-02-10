public class Part1Client {
    public static void main(String[] args) {
    Assignment assign = new Assignment("Lab 1", 10, 9);
    
        System.out.println("Name of assign = " + assign.getName()); 
        System.out.println("Points possible = " + assign.getPointsPossible()); 
        System.out.println("Points earned = " + assign.getPointsEarned());
        
        TotalPointsGradebook gradebook = new TotalPointsGradebook();
        gradebook.add(assign);
        gradebook.add(new Assignment("Lab 2", 10, 10));
        gradebook.add(new Assignment("Lab 3", 10, 8));
        gradebook.add(new Assignment("Lab 4", 15, 13));
        gradebook.add(new Assignment("Quiz 1", 5, 5));
        gradebook.add(new Assignment("Quiz 2", 5, 4));
        gradebook.add(new Assignment("Quiz 3", 5, 5));
        gradebook.add(new Assignment("Test 1", 50, 46));
        gradebook.add(new Assignment("Test 2", 50, 42));
        gradebook.add(new Assignment("Final Exam", 50, 43));
        
        System.out.println("Grade = " + gradebook.calculateGrade());        
    }
    }
    
    