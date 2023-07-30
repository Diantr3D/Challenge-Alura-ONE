package conversortdemoneda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private TemperatureConverter converter = new TemperatureConverter();
    private JTextField inputField;
    private JComboBox<String> conversionType;
    private JLabel resultLabel;

    // Agregamos una referencia a la ventana principal
    private MainWindow mainWindow;

    public TemperatureWindow(MainWindow mainWindow) {
        this.setTitle("Convertidor de Temperatura");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300, 200);
        this.mainWindow = mainWindow;

        // Componentes del UI
        inputField = new JTextField(10);
        String[] conversionOptions = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" };
        conversionType = new JComboBox<>(conversionOptions);
        JButton convertButton = new JButton("Convertir");
        resultLabel = new JLabel("Resultado: ");

        // Crear botones "Inicio" y "Cerrar"
        JButton homeButton = new JButton("Inicio");
        JButton closeButton = new JButton("Cerrar");

        // Agregar componentes a la ventana
        this.add(inputField);
        this.add(conversionType);
        this.add(convertButton);
        this.add(resultLabel);
        this.add(homeButton);
        this.add(closeButton);

        // Configurar el evento del botón
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                try {
                    double inputValue = Double.parseDouble(inputText);
                    double result;

                    // Realizar la conversión
                    switch (conversionType.getSelectedItem().toString()) {
                        case "Celsius a Fahrenheit":
                            result = converter.celsiusToFahrenheit(inputValue);
                            break;
                        case "Fahrenheit a Celsius":
                            result = converter.fahrenheitToCelsius(inputValue);
                            break;
                        case "Celsius a Kelvin":
                            result = converter.celsiusToKelvin(inputValue);
                            break;
                        case "Kelvin a Celsius":
                            result = converter.kelvinToCelsius(inputValue);
                            break;
                        case "Kelvin a Fahrenheit":
                            result = converter.kelvinToFahrenheit(inputValue);
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo de conversión no soportado.");
                    }

                    // Mostrar el resultado
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    // Manejar el caso en que el input no es un número
                    JOptionPane.showMessageDialog(TemperatureWindow.this,
                        "Por favor, ingresa un número válido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configurar eventos de botones
        homeButton.addActionListener(e -> {
            this.setVisible(false);
            mainWindow.showMainWindow();
        });

        closeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                "Gracias por Usar mi Programa. ¡Vuelve pronto!",
                "Hasta luego",
                JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        });

        this.setVisible(true);
    }
}
