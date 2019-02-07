public class UserClass {


    int a;
    int b;

    public UserClass ()
    {
        a = 0;
        b = 3;

    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String  getUserId()
    {
        String a_str = new String();
        String b_str = new String();

        a_str = Integer.toString(a);
        b_str = Integer.toString(b);
        return a_str + b_str;
    }

}
