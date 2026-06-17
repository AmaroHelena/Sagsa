
import Data.FakeExcelRepository;
import Data.RepositoryContrato;
import Core.GeradorEstrategiaCore;
import View.TerminalInterface;

public class Main {

    public static void main(String[] args) {
        // 1. Instancia o subsistema de persistência de dados
        RepositoryContrato bancoDados = new FakeExcelRepository();
        // 2. Cria o motor injetando o contrato de dados
        GeradorEstrategiaCore core = new GeradorEstrategiaCore(bancoDados);
        // 3. Monta a interface conectando ao core
        TerminalInterface interfaceUsuario = new TerminalInterface(core);
        // 4. Dispara a aplicação
        interfaceUsuario.renderizarJanelaTerminal();
    }
}
