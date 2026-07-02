package dto.pet;

import lombok.*;

import java.util.List;

@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {
    int id;
    String name;
    CategoryDTO category;
    List<String> photoUrls;
    List<TagDTO> tags;
    String status;
}
