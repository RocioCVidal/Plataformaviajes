package pe.edu.upao.sistemas.Plataformaviajes.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class LoginDTO {
    private String correo;
    private String contrasena;

    // Getters y setters
}
