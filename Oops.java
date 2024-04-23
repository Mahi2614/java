public class Oops {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor);
        p1.setTip(5);
        System.out.println(p1.getTip);

        // BankAccount myAcc = new BankAccount();
        // myAcc.username="mahi";
        // myAcc.setPassword("abcd");

    }
}

// class BankAccount{
// public String username;
// private String password;
// public void setPassword(String pwd){
// password=pwd;
// }
// }
class Pen {
    private String color;
    private int 

    String

    getColor() { // gettter
        return this.color;
}

   v

id

   setColor(String newColor) {//setter
            color = newColor;
        }

    void setTip(int newTip) {
        tip = newTip;

    }
}
// class Student {
// String name;
// int age;
// float percentage;// cgpa

// void calPercent(int phy, int chem, int math) {
// percentage = (phy + chem + math) / 3;
// }
// }
