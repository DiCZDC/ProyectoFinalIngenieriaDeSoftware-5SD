package Calculo;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class calculoISR {
    Map<Integer, Double> INPCAnual = new HashMap<>();

    public double calcularISR(double precioCompra, double precioVenta, Date fechaCompra){
        iniMapa();
        double tiempo_desde_compra = aniosDesdeCompra(fechaCompra, new Date());
        double costo_disminuir = tiempo_desde_compra*.2;
        double costo_neto = precioCompra - (precioCompra*costo_disminuir);
        if(tiempo_desde_compra >=5)
            return 0;
        double costo_neto_act = costo_neto*aumentoInflacion(fechaCompra, new Date());
        
        double utilidad = precioVenta - costo_neto_act;
        double uma = 39606.36*3;
        if(utilidad <= uma)
            return 0;
        return Math.round((utilidad-uma)*100.00)/100.00;
    }
    
    public double  aniosDesdeCompra(Date fechaCompra, Date fechaVenta){
        long diffInMillies = Math.abs(fechaVenta.getTime() - fechaCompra.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        double years = (double)diff/365;
        return Math.round(years*10.0)/10.0;
    }
    public double aumentoInflacion(Date fechaCompra,Date fechaVenta){
        return INPCAnual.get(obtenerAnio(fechaVenta))/INPCAnual.get(obtenerAnio(fechaCompra));
    }
    public int obtenerAnio(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        return (int)cal.get(Calendar.YEAR);
    }
    public void iniMapa(){
        INPCAnual.put(2010, 4.158333);
        INPCAnual.put(2011, 3.407500);
        INPCAnual.put(2012, 4.113333);
        INPCAnual.put(2013, 3.807500);
        INPCAnual.put(2014, 4.018333);
        INPCAnual.put(2015, 2.724167);
        INPCAnual.put(2016, 2.820000);
        INPCAnual.put(2017, 6.036667);
        INPCAnual.put(2018, 4.901667);
        INPCAnual.put(2019, 3.642500);
        INPCAnual.put(2020, 3.396667);
        INPCAnual.put(2021, 5.682500);
        INPCAnual.put(2022, 7.891667);
        INPCAnual.put(2023, 5.554167);
        INPCAnual.put(2024, 4.792000);
    }
}
