public class Main {
    public static void main(String[] args) {


        GrandMother grandMother = new GrandMother("Ulkan", 65, "Teacher", Habits.READING_BOOKS);
        Profession profession = new Profession("Teacher", "40");
        System.out.println(grandMother.getInfo());


        Mother mother = new Mother("Apal", 39, "Cook", Habits.COOKING);
        System.out.println(mother.getInfo());

        Daughter daughter = new Daughter("Alina", 18, "Students", Habits.DRAWING );
        System.out.println(daughter.getInfo());

    }
}