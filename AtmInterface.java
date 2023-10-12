import java.util.Scanner;

class Atm {
    int amountwid;
    int amountdip;
    int accountbalance;

    void withdrawing(int amountwid) {
        if (accountbalance > amountwid) {
            accountbalance = accountbalance - amountwid;
            System.out.println("After successful withdrawing! Now,your bankbalance is:" + accountbalance + "\n");
        } else {
            System.out.println(
                    "Your withdraw request has been failed!due to less amount your acoount.Please check your bank balance!\n");
        }
    }

    void deposit(int amtountdip) {
        accountbalance = accountbalance + amountdip;
        System.out.println("After successful depositing! Now,your bankbalance is:" + accountbalance + "\n");
    }

    int checkbalance() {
        return accountbalance;
    }
}

class Bankaccount extends Atm {
    String name;
    int accountnumber;

    float accountbalance(int accountbal) {
        return accountbal;
    }

    public void printname(String name) {
        System.out.println("Account Holder Name:" + name);
    }

    public void printnumber(int accountnumber) {
        System.out.println("Account Number:" + accountnumber);
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 2244;
        int p;
        do {
            System.out.println("Enter your ATM pin:");
            p = sc.nextInt();
            if (pin != p) {
                System.out.println("Please enter correct ATM pin:");
            }
        } while (pin != p);

        if (pin == p) {
            Bankaccount usr = new Bankaccount();
            usr.accountbalance = 1000;
            usr.accountnumber = 2323434;
            usr.name = "MOHD ASAD ALI";
            usr.printname(usr.name);
            usr.printnumber(usr.accountnumber);
            float acc = usr.accountbalance(usr.accountbalance);
            System.out.println("Your Account Balance is:" + acc + "rs\n");

            Atm user = new Atm();
            user.accountbalance = 1000;

            while (true) {
                String wlcm = "Please  select an option to perform operation\n1.to perform withdraw operation\n2.To perform deposit operation\n3.to checkbalance\n4.to exit the atm machine.";
                System.out.println(wlcm);
                System.out.println("Enter the number of operation you want to perform :");
                int n = sc.nextInt();
                if (n == 1) {
                    System.out.println("Enter the amount you want to withdraw:");
                    user.amountwid = sc.nextInt();
                    user.withdrawing(user.amountwid);
                } else if (n == 2) {
                    System.out.println("Enter the amount you want to deposit:");
                    user.amountdip = sc.nextInt();
                    user.deposit(user.amountdip);
                } else if (n == 3) {
                    int accbal = user.checkbalance();
                    System.out.println("Your bankbalance is :" + accbal + "rs");
                } else if (n == 4) {
                    System.out.println("Thanks for using ATM machine!Have a great day!");
                    break;
                } else {
                    System.out.println("Enter the valid operation!");
                }

            }
        }
    }
}
