package com.itm.advice.advisementservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@Setter
@Table(name = "advisement")

public class Advisement {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "adviser_id")
    private UUID adviser_id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "created_by")
    private UUID created_by;;

    @Column(name = "meeting_link")
    private String meeting_link;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;



    public Advisement() {

    }
}
