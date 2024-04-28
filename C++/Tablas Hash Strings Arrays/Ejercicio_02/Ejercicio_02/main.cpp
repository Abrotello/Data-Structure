#include <iostream>
#include <unordered_map>

/*
 Dado un array de numeros enteros y un target, retornar los indices de dos numeros para los que la suma de ambos sea igual al target
 
  Ejemplo 1:
   Input: nums = [9,2,5,6], target = 7
   Output: [1,2]
   Explicacion nums[1] (2) + nums[2] (5) = 7
 
  Mapa de complementos
  7 - 9 = -2
  7 - 2 = 5
  5
  Complemento del array         indice
         -2                       0
          5                       1
*/

int* twoSum(int*, int, int);
using namespace std;

int main(int argc, const char * argv[]) {
    int nums[] = {9,2,5,6};
    int size = sizeof(nums) / sizeof(nums[0]);
    int target = 14;
    
    int *ptr = twoSum(nums, target, size);
    
    if(ptr != nullptr) {
        cout << "Indices: ";
        for(int i=0; i<2; i++) {
            cout << *(ptr+i) << ' '; // *(ptr+i) = ptr[i]
        }
        cout << endl;
        delete[] ptr;
    } else {
        cout << "No index found" << endl;
    }
    return 0;
}

int* twoSum(int *ptr_array, int target, int size) {
    if(ptr_array == nullptr || size < 2) return nullptr;
    
    unordered_map<int, int> map;
    
    for(int i=0; i<size; i++) {
        int complement = target - *(ptr_array+i);
        if(map.find(ptr_array[i]) != map.end()) return new int[]{map.at(ptr_array[i]), i};
        map.emplace(complement, i);
    }
    return nullptr;
}
