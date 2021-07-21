package zx9.staris.sqlDeveloper

class companion(){

     companion object{
          var backKeyPressedTime: Long = 0
         var TitleList= arrayListOf(
             titleUrl("모델 : 일정한 표기법으로 표현한 모형 => 소통의 효율성\n \n모델링 : 표기법에 의해 표기하는 것\n-추상화 : 표기법에 의해 표현\n-단순화 : 제한된 표기법 사용 -> 이해 용이함\n-명확화 : 정확하게 기술\n-> 업무 분석 / 변경이나 관리의 목적으로 모델링 활용\n-> 가시화/ 명세화 / 구조화 / 문서화 \n \n모델링 3관점\n-데이터 : 데이터간 관계 / 업무와 데이터의 상관 관계 모델링\n-프로세스 : 실제 할일 / 해야 할 일 모델링\n-데이터와 프로세스 상관관점 : 업무 처리에 따른 데이터가 받는 영향\n \n모델링 유의 사항\n-중복 : 여러 장소에 같은 정보 있으면 안된다\n-비유연성 : 업무 변화 -> 데이터 모델 변경이 많으면 안된다\n-비일관성 : 데이터 간 상호 연관 관계를 분명히 해야한다\n \n \n개념적 모델링 : 추상적, 포괄적\n논리적 모델링 : 정확한 표현\n물리적 모델링 : 물리적 성격의 설계\n \n데이터 독립성\n-외부스키마 : 각 사용자 관점/ 개인 관점\n-개념스키마 : 모든 사용자 관점/ 통합관점\n-내부스키마 : 데이터가 실제 저장되는 방법 표현\n \n-논리적 독립성 : 개념 스키마 변경 => 외부 변경 영향 x\n-물리적 독립성 : 내부 스키마 변경 => 개념/외부 영향 x\n \nmapping \n-논리적 사상 : 외부 view와 개념적 view의 관련성\n-물리적 사상 : 개념적 view와 실제 db의 관련성\n \n데이터 모델링 3요소\n-개체(things[entity/instance])  \n-속성(attribute) \n-관계(relationship) \n \n데이터 모델링 순서\n-피터첸 -ER Model\n-엔티티 그리기 -> 배치하기 -> 관계 설정 -> 관계명 -> 참여도 -> 관계 필수 여부 기술\n \n좋은 데이터 모델\n-완전성 : 모든 데이터 모델 정의\n-중복배제 : \n-업무규칙 : 규칙을 공유\n-데이터 재사용 : 독립적 설계\n-의사소통 : 업무 규칙은 자세히 표현\n-통합성 := 중복 배제\n \n \n","데이터 모델"),

             titleUrl("엔터티\n-유일 식별자 필요\n-인스턴스의 집합(두개 이상)\n-속성 존재\n-다른 엔티티와의 최소 한개 이상의 관계\n \n형태에 따른 구분\n-유형 엔터티 : 물리적 형태 존재 - 물품\n-개념 엔터티 : 개념적 정보 - 보험 상품 \n-사건 엔터티 : 수행하는..? - 동사를 사용하는 듯 := 주문, 청구\n \n발생시점에 따른 구분\n-기본/키 엔터티 : 독립적 생성이 가능한 엔터티\n-중심 엔터티 : 엔터티 간 관계의 엔터티\n-행위 엔터티 :  /자주 변경되는 특징  : 주문목록, 변경이력\n \n \n","엔티티"),

             titleUrl("-더이상 분리되지 않는다\n-한개의 속성 : 한개의 속성 값\n \n기본속성 : 모든 속성들\n설계속성 : 필요한 데이터 이외에 모델링을 위해 정의하는 속성 : 일련번호,\n파생속성 : 다른 속성에 영향 받아 발생 : 합계,총액...\n \nPK속성 / FK 속성 / 일반 속성(PK,FK가 아닌 속성들)\n \n도메인 : 속성이 가질수 있는 값의 범위\n \n","속성"),

             titleUrl("관계명 :\n관계차수 : 1:1,1:M,N:M\n관계선택사양 : 필수[선택]관계\n \n관계 체크사항 :\n-두 엔티티 사이 연관규칙이 존재하나\n-두 엔티티 사이 조합이 발생하나\n-기술서에 관계 연결에 대한 규칙이 서술되어있나\n-기술서에 관계를 가능하게 하는 동사가 있나\n \n \n","관계"),

             titleUrl("-엔티티 대표 속성\n-엔티티는 반드시 하나의 유일 식별자가 존재\n \n \n주식별자\n-유일성 : 유일하게 구분해준다\n-최소성 : 최소로 구성되어야 한다 \n-불변성 : 한번 값이 정해지면 변화하지 않아야 한다\n-존재성 : 값이 존재해야 한다\n \n \n식별자 분류\n-주/보조\n-내부 :스스로 만들어진다\n-외부 : 다른 엔티티와 관계를 통해 받아오는 식별자\n-단일/복합\n-본질/인조\n \n \n식별자 관계 :\n-1:1 부모 속성을 자식 엔티티가 모두 사용\n-1:M 부목 속성+ 다른 부모 속성 + 스스로 속성 으로 주식별자 구성\n-반드시 부모엔티티에 종속 \n-> 주식별자 증가 => 오류 가능성 유발\n \n비식별자 관계 :  부모로부터 속성을 받았지만 주 식별자로 사용하지 않음\n->조인으로 인한 성능 저하\n \n \n \n \n \n","식별자"),

             titleUrl("성능 저하 원인\n-데이터 모델 구조\n-대용량 데이터\n-인덱스 특성 무시\n \n모델링 고려사항\n-정규화 수행\n-용량 산정\n-트랜잭션 유형 파악\n-용량,트랜잭션에 따른 반정규화\n-데이터 모델 검증\n \n","데이터 모델링"),

             titleUrl("정규화 : 데이터 모델 개선, 구조화하는 절차\n-입력,수정,삭제,조회 성능 향상\n- 조인이 많아질 수 있음\n \n반정규화 : 개발,운영의 단순화를 위한 절차\n적용 절차 :  반정규화 대상 조사 -> 다른 방법 유도 -> 반정규화 적용\n \n-반정규화 대상 조사\n: 자주 사용되는 테이블 / 제한된 처리 범위 / 통계 정보 필요 / 많은 조인 필요\n \n-다른 방법 유도\n: 많은 조인 =>view / 부분 처리 => 클러스터링,인덱스 , 파티셔닝\n \n반정규화 기법 - 테이블\n-테이블 병합\n-테이블 분할 : \n수직 : 테이블을 1:1 분리\n수평 : \n-테이블 추가 : 통계테이블 / 부분테이블 / 중복테이블 / 이력테이블\n \n \n반정규화 기법 - 칼럼\n-중복 칼럼 추가/ 파생칼럼 추가 / 이력테이블 칼럼 추가 / pk에 의한 칼럼 추가 / 응용 시스템 오작동을 위한 칼럼 추가\n \n반정규화 기법 - 관계\n-중복관계 추가\n \n","반정규화"),

             titleUrl("성능 저하\n- 한 테이블에 데이터 집중\n- 한 테이블에 여러 칼럼 존재\n- 로우 체이닝 : 로우 길이가 길어서 한 블록에 데이터를 모두 저장 할 수 없다\n- 로우 마이그레이션 : 데이터 수정시 해당 블록을 수정하지 못해 다른 블록에 저장\n \n파티셔닝 : 논리적으로는 하나의 테이블 , 물리적으로는 여러 테이블 스페이스 사용, 칼럼수 적고 데이터는 많을때\n-range partition : 데이터를 쉽게 지울수 있다\n-list partition : 대용량 데이터를 분리/저장 가능하다\n-hash partition : 데이터의 확인이 어렵고, 삭제 불가\n \n","대량 데이터 처리"),

             titleUrl("슈퍼타입 : 공통 부분\n서브타입 : 상속받은 후 다른 엔티티와 차이가 있는 부분\n \n \nOneToOne type : 확장성 좋음 / 조인 나쁨 / io성능 좋음 / 관리 나쁨 / 개별 테이블 접근이 많은 경우 사용\nPlus type :          확장성 보통 / 조인 나쁨 / io성능 좋음 / 관리 나쁨 /  슈퍼+서브 형식으로 데이터 처리하는 경우\nSingle type :       확장성 나쁨 / 조인 좋음 / io성능 나쁨 / 관리 좋음 / 전체를 일괄 처리하는 경우\n","db구조"),

             titleUrl("분산 db : db를 여러 지역, 여러 노드로 위치 => 사용성/성능 증가 \n-논리적으로 동일 시스템, 물리적으로 분산\n \n투명성\n-분할 투명성 : 하나의 논리적 관계가 분할되어 여러 지역에 저장\n-위치 투명성 : 데이터 위치 불필요\n-지역 사상 투명성 : dbms와 db의 mapping 보장, 지역 db의 이름과 무관해도 사용가능\n-중복 투명성 : 중복된 데이터가 분산되어 있는지 알 필요 x\n-장애 투명성 : 장애에 무관한 트랜잭션의 원자성 유지\n-병행 투명성 : 다수 트랜잭션의 일관성 유지\n \n \n장점 : 신뢰성 / 가용성 / 효용성 / 융통성 / 빠른 응답 / 통신 비용 절감 / 지역 사용자 요구 수용 / 자치성 / 점증적 확장\n단점 : 개발 비용 / 오류 잠재성 / 처리 비용 / 복잡성 / 불규칙한 응답 속도 / 통제의 어려움 / 데이터 무결성 위험\n \n분산 적용\n-테이블 분산 : 구조 안변함/ 다른 db에 같은 table 생성 안함 / 문서 작성 필요\n-테이블 분할 분산 \n---수평 분할 : 칼럼은 분리되지 않음 / pk중복 발생 안함\n---수직 분할 : 칼럼 기준 분리 / 동일 pk를 가짐/ pk중복은 발생하지 않음\n \n-테이블 복제 분산 : 데이터 중복 발생 / \n-테이블 요약 : 모든 칼럼과 로우를 가지지만, 요약정보를 가지게 된다\n \n \n","분산 db"),

             titleUrl("db : 데이터를 일정 형태로 저장\ndbms : 효율적 데이터 관리\n파일구조 -> 계층/망형 -> 관계형 -> 객체 관계형\n \nsql : 관계형 db를 위한 언어\n \ndml : select/insert/update/delete \nddl : create/alter/drop/rename\ndcl : grant/revoke 데이터 제어어\ntcl : commit/rollback/savepoint 트랜잭션 제어어\n \n테이블 : 데이터를 저장하는 객체\n \nchar ->   'aa'='aa  '     / varchar->   'aa'='aa  '\n \n제약조건 : primary key/ unique key / not null / check / foreign key\n \nddl   - autocommit\nalter table [tname]\n-add cname ctype;\n-drop column cname;\n-modify (cname ctype)\n-rename column cname to newcname\n-rename tname to newtname\n-drop constraint constname\n-add constraint constname(cname)\n \ndml - commit 필요(sql server는 자동)\n*,% : 모든     _ : 한글자\n \n \ntcl :\n-트랜잭션\n--원자성 : 연산들을 모두 성공/실패\n--일관성 : db내용은 일관적\n--고립성 : 다른 트랜잭션 방행 x\n--지속성 : 영구적 저장\n \nsavepoint svpt1\nrollback to svpt1\n \n","sql- 정의,종류 "),

             titleUrl("null과의 수치 연산은 항상 null\nnull과의 비교 연산은 항상 false\nrownum : 원하는 만큼의 행을 가져올때     :=top (sql server)\nselect top(1) from emp;\n \nlower / upper / ascii / chr=char / concat / substr=substring / length=len / trim\nsign / mod / ceil / floor  /round\n \nsysdate==getdate()\nnvl \nnullif(a,b)  : a와 b가 같으면 null , 다르면 1\ncoalesce(a,b,c,d)   -> a,b,c,d중 순서대로 가장 처음으로 null 이 아닌 값 출력\ncoalesce(null,null,c,null) => c\n \ncount(*) : null포함한 행의 개수\nsum,avg : null 제외 계산\nstddev : 표준 편차\nvarian : 분산\n \ngroup by : alias사용 불가 / where 에서 사용 불가 / having 사용\n \ncase when loc='a' then 'b'\n==> case when 'a' then 'b'\n \norder by : oracle은 null을 가장 큰 값으로 < - > sql server\n \n \n \n \n","sql - 내장 함수 "),

             titleUrl("집합 연산자\n-union : 합집합\n-union all :  중복 표시 합집합\n-intersect : 교집합\n-except, minus : 차집합\n-cross join : 곱집합\n \n \nequi join : 두 테이블간 값들이 서로 정확히 일치하는 경우\n보통은 다 nonequi인듯\n \n- inner join : join 조건의 동일 값이 있는 행만 반환, using이나 on 을 필수로 사용\n- natural join : 두 테이블간 동일 이름의 모든 칼럼에 대해 equi join 수행 => 이때 추가적인 join을 정의 할 수 없음\n- using : 같은 이름을 가진 칼럼 중 원하는 칼럼을 선택해 equi join 한다 / alias사용 불가\n- on : 칼럼 명이 달라도 join 가능하게, alias 가능\n- cross join : m:n데이터 조합 발생\n- outer join : join조건에서 동일한 값이 없는 행도 반환, using이나 on 필수\n- left outer join : 먼저 표기된 테이블 기준 우측 테이블 값이 없어도 null로 채워서 변환\n- right outer join : \n- full outer join : \n \n \n","sql - 집합,조인 "),

             titleUrl("계층형 질의 \n-start with : 계층 시작점 지정\n-connect by : 자식 데이터 지정\n-prior : 방향 전개\n-nocycle : 동일 데이터 전개 x\n-order siblings by : 형제 노드간 정렬\n-where : 모든 전개 이후 조건 적용\n \n-level : 레벨...\n-connect_by_isleaf : 해당 데이터가 leaf면 1 아니면 0\n-connecy_by_iscycle : cycle옵션 사용시 가능 / 해당 데이터가 조상이면 1 아니면 0\n-sys_connect_by_path  : 루트 부터 현 데이터까지의 경로\n-connect_by_root  : 루트 표시\n \n \n \n \n","sql - 계층형 질의 "),

             titleUrl("서브쿼리 : 괄호 사용 / 단일,복수 비교 연산자 사용 가능 / order by 불가 / \n \n비교 연산자\n= , < , > , <> , in , all , any , some\n \n스칼라 서브쿼리 : 한행, 한 칼럼만을 반환하는 서브쿼리\n \n인라인 뷰 : 테이블 명이 올수 있는 곳에 사용 => order by 가능\n \n \n뷰 : 가상 테이블 - 실제 데이터를 가지지 않음\n-독립성 : 테이블 구조 변셩 => 응용 프로그램 변경 x\n-편리성 : 복잡한 질의를 뷰로 생성\n-보안성 : 정보 숨김 가능\n \n \n","sql - 서브쿼리 / 비교 연산자 / 뷰 "),

             titleUrl("roll up : subtotal 제공 - group by와 사용\ngrouping : subtotal의 total\n \ncube : 결합 가능한 모든 값에 대해 집계 - 부하가 심함\ngrouping sets : 개별 집계 가능 / 다양한 집합 생성\n \n \n윈도우 함수\n-rank : 특정 항목에 순위 부여( 1,2,2,4,)\n-desnse_rank : (1,2,2,3,)\n-row_number : 동 순서에도 고유한 순위 부여 (1,2,3,4)\n-sum/max/min/avg/count/\n-first_value / last_value : 가장 먼저나온 값/ 나중에\n-lag : 이전 몇 번째 행의 값\n-lead : 이후 몇 번째 행의 값\n-ratio_to_report : 전체 sum에 대한 각 행의 비율 0~1\n-percent_rank : 순서를 백분위로 표현 0~1\n-cume_dist : 현재 행보다 작거나 같은 건수의 백분율 0~1\n-ntile : 전체 건수를 n등분한 결과\n \n \n","sql 내장 함수2 "),

             titleUrl("grant [create user to/ create session to / create table to ] hr;\nrevoke ~ from hr;\n \nrole : 권한을 한번에 부여하기 위함\ncreate role rolename;\ngrant ~ to rolename;\n \n","sql - dcl "),

             titleUrl("저장 모듈 : 독립적 실행 가능 / 다른 프로그램으로 부터 실행 가능\n \nplsql\n-block구조 -> 모듈화\n-절차적인 프로그래밍\n-에러 정의 가능\n-호환성 좋음\n-프로그램 성능 향상\n-통신량 감소\n \ndeclare \n변수 선언\nbegin\n로직\nexception\n에러 처리\n \n프로시저 vs 트리거\n-프로시저는 commit/rollback 사용 가능 <-> 트리거 불가\n \n","sql - plsql "),

             titleUrl("옵티마이저 : sql에 대해 최적 실행 방법 결정\n-규칙 기반 옵티마이저 : 우선 순위를 가짐 / \n-비용 기반 옵티마이저 : 많이 사용 / 비용 적은것 먼저 실행 / 비용=예상 시간,자원 사용량 / \n \n실행 계획 : sql처리의 절차와 방법 : 조인 순서,엑세스 기법, 최적화 정보 등\n \n인덱스 : 검색 성능 최적화 목적 / 목적과 달리 느려질 수 있음\n \n전체 테이블 스캔 : \n-sql문에 조건이 존재하지 않는 경우\n-sql 조건에 인덱스가 존재하지 않는 경우\n-병렬처리 방식으로 처리하는 경우\n-옵티마이저의 취사 선택\n \n인덱스 스캔 : 인덱스를 기반으로 데이터 추출\n인덱스 유일 스캔 : 유일 인덱스를 사용하여 단 하나의 데이터 추출 \n인덱스 범위 스캔 : 인덱스를 이용해 한건 이상의 데이터 추출\n인덱스 역순 범위 스캔 : 내림차순\n \nNL join : 중첩된 조인, 랜덤 액세스 방식으로 데이터 접근\nsort merge join : 조인할 칼럼 기준으로 정렬 후 조인\nhash join : cpu작업으로 처리 / 랜던 액세스와 정렬 부담을 해결\n","옵티마이저 / 인덱스 / 조인 "),



             )

     }

 }