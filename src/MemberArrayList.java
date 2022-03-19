import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList; // ArrayList 클래스는 제네릭 클래스라는 걸 알 수 있다.

    // 생성자
    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    // 생성자
    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    // 회원 추가
    public void addMember(Member member) {
        arrayList.add(member);
    }

    // 회원 삭제
    public boolean removeMember(int memberId) {
        // arrayList 순회
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);

            int tmpId = member.getMemberId();
            if (tmpId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }

        // for 문에서 순회를 다 하고 나서도 memberId와 매핑되는 id가 없다면 제어가 여기로 오게 된다. 제어 처리를 해준다.
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 모든 회원 출력
    public void showAllMember() {
        // 향상된 for 문
        for (Member member : arrayList) {
            System.out.println(member);
        }

        System.out.println();
    }
}
