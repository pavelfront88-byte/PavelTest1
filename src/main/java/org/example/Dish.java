package org.example;
class Dish
{
    private int foodAmount;
    public Dish(int initialFood)
    {
        if (initialFood<0)
        {
            throw new IllegalArgumentException();
        }
        this.foodAmount = initialFood;
    }
    public boolean takeFood(int amount)
    {
        if (foodAmount >= amount)
        {
            foodAmount -= amount;
            return true;
        }
        return false;
    }
}
