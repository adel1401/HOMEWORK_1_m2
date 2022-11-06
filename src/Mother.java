public class Mother extends GrandMother {


    private String name;
    private int age;
    private Profession profession;
    private Habits habits;

    @Override
    public Habits getHabits() {
        return habits;
    }

    public Mother(String Apal, int age, String cook, Habits habits) {
        super(Apal, 39, cook, habits);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Profession getProfession() {
        return profession;
    }

    public Mother(String name, int age, Profession profession) {
        super(name, age, profession, Habits.COOKING);

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}

