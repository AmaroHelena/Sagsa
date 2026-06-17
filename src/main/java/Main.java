
import Data.RepositoryContrato;
import Data.BancoDadosRealRepository;
import Core.GeradorEstrategiaCore;
import View.TerminalInterface;

public class Main {

    public static void main(String[] args) {

        RepositoryContrato bancoDados = new BancoDadosRealRepository();

        GeradorEstrategiaCore core = new GeradorEstrategiaCore(bancoDados);

        TerminalInterface interfaceUsuario = new TerminalInterface(core);

        interfaceUsuario.renderizarJanelaTerminal();
    }
}
