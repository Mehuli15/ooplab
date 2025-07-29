#include <stdio.h>

void main(){
    int a[20],b[20],i,n1,n2;

    printf("Enter the size of the first array : ");
    scanf("%d",& n1);

    printf("Enter the 1st array elements :\n ");
    for (i=0; i<n1; i++){
        scanf("%d",& a[i]);
    }

    printf("Enter the size of the second array : ");
    scanf("%d",& n2);

    printf("Enter the 2nd array elements :\n ");
    for (i=0; i<n2; i++){
        scanf("%d",& b[i]);
    }

    n2=n1+n2;//20+20=40

    for(i=0; i<n2; i++){
    a[n1+i]=b[i];
    }

    printf("Merged elements are : \n");

    for (i=0; i<n2; i++){
        printf("%d",a[i]);
        printf(" ");
    }
    printf("av.sc.u4cse24150");
}
