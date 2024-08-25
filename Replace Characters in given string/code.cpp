#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    
    char ch1, ch2;
    cin >> ch1;
    cin >> ch2;
    
    string res = "";
    for(char c : s) {
        if(c == ch1)
            res += ch2;
        else if(c == ch2)
            res += ch1;
        else
            res += c;
    }
    cout << res << endl;
}