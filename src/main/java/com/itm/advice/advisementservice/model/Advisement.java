package com.itm.advice.advisementservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "advisement")

public class Advisement {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "adviser_id")
    private UUID adviserId;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "meeting_link")
    private String meetingLink;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    public Advisement(UUID id, UUID adviser_id, UUID user_id, UUID created_by, String meeting_link, String type, String status, LocalDateTime start_date, LocalDateTime end_date) {
        this.id = id;
        this.adviserId = adviser_id;
        this.userId = user_id;
        this.createdBy = created_by;
        this.meetingLink = meeting_link;
        this.type = type;
        this.status = status;
        this.startDate = start_date;
        this.endDate = end_date;
    }

    public Advisement() {

    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAdviser_id() {
        return adviserId;
    }

    public void setAdviser_id(UUID adviser_id) {
        this.adviserId = adviser_id;
    }

    public UUID getUser_id() {
        return userId;
    }

    public void setUser_id(UUID user_id) {
        this.userId = user_id;
    }

    public UUID getCreated_by() {
        return createdBy;
    }

    public void setCreated_by(UUID created_by) {
        this.createdBy = created_by;
    }

    public String getMeeting_link() {
        return meetingLink;
    }

    public void setMeeting_link(String meeting_link) {
        this.meetingLink = meeting_link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getStart_date() {
        return startDate;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.startDate = start_date;
    }

    public LocalDateTime getEnd_date() {
        return endDate;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.endDate = end_date;
    }
}
