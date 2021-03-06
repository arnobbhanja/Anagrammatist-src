package wordnet_jaws;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;
import edu.smu.tspell.wordnet.*;

public class WordnetGUI extends javax.swing.JFrame {

    GetSets gs;
    String previousword;
    
    public WordnetGUI() {
        initComponents();
        gs = new GetSets();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordnetLabel = new javax.swing.JLabel();
        enterword = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Antonymresult = new javax.swing.JTextArea();
        antonym = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        synonymResult = new javax.swing.JTextArea();
        synonym = new javax.swing.JButton();
        homepage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wordnet Interface");

        wordnetLabel.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        wordnetLabel.setText("Wordnet Interface");
        wordnetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordnetLabelMouseClicked(evt);
            }
        });

        enterword.setToolTipText("");
        enterword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterwordActionPerformed(evt);
            }
        });

        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        Antonymresult.setColumns(20);
        Antonymresult.setRows(5);
        Antonymresult.setText("antonyms!");
        jScrollPane1.setViewportView(Antonymresult);

        antonym.setText("Antonym");
        antonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antonymActionPerformed(evt);
            }
        });

        synonymResult.setColumns(20);
        synonymResult.setRows(5);
        synonymResult.setText("synonyms!");
        jScrollPane2.setViewportView(synonymResult);

        synonym.setText("Synonym");
        synonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                synonymActionPerformed(evt);
            }
        });

        homepage.setText("JAWS Homepage");
        homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(wordnetLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(homepage)
                                .addGap(18, 18, 18)
                                .addComponent(closeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterword, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(synonym, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(antonym, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(wordnetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antonym)
                    .addComponent(synonym))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(homepage))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Wordnet Actions
    
    private void wordnetLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordnetLabelMouseClicked
        
        String note = "WordNet® is a large lexical database of English. \n"
                + "Nouns, verbs, adjectives and adverbs are grouped into sets of cognitive synonyms (synsets); \n"
                + "each expressing a distinct concept.";
        JOptionPane.showMessageDialog(rootPane, note);
    }//GEN-LAST:event_wordnetLabelMouseClicked

    private void enterwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterwordActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Use Buttons!");
    }//GEN-LAST:event_enterwordActionPerformed

    private void antonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antonymActionPerformed
        String word = enterword.getText().trim();
        if(previousword!=null && word!=null &&!word.equals(previousword)){
            synonymResult.setText("synonyms!");
            Antonymresult.setText( gs.getAnton(word) );
        }else if(word!=null && !word.equals(previousword)){
            synonymResult.setText("synonyms!");
            Antonymresult.setText( gs.getAnton(word) );
        }else{
            Antonymresult.setText( gs.getAnton(word) );
        }
        previousword = word; 
    }//GEN-LAST:event_antonymActionPerformed

    private void synonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_synonymActionPerformed
        String word = enterword.getText().trim();
        if(previousword!=null && word!=null &&!word.equals(previousword)){
            Antonymresult.setText("antonyms!");
            synonymResult.setText( gs.getSynonyms(word) );
        }else if(word!=null && !word.equals(previousword)){
            Antonymresult.setText("antonyms!");
            synonymResult.setText( gs.getSynonyms(word) );
        }else{
            synonymResult.setText( gs.getSynonyms(word) );
        }
        previousword = word; 
    }//GEN-LAST:event_synonymActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageActionPerformed
        try {
                 Desktop.getDesktop().browse(new URL("http://wordnet.princeton.edu/wordnet/").toURI());
            } catch (URISyntaxException | IOException e) {}
    }//GEN-LAST:event_homepageActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Antonymresult;
    private javax.swing.JButton antonym;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField enterword;
    private javax.swing.JButton homepage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton synonym;
    private javax.swing.JTextArea synonymResult;
    private javax.swing.JLabel wordnetLabel;
    // End of variables declaration//GEN-END:variables
}
