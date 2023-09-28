package oops.inheritance.exercise;

class A{
    void showA()
    {
        System.out.println("This is show A");
    }
    void show()
    {
        System.out.println("I am in A");
    }
}
class B extends A{
    void showB()
    {
        System.out.println("This is show B");
    }
    void show()
    {
        System.out.println("I am in B");
    }
}
class Demo1
{
    public static void main(String args[])
    {
        B b1 = new B();
        b1.show();
    }
}
