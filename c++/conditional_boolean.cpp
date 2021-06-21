#include <iostream>
using namespace std;


int main() {
int x = 1 , y = 6;

if (x>7 == y<7){ //false because x<1
    cout << y-x << endl;
}
else {
    cout << x-y; //1-6 = -5 . print -5
}

cout <<x+y; // 1 + 6 = 7 
//output = -57
return 0;
}

