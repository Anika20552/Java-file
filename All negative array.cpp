#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the number of elements in the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter"<<n<<"element:";
    for(int i=0;i<n;i++){
    cin>>arr[i];
    }
    cout<<"Negative element in the array:";
    bool hasNegative = false;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            cout<<arr[i]<<" ";
            hasNegative = true;

        }
    }
    if(!hasNegative){
        cout<<"none";
    }
    cout<<endl;
    return 0;


}

