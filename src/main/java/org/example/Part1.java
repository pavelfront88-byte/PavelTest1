package org.example;
import java.time.LocalDate;
class Товар
{
    private String Название;
    private LocalDate Дата_Производства;
    private String Производитель;
    private String Страна_Происхождения;
    private double Цена;
    private boolean Забронирован_Покупателем;
    public Товар(
            String Название,
            LocalDate Дата_Производства,
            String Производитель,
            String Страна_Происхождения,
            double Цена,
            boolean Забронирован_Покупателем)
    {
        this.Название=Название;
        this.Дата_Производства=Дата_Производства;
        this.Производитель=Производитель;
        this.Страна_Происхождения=Страна_Происхождения;
        this.Цена=Цена;
        this.Забронирован_Покупателем=Забронирован_Покупателем;
    }
public void Вывести_Информацию()
{
    System.out.println("Информация о товаре:");
    System.out.println("Название:"+Название);
    System.out.println("Дата производства:"+Дата_Производства);
    System.out.println("Производитель:"+Производитель);
    System.out.println("Страна происхождения:"+Страна_Происхождения);
    System.out.println("Цена:"+Цена);
    System.out.println("Забронирован_Покупателем:"+Забронирован_Покупателем);

}}