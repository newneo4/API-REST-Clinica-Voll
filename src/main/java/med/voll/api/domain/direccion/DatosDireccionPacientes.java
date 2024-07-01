package med.voll.api.domain.direccion;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DatosDireccionPacientes(
        @NotBlank @Size(max = 100) String urbanizacion,
        @NotBlank @Size(max = 100) String distrito,
        @NotBlank @Size(max = 9) String codigoPostal,
        @Size(max = 100) String complemento,
        @Size(max = 20) String numero,
        @NotBlank @Size(max = 100) String provincia,
        @NotBlank @Size(max = 100) String ciudad
) {
}
