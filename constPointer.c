#include <stdio.h>

void main(){
    int i= 10;
    int j= 20;
    int const*ptr= &i;
    printf("ptr:%d\n", *ptr);
    ptr= &j;
    printf("ptr:%d\n",*ptr);
}
