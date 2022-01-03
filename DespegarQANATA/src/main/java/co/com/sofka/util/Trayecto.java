package co.com.sofka.util;

public enum Trayecto {
     ida_vuelta("Ida y vuelta"),
     ida("Solo ida"),
     multidestino("Multidestino");

     private final String value;

     Trayecto(String value) {
         this.value =value;
     }

}
