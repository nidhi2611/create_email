package user;

public class User {
    String name;
    String company;
    int age;

    public User(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String createEmail() {
        return String.format("%s_%d@%s.com", getName(), getAge(), getCompanyName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
