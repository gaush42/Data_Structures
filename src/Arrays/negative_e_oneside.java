package Arrays;

class negative_e_oneside {

    public void rearrange(int[] arr){
        int j=0,t;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,16,-8,-9,7,2,-5};
        negative_e_oneside n = new negative_e_oneside();
        n.rearrange(arr);
    }
}
