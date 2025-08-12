#include <stdio.h>
#include <stdlib.h>

int main(){
    int *ptr,n1,n2;
    printf("Enter size of an array : ");
    scanf("%d",&n1);
    ptr=(int*)malloc(n1*sizeof(int));
    printf("Address of previously allocated memory : ");
    for(int i=0;i<n1;++i){
        printf("%u\t",ptr+i);
    }

    printf("\nEnter new size of array here : ");
    scanf("%d\t",&n2);
    ptr=realloc(ptr,n2);
    for(int i=0;i<n2;i++){
        printf("%u\t",ptr+i);
    }
    return 0;
}
