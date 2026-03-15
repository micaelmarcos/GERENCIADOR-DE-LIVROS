import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MICAEL MARCOS
 */
public class MMLibrary extends javax.swing.JDialog {

// CRIAR UM ARRAYLIST DO TIPO LIVRO PARA ARMAZENAR OS OBJETOS
    List<Livro> livros = new ArrayList<>(); 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MMLibrary.class.getName());


    public MMLibrary(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        recuperaArquivo(); // RECUPERA DADOS DO ARQUIVO AO INICIAR PROGRAMA 
        listaLivrosTabela(); // LISTA TODOS OS LIVROS CADASTRADOS NA TABELA AO INICIAR PROGRAMA
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaAdicionarLivro = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAdicionarTitulo = new javax.swing.JTextField();
        lblAdicionarAutor = new javax.swing.JTextField();
        lblAdicionarEmprestado = new javax.swing.JTextField();
        lblAdicionarStatus = new javax.swing.JLabel();
        btnAdicionaConfirma = new javax.swing.JButton();
        lblAdicionarPagina = new javax.swing.JTextField();
        lblAdicionarPublicacao = new javax.swing.JTextField();
        lblAdicionarPreco = new javax.swing.JTextField();
        chkEmprestado = new javax.swing.JCheckBox();
        telaAlerta = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();
        telaEditarLivro = new javax.swing.JDialog();
        label1 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        fieldEditarTitulo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldEditarAutor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldEditarPaginas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fieldEditarAno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fieldEditarPreco = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnEditarConfirmar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        fieldEditarEmprestado = new javax.swing.JTextField();
        telaListaBusca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivrosBusca = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAdicionarLivro = new javax.swing.JButton();
        btnAlterarLivro = new javax.swing.JButton();
        btnExcluirLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        jComboOrdenar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jCombroFiltrarEmprestado = new javax.swing.JComboBox<>();
        jComboFiltrarAutor = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        TelaAdicionarLivro.setMinimumSize(new java.awt.Dimension(370, 408));
        TelaAdicionarLivro.setModal(true);
        TelaAdicionarLivro.setPreferredSize(new java.awt.Dimension(370, 408));
        TelaAdicionarLivro.setResizable(false);
        TelaAdicionarLivro.setSize(new java.awt.Dimension(370, 408));

        jPanel4.setBackground(new java.awt.Color(52, 168, 83));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADICIONAR LIVRO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Titulo");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Autor");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Número de páginas");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ano de Publicação");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Preço");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Emprestado para");

        btnAdicionaConfirma.setBackground(new java.awt.Color(204, 204, 204));
        btnAdicionaConfirma.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAdicionaConfirma.setText("ADICIONAR");
        btnAdicionaConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaConfirmaActionPerformed(evt);
            }
        });

        chkEmprestado.setText("Não emprestado");

        javax.swing.GroupLayout TelaAdicionarLivroLayout = new javax.swing.GroupLayout(TelaAdicionarLivro.getContentPane());
        TelaAdicionarLivro.getContentPane().setLayout(TelaAdicionarLivroLayout);
        TelaAdicionarLivroLayout.setHorizontalGroup(
            TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                        .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TelaAdicionarLivroLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                                        .addComponent(lblAdicionarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, Short.MAX_VALUE))
                                    .addComponent(lblAdicionarPreco)
                                    .addComponent(lblAdicionarPublicacao)
                                    .addComponent(lblAdicionarPagina)
                                    .addComponent(lblAdicionarAutor)
                                    .addComponent(lblAdicionarTitulo))
                                .addGap(19, 19, 19))
                            .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdicionarStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(btnAdicionaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 48, Short.MAX_VALUE)))))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        TelaAdicionarLivroLayout.setVerticalGroup(
            TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaAdicionarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAdicionarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAdicionarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAdicionarPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblAdicionarPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAdicionarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(TelaAdicionarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblAdicionarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEmprestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdicionarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        telaAlerta.setAutoRequestFocus(false);
        telaAlerta.setMinimumSize(new java.awt.Dimension(230, 230));
        telaAlerta.setModal(true);
        telaAlerta.setResizable(false);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuidado.png"))); // NOI18N

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAlerta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlerta.setText("A descrição do alerta será mostrado aqui");

        javax.swing.GroupLayout telaAlertaLayout = new javax.swing.GroupLayout(telaAlerta.getContentPane());
        telaAlerta.getContentPane().setLayout(telaAlertaLayout);
        telaAlertaLayout.setHorizontalGroup(
            telaAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAlertaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(telaAlertaLayout.createSequentialGroup()
                .addGroup(telaAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaAlertaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaAlertaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        telaAlertaLayout.setVerticalGroup(
            telaAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAlertaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        telaEditarLivro.setTitle("EDITAR LIVRO");
        telaEditarLivro.setAlwaysOnTop(true);
        telaEditarLivro.setFocusable(false);
        telaEditarLivro.setMinimumSize(new java.awt.Dimension(400, 300));
        telaEditarLivro.setModal(true);
        telaEditarLivro.setResizable(false);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("EDITAR LIVRO");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("TITULO");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("AUTOR");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("NÚMERO DE PÁGINAS");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ANO DE PUBLICAÇÃO");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("PREÇO");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEditarConfirmar.setText("CONFIRMAR ALTERAÇÕES");
        btnEditarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarConfirmarActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("EMPRESTADO PARA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldEditarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldEditarAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fieldEditarPaginas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(fieldEditarAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldEditarPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldEditarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fieldEditarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fieldEditarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldEditarPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fieldEditarAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(fieldEditarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fieldEditarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout telaEditarLivroLayout = new javax.swing.GroupLayout(telaEditarLivro.getContentPane());
        telaEditarLivro.getContentPane().setLayout(telaEditarLivroLayout);
        telaEditarLivroLayout.setHorizontalGroup(
            telaEditarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaEditarLivroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(telaEditarLivroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        telaEditarLivroLayout.setVerticalGroup(
            telaEditarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaEditarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        telaListaBusca.setTitle("Livros");
        telaListaBusca.setMinimumSize(new java.awt.Dimension(1082, 536));
        telaListaBusca.setModal(true);
        telaListaBusca.setResizable(false);

        tblLivrosBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Autor", "Paginas", "Ano Publicação", "Preço", "Emprestado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLivrosBusca);

        javax.swing.GroupLayout telaListaBuscaLayout = new javax.swing.GroupLayout(telaListaBusca.getContentPane());
        telaListaBusca.getContentPane().setLayout(telaListaBuscaLayout);
        telaListaBuscaLayout.setHorizontalGroup(
            telaListaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        telaListaBuscaLayout.setVerticalGroup(
            telaListaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MM Library");
        setBackground(new java.awt.Color(52, 168, 83));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 206, 214));
        jPanel1.setFocusCycleRoot(true);

        btnAdicionarLivro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAdicionarLivro.setText("ADICIONAR LIVRO");
        btnAdicionarLivro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarLivroActionPerformed(evt);
            }
        });

        btnAlterarLivro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAlterarLivro.setText("ALTERAR LIVRO");
        btnAlterarLivro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLivroActionPerformed(evt);
            }
        });

        btnExcluirLivro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExcluirLivro.setText("EXCLUIR");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(254, 251, 216));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_mm_library_redimensionada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(213, 244, 230));

        tblLivros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblLivros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Autor", "Paginas", "Ano Publicação", "Preço", "Emprestado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblLivros.setEditingColumn(0);
        tblLivros.setEditingRow(0);
        tblLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(tblLivros);
        tblLivros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jComboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Titulo", "Autor" }));
        jComboOrdenar.setToolTipText("");
        jComboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboOrdenarActionPerformed(evt);
            }
        });

        jLabel10.setText("Ordenar por:");

        jLabel9.setText("Meus Livros");

        jLabel19.setText("Listar Livros emprestados para:");

        jCombroFiltrarEmprestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jCombroFiltrarEmprestado.setToolTipText("");
        jCombroFiltrarEmprestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombroFiltrarEmprestadoActionPerformed(evt);
            }
        });

        jComboFiltrarAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboFiltrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFiltrarAutorActionPerformed(evt);
            }
        });

        jLabel20.setText("Filtrar Autor:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jComboFiltrarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCombroFiltrarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jCombroFiltrarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboFiltrarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // O MÉTODO ABAIXO SALVA OS LIVROS QUE ESTÃO NO ARRAY EM UM ARQUIVO .txt
    private void salvarAlteracaoArquivo() {
        String path = "Backuplivros.txt";        

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(Livro li : livros) {
                // GRAVA NA LINHA OS DADOS DO LIVRO
                bw.write(li.getTitulo() + ", " + li.getAutor() + ", " + li.getNumero_paginas() + ", " + li.getAno_publicacao() + ", " + li.getPreco() + ", " + li.getNome_emprestado());
                bw.newLine(); // PULA A LINHA
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
    // O MÉTODO ABAIXO VERIFICA QUAL LIVRO SELECIONADO E EXCLUI ELE DA LISTA E DO ARQUIVO
    private void excluirLivro() {
     
        int linhaSelecionada = tblLivros.getSelectedRow(); // CAPTURA A LINHA SELECIONADA NA TABELA CASO NAO TENHA RETORNA -1
        
        if(indiceSelectTable() != -1) {
            livros.remove(indiceSelectTable());
            salvarAlteracaoArquivo();
            listaLivrosTabela();
        } else {
           
        }
    }
    
    // O MÉTODO ABAIXO RETORNA O INDICE DE ARRAY DO LIVRO CUJO SKU FOI INFORMADO POR PARAMETRO
    private int indiceCheck(String titulo) {
        for(int i=0; i<=livros.size(); i++) {
            if(livros.get(i).getTitulo().equals(titulo)){
                return i;
            }
        }
            return -1;
    }
    
    // RETORNA O INDICE DO LIVRO DA LINHA SELECIONADA NA TABELA
    private int indiceSelectTable() {
        int linhaSelecionada = tblLivros.getSelectedRow(); // CAPTURA A LINHA SELECIONADA NA TABELA CASO NAO TENHA RETORNA -1
        if(linhaSelecionada == -1) {
            lblAlerta.setText("Nenhuma livro selecionado!"); // SE NÃO TIVER LINHA SELECIONADA LANÇAR ALERTA NA TELA 
            telaAlerta.setLocationRelativeTo(null);
            telaAlerta.setVisible(true);
            return -1;
        } else {
            String titulo = (String) tblLivros.getModel().getValueAt(linhaSelecionada, 0); // VERIFICA QUAL O INDICE NO ARRAYLIST DO LIVRO SELECIONADO PARA DELETAR
            int indice = indiceCheck(titulo);
            return indice;
        }
    }
    
    // O MÉTODO ABAIXO LISTA OS LIVROS NA JTABLE
    
    private void listaLivrosTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblLivros.getModel(); // CAPTURA O MODELO DA TABELA 
        modelo.setRowCount(0); // REMOVE TODAS AS LINHAS DA TABELA 
        List<String>nomes = new ArrayList<>(); // ARRAY COM NOMES DAS PESSOAS QUE PEGARAM LIVROS EMPRESTADOS 
        List<String>autores = new ArrayList<>();// ARRAY DE NOMES DE AUTORES SEM DUPLICAÇÃO


        for(Livro li : livros) {
            // PREENCHER A TABELA NOVAMENTE COM OS LIVROS CADASTRADOS
            Object[] novaLinha = {li.getTitulo(), li.getAutor(), li.getNumero_paginas(), li.getAno_publicacao(),"R$" + String.format("%.2f", li.getPreco()) , li.getNome_emprestado()};
            
            modelo.addRow(novaLinha);// ADICIONA UMA NOVA LINHA 
            
            // GRAVAR NOMES DE PESSOAS QUE PEGARAM EMPRESTADO EM UM ARRAY FILTRANDO OS QUE JÁ ESTÃO NA LISTA
            if(!nomes.contains(li.getNome_emprestado())) {
                nomes.add(li.getNome_emprestado());
            } 
            
            // GRAVAR NOMES DOS AUTORES EM UM ARRAY FILTRANDO OS QUE JÁ ESTÃO LÁ
            if(!autores.contains(li.getAutor())) {
                autores.add(li.getAutor());
            } 
        }
        // O CODIGO ABAIXO EVITA REPLICACÃO DE ITENS NO COMBOBOX DA LISTA DE LIVROS EMPRESTADOS
        for(int i=jCombroFiltrarEmprestado.getItemCount(); i>1; i--) {
                jCombroFiltrarEmprestado.removeItemAt(i-1);
        }
        for(String s : nomes) {
            if(s != "Todos"){
                jCombroFiltrarEmprestado.addItem(s);

            } 
        }
        
        // O CÓDIGO ABAIXO EVITA REPLICAÇÃO DE ITENS NO COMBOBOX DE NOMES DE AUTORES
        for(int i=jComboFiltrarAutor.getItemCount(); i>1; i--) {
                jComboFiltrarAutor.removeItemAt(i-1);
        }
        for(String s : autores) {
                jComboFiltrarAutor.addItem(s);
        }
    }
    
    // O MÉTODO ABAIXO RECUPERA PARA A APLICAÇÃO OS LIVROS QUE ESTÃO SALVOS NO ARQUIVO .txt
    private void recuperaArquivo() {
        try(BufferedReader br = new BufferedReader(new FileReader("Backuplivros.txt"))) {

            String line = br.readLine();
            livros.clear(); // LIMPA O ARRAY PARA INSERIR OS VALORES QUE ESTÃO NO ARQUIVO
            
            while(line != null) {
                String[] fields = line.split(", "); // USA UMA REFERENCIA PARA SEPARAR AS INFORMACOES QUE ESTÃO NA LINHA DO ARQUIVO
                String titulo = fields[0];
                String autor = fields[1];
                int numero_paginas = Integer.parseInt(fields[2]);
                int ano_publicacao = Integer.parseInt(fields[3]);
                double preco = Double.parseDouble(fields[4]);
                String nome_emprestado = fields[5];
                
                // ADICIONA AS INFOMAÇÕES NO ARRAYLIST LIVROS
                livros.add(new Livro(titulo, autor, numero_paginas, ano_publicacao, preco, nome_emprestado));
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    private void btnAdicionaConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaConfirmaActionPerformed
    try {
        String titulo = lblAdicionarTitulo.getText();
        String autor = lblAdicionarAutor.getText();
        int numero_paginas = Integer.parseInt(lblAdicionarPagina.getText());
        int ano_publicacao = Integer.parseInt(lblAdicionarPublicacao.getText());
        double preco = Double.parseDouble(lblAdicionarPreco.getText()); 
        String nome_emprestado;
        /* VERIFICA SE O CHECKBOX QUE MOSTRA SE O LIVRO FOI EMPRESTADO ESTÁ SELECIONADO,
        CASO ESTEJA O SISTEMA IRÁ INSERIR NULL NO CAMPO QUE INDICA SE O LIVRO ESTÁ EMPRESTADO, 
        CASO CONSTRARIO ELE IRÁ INSERIR O NOME DA PESSOA PARA QUEM ESTÁ EMPRESTADO
        */
        boolean emprestado = chkEmprestado.isSelected();
        if(emprestado) {
            nome_emprestado = "Não emprestado";
        } else {
            nome_emprestado = lblAdicionarEmprestado.getText();
        }      

        livros.add(new Livro(titulo, autor, numero_paginas, ano_publicacao, preco, nome_emprestado)); // adiciona o objeto livro ao array livros
        
        lblAdicionarStatus.setText("Livro adicionado com Sucesso!");
        
        salvarAlteracaoArquivo(); // Salva as alterações no arquivo.
        listaLivrosTabela();
        TelaAdicionarLivro.setVisible(false);

    } catch(IllegalArgumentException e) {
            lblAdicionarStatus.setText(e.getMessage());
    }
    
    }//GEN-LAST:event_btnAdicionaConfirmaActionPerformed

    private void btnAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarLivroActionPerformed
        TelaAdicionarLivro.setLocationRelativeTo(null); // CENTRALIZA NA TELA
        TelaAdicionarLivro.setVisible(true);  
     
        // O BLOCO DE CÓDIGO ABAIXO LIMPA OS CAMPOS CASO TENHA SIDO FEITA UMA INCLUSÃO DE LIVROS RECENTES
        lblAdicionarTitulo.setText("");
        lblAdicionarAutor.setText("");
        lblAdicionarPagina.setText("");
        lblAdicionarPublicacao.setText("");
        lblAdicionarPreco.setText("");
        lblAdicionarEmprestado.setText("");
        lblAdicionarStatus.setText("");
        
    }//GEN-LAST:event_btnAdicionarLivroActionPerformed

    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        excluirLivro();
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    // Fecha a tela de alerta ao usuário
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        telaAlerta.setLocationRelativeTo(null); // CENTRALIZA O ALERTA
        telaAlerta.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // ABRE A JANELA DE EDIÇÃO DO LIVRO
    private void btnAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLivroActionPerformed
        int indice = indiceSelectTable();

        if(indice != -1){
            fieldEditarTitulo.setText(livros.get(indice).getTitulo());
            fieldEditarAutor.setText(livros.get(indice).getAutor());
            fieldEditarPaginas.setText(Integer.toString(livros.get(indice).getNumero_paginas()));
            fieldEditarAno.setText(Integer.toString(livros.get(indice).getAno_publicacao()));
            fieldEditarPreco.setText(Double.toString(livros.get(indice).getPreco()));
            fieldEditarEmprestado.setText(livros.get(indice).getNome_emprestado());
            
            telaEditarLivro.setLocationRelativeTo(null); // CENTRALIZA A CAIXA DE EDICÇÃO
            telaEditarLivro.setVisible(true); // MOSTRA A TELA DE EDIÇÃO DE LIVRO
        } 
    }//GEN-LAST:event_btnAlterarLivroActionPerformed
    
    private void btnEditarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConfirmarActionPerformed
        int indice = indiceSelectTable(); // RETORNAR O INDICE NO ARRAYIST DO LIVRO QUE ESTÁ EDITANDO
        
        // COLETAR OS DADOS DO CAMPO DIGITADO PELO USUÁRIO
        String titulo = fieldEditarTitulo.getText();
        String autor = fieldEditarAutor.getText();
        int paginas = Integer.parseInt(fieldEditarPaginas.getText());
        int ano = Integer.parseInt(fieldEditarAno.getText());
        double preco = Double.parseDouble(fieldEditarPreco.getText());
        String emprestado = fieldEditarEmprestado.getText();
        
        // ALTERAR OS DADOS NO ARRAYLIST USANDO METODOS SETTERS
        livros.get(indice).setTitulo(titulo);
        livros.get(indice).setAutor(autor);
        livros.get(indice).setNumero_paginas(paginas);
        livros.get(indice).setAno_publicacao(ano);
        livros.get(indice).setPreco(preco);
        livros.get(indice).setNome_emprestado(emprestado);
        
        // SALVAR AS ALTERAÇÕES NO ARQUIVO .TXT
        salvarAlteracaoArquivo();
        
        // ATUALIZAR DADOS DA TABELA
        listaLivrosTabela();
        
        // FECHA A JANELA DE EDIÇÃO DE LIVRO
        telaEditarLivro.setVisible(false);
    }//GEN-LAST:event_btnEditarConfirmarActionPerformed

    private void jComboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboOrdenarActionPerformed
        int indiceSelecionado = jComboOrdenar.getSelectedIndex();
        switch(indiceSelecionado) {
            case 0: // UTILIZA A MESMA ORDEM QUE ESTÁ NO ARQUIVO
                recuperaArquivo();
                listaLivrosTabela();
                break;
            case 1: // ORDENA POR TITULO
                livros.sort(Comparator.comparing(Livro::getTitulo));
                listaLivrosTabela();
                break;
            case 2: // ORDENA POR AUTOR
                livros.sort(Comparator.comparing(Livro::getAutor));
                listaLivrosTabela();
        }
    }//GEN-LAST:event_jComboOrdenarActionPerformed

    private void jCombroFiltrarEmprestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombroFiltrarEmprestadoActionPerformed
        String itemSelecionado = jCombroFiltrarEmprestado.getSelectedItem().toString(); // capturar o item selecionado no combobox
        
        /* Se o item selecionado for diferente de "Todos" deve efetuar uma ação que é 
        listar os livros emprestados para a pessoa selecionada */
        if(!"Todos".equals(itemSelecionado)) { 
            DefaultTableModel modelo = (DefaultTableModel) tblLivrosBusca.getModel(); // CAPTURA O MODELO DA TABELA 
            modelo.setRowCount(0); // REMOVE TODAS AS LINHAS DA TABELA 

            for(Livro li : livros) {
                
                if(li.getNome_emprestado().equals(itemSelecionado)) {
                
                    // PREENCHER A TABELA NOVAMENTE COM OS LIVROS CADASTRADOS
                    Object[] novaLinha = {li.getTitulo(), li.getAutor(), li.getNumero_paginas(), li.getAno_publicacao(),"R$" + String.format("%.2f", li.getPreco()) , li.getNome_emprestado()};

                    modelo.addRow(novaLinha);// ADICIONA UMA NOVA LINHA 
                }
            }   
            telaListaBusca.setLocationRelativeTo(null); // CENTRALIZA NA TELA
            telaListaBusca.setVisible(true);
        }
    }//GEN-LAST:event_jCombroFiltrarEmprestadoActionPerformed

    private void jComboFiltrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFiltrarAutorActionPerformed
        String itemSelecionado = jComboFiltrarAutor.getSelectedItem().toString(); // capturar o item selecionado no combobox
        
        /* Se o item selecionado for diferente de "Todos" deve efetuar uma ação que é 
        listar os livros emprestados para a pessoa selecionada */
        if(!"Todos".equals(itemSelecionado)) { 
            DefaultTableModel modelo = (DefaultTableModel) tblLivrosBusca.getModel(); // CAPTURA O MODELO DA TABELA 
            modelo.setRowCount(0); // REMOVE TODAS AS LINHAS DA TABELA 

            for(Livro li : livros) {
                
                if(li.getAutor().equals(itemSelecionado)) {
                
                    // PREENCHER A TABELA NOVAMENTE COM OS LIVROS CADASTRADOS
                    Object[] novaLinha = {li.getTitulo(), li.getAutor(), li.getNumero_paginas(), li.getAno_publicacao(),"R$" + String.format("%.2f", li.getPreco()) , li.getNome_emprestado()};

                    modelo.addRow(novaLinha);// ADICIONA UMA NOVA LINHA 
                }
            }   
            telaListaBusca.setLocationRelativeTo(null); // CENTRALIZA NA TELA
            telaListaBusca.setVisible(true);
        }    }//GEN-LAST:event_jComboFiltrarAutorActionPerformed
  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MMLibrary dialog = new MMLibrary(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog TelaAdicionarLivro;
    private javax.swing.JButton btnAdicionaConfirma;
    private javax.swing.JButton btnAdicionarLivro;
    private javax.swing.JButton btnAlterarLivro;
    private javax.swing.JButton btnEditarConfirmar;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JCheckBox chkEmprestado;
    private javax.swing.JTextField fieldEditarAno;
    private javax.swing.JTextField fieldEditarAutor;
    private javax.swing.JTextField fieldEditarEmprestado;
    private javax.swing.JTextField fieldEditarPaginas;
    private javax.swing.JTextField fieldEditarPreco;
    private javax.swing.JTextField fieldEditarTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboFiltrarAutor;
    private javax.swing.JComboBox<String> jComboOrdenar;
    private javax.swing.JComboBox<String> jCombroFiltrarEmprestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private javax.swing.JTextField lblAdicionarAutor;
    private javax.swing.JTextField lblAdicionarEmprestado;
    private javax.swing.JTextField lblAdicionarPagina;
    private javax.swing.JTextField lblAdicionarPreco;
    private javax.swing.JTextField lblAdicionarPublicacao;
    private javax.swing.JLabel lblAdicionarStatus;
    private javax.swing.JTextField lblAdicionarTitulo;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTable tblLivrosBusca;
    private javax.swing.JDialog telaAlerta;
    private javax.swing.JDialog telaEditarLivro;
    private javax.swing.JDialog telaListaBusca;
    // End of variables declaration//GEN-END:variables
}
