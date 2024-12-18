package ctrlfit.telas;

import ctrlfit.excel.ExportarExcel;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoPagamentos extends javax.swing.JFrame {

    private boolean pesquisarPagamento = false;
    GerenciamentoAlunos gerenciamentoAlunos = new GerenciamentoAlunos();//somente para passar como parametro para o construtor

    public GerenciamentoPagamentos() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ctrlfit/icons/logo_haltere2.png")));
        jTablePagamentos.setDefaultEditor(Object.class, null);//Deixa a jTable não editavel
        carregarDadosPagamentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePagamentos = new javax.swing.JTable();
        btnRegistrarPagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisarPagamento = new javax.swing.JButton();
        txtPesquisarPagamento = new javax.swing.JTextField();
        btnExportar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Pagamentos");
        setResizable(false);

        jTablePagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Matrícula", "Nome do Aluno", "Plano", "Preço", "Forma Pagamento", "Data Pagamento", "Data Fim"
            }
        ));
        jTablePagamentos.setFocusable(false);
        jTablePagamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePagamentos);
        if (jTablePagamentos.getColumnModel().getColumnCount() > 0) {
            jTablePagamentos.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTablePagamentos.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTablePagamentos.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        btnRegistrarPagamento.setText("Registrar Pagamento");
        btnRegistrarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar Aluno:");

        btnPesquisarPagamento.setText("Pesquisar");
        btnPesquisarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPagamentoActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.setToolTipText("Exportar para Excel");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarPagamento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPagamento)
                    .addComponent(jLabel1)
                    .addComponent(btnPesquisarPagamento)
                    .addComponent(txtPesquisarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagamentoActionPerformed
        //armazena o indice da linha na variavel linhaSelecionada, a primeira linha é 0, -1 para nenhuma linha selecionada
        int linhaSelecionada = jTablePagamentos.getSelectedRow();

        if (linhaSelecionada != -1) {
            //obetr os valores da linha selecionada
            int codigo = (int) jTablePagamentos.getValueAt(linhaSelecionada, 0);

            int matriculaAluno = 0;
            String nomeAluno = "";

            try {
                Connection conexao = ctrlfit.conexao.ConexaoDAO.conectarBD();
                String sql = "SELECT * FROM pagamento WHERE Codigo_Pagamento = ?";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, codigo);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    matriculaAluno = rs.getInt("Aluno_Matricula_Aluno");
                    nomeAluno = rs.getString("NomeAluno_Pagamento");
                }
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            CadastroPagamento cadastroPagamentos = new CadastroPagamento(this, gerenciamentoAlunos, matriculaAluno, nomeAluno);
            cadastroPagamentos.setVisible(true);

            cadastroPagamentos.trazerDados(codigo);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para registrar pagamento.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPagamentoActionPerformed

    private void btnPesquisarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPagamentoActionPerformed
        if (txtPesquisarPagamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do aluno(a) para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            pesquisarPagamento = true;
            carregarDadosPagamentos();
        }
    }//GEN-LAST:event_btnPesquisarPagamentoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        pesquisarPagamento = false;
        carregarDadosPagamentos();
        txtPesquisarPagamento.setText("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        ExportarExcel exportar = new ExportarExcel();
        exportar.exportar(jTablePagamentos);
    }//GEN-LAST:event_btnExportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnPesquisarPagamento;
    private javax.swing.JButton btnRegistrarPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePagamentos;
    private javax.swing.JTextField txtPesquisarPagamento;
    // End of variables declaration//GEN-END:variables

    public void carregarDadosPagamentos() {
        try {
            Connection conexao = ctrlfit.conexao.ConexaoDAO.conectarBD();

            String sql = "";
            PreparedStatement st;

            if (pesquisarPagamento) {
                String nomeAlunoPagamento = txtPesquisarPagamento.getText();
                sql = "SELECT Codigo_Pagamento, Aluno_Matricula_Aluno, NomeAluno_Pagamento, Plano_Pagamento, Preco_Pagamento, Forma_Pagamento, DATE_FORMAT(Dt_Pagamento, '%d/%m/%Y') AS Dt_Pagamento, DATE_FORMAT(DtFim_Aluno, '%d/%m/%Y') AS DtFim_Aluno FROM pagamento WHERE NomeAluno_Pagamento LIKE ?";

                st = conexao.prepareStatement(sql);
                st.setString(1, "%" + nomeAlunoPagamento + "%");
            } else {
                sql = "SELECT Codigo_Pagamento, Aluno_Matricula_Aluno, NomeAluno_Pagamento, Plano_Pagamento, Preco_Pagamento, Forma_Pagamento, DATE_FORMAT(Dt_Pagamento, '%d/%m/%Y') AS Dt_Pagamento, DATE_FORMAT(DtFim_Aluno, '%d/%m/%Y') AS DtFim_Aluno FROM pagamento";
                st = conexao.prepareStatement(sql);
            }

            ResultSet rs = st.executeQuery();

            // Obter o modelo da tabela e limpar dados anteriores
            DefaultTableModel model = (DefaultTableModel) jTablePagamentos.getModel();
            model.setRowCount(0);

            // Iterar pelos resultados e adicionar à tabela
            while (rs.next()) {
                int codigoPagamento = rs.getInt("Codigo_Pagamento");
                String matriculaAluno = rs.getString("Aluno_Matricula_Aluno");
                String nomeAluno = rs.getString("NomeAluno_Pagamento");
                String plano = rs.getString("Plano_Pagamento");
                String preco = rs.getString("Preco_Pagamento");
                String formaPagamento = rs.getString("Forma_Pagamento");
                String dtPagamento = rs.getString("Dt_Pagamento");
                String dtFim = rs.getString("DtFim_Aluno");

                model.addRow(new Object[]{codigoPagamento, matriculaAluno, nomeAluno, plano, preco, formaPagamento, dtPagamento, dtFim});
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

}
