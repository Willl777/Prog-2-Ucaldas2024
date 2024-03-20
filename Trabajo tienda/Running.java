import java.util.ArrayList;

public class Running {
    ArrayList<Shoes> runningshoes = new ArrayList<>();

    public ArrayList<Shoes> addRunningShoesWoman() {
        runningshoes.add(new Shoes("1234", 100f, 38, "ruta1", false, 15));
        runningshoes.add(new Shoes("1324", 200f, 42, "ruta2", true, 8));
        runningshoes.add(new Shoes("0434", 150f, 38, "ruta3", false, 4));
        runningshoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 3));

        return runningshoes;
    }

    public ArrayList<Shoes> addRunningShoesMan() {
        runningshoes.add(new Shoes("1235", 300f, 35, "ruta1", true, 15));
        runningshoes.add(new Shoes("1325", 250f, 42, "ruta2", true, 1));
        runningshoes.add(new Shoes("0435", 150f, 43, "ruta3", false, 9));
        runningshoes.add(new Shoes("2435", 250f, 38, "ruta4", true, 10));

        return runningshoes;
    }

    public String showInformationShoes() {
        String Information = "";
        for (int i = 0; i < runningshoes.size(); i++) {
            Information += runningshoes.get(i).getReference() + "- Talla: " +
                    runningshoes.get(i).getsize() + " - Precio: " +
                    runningshoes.get(i).getPrice() + "- Fotos: " +
                    runningshoes.get(i).getphoto_route() + "- Envio a casa: " +
                    runningshoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    runningshoes.get(i).getcant_colours() + "\n__";
        }
        return Information;
    }

    public String sizeInformationShoes() {
        String Information = "";
        for (int i = 0; i < runningshoes.size(); i++) {
            if (runningshoes.get(i).getsize() == 38) {
                Information += runningshoes.get(i).getReference() + "- Talla: " +
                    runningshoes.get(i).getsize() + " - Precio: " +
                    runningshoes.get(i).getPrice() + "- Fotos: " +
                    runningshoes.get(i).getphoto_route() + "- Envio a casa: " +
                    runningshoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    runningshoes.get(i).getcant_colours() + "\n__";
            }
        }
        return Information;
    }

    public String priceInformationShoes() {
        String Information = "";
        for (int i = 0; i < runningshoes.size(); i++) {
            if (runningshoes.get(i).getPrice() > 150) {
                Information += runningshoes.get(i).getReference() + "- Talla: " +
                    runningshoes.get(i).getsize() + " - Precio: " +
                    runningshoes.get(i).getPrice() + "- Fotos: " +
                    runningshoes.get(i).getphoto_route() + "- Envio a casa: " +
                    runningshoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    runningshoes.get(i).getcant_colours() + "\n__";
            }
        }
        return Information;
    }
    public String sendInformationShoes() {
        String Information = "";
        for (int i = 0; i < runningshoes.size(); i++) {
            if (runningshoes.get(i).isSend_method() == false) {
                Information += runningshoes.get(i).getReference() + "- Talla: " +
                    runningshoes.get(i).getsize() + " - Precio: " +
                    runningshoes.get(i).getPrice() + "- Fotos: " +
                    runningshoes.get(i).getphoto_route() + "- Envio a casa: " +
                    runningshoes.get(i).isSend_method() + "- Cantidad de colores: " +
                    runningshoes.get(i).getcant_colours() + "\n__";
            }
        }
        return Information;
    }
}
