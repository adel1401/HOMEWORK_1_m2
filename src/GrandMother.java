

public class GrandMother {

    private String name;
    private int age ;
    private Profession profession;
    private Habits habits;

    public GrandMother(String name, int age, Profession profession, Habits habits) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.habits = habits;
    }

    public GrandMother(String ulkan, int age, String teacher, Habits readingBooks) {
    }



    public Habits getHabits() {
        return habits;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Profession getProfession() {
        return profession;
    }


    public String getInfo(){
        return " Name: " + name +
                "\nAge: " + age +
                "\nProfession: " + profession.getProfession();

    }

    }
