package sgpf.models;

public class Lote {
        private int idLote;
    private String nombreLote;
    private int idMedicamento;
    private int cantidad;
    private String fechaVencimiento;
    private String createdAt;
    private String updatedAt;

    // Constructor vacío
    public Lote() {}

    // Constructor completo
    public Lote(int idLote, String nombreLote, int idMedicamento, int cantidad, String fechaVencimiento, String createdAt) {
        this.idLote = idLote;
        this.nombreLote = nombreLote;
        this.idMedicamento = idMedicamento;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.createdAt = createdAt;
    }

    // Getters y Setters
    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getNombreLote() {
        return nombreLote;
    }

    public void setNombreLote(String nombreLote) {
        this.nombreLote = nombreLote;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
}
