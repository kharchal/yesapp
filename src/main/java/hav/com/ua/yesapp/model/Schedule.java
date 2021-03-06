package hav.com.ua.yesapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;
    private String descr;
}
