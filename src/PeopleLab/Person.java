package PeopleLab;

public abstract class Person {
    private String type;
    public Person(String type)
    {
        this.type = type;
    }
    public abstract String getFirstName();
    public abstract String getFamilyName();
    public boolean toString(){
        return getFirstName().equals(getFamilyName());
    }
}
