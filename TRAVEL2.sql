
CREATE TABLE TRAVEL(
   DESTINATION VARCHAR2(1000) PRIMARY KEY,
   NATION VARCHAR2(1000),
   FESTIVAL VARCHAR2(1000),
   FOOD VARCHAR2(1000),
   ACTIVITY VARCHAR2(1000)
);




SELECT* FROM travel;


/*nation2 컬럼 추가*/
ALTER TABLE Travel add(NATION2 varchar2(1000));

/*nation2 컬럼에 입력하기*/
update TRAVEL SET NATION2 ='미국' WHERE DESTINATION = '그랜드캐년';
update TRAVEL SET NATION2 ='멕시코' WHERE DESTINATION = '구리협곡';
update TRAVEL SET NATION2 ='멕시코' WHERE DESTINATION = '수미데로협곡';
update TRAVEL SET NATION2 ='그리스' WHERE DESTINATION = '비코스 협곡';
update TRAVEL SET NATION2 ='핀란드' WHERE DESTINATION = '라플란드';
update TRAVEL SET NATION2 ='스웨덴' WHERE DESTINATION = '유카스야르비';
update TRAVEL SET NATION2 ='아이슬란드' WHERE DESTINATION = '레이캬비크';
update TRAVEL SET NATION2 ='노르웨이' WHERE DESTINATION = '스발바르제도';
update TRAVEL SET NATION2 ='프랑스' WHERE DESTINATION = '몽블랑';
update TRAVEL SET NATION2 ='네팔' WHERE DESTINATION = '에베레스트';
update TRAVEL SET NATION2 ='인도' WHERE DESTINATION = '조드푸르';
update TRAVEL SET NATION2 ='폴란드' WHERE DESTINATION = '시비노우이시치에';
update TRAVEL SET NATION2 ='쿠바' WHERE DESTINATION = '하바나';
update TRAVEL SET NATION2 ='그리스' WHERE DESTINATION = '산토리니';
update TRAVEL SET NATION2 ='말레이시아' WHERE DESTINATION = '코타키나발루';
update TRAVEL SET NATION2 ='몰디브' WHERE DESTINATION = '몰디브';
update TRAVEL SET NATION2 ='이탈리아' WHERE DESTINATION = '베네치아';
update TRAVEL SET NATION2 ='몰타' WHERE DESTINATION = '몰타';
update TRAVEL SET NATION2 ='홍콩' WHERE DESTINATION = '홍콩';
update TRAVEL SET NATION2 ='미국' WHERE DESTINATION = '하와이';
update TRAVEL SET NATION2 ='필리핀' WHERE DESTINATION = '보라카이';
update TRAVEL SET NATION2 ='팔라우' WHERE DESTINATION = '팔라우';
update TRAVEL SET NATION2 ='호주' WHERE DESTINATION = '누사';
update TRAVEL SET NATION2 ='미국' WHERE DESTINATION = '라스베가스';
update TRAVEL SET NATION2 ='모나코' WHERE DESTINATION = '몬테카를로';
update TRAVEL SET NATION2 ='마카오' WHERE DESTINATION = '마카오';
update TRAVEL SET NATION2 ='싱가포르' WHERE DESTINATION = '싱가포르';
update TRAVEL SET NATION2 ='모로코' WHERE DESTINATION = '마라케시';
update TRAVEL SET NATION2 ='이탈리아' WHERE DESTINATION = '밀라노';
update TRAVEL SET NATION2 ='일본' WHERE DESTINATION = '오사카';
update TRAVEL SET NATION2 ='체코' WHERE DESTINATION = '프라하';
update TRAVEL SET NATION2 ='프랑스' WHERE DESTINATION = '파리';
update TRAVEL SET NATION2 ='영국' WHERE DESTINATION = '런던';
update TRAVEL SET NATION2 ='미국' WHERE DESTINATION = '워싱턴DC';
update TRAVEL SET NATION2 ='베트남' WHERE DESTINATION = '다낭';
update TRAVEL SET NATION2 ='홍콩' WHERE DESTINATION = '홍콩';
update TRAVEL SET NATION2 ='미국' WHERE DESTINATION = '뉴욕';


/*자료 입력*/
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('그랜드캐년', '미국', '(매년 11월 초)피닉스 로컬 퍼스트 애리조나 가을 축제', '인앤아웃 버거 ', '그랜드 캐니언 웨스트림 헬리콥터 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('구리협곡', '멕시코', '(매년 5월 15일)San Isidro Labrador의 2 일 ', '마카카 -(전통적으로 말린 고기, 보통 양념 된 쇠고기 또는 돼지 고기)', '2.3km인 남미에서 제일 긴 짚라인 코스');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('수미데로협곡', '멕시코', '(매년 10월31일~ 12월2일)망자의 날 축제', '부리토 ', '수미데로 협곡 보트 체험');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('비코스 협곡', '그리스', '(매년 4월 중순) 디오니소스 축제', '수블라키 (유명한 그리스의 패스트 푸드)', '비코스 협곡이 세계에서 가장 깊은 협곡인데...이 자체가 이색체험이다...');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('라플란드', '핀란드', '(매년 12월)산타마을 축제', '칼라쿠코(생선과 고기로 속을 채운 핀란드식 빵으로 국민음식)', '순록 사파리, 허스키 썰매');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('유카스야르비', '스웨덴', '(매년 4월30일)발푸르기스 전야제', '그라브락스(전통적으로 즐겨먹는 대표적인 연어로 만든 음식)', '개 썰매, 순록 썰매, 스노모빌 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('레이캬비크', '아이슬란드', '(매년 6월 초)바이킹 페스티벌', '스비드 (양머리 삶은 음식)', '아이슬란드의 여러 풍경을 볼 수 있는 요쿨살론 & 남부 해안 일일 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('스발바르제도', '노르웨이 ', '(매년 1월 말~ 2월 초) 트롬쇠 오로라 축제', '그라브락스(설탕과 소금 허브의 일종인 딜에 생선(연어)를 하루이틀 절여서 만든 요리)', '사우나체험');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('몽블랑', '프랑스', '(매년 2월)니스 카니발', '에스카르고(달팽이요리) or 몽블랑', '350km에 걸친 트래킹코스를 따라 걷는 샤모니 몽블랑 트래킹');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('에베레스트', '네팔', '(매년 9월~ 10월)더싸인축제', '탄두리 치킨 (향신료를 넣고 요구르트에 재운닭)', '패러호킹');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('조드푸르', '인도', '(매년 3월2일)홀리페스티벌', '비리야니(쌀이 주된 재료이고, 여기에 향신료, 고기, 계란, 채소, 말린 과일 등을 넣어 볶은요리)', '코끼리 트래킹 ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('시비노우이시치에', '폴란드', '(매년 6월 중순~말)노츠쿠파위(풍등축제)', '피에로기 (속에 양파와 치즈와 감자를 채운 폴란드의 대표적인 폴란드 음식)', '소금광산 투어 ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('하바나', '쿠바', '(매년 8월) 혁명보다 오래된 역사를 자랑하는 카르나발 축제', '소고기와 밥에 튀긴 바나나를 곁들인 로파비에하', '하바나의 낭만적인 분위기와 클래식한 올드카로 도시를 돌아다니는 아바나 올드카 투어 ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('산토리니', '그리스', '(매년 6월~ 8월) 두 달에 걸쳐서 개최되는 아크로폴리스와 아테네의 헤로데스 아티쿠스 야외 음악당을 무대로 펼쳐지는 헬레니스 축제', '또띠아 빵 속에 각종 야채와 고기를 싸먹는 그리스의 대표 요리 삐따 브래드', '아직도 화산활동을 계속하고 있는 활화산과 그 주위를 걷고 구경할 수 있는 산토리니 크루즈 체험');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('코타키나발루', '말레이시아', '(매년 5월) 각 지역의 전통을 종합적으로 만나볼 수 있는 사바 페스티벌', '코코넛 밀크로 지은 밥과 달걀 삼발 소스 등을 곁들여 먹는 나시르막', '하늘을 나는 기분을 느낄 수 있는 사피섬 짚라인');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('몰디브', '몰디브', '(매년 7월) 몰디브 최대의 축제 몰디브 독립기념일', '일명 봉투 로 불리는 반죽에 각종 속재료를 가득 채운 비스 키 미야', '바다 낚시 체험을 할 수 있는 선셋 낚시');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('베네치아', '이탈리아', '(매년 1월~ 2월) 화려한 가면과 옷을 차려 입고 베네치아 곳곳을 누비며 광장을 가득 메우는 베네치아 가면 축제', '몬타지오 치즈와 빵을 프라이팬에 바삭하게 구운 프리코', '보트를 렌탈해서 실제 현지인처럼 베네치아 라군을 누비는 클래식 베니스 보트');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('몰타', '몰타', '(매년 2월 4일~ 5일) 몰타의 색깔을 가장 잘 느낄 수 있는 몰타의 카니발 페스티벌', '지역 전통 식재료인 토끼고기와 각종 식재료를 오래 졸여 만든 페넥', '몰타에서 가장 유명한 자연 경관으로 꼽히는 아즈라 윈도우를 볼 수 있는 고조섬 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('홍콩', '홍콩', '(매년 2월(음력1월)) 화려하고 다양한 연등 행렬을 곳곳에서 볼 수 있는 연등 축제', '돼지뼈 국물을 베이스로 매콤하고 걸쭉하게 즐길 수 있는 운남 쌀국수', '홍콩섬을 둘러싼 잔잔한 바다를 감상하며 프라이빗한 파티를 즐길 수 있는 홍콩 보트 트립');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('다낭', '베트남', '(매년 4월 말 ~ 6월) 아시아 최대의 불꽃 축제인 다낭 세계 불꽃축제', '쌀국수 또는 쌀국수와 숯불에 구운 돼지고기를 같이 곁드린 분짜', '크루즈 위에서 다낭의 멋진 경치와 함께 무제한 맥주를 즐겨볼 수 있는 다낭 한강 유람선 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('하와이', '하와이', '(매년 2월) 쥬얼리, 목공예, 도자, 퀼트 등 알로하 예술 세계를 살펴보기 좋은 와이키키 아트 페스트', '하와이 스타일 햄버그 스테이크라고 불리는 로코모코', '서퍼들의 천국 하와이에서 즐기는 서핑');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('보라카이', '필리핀', '(매년 4월) 여러 팀이 참가하여 대형 보트로 레이싱 대회를 펼치는 드래곤 보트 축제', '보라카이의 싱싱한 해산물을 가득 담은 빠에야', '숨을 쉴 수 있는 헬멧을 착용하고 바다 속을 거니는 보라카이 씨워터 ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('팔라우', '팔라우', '(매년 6월) 스쿠버 다이빙과 바다 속 풍경을 사진으로 담는 팔라우 다이빙 축제', '비주얼로 압도하는 맹그로브 크랩', '여러 아마추어 다이버들과 함께 하는 스쿠버 다이빙');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('누사', '호주', '(매년 8월) 인도네시아 전통예술에서부터 현대 팝에 이르기까지 다양한 장르로 구성되어있는 누사 두아 축제', '각종 고기를 속재료로 넣은 미트파이', '아드레날린이 폭발하는 수상스포츠체험');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('라스베가스', '미국', '(매년 5월 말) 일렉트로닉 음악 축제 EDC', '햄버거, 베이커리, 샌드위치, 스테이크', '라스베가스의 쇼 중 가장 인기가 많은 수중쇼인  르레브쇼');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('몬테카를로', '모나코', '(매년 5월 중순) 그랑 프리 자동차 경주대회', '밀가루 반죽에 근대, 시금치, 양파, 리코타, 파마산 치즈 등을 넣고 기름에 튀긴 바르바쥐앙', '1천여 종의 희귀 식물과 선인장, 지하 동굴까지 볼 수 있는 모나코 열대 정원');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('마카오', '중국', '(매년 12월) 마카오 라이트 페스티벌', '부드러운 돼지고기를 바삭하게 구워진 빵 사이에 넣은 주빠빠오', '마카오의 카지노');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('싱가포르', '싱가포르', '(매년 1월말) 춘절 축제를 기념하는 행렬로 시작된 퍼레이드로, 타이완 곡예사부터 살사 댄서까지 모두 등장하는 국제적인 행사인 칭게이 퍼레이드', '고소한 코코넛밀크로 만든 국물에 쌀국수, 새우, 달걀, 어묵, 숙주를 넣어 만든 국수 요리인 커리 그래비', '아시아 최대 규모의 관람차인 싱가포르 플라이어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('마라케시', '모로코', '(매년 9월) 오아시스 축제', '밑에는 소고기나 양고기 또는 닭고기를 놓고 그 위에 감자, 당근, 호박, 완두 등을 얹고 원뿔 모양의 뚜껑을 덮어서 오랫동안 익힌 음식인 타진', 'Hop-on_Hop-off 시티 투어 버스');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('밀라노', '이탈리아', '(매년 4월 말) 밀라노 디자인 위크', '소 정강이를 뼈째로 고아 소뼈의 깊은 맛을 우려 낸 요리 오쏘부꼬, 최고급 향신료인 샤프란과 버터, 치즈를 곁들인 밀라노식 리조또, 뼈째 자른 소고기를 얇게 빵가루를 묻혀 미디엄으로 익히는 소고기 커틀렛', '세라발레 디자이너 아울렛 쇼핑 체험');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('오사카', '일본', '(매년 7월 말) 가마 행렬이나 후나토쿄에서 신령을 태운 배를 띄우는 모습이 장관인 텐진 마츠리', '타코야끼, 고기나 채소를 꼬치에 끼우고 튀김옷을 입혀 기름에 튀긴 꼬치튀김인 쿠시카츠, 양배추, 계란, 고기나 오징어를 섞어 평평하게 굽는 오사카식 오코노미야끼', '유니버셜 스튜디오 패스, 레고랜드 디스커버리 센터');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('뉴욕', '미국', '(매년 7월 4일) 독립기념일에 열리는 불꽃놀이', '베이글, 치즈케이크, 뉴욕풍피자, 팔라펠,케밥 등', '뉴욕 현대미술관, 엣지 전망대, 엠파이어 스테이트 빌딩 등 핫플레이스를 편리하게 방문할 수 있는 뉴욕 익스플로러 패스- GO 카드');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('프라하', '체코', '(매년 5월) 체코의 다양한 흑맥주를 맛볼 수 있는 맥주 축제', '돼지고기의 무릎의 한 부분을 통째로 구워만든 꼴레뇨', '하늘에서 지상으로 낙하하는 짜릿한 스카이다이빙');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('파리', '프랑스', '(매년 2월~ 3월) 화려한 복장으로 꾸민 사람들이 길거리를 행진하는 카니발 축제', '식용 달팽이로 만든 에스까르고와 버터향이 가득하고 바삭바삭한 크루아상', '다양한 브랜드들을 만날 수 있는 르봉 마르셰, 라파예트 백화점에서 쇼핑하거나, 루브르 박물관, 오르세 박물관, 오랑주리 박물관 등 세계적인 미술관 투어');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('런던', '영국', '(매년 1월 1일)세계에서 가장 큰 규모의 새해 행진인 새해맞이 퍼레이드', '썬 감자와 생선에 튀김옷을 입혀 튀겨 만든 피시앤칩스', '해리포터 팬들을 위한 런던 해리포터 스튜디오 방문 또는 런던의 대표적인 랜드마크인 런던아이 탑승');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('워싱턴DC', '미국', '(매년 3월 중순~ 4월 중순) 봄을 수놓는 벚꽃의 향연, 워싱턴 DC 벚꽃 축제', '햄버거, 치킨, 핫도그, 도넛 등 다양한 패스트푸드', '국립 자연사 박물관,  미국 역사 박물관 등 세계적인 박물관 관람');

/*홍콩 지우기*/
DELETE FROM TRAVEL WHERE NATION ='홍콩';


