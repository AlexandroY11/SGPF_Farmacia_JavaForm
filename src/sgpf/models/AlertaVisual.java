/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgpf.models;

/**
 *
 * @author Brayan Hurtado
 */
public class AlertaVisual {
    private int idLote;
    private String color;
    private String mensaje;

    public AlertaVisual(int idLote, String color, String mensaje) {
        this.idLote = idLote;
        this.color = color;
        this.mensaje = mensaje;
    }

    public int getIdLote() {
        return idLote;
    }

    public String getColor() {
        return color;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "AlertaVisual [Lote ID: " + idLote + ", Color: " + color + ", Mensaje: " + mensaje + "]";
    }
}
