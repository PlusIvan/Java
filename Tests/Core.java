
public class Core {
    private static void imprimeArray(int array[]) {

        for(int e: array) {
 
            System.out.print(e + " ");
 
        }
 
     }
     private static void swap(int array[], int indexA, int indexB)
     {
        int aux = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = aux;
     }
     private static void quickSort(int array[],int esq, int dir ) {

      

        if (esq >= dir)
 
            return;
 
       
 
        int pivot = array[dir];
 
        int indexPivot = dir;
 
        int indexEsq = esq;
 
        int indexDir = dir;
 
       
 
        dir = dir-1;
 
        while(esq < dir) {
 
            while(array[esq] < pivot && esq < dir) {
 
                esq++;
 
            }         
 
            while(array[dir] > pivot && esq < dir) {
 
                dir--;
 
            }
 
            swap(array, esq, dir);
 
        }
 
        if (array[esq] > pivot) {
 
            swap(array,esq,indexPivot);
 
            indexPivot = esq;
 
        }
 
       
 
        //System.out.println("Vou chamar: inicio "+ indexEsq + "Fim: " + (esq-1));
 
       
 
        quickSort(array,indexEsq, indexPivot-1);
 
    
 
        //System.out.println("Vou chamar segunda: inicio "+ (esq+1) + "Fim: " + (indexPivot));
 
       
 
        quickSort(array,indexPivot+1,indexDir);
 
       
 
     }

    public static void main(String[] args) {

              //int array[] = {7,1,5,6,4,2,3,8}; 

       //int array[] = {1,2,3,4,5,6,7,8};

       //int array[] = {8,7,6,5,4,3,2,1};

       //int array[] = {1,3,5,7,2,4,6,8};

       //int array[] = {3,2,1,4,5,8,7,6};

       int array[] = {6,5,1,3,2,7,8,4};

      

      

      

      

       quickSort(array,0,7);

       imprimeArray(array);  

        
    }
}