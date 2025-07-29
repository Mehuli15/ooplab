#include <stdio.h>

void main(){
        int a[3][2]={10, 20, 30, 40, 50, 60};
        for(int i=0; i<3; i++){
            for(int j=0; j<2;j++){
                printf("a[%d][%d]=%d\n",i,j,a[i][j]);
            }
        }
}
