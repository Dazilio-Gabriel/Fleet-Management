package trucks.application;

import trucks.domain.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckService {
    List<Truck> trucksList = new ArrayList<>();


// public List<Produtos> FiltrarProdutosQuantidade() {
//        System.out.println("Filtrando Produtos por quantidade");
//        System.out.println("Digite o ID do produto: ");
//        int quantidadeUsuario = input.nextInt();
//        return listaDosProdutos.stream()
//                .filter(p -> p.getQuantidade() >= quantidadeUsuario)
//                .toList();


    public List<Truck> validatorPlate(String plate) {
        String verficPlate = "";
        return trucksList.stream().
                filter(p -> p.getPlate() == verficPlate).toList();
    }


    public void ListAllTrucks(Truck trucks) {
        for (Truck t : trucksList) {
            System.out.println(t);
        }
    }

}