#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter how many numbers:";
    cin>>n;
    int arr[n];
    int sum=0;
    cout<<"Enter"<<n<<"number:\n";
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum+=arr[i];
    }
    float average=(float)sum/n;
    cout<<"Sum="<<sum<<endl;
    cout<<"Average="<<average<<endl;
    return 0;





}

