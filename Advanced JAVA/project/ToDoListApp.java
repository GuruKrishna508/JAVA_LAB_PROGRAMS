package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListApp extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> taskList;
    private JTextField taskInput;
    private JButton addButton, removeButton, clearAllButton;
    private JPanel panel;
    private JTextArea notesArea;
    private float hue = 0f;

    public ToDoListApp() {
        setTitle("🎯 My Vibrant To-Do List");
        setSize(700, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // Allow maximizing
        // Remove setResizable(false) to enable maximizing
        // setResizable(true); is default

        // Main panel
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = Color.getHSBColor(hue, 0.6f, 1f);
                Color color2 = Color.getHSBColor((hue + 0.1f) % 1f, 0.6f, 1f);
                GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(new BorderLayout());
        animateGradientBackground();
        add(panel, BorderLayout.CENTER);

        // Task List
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        taskList.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        taskList.setBackground(new Color(255, 255, 255, 180));
        taskList.setSelectionBackground(new Color(255, 182, 193));
        taskList.setBorder(BorderFactory.createTitledBorder("📋 Tasks"));
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(scrollPane, BorderLayout.CENTER);

        // Notes Section
        notesArea = new JTextArea(4, 40);
        notesArea.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        notesArea.setLineWrap(true);
        notesArea.setWrapStyleWord(true);
        notesArea.setBorder(BorderFactory.createTitledBorder("📝 Important Notes"));

        JScrollPane notesScroll = new JScrollPane(notesArea);
        notesScroll.setPreferredSize(new Dimension(650, 100));
        notesScroll.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(notesScroll, BorderLayout.NORTH);

        // Bottom Panel for task controls
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        bottomPanel.setOpaque(false);

        taskInput = new JTextField(20);
        taskInput.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        taskInput.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        addButton = createStyledButton("➕ Add Task", new Color(100, 221, 23));
        removeButton = createStyledButton("🗑️ Remove Selected", new Color(255, 87, 34));
        clearAllButton = createStyledButton("❌ Clear All", new Color(255, 160, 122));

        bottomPanel.add(taskInput);
        bottomPanel.add(addButton);
        bottomPanel.add(removeButton);
        bottomPanel.add(clearAllButton);

        panel.add(bottomPanel, BorderLayout.SOUTH);

        // Button Actions
        addButton.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskInput.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                listModel.remove(selected);
            }
        });

        clearAllButton.addActionListener(e -> {
            if (!listModel.isEmpty()) {
                int confirm = JOptionPane.showConfirmDialog(this, "Clear all tasks?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    listModel.clear();
                }
            }
        });

        setVisible(true);
    }

    private JButton createStyledButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(color.darker());
            }

            public void mouseExited(MouseEvent e) {
                button.setBackground(color);
            }
        });

        return button;
    }

    private void animateGradientBackground() {
        Timer timer = new Timer(50, e -> {
            hue += 0.002f;
            if (hue > 1) hue = 0;
            panel.repaint();
        });
        timer.start();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // Use default
        }

        SwingUtilities.invokeLater(ToDoListApp::new);
    }
}

