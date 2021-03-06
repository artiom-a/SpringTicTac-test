package ru.tiktaktoe.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    public Player(String name){
        this.name = name;
    }

    private Player(){}


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
