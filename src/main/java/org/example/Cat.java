package org.example;
class Cat extends Animal
{
    private static int catCount = 0;
    private boolean isFull;
    public Cat(String name)
    {
        super(name);
        this.isFull = false;
        catCount++;
    }
    @Override
    public void run(int distance)
    {
        if (distance <= 200)
        {
            System.out.println(name+distance);
        } else
        {
            System.out.println(name +distance);
        }
    }
    @Override
    public void swim(int distance)
    {
        System.out.println(name);
    }}
