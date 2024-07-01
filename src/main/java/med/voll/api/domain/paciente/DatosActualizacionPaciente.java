package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.direccion.DatosDireccionPacientes;

public record DatosActualizacionPaciente(
    @NotNull
    Long id,
    String nombre,
    String documentoIdentidad,
    DatosDireccionPacientes direccion
) {
}
