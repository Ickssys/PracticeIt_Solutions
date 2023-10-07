public class HarvardLawyer extends Lawyer{
    
    public double getSalary(){
        return super.getSalary() * 1.20;
    }
    
    public int getVacationDays(){
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm(){
        String form1 = super.getVacationForm();
        String form2 = super.getVacationForm();
        String form3 = super.getVacationForm();
        String form4 = super.getVacationForm();
        
        return form1 + form2 + form3 + form4;
    }
}
