package org.example;
class Cat extends Animal
{
    private static int catCount = 0; // счётчик котов
    private boolean isFull; // сытость кота
    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 200 м)");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }}
