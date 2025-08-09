#include <stdio.h>

void main(){
    int var;
    int *ptr;
    int **pptr;
    var= 200;
    ptr= &var;
    pptr= &ptr;
    printf("Value of var : %d",var);
    printf("\nThe value of *ptr : %d",*ptr);
    printf("\nThe value of **pptr : %d",**pptr);
    printf("\nThe address of *ptr : %x",ptr);
    printf("\nThe address of **pptr : %d",pptr);
}
