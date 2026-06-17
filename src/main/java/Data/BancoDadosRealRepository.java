package Data;

import java.util.HashMap;
import java.util.Map;
import Data.RepositoryContrato;

public class BancoDadosRealRepository implements RepositoryContrato {

    private Map<String, String> nuvemSenaiDados = new HashMap<>();

    public BancoDadosRealRepository() {
        nuvemSenaiDados.put("UC3-02", "[NUVEM-SQL] Analisar de forma crítica e mapear as fronteiras de subsistemas.");

        nuvemSenaiDados.put("UC5-01", "[NUVEM-SQL] Testar a segurança de endpoints contra ataques e injeções.");
    }

    @Override
    public String buscarCapacidadePorCodigo(String codigo) {
        return nuvemSenaiDados.getOrDefault(codigo, "Código inexistente na nuvem do SENAI.");
    }
}
