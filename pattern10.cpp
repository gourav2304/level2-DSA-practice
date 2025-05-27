#include<iostream>
using namespace std;

int main(){
    int i , j ;
    for(i=5;i>=0;i--){
        for(j=1;j<=i;j++){
            char name = 'a'+(j-1);
            cout<<name<<" ";
        }
        cout<<endl;
    }
}
// output:


            // a b c d e 
            // a b c d
            // a b c
            // a b
            // a
