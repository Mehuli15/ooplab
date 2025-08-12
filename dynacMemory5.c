#include <stdio.h>
#include <stdlib.h>

int main(){
    char name[100];
    char* description;
    strcpy(name, "Zara Ali Khan");
    description=malloc(200*sizeof(char));
    if (description == NULL){
        fprintf(stderr, "Error-unable to allocate required memory\n");
    }else{
        strcpy(description,"Zara Ali is a DPS student.");
    }
    if (description == NULL){
        fprintf(stderr, "Error-unable to allocate required memory\n");
    }else{
        strcat(description,"She is in class 10th");
    }
    printf("Name=%s\n",name);
    printf("Description : %s\n", description);

    return 0;
}
