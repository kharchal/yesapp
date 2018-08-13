package hav.com.ua.yesapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    private Long balance;

    @ManyToOne
    private Level level;

    @ManyToOne
    private Group group;

//    @ManyToMany
//    private List<Group> groups;

    @ManyToOne
    private Student refered;
}
