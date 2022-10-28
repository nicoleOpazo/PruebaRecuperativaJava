import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class PruebaRecuperativaJava {
    ArrayList <Integer> arrayProductos = new ArrayList <Integer>(Arrays.asList(1000,500,650,8000));
    
    static String total (String dia, ArrayList arrayProductos){
        int sumaTotalProductos;
        int descuento =20;
        if (dia == "martes" || dia == "jueves"){
            for(i=0; arrayProductos.length>i; i++){
                sumaTotalProductos = arrayProductos[i]+sumaTotalProductos;
            }
            int conDescuento = sumaTotalProductos - (descuento*sumaTotalProductos)/100;
            return conDescuento;
        }
        else {
            return sumaTotalProductos;
        }
    }

    
    int suma = 0;
    for (i=0; arrayProductos.length>i; i++){
        
        if (arrayProductos.length>3 && arrayProductos[i]>10000){
            suma = arrayProductos[i]+suma;
            int desc = suma - ((5*suma)/100);
            System.out.println("Sí corresponde descuento, su total es de: " +desc);
        }
        else {
            System.out.println("No corresponde descuento");
        }
    }

    
    for (i=0; arrayProductos.length>i; i++){
        
        if (arrayProductos[i]>=0){
            System.out.println("Éxito");
        }
        else {
            System.out.println("Error, " + arrayProductos[i]);
        }
    }

    /*
    ● Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
    producto
        ○ Crea una función que retorne el valor del producto más costoso.
        ○ Crea una función que retorne el valor del producto menos costoso.
    */
    ArrayList <Integer> miArray = new ArrayList <Integer>(Arrays.asList(200,5500,900,7000,500,300));

    /*
    function numeroMayor(numero) {
        if(numero >10) {
            console.log("true")
        }
        else{console.log("false")}
    }
    numeroMayor(20);
    */

    
}
}
