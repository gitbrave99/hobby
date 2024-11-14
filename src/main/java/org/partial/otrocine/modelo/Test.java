package org.partial.otrocine.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nobre;

    public Test() {

    }

    public Test(String nobre) {
        this.nobre = nobre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", nobre='" + nobre + '\'' +
                '}';
    }
}
