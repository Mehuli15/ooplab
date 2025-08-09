#include <stdio.h>
void main(){
    int arr[5]= {10, 20, 30, 40, 50};
    int *ptr= arr;
    printf("%d\n", *ptr);
    ptr= ptr+3;
    printf("%d\n", *ptr);
    ptr= ptr-2;
    printf("%d\n", *ptr);
}
