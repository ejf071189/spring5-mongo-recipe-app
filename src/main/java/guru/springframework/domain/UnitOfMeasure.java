package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {

    @Id
    private String id;
    private String description;
}
