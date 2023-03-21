package creditcardtest;

import java.util.Scanner;
class CreditCard01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double []card = new double[12];
		double total=0, avg;
		for(int i=0; i<card.length; i++){
			System.out.print( (i+1) + "월 사용금액==>" );
			card[i] = sc.nextDouble();
			total += card[i];
		}
		avg = total / card.length;

		double max = card[0];
		double min = card[0];
		int max_month = 0;
		int min_month = 0;
		
		for(int i=1 ; i<card.length ; i++ ){
			if(card[i] > max){
				max = card[i];
				max_month = i;
			}

			if(card[i] < min){
				min = card[i];
				min_month = i;
			}		
		}

		System.out.println(" *** 월 별 카드 사용금액 ***");
		for(int i=0; i<card.length; i++){
			System.out.println( (i+1) + "월 금액:" + card[i]);
		}
		System.out.println("----------------------");
		System.out.println("전체 사용 금액:"+total);
		System.out.println("평균 사용 금액:"+avg);
		System.out.println("가장 지출이 많았던 월:"+(max_month+1));
		System.out.println("가장 지출이 적었던 월:"+(min_month+1));
	}
}
