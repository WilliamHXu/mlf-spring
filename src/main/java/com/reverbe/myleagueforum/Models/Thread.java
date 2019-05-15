package com.reverbe.myleagueforum.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Leaguer creater;

}
