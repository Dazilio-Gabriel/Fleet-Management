package trucks.domain;

import java.time.LocalDateTime;

public class Truck {

    private int truckId = 0;
    private String plateNumber;
    private String brand;
    private String model;
    private int year;
    private Double capacityKg;
    private TruckStatus truckStatus;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getCapacityKg() {
        return capacityKg;
    }

    public void setCapacityKg(Double capacityKg) {
        this.capacityKg = capacityKg;
    }

    public TruckStatus getTruckStatus() {
        return truckStatus;
    }

    public void setTruckStatus(TruckStatus truckStatus) {
        this.truckStatus = truckStatus;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    //public enum DiaSemana { SEGUNDA, TERCA, QUARTA, ... }.


    //5️⃣ Exemplo mental (sem código)
    //Em vez de:
    //setStatus(IN_TRIP)
    //setDeleted(true)
    //Você pensa em ações:
    //“entrar em viagem”
    //“ir para manutenção”
    //“desativar”
    //Cada ação:
    //muda o status
    //valida se pode


    @Override
    public String toString() {
        return "Truck{" +
                "truckId=" + truckId +
                ", plateNumber='" + plateNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", capacityKg=" + capacityKg +
                ", truckStatus=" + truckStatus +
                ", deleted=" + deleted +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
