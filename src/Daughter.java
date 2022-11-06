 final public class Daughter extends  Mother {

    private String name;
    private int age;
    private  Profession  profession;

    private Habits habits;

     public Daughter(String alina, int age, String students, Habits habits) {
         super(alina, age,students, habits);
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

     public Daughter(String name, int age, Profession profession) {
         super(name, age, profession);
     }

     @Override
     public String getInfo() {
         return super.getInfo();
     }
 }
