package 기본.Baeakjoon;

public class k_번째의_수 {
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];


        for(int i =0; i<commands.length; i++){
            int[] sample = new int[commands[i][1]-commands[i][0]+1];
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
                for(int x = 0; x<sample.length; x++){
                    if(sample[x]==0){
                        sample[x] = array[j];
                        break;


                    }
                }
            }
            for(int a=0; a<sample.length; a++) {
                for(int j=a+1; j<sample.length; j++) {
                    if(sample[a] > sample[j]) {
                        int tmp = sample[a];
                        sample[a] = sample[j];
                        sample[j] = tmp;
                    }


                }
            }
            for(int b=0; b<answer.length; b++){
                if(answer[b]==0){
                    answer[b] = sample[commands[i][2]-1];
                    break;
                }
            }
        }
        return answer;
    }
}
