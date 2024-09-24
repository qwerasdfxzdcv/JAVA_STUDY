//팀원은 4명까지, 팀명은 아메리카노, 팀의목표는 "착하게 살자"

public class Team {
    Person2[] members = new Person2[4];
    String teamName;
    String goal;
    //멤버 추가
    public void memberAdd(Person2 member) {
            for (int i = 0; i < members.length; i++) {
                if (members[i] == null) {
                    members[i] = member;
                }
            }
    }
    //멤버 삭제
    public void memberRemove(String memberName) {
        for(int i = 0; i < members.length; i++){
            if(members[i].name.compareTo(memberName) == 0){
                members[i] = null;
            }
        }
    }
    //출력
    public void print(){
        System.out.println("이 팀명은 " + teamName + "입니다.");
        System.out.println("목표는 " + goal +"입니다.");
        System.out.print("팀원은" );
        for(int i = 0; i < members.length; i++){
            if(members[i] != null){
                System.out.print(" " + members[i].name + "(" + members[i].age + "),");
            }
        }
        System.out.println("입니다.");
    }
}
