## 📋 구현 기능 목록

### view
- [x] 입출력 클래스 구현
- [x] 인사말 출력
- [x] 식당 예상 방문 날짜 입력
- [x] 메뉴 입력
- [x] 잘못된 값을 입력할 경우
  - [x] `IllegalArgumentException`
  - [x] "[ERROR]"로 시작하는 에러 메시지를 출력
  - [x] 그 부분부터 입력을 다시 받는다.
    - [x] 음료만 주문 불가
    - [x] 중복 메뉴 주문 불가
    - [x] 최대 20개 주문 가능
- [x] 주문 메뉴 출력
- [x] 할인 전 금액 출력
- [x] 증정 메뉴 출력
- [x] 혜택 내역 출력
- [x] 총혜택 금액 출력
- [x] 예상 결제 금액 출력
- [x] 이벤트 배지 출력

### service
- [x] order 리턴하는 함수
- [x] String으로 받은 주문정보를 Map으로 리턴하는 함수

### domain

#### menu
- [x] menuType 리턴하는 함수

#### menuItem
- [x] menuItem 리턴하는 함수
- [x] price 리턴하는 함수

#### badge
- [x] price에 따라 badge 리턴하는 함수

#### order
- [x] 해당 주문에 적용 가능한 이벤트만 filter하는 함수
- [x] 해당 주문으로 받은 badge 리턴하는 함수
- [x] 가격, 증정품 정보 리턴하는 함수

#### condition
- [x] 금액, 날짜에 따른 조건 관리

#### event
- [x] 할인 금액 리턴하는 함수
- [x] 증정 이벤트 : 증정품 리턴하는 함수
- [x] 날짜 이벤트 : 날짜 설정하는 함