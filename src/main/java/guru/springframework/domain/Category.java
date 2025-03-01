package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class Category {
    @Id
    private String id;
    private String description;

    @DBRef
    private Set<Recipe> recipes;
}
