package com.clase15;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import com.opencsv.bean.CsvDate;

// debo leerun valor String desde el csv y convertirlo en double
import com.opencsv.bean.AbstractBeanField;

//DoubleConverter 
import com.opencsv.bean.CsvBindByPosition;


//Lombok
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter

public class LectorCsv {
    String ofertasFileRuta;
    List<OfertasBind> lineasOfertas;

    public LectorCsv(String ofertasFileRuta) {
        this.ofertasFileRuta = ofertasFileRuta;
        this.lineasOfertas = new ArrayList<>();
    }

    public void parsearOfertas() {
      
        List<OfertasBind> lineasOfertas = null;

        try {
            // En esta primera línea definimos el archivos que va a ingresar
            lineasOfertas = new CsvToBeanBuilder(new FileReader(this.ofertasFileRuta))
                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                    .withSkipLines(1)
                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                    .withSeparator(';')
                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                    .withType(OfertasBind.class)
                    // debo leerun valor String desde el csv y convertirlo en double
                    .build()
                    .parse();

        } catch (IOException e) {
        e.printStackTrace();
        }
        this.lineasOfertas=lineasOfertas;
        System.out.println("Se cargaron las ofertas " + lineasOfertas.size());

        }


// Crear resultados de partidos
    public ArrayList<Ofertas> cargarOfertas() {
        ArrayList<Ofertas> ofertasList = new ArrayList<Ofertas>();
        Producto productoAux;
        Descuento descuentoAux;

        for ( OfertasBind o : this.lineasOfertas) {

            productoAux = new Producto(o.getProducto(), o.getPeso(), o.getMedida(), o.getPrecio());
            descuentoAux = new Descuento(o.getTipo_descuento(), o.getCantidad(), o.getTope());
            Ofertas partidoAux = new Ofertas(productoAux, descuentoAux, o.getFechaDesde(), o.getFechaHasta());
            ofertasList.add(partidoAux);
        
        }

        return ofertasList;
    }
   
}