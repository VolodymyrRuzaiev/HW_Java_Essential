package Pract_1;

public class Account {
    Client owner = new Client();
    Money money = new Money();

    Long numInter = null;
    Long numUkr = null;
    String pref = "UA";

    Byte type = null;

    public Account(new Money())

    {

        {
            this.money = money;
            this.numInter = numInter;
            this.numUkr = numUkr;
        }

        @Override
        public String toString() {
        return "Account" +
                ", money"+ money.sum + money+
                ", num"+ numInter + numUkr +
                "";}
    }

        public static void main (String[]args){
        Account objAcc1 = new Account(new Money(1000, "USD"), 111L, 111L);
        Account objAcc2 = new Account(new Money(1000, "USD"), 222L, 222L);
        objAcc1.money.sum -= 500;
        objAcc2.money.sum += 500;
        System.out.println(objAcc1.toString());
        System.out.println(objAcc2.toString());
    }


    }  //  public class

    class Client {

    }

    class Money {
        public int sum;
    }
}

