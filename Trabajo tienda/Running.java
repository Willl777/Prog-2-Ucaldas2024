import java.util.ArrayList;

public class Running{
    ArrayList<Shoes> runningshoes = new ArrayList<>();

    public ArrayList<Shoes> addRunningShoes() {
        runningshoes.add(new Shoes("1234", 100f, 41, "ruta1", false, 15));
        runningshoes.add(new Shoes("1324", 200f, 42, "ruta2", true, 8));
        runningshoes.add(new Shoes("0434", 150f, 43, "ruta3", false, 9));
        runningshoes.add(new Shoes("2434", 250f, 44, "ruta4", true, 10));

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
}
