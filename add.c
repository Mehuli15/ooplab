#include <stdio.h>

void main(){
        int a[3][3], b[3][3], add[3][3];
        int i,j;
        printf("Enter matrix a : ");
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                scanf("%d",& a[i][j]);
            }
        }
        printf("Enter the matrix b : ");
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                scanf("%d",& b[i][j]);
            }
        }

        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                add[i][j]=a[i][j]+b[i][j];
                printf("\n");
            }
        }

        printf("Addition of a and b is : ");
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                printf("%d",add[i][j]);
                printf("\n");
            }
        }
}
