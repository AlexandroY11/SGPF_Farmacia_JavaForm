/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgpf.models;

/**
 *
 * @author Alexandro
 */
public class Medicamento {
private int idMedicamento;
    private String nombre;
    private String codigoBarras;
    private String foto;
    private String createdAt;
    private String updatedAt;

    // Constructor vacío
    public Medicamento() {
    }

    // Constructor con parámetros
    public Medicamento(int idMedicamento, String nombre, String codigoBarras, String foto, String createdAt, String updatedAt) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.foto = foto;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters y Setters
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return nombre;  // Esto es lo que mostrará en el ComboBox
    }
}
