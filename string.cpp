#include<iostream>
#include<String>
using namespace std;

int main(int argc, char const *argv[]) {
    
    string str1 = "Hello";
    string str2 = "Hello";

    cout << &str1 << endl;
    cout << &str2 << endl;

    if (str1 == str2) {
        cout << "Same" << endl;
    } else {
        cout << "Not same" << endl;
    }
    

    return 0;
}