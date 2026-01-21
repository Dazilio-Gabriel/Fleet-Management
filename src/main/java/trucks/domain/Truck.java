package trucks.domain;

public class Truck {

    private int idCaminhao = 0;
    private String name;
    private String modelo;
    private int ano;
    private double kmAtual;
    private String status;

    public int getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(int idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(double kmAtual) {
        this.kmAtual = kmAtual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Truck(String id, String name, String modelo, int ano, double kmAtual, String status) {


    }

    @Override
    public String toString() {
        return "Truck{" +
                "id='" + idCaminhao + '\'' +
                ", name='" + name + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", kmAtual=" + kmAtual +
                ", status='" + status + '\'' +
                '}';
    }
//regras internas do caminhão (ex: não pode diminuir km)


}
