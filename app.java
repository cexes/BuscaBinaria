public class app {
      public static void main(String[] args) {
          
            
            int v[] = {1,2,3,4,5,6,7,8,9,10,11,12,20,21};
            System.out.println(BuscaBinaria(v, 20));
         

      }
    
        public static int BuscaBinaria(int vetor[], int valor){
              
                  int pivo;
                  int inicio = 0; 
                  int fim = vetor.length -1;
                      
               while(inicio <= fim){
                     pivo =(inicio + fim)/2;
                      
                     if(vetor[pivo] == valor){
                         return pivo;
                 } 
                      else if(vetor[pivo] < valor){
                              inicio = pivo + 1;
                      }
                     if(vetor[pivo] > valor){
                           fim = pivo -1;
                     }
                     
               }
            

             return -1; 
        }

}