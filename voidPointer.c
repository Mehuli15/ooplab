#include <stdio.h>

void main(){
    int a= 10;
    void *p1= &a;
    float f= 2.5;
    void *p2= &f;
    printf("Value of a is : %d\n", *(int *)p1);
    printf("Address of a is :%x\n", p1);
    printf("Value of f is : %f\n", *(float *)p2);
    printf("Address of a is :%x\n", p2);
}
