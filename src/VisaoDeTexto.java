import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {

    private EstatisticasCampo infos;

    public VisaoDeTexto() {
        infos = new EstatisticasCampo();
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
       //nao ha implementação para ser feita pois nao e do escopo da classe VisaoDeTexto definir a cor dos animais
    }
    
    @Override
    public boolean ehViavel(Campo campo) {

        return infos.ehViavel(campo);
    }
    
     @Override
    public void mostrarStatus(int passo, Campo campo) {
        
        infos.reiniciar();
        String dados = infos.obterDetalhesPopulacao(campo);

        System.out.println("Passo " + passo + " " + dados);
    }

     @Override
    public void reiniciar() {
        // sem implementação
    }

    @Override
    public void reabilitarOpcoes() {
        // sem implementação
    }


    
}