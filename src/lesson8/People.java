package lesson8;

public class People {
    private String name;
    private String sername;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (age != people.age) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        return sername != null ? sername.equals(people.sername) : people.sername == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sername != null ? sername.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
