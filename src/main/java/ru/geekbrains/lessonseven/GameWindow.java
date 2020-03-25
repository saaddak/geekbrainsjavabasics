package ru.geekbrains.lessonseven;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.html.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameWindow extends JFrame {

    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    private FieldPanel fieldPanel;
    private SettingsWindow settingsWindow;

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("Крестики-нолики");
        setResizable(false);
        JButton btnStart = new JButton("Начать игру");
        JButton btnStop = new JButton("<html><body><strong>Выход</strong></body></html>");
        settingsWindow = new SettingsWindow(this);
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        };
        btnStart.addActionListener(listener);

        String htmlString = "<html>" +
                "               <body>" +
                "                   <h1>Очень красивый главный заголовок</h1>" +
                "                   <h2>Красивый заголовок поменьше</h2>" +
                "                   <p>Первое правило клуба Крестиков-Ноликов: никому не рассказывать о клубе Крестиков-Ноликов.</p>" +
                "                   <p>Второе правило клуба Крестиков-Ноликов: никогда никому не рассказывать о клубе Крестиков-Ноликов.</p>" +
                "                   <p>Третье правило клуба Крестиков-Ноликов: в схватке участвуют только двое.</p>" +
                "                   <p>Четвертое правило клуба Крестиков-Ноликов: не более одного поединка за один раз.</p>" +
                "                   <p>Пятое правило клуба Крестиков-Ноликов: бойцы сражаются без джойстика и на голой игровой доске.</p>" +
                "                   <p>Шестое правило клуба Крестиков-Ноликов: поединок продолжается столько, сколько потребуется.</p>" +
                "                   <p>Седьмое правило клуба Крестиков-Ноликов: если противник потерял сознание или делает вид, что потерял, или нажал кнопку «Выход» — поединок окончен.</p>" +
                "                   <p>Восьмое и последнее правило клуба Крестиков-Ноликов: новичок обязан принять бой.</p>" +
                "               </body>" +
                "           </html>";

        JEditorPane jEditorPane = new JEditorPane();
        jEditorPane.setEditable(false);
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);
        JScrollPane scrollPane = new JScrollPane(jEditorPane);

        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color: #000000; font-family: SFMono-Regular,Menlo,Monaco,Consolas,\"Liberation Mono\",\"Courier New\",monospace; margin: 15px 10px; }");
        styleSheet.addRule("h1 {font: 20pt \"Courier New\"; color: #B22222; font-weight: bold; text-align: center;}");
        styleSheet.addRule("h2 {font: 18pt monospace; color: #4169E1;}");
        styleSheet.addRule("p {font : 11px Menlo; color: #5a5a5a; margin: 7px 0;}");

        Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        JPanel pBtns = new JPanel(new GridLayout(1, 2));
        pBtns.add(btnStart);
        pBtns.add(btnStop);
        fieldPanel = new FieldPanel();

        add(pBtns, BorderLayout.SOUTH);
        add(fieldPanel);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        fieldPanel.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}
