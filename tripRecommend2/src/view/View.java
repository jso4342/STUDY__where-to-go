package view;

import java.util.Scanner;

import dao.DAO;
public class View {
      public static void main(String[] args) {    	
         DAO dao = new DAO();
         
         // 질문 및 답변 문구는 꼭 드라이브에 있는 사진 보고 참고해주세요! 
         //"질문내용\n1)답변1\n2)답변2\n3)답변3\n"
         String themeQ = "다음 중 어디가 제일 좋아?\n1)자연\n2)바다\n3)도시\n";
           // 자연 
            String natureFQ1 = "'자연'하면 떠오르는 곳은?\n\n1)웅장한 협곡\n2)밤 하늘 아름다운 오로라\n3)나무가 울창한 산\n";
            // 자연 - 협곡 
            String natureFQ2 = "여행 중 '이곳은 위험하니 더이상 다가가지 마세요!' 라는 가이드의 말을 들었다. 나의 반응은?\n\n1)여행은 안전이 최고야. 가이드 분의 말을 새겨들어야지\n2)난 저 안에 뭐가 있을지 궁금해 미치겠어! 한눈 팔 때 몰래 들어가봐야지\n";
            String natureFQ2_1 = "길을 걷다 우연히 별똥별을 보았을 때, 나는?\n\n1)친구에게 전화해서 별똥별에 대한 이야기를 1시간동안 나눈다\n2)곰곰이 생각해보다가 혼자 소원을 빈다\n";
            String natureFQ2_2 = "나의 식습관에 맞는 음식은?\n\n1)고기 왕창 타코\n2)건강가득 그릭 샐러드\n";
            // 자연 - 오로라 
            String natureFQ3 = "여행을 갔을 때 잠은 어디서 자고싶어?\n\n1)오로라 보기도 힘든데 잠이라도 편하게 잘래...\n2)오로라 보면서 당연히 캠핑도 해야지!\n";
            String natureFQ3_1 = "인생샷 찍을 때 배경은 어땠으면 좋겠어?\n\n1)난 무조건 새롭고 특이했으면 좋겠어!\n2)먼곳까지 왔는데 돈 쓴 느낌 내고싶어!\n";
            String natureFQ3_2 = "인생은... 뭐라고 생각해?\n\n1)인생은 작품...이다!\n2)인생은 자연과도 같은 것이지...\n";
            // 지연 - 산
            String natureFQ4 = "여행하면서 하는 하이킹은 어때?\n\n1)하이킹..? 그거 너무 힘든 거 아니야? 보는 것 만으로 만족이야!\n2)산이 있는 곳이 왔으면 올라가봐야지! 당장 등산 갈겨\n";
            String natureFQ4_1 = "빵 하면 역시 몽블랑이지~!!\n\n1)ㅇㅈ\n2)몽블랑은 브랜드 아닌가?\n";
            String natureFQ4_2 = "여행에서 조심해야할 게 있다면? 개조심이다\n\n1)개조심 중요하지\n2)???\n";

         
         // 바다
         String seaFQ1 ="사랑하는 사람과 함께 한다면?\n \n1)석양이 보고싶어\n2)크루즈 여행을 하고 싶어\n3)레저 스포츠를 하고 싶어";
         //바다 - 석양
         String seaFQ2 ="나는 바다를?\n \n1)보는 걸 좋아하는 편이야...\n2)들어가는 걸 좋아하는 편이야...";
         String seaFQ2_1 ="저녁을 보낼 장소를 고른다면?\n\n1)화려한 곳에서 춤추고 싶어...\n2)조용한 곳에서 커피 한잔";
         String seaFQ2_2 ="이번에 여행을 떠난다면 나는?\n\n1)가까운데 가자!\n2)멀리멀리가자~!";
         //바다 - 크루즈 여행
         String seaFQ3="이번에 여행을 떠난다면 나는 ? \n\n1)가까운데 가자 ! \n2)멀리멀리 가자 !";
         String seaFQ3_1="둘 중에 더 하고싶은 것은? \n\n1)운하에서 곤돌라 타기 \n2)다이빙하기";
         String seaFQ3_2="말이 안통하는 외국인을 만났다 ! 그럴 때 나는 ? \n\n1)나에겐 파파고가 있다 ! \n2)아임쏘리..(자리를 피한다.)";
         //바다 - 레저 스포츠
         String seaFQ4="음식점을 간다면 ? \n\n1)무조건 후기가 많은 곳으로 ! \n2)나만의 맛집을 찾겠어!";
         String seaFQ4_1="완전 바빴던 하루! 휴식 타임동안 나는 뭘 할까 ? \n\n1)바다를 보며 태닝할래 \n2)스파랑 마사지 받을래";
         String seaFQ4_2="사람이 많은 곳에서 나는 \n\n1)인생은 마이웨이. 혼자가 편하다 \n2)오히려 좋아. 다 내 친구들 !";
         
         
         // 도시 
         String cityFQ1 = "여행을 갈 때 나는 어떤 편인가요?\n\n1)카지노는 못참지 ㅋㅋ \n2)이 날을 위해 열심히 일했다. FLEX하러 가자 \n3)이 나라는 어떤 역사가 있을지 궁금해";
         //도시 - 카지노
         String cityFQ2="카지노에서 나는 ? \n\n1)인생은 한방! ALL-IN \n2)경험삼아 찍먹..";
         String cityFQ2_1="저녁을 보낼 특별한 장소를 고른다면 ? \n\n1)화려한 곳에서 춤추고 싶어! \n2)조용한 곳에서 커피한잔..";
         String cityFQ2_2="후식으로 먹고싶은 것은? \n\n1)에그타르트 \n2)카야토스트";
         
         //도시 - 쇼핑
         String cityFQ3="내 쇼핑 취향은 ? \n\n1)쇼핑은 명품이지 \n2)면세점 가려고 온거 아니야?";
         String cityFQ3_1="디즈니랜드를 갈 수 있게 된다면? \n\n1)동심을 느끼러 가보자고 ! \n2)난..놀이공원은 패스..체력이 딸려..";
         String cityFQ3_2="오늘 저녁 메뉴는? \n\n1)라멘 \n2)햄버거";
         //도시 - 역사
         String cityFQ4="박물관이 좋아? 궁전이 좋아? \n\n1)역사를 한 곳에서 알아볼 수 있는 박물관 \n2)직접 건축물을 볼 수 있는 궁전 ";
         String cityFQ4_1="둘 중에 뭐가 더 하고싶어? \n\n1)야경을 보며 맥주 한잔 \n2)동화같은 곳에서 오렌지 주스 한잔 ";
         String cityFQ4_2="둘 중에 어떤 영화 볼래 ? \n\n1)셜록홈즈 \n2)스파이더 맨";
         
         String choiceService = "\n🌴 해당 여행지의 정보를 조회하시겠습니까? \n1)최저가 항공 조회하기\n2)패키지 여행 추천받기\n3)추천 여행지 코로나 관련 지침 확인하기\n4)다른 여행지 추천받기";

         
           Scanner sc = new Scanner(System.in);
            int mainChoice = 0;
            int choice = 0;
            System.out.println("\n---------------------선택해 주세요---------------------\n\n 1.해외여행지 추천받기 \n 2.국내여행(당일치기) 조회하기");
            mainChoice=sc.nextInt();
            if(mainChoice==1) {System.out.println(themeQ);
           
            try {
               choice = sc.nextInt();
               switch(choice) {
               case 1: // 자연
                  System.out.println(natureFQ1);
                  choice = sc.nextInt();
                  switch(choice) {
                  case 1: // 협곡 
                     System.out.println(natureFQ2);
                     choice = sc.nextInt();
                     switch(choice) {							///
                     case 1: 
                        System.out.println(natureFQ2_1);
                        choice = sc.nextInt();
                        
                        switch(choice) {
                        case 1: // 그레이트 캐니언 (미국)공항코드 : lax //
                           // 여행지 추천 문구 출력
                           System.out.println(dao.getDbData("그랜드캐년"));  
                           while(true) {
	                           System.out.println(choiceService);
	                           choice = sc.nextInt();
	                           dao.extraService(choice, "그랜드캐년");
	                           if (choice == 4) {// 처음으로 돌아가기
	                        	   main(args) ;           
	                        	   break;      
	                               }
                           }
                           break;
                        case 2: //구리 협곡 (멕시코)공항코드 : CUU //
                           System.out.println(dao.getDbData("구리협곡"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "구리협곡");
                              if (choice == 4) {// 처음으로 돌아가기
                           	   main(args) ;           
                           	   break;      
                                  }
                           }
                        }
                      
                        break; 
                     case 2:
                        System.out.println(natureFQ2_2);
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: // 수미데로협곡 (멕시코) 
                           System.out.println(dao.getDbData("수미데로협곡"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "수미데로협곡");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                           break;
                        case 2: //비코스협곡 (그리스) 공항코드 : JTR
                           System.out.println(dao.getDbData("비코스 협곡"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "비코스 협곡");

                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                        }
                        break;
                        
                        }							
                    
                     
                     break;
                  case 2: // 오로라
                     System.out.println(natureFQ3);
                     choice = sc.nextInt();
                     switch(choice) {
                     case 1: 
                        System.out.println(natureFQ3_1);
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: // 라플란드 (핀란드) 공항코드 :RVN
                           System.out.println(dao.getDbData("라플란드"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "라플란드");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                         break;
                        case 2: //유카스야르비 (스웨덴) 공항코드 :KRN
                           System.out.println(dao.getDbData("유카스야르비"));   
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "유카스야르비");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                        }
                           break;
                      
                     case 2:
                        System.out.println(natureFQ3_2);
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: // 레이캬비크(아이슬랜드) 공항코드 : KEF
                           System.out.println(dao.getDbData("레이캬비크"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "레이캬비크");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                           break;
                        case 2: //스발바르제도 (노르웨이) 공항코드 : OSL
                           System.out.println(dao.getDbData("스발바르제도"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "스발바르제도");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                           break;
                        }
                        break;
                     }
                     break;
                  case 3: // 산 
                      System.out.println(natureFQ4);
                      choice = sc.nextInt();
                      switch(choice) {
                      case 1: // 
                         System.out.println(natureFQ4_1);
                         choice = sc.nextInt();
                         switch(choice) {
                         case 1: // 몽블랑 (프랑스) 공항코드 : GVA
                            System.out.println(dao.getDbData("몽블랑"));
                            while(true) {
                            System.out.println(choiceService);
                              choice = sc.nextInt();
                              dao.extraService(choice, "몽블랑");
                              if (choice == 4) {// 처음으로 돌아가기
                           	   main(args) ;           
                           	   break;      
                                  }
                            }
                            break;
                        case 2: //시비노우이시치에 (폴란드) 공항코드 : SZZ
                           System.out.println(dao.getDbData("시비노우이시치에"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "시비노우이시치에");
                               
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                         }
                           break;
                      
                     case 2:
                        System.out.println(natureFQ4_2);
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: // 조드푸르 (인도)  공항코드: JDH
                           System.out.println(dao.getDbData("조드푸르"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "조드푸르");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                           break;
                        case 2: //에베레스트 (네팔) 공항코드:LUA
                           System.out.println(dao.getDbData("에베레스트"));
                           while(true) {
                          System.out.println(choiceService);
                                 
                             choice = sc.nextInt();
                             dao.extraService(choice, "에베레스트");
                             if (choice == 4) {// 처음으로 돌아가기
                          	   main(args) ;           
                          	   break;      
                                 }
                           }
                           break;
                        }
                        break;
                     }
                     break;
                  }
                  break;
               case 2:
//                  -----------------------------------------------------------------------------------------------------------------------------------------------------
                  ///// 바다  switch(choice) {
                     System.out.println(seaFQ1);         //사랑하는 사람과 함께 한다면 ?
                     choice = sc.nextInt();
                     switch(choice) {
                     case 1: // 석양이 보고싶어
                        System.out.println(seaFQ2);      //나는 바다를
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1:    //보는걸 좋아하는 편 
                           System.out.println(seaFQ2_1);   //저녁을 보낼 장소를 고른다면?
                           choice = sc.nextInt();
                           
                        
                           switch(choice) {
                           case 1: // 하바나 (쿠바) 공항번호 : HAV
                              // -------------------------------------
                              System.out.println(dao.getDbData("하바나"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "하바나");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //산토리니 그리스  공항번호: JTR
                              System.out.println(dao.getDbData("산토리니"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "산토리니");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2:   //들어가는 걸 좋아하는 편 
                           System.out.println(seaFQ2_2);   //이번에 여행을 떠난다면 나는 
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 코타키나 발루(말레이시아) 공항번호: BKI
                              System.out.println(dao.getDbData("코타키나발루"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "코타키나발루");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //몰디브 공항번호: MLE
                              System.out.println(dao.getDbData("몰디브"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "몰디브");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     case 2: //크루즈 여행을 하고 싶어
                        System.out.println(seaFQ3);   //이번에 여행을 떠난다면 나는 
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1:    //가까운데 가자
                           System.out.println(seaFQ3_1);   //둘 중에 더 하고 싶은 것은?
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 베네치아(이탈리아) 공항번호: VCE
                              System.out.println(dao.getDbData("베네치아"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "베네치아");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //몰타  공항번호 : MLA
                              System.out.println(dao.getDbData("몰타"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "몰타");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2:   //멀리멀리가자 
                           System.out.println(seaFQ3_2);   //말이 안통하는 사람을 만났어 그럴때 나는? 
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 홍콩 공항번호: HKG
                              System.out.println(dao.getDbData("홍콩"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "홍콩");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //다낭(베트남) 공항번호 : DAD
                              System.out.println(dao.getDbData("다낭"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "다낭");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     case 3: // 레저 스포츠
                        System.out.println(seaFQ4);   //음식점을 간다면 
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: //무조건 후기가 많은 곳으로 
                           System.out.println(seaFQ4_1);   //완전 바빴던 하루 휴식타임 동안 나는?
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 하와이 공항번호: HNL
                              System.out.println(dao.getDbData("하와이"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "하와이");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //보라카이(필리핀) 공항번호: KLO
                              System.out.println(dao.getDbData("보라카이"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "보라카이");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2://나만의 맛집을 찾겠어 
                           System.out.println(seaFQ4_2);   //사람이 많은 곳에서 나는 
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 팔라우 공항번호: ROR
                              System.out.println(dao.getDbData("팔라우"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "팔라우");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //누사(호주) 공항번호: MCY
                              System.out.println(dao.getDbData("누사"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "누사");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     }
                     break;
               
               case 3:
//                  ----------------------------------------------------------------------------------------------------------------------------
                  //// 도시 
                     System.out.println(cityFQ1);         //여행을 갈 때 나는 어떤 편?
                     choice = sc.nextInt();
                     switch(choice) {
                     case 1: // 카지노
                        System.out.println(cityFQ2);      //카지노에서 나는 
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1:    //인생은 한방 
                           System.out.println(cityFQ2_1);   //저녁을 보낼 장소를 고른다면?
                           choice = sc.nextInt();
                           
                        
                           switch(choice) {
                           case 1: // 라스베가스(미국) 공항번호: LAS
                              System.out.println(dao.getDbData("라스베가스"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "라스베가스");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //몬테카를로(모나코) 공항번호: NCE
                              System.out.println(dao.getDbData("몬테카를로"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "몬테카를로");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2:   //경험삼아 찍먹
                           System.out.println(cityFQ2_2);   //후식으로 먹고싶은 것은
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 마카오(중국) 공항번호 : MFM
                              System.out.println(dao.getDbData("마카오"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "마카오");
                                 if (choice == 4) {// 처음으로 돌아가기
                              	   main(args) ;           
                              	   break;      
                                     }
                              }
                              break;
                           case 2: //싱가포르 공항번호: SIN
                              System.out.println(dao.getDbData("싱가포르"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "싱가포르");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     case 2: //쇼핑(FLEX)
                        System.out.println(cityFQ3);   //내 쇼핑 취향은?
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1:    //쇼핑은 명품이지
                           System.out.println(cityFQ3_1);   //디즈니랜드 가고싶어? 
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 파리(프랑스) 공항번호: CDG
                              System.out.println(dao.getDbData("파리"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "파리");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //밀라노(이탈리아) 공항번호: MXP
                              System.out.println(dao.getDbData("밀라노"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "밀라노");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2:   //면세점 가려고 온거 아니였어? 
                           System.out.println(cityFQ3_2);   //오늘 저녁 메뉴는?
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 오사카(일본) 공항번호: KIX
                              System.out.println(dao.getDbData("오사카"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "오사카");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //뉴욕(미국) 공항번호: JFK
                              System.out.println(dao.getDbData("뉴욕"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "뉴욕");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     case 3: // 역사 
                        System.out.println(cityFQ4);   //박물관이 좋아 궁전이 좋아? 
                        choice = sc.nextInt();
                        switch(choice) {
                        case 1: //역사를 한 곳에서 알아볼 수 있는 박물관 
                           System.out.println(cityFQ4_1);   //둘 중에 뭐가 더 하고싶어? 
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 프라하(체코) 공항번호: PRG
                              System.out.println(dao.getDbData("프라하"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "프라하");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //마라케시(모로코) 공항번호: RAK
                              System.out.println(dao.getDbData("마라케시"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "마라케시");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        case 2://직접 건축물을 볼 수 있는 궁전 
                           System.out.println(cityFQ4_2);   //둘 중에 어떤 영화 볼래??
                           choice = sc.nextInt();
                           switch(choice) {
                           case 1: // 런던(영국) 공항번호: LHR
                              System.out.println(dao.getDbData("런던"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "런던");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           case 2: //워싱턴DC(미국) 공항번호: IAD
                              System.out.println(dao.getDbData("워싱턴DC"));
                              while(true) {
                             System.out.println(choiceService);
                                    
                                choice = sc.nextInt();
                                dao.extraService(choice, "워싱턴DC");
                                if (choice == 4) {// 처음으로 돌아가기
                             	   main(args) ;           
                             	   break;      
                                    }
                              }
                              break;
                           }
                           break;
                        }
                        break;
                     }
                     break;
               }
            
            } catch (Exception e) { // 정수 아닌 값 입력 했을 때 try - catch 문으로 오류 잡아주세요 
               System.out.println("오류");
               e.printStackTrace();
            }
            }
            if(mainChoice==2) {
            	System.out.println("\n-----------------여행하고싶은 국내여행지를 선택해주세요-----------------\n");
            	 //1=서울/인천/경기
                //2=강원
                //3=충청
                //4=전라
                //5=경상
                //6=제주
            	System.out.println("1번.서울/인천/경기 \t2번.강원 \t3번.충청 \t4번.전라 \t5번.경상 \t6.제주 \n");
            	 choice=sc.nextInt();
            	 
            	dao.koreaPackage(choice);
             
            }
      }
 }
      
   
