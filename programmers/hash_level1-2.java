import java.util.Arrays;

public hash_level1-2 {
    public String solution(String[] participant, String[] completion){
        
        //배열 정렬
        Arrays.sort(participant);
        Arryas.sort(completion);

        //배열 순서대로 비교
        for (int i  = 0; i < completion.length; i++) {

            // 참가자와 완주자를 하나씩 비교해서 이름이 다른 사람이 나오면 그 사람은 완주하지 못한 사람
            if (!participant[i].equals(completion[i])) {
                return participant[i]; // 이름이 다른 사람이 완주하지 못한 사람
            }
        }

        //비교했을때 동일하면 마지막 참가자가 완주 못한 사람
        return participant[participant.length -1];
    }
}