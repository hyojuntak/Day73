class Main {
  public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();	//어떤 수가 입력될지 모르니까 arraylist로 받음(arr객체 생성)
        Scanner sc = new Scanner(System.in);		//Scanner 객체 생성

        String s = sc.next();				//String 타입의 s 변수에 숫자 입력받음
        for (int i = 0; i < s.length(); i++) {			//s의 길이만큼 돌면서
            arr.add(Integer.parseInt(s.substring(i, i+1)));	//arrlist인 arr에 str값 하나씩 int형으로 변환후 추가
        }
        // System.out.println(arr);			

        int result = 1;					//연산을 하기 위한 결과 int형 타입 result 변수 생성

        for (int i = 0; i < arr.size(); i++) {			//arr 크기만큼 돌면서
            if(arr.get(i)==0){				//1. arr 안에 0이 있으면
                if(i==0) continue;				//그 값의 index가 0이면 아무것도 안함(result 값 유지)
                if(i>0) result += arr.get(i);			//그 값의 index가 0보다 크면 result 값에 그 값을 더함
            }
            else if(arr.get(i)==1){				//2. arr 안에 1이 있으면
                if(i==0) continue;				//그 값의 index가 0이면 아무것도 안함(result 값 유지)
                if(i>0) result += arr.get(i);			//그 값의 index가 0보다 크면 result 값에 그 값을 더함 
            }
