class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count=1;
        int i=0;
        int j=0;
        int iend=matrix[0].length-1;
        int istart=0;
        int jend=matrix.length-1;
        int jstart=0;
        int dir=1;
        for(int a = 0; a<matrix.length * matrix[0].length ;a++){
            if(dir==1){
                //L1.add(matrix[j][i]);
                matrix[j][i]=count++;
                if(i+1>iend){
                    dir=2;
                    jstart++;
                    j++;
                }
                else{i++;}
            }
            else if(dir==2){
               // L1.add(matrix[j][i]);
               matrix[j][i]=count++;
                if(j+1>jend){
                    dir=3;
                    iend--;
                    i--;
                }
                else{j++;}
            }
            else if(dir==3){
                //L1.add(matrix[j][i]);
                matrix[j][i]=count++;
                if(i-1<istart){
                    dir=4;
                    jend--;
                    j--;
                }
                else{i--;}
                
            }
            else if(dir==4){
                //L1.add(matrix[j][i]);
                matrix[j][i]=count++;
                if(j-1<jstart){
                    dir=1;
                    istart++;
                    
                    i++;
                }
                else{j--;}
            }
        }
        return matrix;
    }
}