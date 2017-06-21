package com.example.yhislaraf.tabby.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhislaraf on 21-06-17.
 */

public class Utils {

    public List<Country> getCodeCountry(){

        List<Country> lista = new ArrayList<Country>(){{
            add(new Country("España","ES"));
            add(new Country("Argentina","AR"));
            add(new Country("Bolivia","BO"));
            add(new Country("Chile","CL"));
            add(new Country("Colombia","CO"));
            add(new Country("Ecuador","EC"));
            add(new Country("Mexico","MX"));
            add(new Country("Perú","PR"));
            add(new Country("Uruguay","UY"));
            add(new Country("Venezuela","VE"));
        }
        };
        return lista;
    }
}
