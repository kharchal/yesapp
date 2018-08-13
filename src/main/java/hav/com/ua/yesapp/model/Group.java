package hav.com.ua.yesapp.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Level level;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Schedule schedule;

    private LocalDate started;
    private LocalDate finished;
}
