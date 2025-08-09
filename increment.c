#include <stdio.h>

void main(){
    int arr[5]= {10, 20, 30, 40, 50};
    int *ptr= arr;
    printf("Initial pointer value :\n");
    printf("Address: %p, Value:%d\n", ptr, *ptr);
    ptr++;
    printf("\nAfter incrementing pointer by 1 :\n");
    printf("Address: %p, Value:%d\n", ptr, *ptr);
    ptr++;
    printf("\nAfter incrementing pointer by 1 again :\n");
    printf("Address: %p, Value:%d\n", ptr, *ptr);
}
