package programmers.level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompleteRun {

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> participantList = new ArrayList<>();
        List<String> completionList = new ArrayList<>();
        Set<String> sameName = new HashSet<>();
        List<String> sameNameList = new ArrayList<>();

        for (int i = 0; i < participant.length; i++) {
            participantList.add(participant[i]);
        }

        for (int i = 0; i < completion.length; i++) {
            completionList.add(completion[i]);
        }

        for (int i = 0; i < participantList.size(); i++) {
            for (int j = 0; j < participantList.size(); j++) {
                if (participantList.get(i).equals(participantList.get(j)) && i != j) {
                    sameName.add(participantList.get(i));
                }
            }
        }
        if (!sameName.isEmpty()) {
            Iterator<String> it = sameName.iterator();
            while (it.hasNext()) {
                sameNameList.add(it.next());
            }
        }

        List<String> answerList = participantList.stream()
                .filter(part -> completionList.stream().noneMatch(Predicate.isEqual(part)))
                .collect(Collectors.toList());

//        List<String> sameName = sameNames.stream()
//                .filter(same -> completionList.stream().noneMatch(Predicate.isEqual(same)))
//                .collect(Collectors.toList());

        List<String> answerList2 = sameNameList.stream()
                .filter(part -> completionList.stream().noneMatch(Predicate.isEqual(part)))
                .collect(Collectors.toList());

        answerList.add(answerList2.get(0));

        return answerList.get(0);
    }
}
