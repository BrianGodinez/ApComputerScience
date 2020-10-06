public class TaxReturn
{
  double income;
  String status;
  int SSN;
  //tax rates depending on input
  private static final double RATE1 = 0.15;
  private static final double RATE2 = 0.20;
  private static final double RATE3 = 0.28;
  private static final double RATE4 = 0.37;

  private static final double SINGLE_BRACKET1 = 21000;
  private static final double SINGLE_BRACKET2 = 41400;
  private static final double SINGLE_BRACKET3 = 75670;
  private static final double SINGLE_BRACKET4 = 91340;

  private static final double MARRIED_BRACKET1 = 21000;
  private static final double MARRIED_BRACKET2 = 51400;
  private static final double MARRIED_BRACKET3 = 85670;
  private static final double MARRIED_BRACKET4 = 101340;

/*
 * Creates taxreturn object
 * @param anIncome = taxpayer's income
 * @param status = Single or Married
*/
  public TaxReturn(double anIncome, String aStatus, int ssn)
  {
    this.income = anIncome;
    this.status = aStatus;
    this.SSN = ssn;
  }

  public int getSSN()
  {
    return SSN;
  }

  public double getTax()
  {
    double tax = 0;

    if(status.equalsIgnoreCase("married") || status.equalsIgnoreCase("m")) 
    {
      if(income <= MARRIED_BRACKET1)
      {
        tax = income*RATE1;
      }

      else if(income <= MARRIED_BRACKET2)
      {
        tax = RATE1*MARRIED_BRACKET1 + RATE2 * (income - MARRIED_BRACKET1);
      }

      else if(income <= MARRIED_BRACKET3)
      {
        tax = RATE1*MARRIED_BRACKET1 + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3*(MARRIED_BRACKET3 - MARRIED_BRACKET2);
      }

      else
      {
        tax = RATE1*MARRIED_BRACKET1 + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3*(MARRIED_BRACKET3 - MARRIED_BRACKET2) + RATE4*(income - MARRIED_BRACKET4);
      }
}
    else if(status.equalsIgnoreCase("single") || status.equalsIgnoreCase("s"))
    {
      if (income <= SINGLE_BRACKET1)
      {
        tax = income + RATE1;
      }
      else if (income <= SINGLE_BRACKET2)
      {
        tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET1);
      }
      else if (income <= SINGLE_BRACKET3)
      {
        tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (income - SINGLE_BRACKET2);
      else if (income <= SINGLE_BRACKET2)
      {
        tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET1);
      }
      else if (income <= SINGLE_BRACKET3)
      {
        tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (income - SINGLE_BRACKET2);
      }
      else
      {
        tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (SINGLE_BRACKET3 - SINGLE_BRACKET2) + RATE4 * (income - SINGLE_BRACKET4);
      }
    }
    else
    {
      System.out.println("You typed in an inappropriate status, please refresh and try again.");
    }
    return tax;
  }

  //@override
  public boolean equals(TaxReturn c)
  {
    return (c.getSSN() == this.getSSN() && (c.income == this.income));
  }

}

// this is the tax return class part of the tax return project
