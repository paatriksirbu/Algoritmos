package sorts;
import static sorts.SortUtils.*;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */
class QuickSort implements SortAlgorithm {      //Algoritmo obtenido de la pagina the-algorithms.

    /**
     * This method implements the Generic Quick Sort
     *
     * @param array The array to be sorted Sorts the array in increasing order
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        doSort(array, 0, array.length - 1);
        return array;
    }

    /**
     * The sorting process
     *
     * @param left The first index of an array
     * @param right The last index of an array
     * @param array The array to be sorted
     */
    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot, right);
        }
    }

    /**
     * Ramdomize the array to avoid the basically ordered sequences
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array
     * @return the partition index of the array
     */
    private static <T extends Comparable<T>> int randomPartition(T[] array, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        swap(array, randomIndex, right);
        return partition(array, left, right);
    }

    /**
     * This method finds the partition index for an array
     *
     * @param array The array to be sorted
     * @param left The first index of an array
     * @param right The last index of an array Finds the partition index of an
     * array
     */
    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int mid = (left + right) >>> 1;
        T pivot = array[mid];

        while (left <= right) {
            while (less(array[left], pivot)) {
                ++left;
            }
            while (less(pivot, array[right])) {
                --right;
            }
            if (left <= right) {
                swap(array, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }
    // Termina el algoritmo

    //Creamos clase Tarea y los atributos nombre y prioridad que usaremos mas tarde.
    static class Tarea implements Comparable<Tarea>{
        private String nombre;      //definimos las variables
        private int prioridad;

        public Tarea(String nombre, int prioridad) {    //constructor de la clase y las inicializamos.
            this.nombre = nombre;
            this.prioridad = prioridad;
        }
        public int compareTo(Tarea otraTarea){      //usamos el compareTo para determinar el orden para el orden del algoritmo.
            return Integer.compare(this.prioridad, otraTarea.prioridad);
        }
        @Override
        public String toString() {      //usamos un toString para representar una cadena, es decir, para describir el
                                        //objeto que vamos a crear posteriormente.
            return "Tarea: " +
                    "Nombre: '" + nombre + '\'' +
                    ", Prioridad: " + prioridad;

        }
    }
    // Driver Program
    public static void main(String[] args) {    //El main es obligatorio para que el programa pueda compilar y ver si nuestro
                                                //algoritmo funciona correctamente.

        Tarea[] tareas = new Tarea[]{           //Creamos nuevas tareas para que nuestro algoritmo las ordene segun prioridad.
                new Tarea("Pasear", 3),
                new Tarea("Universidad", 1),
                new Tarea("Revisar facturas", 2),
                new Tarea("Revisar mail", 2),
                new Tarea("Ir a la gasolinera", 2),
                new Tarea("Fregar platos", 4),
                new Tarea("Recoger habitacion", 1),
        };

        new QuickSort().sort(tareas);       //Aqui el algoritmo es donde realiza su funcion y nos ordena las tareas por prioridad

        for (Tarea tarea: tareas){      //usamos un foreach para recorrer el array entero y que nos muestre las tareas ya ordenadas.
            System.out.println(tarea);
        }


    }
}
