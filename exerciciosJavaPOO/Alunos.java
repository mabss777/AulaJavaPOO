public class Alunos {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3; 
    

    public double finalGrade(){
       return grade1 + grade2 + grade3;
    }

    public double missingPoints(){
      return 60 - finalGrade();
   }

   public String passOrFailed(){
    if(finalGrade() >= 60){
            return "Your final grade is: "+finalGrade()+"\nPASS";
        }else {
           return "Your final grade is: "+finalGrade()+"\nFAILED!\nMISSING "+(missingPoints())+" POINTS!";
        }
   }
}
