package SingleResponsibilityPrinciple;

public class CalculateNetSalary  {
  private int baseSalary;
  
  public CalculateNetSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public int calculateNetSalary() {
    int tax = (int) (baseSalary * 0.25);//calculate in otherway
    return baseSalary - tax;
    }
}
