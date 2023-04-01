package com.itm.advice.advisementservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "advisement")
@Getter
@Setter
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
    private Timestamp start_date;

    @Column(name = "end_date")
    private Timestamp end_date;

    public Advisement(UUID id, UUID adviser_id, UUID user_id, UUID created_by, String meeting_link, String type, String status, Timestamp start_date, Timestamp end_date) {
        this.id = id;
        this.adviser_id = adviser_id;
        this.user_id = user_id;
        this.created_by = created_by;
        this.meeting_link = meeting_link;
        this.type = type;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
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
        return adviser_id;
    }

    public void setAdviser_id(UUID adviser_id) {
        this.adviser_id = adviser_id;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public UUID getCreated_by() {
        return created_by;
    }

    public void setCreated_by(UUID created_by) {
        this.created_by = created_by;
    }

    public String getMeeting_link() {
        return meeting_link;
    }

    public void setMeeting_link(String meeting_link) {
        this.meeting_link = meeting_link;
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

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }
}
