package org.example;
class Animal
{
    protected String name;
    public Animal(String name)
    {
        this.name=name;
    }
    void run(int distance)
    {
        System.out.println(name+"пробежал"+distance+"метров");
    }
    void swim(int distance)
    {
        System.out.println(name+"проплыл"+distance+"метров");
    }
}
class Dog extends Animal
{
    public Dog(String Sharik)
    {
        super(Sharik);
    }
    void run(int distance)
    {
        if (distance<=500)
            System.out.println(getName()+"пробежал"+distance+"метров");
        else
            System.out.println(getName()+"не смог пробежать дистанцию");
    }
    private String getName()
    { return name; }
}
class Cat extends Animal
{
    public Cat(String Murzik)
    {
        super(Murzik);
    }
    void run(int distance)
    {
        if (distance<=200)
            System.out.println(getName()+"пробежал"+distance+"метров");
        else
            System.out.println(getName()+"не смог пробежать дистанцию");
    }
    private String getName() { return name; }
}

