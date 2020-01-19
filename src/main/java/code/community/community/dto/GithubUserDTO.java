package code.community.community.dto;

import lombok.Data;

@Data
public class GithubUserDTO {
    private String name;
    private String pio;
    private Long id;
    private String avatar_url;
}
