#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
    int numbers[] = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
    
    unordered_map<int, int> map;
    
    int odd = 0;
    
    for(int number : numbers) {
        if(map.find(number) != map.end()) {
            map.find(number)->second++;
        } else {
            map.insert({number, 1});
        }
    }
    
    for(auto it = map.begin(); it != map.end(); it++) {
        if(it->second % 2 != 0) {
            odd = it->first;
        }
    }
    
    cout << odd << endl;
}

