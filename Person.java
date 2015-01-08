import java.util.ArrayList;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private Person father;
    private Person mother;
    private ArrayList<Person>children;

    /**
     * Constructor for objects of class Person
     */
    public Person(String nombre, int edad)
    {
        name = nombre;
        age = edad;
        father = null;
        mother = null;
        children = new ArrayList<Person>();
    }

    /**
     * Metodo que muestra por pantalla el nombre y edad de la persona 
     */
    public void showData()
    {
        System.out.println ( "Nombre: " + name);
        System.out.println ( "Edad: " + age);
    }

    /**
     * Metodo que permite fijar el padre de la persona
     */
    public void setFather(Person father)
    {
        this.father = father;
    }

    /**
     * Metodo que permite fijar la madre de la persona
     */
    public void setMother(Person mother)
    {
        this.mother = mother;
    }

    /**
     * Metodo que permite añadir un hijo a una persona
     */
    public void addChild (Person child)
    {
        children.add(child);
        child.setFather(this); 
    }

    /**
     * Metodo que muestra por pantalla los datos del padre y de la madre de una persona
     */
    public void showParentsData()
    {
        if (this.mother != null || this.father != null)
        {
            System.out.println ("Datos de los padres;");
            mother.showData();
            father.showData();
        }

    }

    /**
     * Metodo que muestra por pantalla los datos de los hijos de una persona
     */
    public void showChildrenData()
    {
        if (children.size() > 0)
        {
            System.out.println("Hijos");
            for (Person child : children)
            {
                child.showData();
            }
        }
        else
        {
            System.out.println("No tiene hijos");
        }

    }

    /**
     * Metodo que devuelve si una persona tiene o no hijos
     */
    public boolean hasChildrens()
    {
        boolean hasChildrens = false;

        if (children.size() > 0)
        {
            hasChildrens = true;
        }
        return hasChildrens;
    }

    /**
     * Metodo que devuelve el numero de hijos de una persona
     */
    public int getNumberOfChildren()
    {
        int numberOfChildren = 0;
        for (Person child : children)
        {
            numberOfChildren = numberOfChildren + 1;
        }
        return numberOfChildren;

    }

    /**
     * Metodo que devuelve si una persona tiene hermanos o no
     */
    public boolean hasBrothers()
    {
        boolean hasBrothers = false;
        if (mother.getNumberOfChildren() > 1) 
        {
            hasBrothers = true;
        }
        else if (father.getNumberOfChildren() > 1)
        {
            hasBrothers = true;
        }
        return hasBrothers;
    }

}