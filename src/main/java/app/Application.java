package app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "appl_application")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String applicationNumber;
    String status;
    String createDate; //yyyyMMdd
    Integer sessionId;

}

