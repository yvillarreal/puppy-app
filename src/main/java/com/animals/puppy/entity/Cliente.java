package com.animals.puppy.entity;

import org.apache.logging.log4j.message.TimestampMessage;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository

public class Cliente {

    private String nombre;
    private Timestamp creadoEl;

    public Timestamp getCreadoEl() {
        return creadoEl;
    }

    public void setCreadoEl(Timestamp creadoEl) {
        this.creadoEl = creadoEl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
