package hav.com.ua.yesapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "constants")
public class Constant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String value;
    private ConstantType type;
}
