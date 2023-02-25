
/**.
 * Employee
 * @author Sam Pulaski
 * @version 3/22/21
 */
public class Employee
{
    private String name;
    private double salary;
    /**.
     *  constructs an employee with 
     *  @param employeeName the name of Employee
     *  @param currentSalary the salary
     */
    public  Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
  /**.
   * Gets the name of the employ
   * @return name of Employee
   */
    public String getName ()
    {
        return (name);
    }
   /**.
    * Gets the salary of the Employye
    * @return current salary
    */
    public double getSalary ()
    {   
        return salary;
    }
   /**.
    * Raises salary bya percernt
    * @param byPercent the percent raised 
    */
    public void raiseSalary (double byPercent)
    {
        salary = salary + (salary * (byPercent / 100));
    }
}
