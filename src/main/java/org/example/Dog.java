package org.example;
class Dog extends Animal
{
    private static int dogCount=0;
    public Dog(String name)
    {
        super(name);
        dogCount++;
    }
    @Override
    public void run(int distance)
    {
        if (distance<=500)
        {
            System.out.println(name+distance);
        } else
        {
            System.out.println(name+distance);
        }
    }
    @Override
    public void swim(int distance)
    {
        if (distance<=10)
        {
            System.out.println(name+distance);
        } else
        {
            System.out.println(name+distance);
        }
    }}
