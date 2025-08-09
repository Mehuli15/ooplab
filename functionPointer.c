#include <stdio.h>

int func(int *x, int *y);

void main(){
    int a= 10;
    int b= 20;
    func(&a,&b);
    printf("Value of A/Sum is : %d",a);
}

int func(int *x, int*y){
    *x= *x+*y;
    return *x;
}
