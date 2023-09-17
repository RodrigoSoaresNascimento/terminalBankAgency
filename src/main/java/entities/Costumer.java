package entities;

public class Costumer {

    private String cpf;

    private String name;

    private Integer age;

    private String email;

    public Costumer(String cpf, String name, Integer age, String email) {
        this.cpf = cpf;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Costumer() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
