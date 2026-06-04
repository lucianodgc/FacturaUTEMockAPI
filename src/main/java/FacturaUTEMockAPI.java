import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.UUID;

@Path("/pagos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FacturaUTEMockAPI {

    @POST
    public Response notificarPago(String jsonRequest) {
        String idTransaccion = "UTE-" + UUID.randomUUID().toString();

        return Response.status(Response.Status.OK)
                .entity("{\"status\":\"OK\", \"transaccion\":\"" + idTransaccion + "\"}")
                .build();
    }
}