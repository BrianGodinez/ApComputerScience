package com.company;

public class Classing
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(20, 20, 60);
        Rectangle rectangle = new Rectangle(100, 100, 40, 40);

        System.out.println("The diameter of the circle is: " + circle.getRadius() * 2);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

        circle.setName("MyBigThiccCircle");
        System.out.println(circle.getName());
    }
}

interface IRectangle
{
    int getArea();
}

abstract class Shape
{
    private int x, y;
    private String name;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

class Circle extends Shape
{
    private int x, y;
    private int radius;

    public Circle(int x, int y, int radius)
    {
        super(x, y);

        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}

class Rectangle extends Shape implements IRectangle
{
    private int x, y;
    private int width, height;

    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);

        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getArea()
    {
        return width * height;
    }
}
