public class COD extends BankAccont{
    int numberOfWithdraws;
 public int getDetails()
 {
    return account;
   // System.out.println(account);
 }
    public void setDetails()
    {
         account=123 ;
         balance =20.3;
    }

    public static void main(String[] args) {
       COD c=new COD();
   c.setDetails();
   int acc=c.getDetails();
   System.out.println(acc);

    }
}
