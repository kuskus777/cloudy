/*
Crea una clase llamada MonitorClimatico con los siguientes métodos:
📊 Métodos de análisis:

    generarTemperaturas(int min, int max): Genera un array de 7 temperaturas aleatorias entre los valores mínimo y máximo.
    temperaturaMinima(int[] temperaturas): Devuelve la temperatura más baja registrada.
    temperaturaMaxima(int[] temperaturas): Devuelve la temperatura más alta registrada.
    mediaTemperaturas(int[] temperaturas): Calcula la temperatura promedio de la semana.
    desviacionEstandar(int[] temperaturas): Calcula la desviación estándar de las temperaturas (para detectar variabilidad).
    hayTemperatura(int[] temperaturas, int valor): Indica si una temperatura específica fue registrada.
    diaDeTemperatura(int[] temperaturas, int valor): Devuelve el índice del día en que se registró una temperatura específica (0 = lunes, 6 = domingo).

🔄 Métodos de transformación:

    invertirTemperaturas(int[] temperaturas): Invierte el orden de las temperaturas (de domingo a lunes).
    rotarTemperaturasDerecha(int[] temperaturas, int n): Rota las temperaturas n días hacia la derecha.
    rotarTemperaturasIzquierda(int[] temperaturas, int n): Rota las temperaturas n días hacia la izquierda.

🧠 Métodos de interpretación:

    clasificarTemperaturas(int[] temperaturas): Devuelve un array de etiquetas ("Frío", "Templado", "Caliente") según rangos definidos:

Frío: < 18°C
Templado: 18°C–25°C
Caliente: > 25°C

    detectarAnomalias(int[] temperaturas): Devuelve un array con los días que tienen temperaturas que se desvían más de 1.5 veces la desviación estándar respecto a la media.
*/
package condicionales;

/**
 *
 * @author huetya
 */
public class Condicionales {

    public static void main(String[] args) {
        
        
    }
    public static void holaMundo(String hola){
        System.out.println("hola mundo");
    }
}
