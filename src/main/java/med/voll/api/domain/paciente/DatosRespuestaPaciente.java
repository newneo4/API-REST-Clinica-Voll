package med.voll.api.domain.paciente;

public record DatosRespuestaPaciente(
        Long id,
        String nombre,
        String email,
        String documentoIdentidad,
        String telefono
) {
}
