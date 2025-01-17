package com.example.database.entity;

import com.example.database.controller.Status;
import jakarta.persistence.*;

@Entity
@Table(name="user_entity")//if the name of the table differs from the name of the class, you can map it here
public class UserEntity {
    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="status", nullable = true)
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
