package org.example;

public class Hotel {

    private int quarto;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Hotel{" +
                "quarto=" + quarto +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Hotel(int quarto, String name, String email) {
        this.quarto = quarto;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
