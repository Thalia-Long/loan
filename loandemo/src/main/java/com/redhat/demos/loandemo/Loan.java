package com.redhat.demos.loandemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Amount")
   private int amount;
   @org.kie.api.definition.type.Label(value = "Approved")
   private java.lang.Boolean approved;
   @org.kie.api.definition.type.Label(value = "Duration")
   private int duration;
   @org.kie.api.definition.type.Label(value = "InterestRate")
   private java.lang.Double interestRate;

   public Loan()
   {
   }

   public int getAmount()
   {
      return this.amount;
   }

   public void setAmount(int amount)
   {
      this.amount = amount;
   }

   public java.lang.Boolean getApproved()
   {
      return this.approved;
   }

   public void setApproved(java.lang.Boolean approved)
   {
      this.approved = approved;
   }

   public int getDuration()
   {
      return this.duration;
   }

   public void setDuration(int duration)
   {
      this.duration = duration;
   }

   public java.lang.Double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(java.lang.Double interestRate)
   {
      this.interestRate = interestRate;
   }

   public Loan(int amount, java.lang.Boolean approved, int duration,
         java.lang.Double interestRate)
   {
      this.amount = amount;
      this.approved = approved;
      this.duration = duration;
      this.interestRate = interestRate;
   }

}