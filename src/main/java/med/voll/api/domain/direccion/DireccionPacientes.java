package med.voll.api.domain.direccion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor // Necesario para JPA
public class DireccionPacientes {

    @Column(name = "urbanizacion", nullable = false, length = 100)
    private String urbanizacion;

    @Column(name = "distrito", nullable = false, length = 100)
    private String distrito;

    @Column(name = "codigoPostal", nullable = false, length = 9)
    private String codigoPostal;

    @Column(name = "complemento", length = 100)
    private String complemento;

    @Column(name = "numero", length = 20)
    private String numero;

    @Column(name = "provincia", nullable = false, length = 100)
    private String provincia;

    @Column(name = "ciudad", nullable = false, length = 100)
    private String ciudad;

    // Constructor que inicializa desde DatosDireccionPacientes
    public DireccionPacientes(DatosDireccionPacientes datos) {
        this.urbanizacion = datos.urbanizacion();
        this.distrito = datos.distrito();
        this.codigoPostal = datos.codigoPostal();
        this.complemento = datos.complemento();
        this.numero = datos.numero();
        this.provincia = datos.provincia();
        this.ciudad = datos.ciudad();
    }

    public DireccionPacientes actualizarDatos(DatosDireccionPacientes datos) {
        this.urbanizacion = datos.urbanizacion();
        this.distrito = datos.distrito();
        this.codigoPostal = datos.codigoPostal();
        this.complemento = datos.complemento();
        this.numero = datos.numero();
        this.provincia = datos.provincia();
        this.ciudad = datos.ciudad();

        return this;
    }
}
