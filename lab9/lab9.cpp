// Angel Camacho
// CS 278
#include <iomanip>
#include <iostream>
#include <cmath>
#include <string>
using namespace std;
    static double firstSum(int n);
    static int secondSumation(int n);
    int main(){
        int i = 30;
        cout << "Please Enter value of n: " << endl; cin.get() >> i;
        cout << "Summation of first number: " << i << " : " << firstSum(i) << endl;
        cout << "Summation of second humber: " << i  << " : " <<  secondSumation(i) << endl;
        }
        static double firstSum(int n){
            if (n==0){               
                return 1;
            }
            double last = 2^n;            
            double inductive = firstSum(n-1); 
            return (last + inductive);
         }
        static int secondSumation(int n){
            if (n==1){                 
                return 2;
                }
            int last2 = (n*(n+1)); 
            int inductive2 = secondSumation(n-1);  
            return (last2 + inductive2);
         }