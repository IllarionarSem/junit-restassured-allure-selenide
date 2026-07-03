package dto.pet;

import lombok.*;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    int id;
    String name;
}
