package med.voll.api.domain.medico;

public record DatosRespuestaMedico(
        Long id,
        String nombre,
        String email,
        String telefono,
        String documento
) {
}
