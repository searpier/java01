import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //프로그램 시작
        //1. 이름 등록

        ArrayList<String> nameList = new ArrayList<>(); //이름등록부

        Scanner scName=new Scanner(System.in);//입력받을 스캐너 객체 (이름)
        Scanner scMenu=new Scanner(System.in);//입력받을 스캐너 객체 (메뉴)

        String name;//문자열 변수
        int choice;// 메뉴 입력 변수
        boolean flag=true; //프로그램 동작 여부


        while(flag){

            System.out.println("=============");
            System.out.println("1.입력");
            System.out.println("2.출력");
            System.out.println("3.삭제");
            System.out.println("4.종료");
            System.out.println("=============");
            System.out.println("메뉴 입력 :");
            choice= scMenu.nextInt();

            switch(choice){

                case 1: //입력
                    System.out.println("등록할 이름을 입력 : ");
                    name=scName.nextLine();

                    nameList.add(name);

                    break;
                case 2: //출력

                    for(int i=0; i< nameList.size(); i++){

                        System.out.print(i);
                        System.out.println(". "+nameList.get(i));

                    }

                    break;
                    case 3:

                        System.out.println("삭제할 이름을 입력 : ");
                        name=scName.nextLine();

                        for(int i=0; i< nameList.size(); i++){

                            if(name.equals(nameList.get(i))){//같은 문자열이 있을경우
                                nameList.remove(i);
                            }

                        }

                        System.out.println("삭제완료!");

                    break;
                case 4: //종료
                    flag=false;
                    System.out.println("******프로그램 종료");
                    break;

            }

        }

    }

}