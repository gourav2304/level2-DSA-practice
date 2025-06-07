#include <iostream>
using namespace std;

int main() {
    
    int asterisks[] = {5, 0, 3, 0, 0};
    int numLines = 5;

    
    for (int i = 0; i < numLines; i++) {
        // First two characters: "  " (two spaces) for lines 1-4, "**" for line 5
        if (i < 4) {
            cout << "  ";
        } else {
            cout << "**";
        }

        // Third character: always "e"
        cout << "e";

        // Print asterisks based on the array
        for (int j = 0; j < asterisks[i]; j++) {
            cout << "*";
        }

        // Newline after each line
        cout << endl;
    }

    return 0;
}