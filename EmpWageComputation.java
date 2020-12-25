public class EmpWageComputation
{
        //Constant Vatiable declaration
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;

        public String company;
        public int empRatePerHr;
        public int numOfWorkingDays;
        public int maxWorkingHrs;

        //Parameter Constructor call
        public EmpWageComputation(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)
        {
                this.company=company;
                this.empRatePerHr=empRatePerHr;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxWorkingHrs=maxWorkingHrs;
        }
        //method call
        public void computeEmpWage()
        {
                int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=maxWorkingHrs && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;

                        switch(empCheck)
                        {
                                case FULL_TIME:
                                empHrs=8;
                                break;

                                case PART_TIME:
                                empHrs=4;
                                break;

                                default:
                                empHrs=0;
                        }
                        totalEmpHrs+=empHrs;
                }
                totalEmpWage=totalEmpHrs*empRatePerHr;
                System.out.println("Company: "+company+" Total Employee Wage: "+totalEmpWage);

        }

        public static void main(String[] args)
        {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
                System.out.println("--------------------------------------------------------------------");

                EmpWageComputation Facebook=new EmpWageComputation("Facebook",12,34,56);
                EmpWageComputation Google=new EmpWageComputation("Google",22,44,16);
                EmpWageComputation Microsoft=new EmpWageComputation("Microsoft",62,44,26);

                Facebook.computeEmpWage();
                Google.computeEmpWage();
                Microsoft.computeEmpWage();
        }
}


