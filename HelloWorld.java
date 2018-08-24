
class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    // getter/accessor function
    public String getName() {
        return name;
    }

    // setter/mutator function
    public void setName(String name) {
        this.name = name;
    }

    // private is only accessible in THIS class - not even child classes!
    private void breathe() {
        // inhale, exhale
    }

    public void walk() {
        // move
    }
}


class Student extends Person {

    private int studentId;
    private String major;

    // getters and setters here

    public void doHomework() {
        // procrastinate
    }


    @Override
    void walk()  {
        super.walk();
        // carry backpack
    }


}
