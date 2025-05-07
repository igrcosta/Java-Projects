import javax.swing.*;
import java.awt.*;

public class PlayerGUI extends JFrame{
    private JLabel nomeLabel;
    private JProgressBar hpBar;
    private JTextArea armasArea;

    private Player player;

    public PlayerGUI(Player player) {
        this.player = player;
        inicializarComponentes();
        configurarJanela();
    }

    private void configurarJanela(){
        setTitle("Status:");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); //centralizando a tela
        setLayout(new BorderLayout());
    }

    private void inicializarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //centralizando verticalmente

        //name label
        nomeLabel = new JLabel("Nome: " + player.getnome());
        nomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        nomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 2. Barra de vida
        hpBar = new JProgressBar(0, 100);
        hpBar.setValue(calcularPorcentagemVida());
        hpBar.setStringPainted(true); // Mostra texto
        hpBar.setString(player.gethp() + " HP");
        hpBar.setForeground(Color.RED);
    
    // 3. Área de texto para armas
    armasArea = new JTextArea();
    armasArea.setText("Arma equipada: " + player.getIDarma());
    armasArea.setEditable(false);
    
    // Adiciona componentes ao painel
    panel.add(Box.createVerticalStrut(20)); // Espaço
    panel.add(nomeLabel);
    panel.add(Box.createVerticalStrut(20));
    panel.add(hpBar);
    panel.add(Box.createVerticalStrut(20));
    panel.add(new JScrollPane(armasArea));
    
    // Adiciona painel à janela
    add(panel, BorderLayout.CENTER);
}

private int calcularPorcentagemVida() {
    if(!player.nome.equals("Zoio")){
    int vidaMaxima = 15; 
    return (player.gethp() * 100) / vidaMaxima;
} else {
    int vidaMaxima = 30; 
    return (player.gethp() * 100) / vidaMaxima;
}

}
