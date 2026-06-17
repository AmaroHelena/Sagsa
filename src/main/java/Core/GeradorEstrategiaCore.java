
package Core;

import Data.RepositoryContrato;

public class GeradorEstrategiaCore {

    private RepositoryContrato dataRepository;
    // Injeção de Dependência via Construtor - Baixíssimo Acoplamento

    public GeradorEstrategiaCore(RepositoryContrato repository) {
        this.dataRepository = repository;
    }

    public String processarEstrategiaDocente(String codigoUc) {
        // Coesão: Esse método apenas lê o dado contratual e aplica a regra pedagógica
        String capacidade = dataRepository.buscarCapacidadePorCodigo(codigoUc);
        return "--- SITUAÇÃO DE APRENDIZAGEM GERADA PELO SAGSA ---\n"
                + "Mapeamento de Origem: Código " + codigoUc + "\n"
                + "Competência Identificada: " + capacidade + "\n"
                + "Estratégia Didática Sugerida: Realizar um estudo de caso em formato de Workshop "
                + "com os alunos trabalhando em equipes de desenvolvimento ágil (Scrum).\n"
                + "--------------------------------------------------";
    }
}
