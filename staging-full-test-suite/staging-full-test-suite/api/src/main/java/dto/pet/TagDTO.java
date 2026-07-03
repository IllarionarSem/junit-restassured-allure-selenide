package dto.pet;

import lombok.*;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
public class TagDTO {
    int id;
    String name;
}
