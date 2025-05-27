#include<iostream>
using namespace std;

int main(){
    int i , j ;
    for(i=1;i<=5;i++){
        for(j=0;j<i;j++){
            cout<<j+10<<" ";
        }
        cout<<endl;
    }
}
// output:

//         10 
//         10 11 
//         10 11 12 
//         10 11 12 13 
//         10 11 12 13 14