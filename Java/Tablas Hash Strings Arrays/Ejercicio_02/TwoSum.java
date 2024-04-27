import java.util.HashMap;
import java.util.Map;

    /*
     * Dado un array de numeros enteros y un target, retornar los indices de dos numeros
     * para los que la suma de ambos sea igual al target
     * 
     * Ejemplo 1:
     * Array num = [9,2,5,6], target = 7
     * Output indices[1,2]
     * Explicacion num[1] + num[2] == 7
     * 
     * Ejemplo 2:
     * Array num = [9,2,5,6], target = 100
     * Output null
     * 
     * Dos bucles for anidados O(N^2)
     * 9: 2,5,6
     * 2: 5,6
     * 5: 6
     * 
     * Mapa de complementos O(N)
     *      Complemento del array / indice del array
     *      7 - 9 = -2              posicion del 9 [0]
     *      7 - 2 = 5               posicion del 2 [1]
     * {
     *     -2 : 0,
     *      5 : 1,
     *      1 : 3
     * }
     */


public class TwoSum {

     public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return null;
        
        Map<Integer, Integer> compMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(compMap.containsKey(nums[i])) return new int[]{compMap.get(nums[i]), i};
            int complement = target - nums[i];
            compMap.put(complement, i);
        }
        return null;
     }
}
