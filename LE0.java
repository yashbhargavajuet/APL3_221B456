//setter getter methods
class Juet
{
    int age;
    String name;
    public void SetAge(int a)
    {
        this.age=a;
    }
    public void SetName(String n)
    {
        this.name=n;
    }
    public void getageandname()
    {
        System.out.println(age+" "+name);
    }
}
public class LE0
{
    public static void main(String[] args)
    {
        Juet obj=new Juet();
        obj.SetAge(19);
        obj.SetName("Lamba");
        obj.getageandname();
        obj.SetAge(34);
        obj.SetName("Binod");
        obj.getageandname();
    }
}