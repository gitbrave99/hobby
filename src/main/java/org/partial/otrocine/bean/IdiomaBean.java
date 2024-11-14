package org.partial.otrocine.bean;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.HashMap;
import java.util.Map;

@Named
@RequestScoped
public class IdiomaBean {
    private String idioma;
    private Map<String, String> idiomas;
    private Map<String, Map<String, String>> data = new HashMap<>();
    private Map<String, String> cities;

    @PostConstruct
    public void init() {
        idiomas = new HashMap<>();
        idiomas.put("Español", "Español");
        idiomas.put("English", "English");
    }


    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Map<String, String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Map<String, String> countries) {
        this.idiomas = countries;
    }

    public void onIdiomaChange() {
        System.out.println("solo algo"+idioma);
        /*if (idioma != null && !"".equals(idioma)) {
            idiomas = data.get(idioma);
        }
        else {
            cities = new HashMap<>();
        }
        * */
    }


}
