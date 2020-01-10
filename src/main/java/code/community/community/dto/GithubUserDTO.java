package code.community.community.dto;

public class GithubUserDTO {
    private String name;
    private String pio;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPio() {
        return pio;
    }

    public void setPio(String pio) {
        this.pio = pio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
