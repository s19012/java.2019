import java.util.*;

public class Ex3{

	public String ex3_0(int n){
        String ret = "";
        if (n > 0) {
            ret = "その値は正です";
        }
        else {
            ret = "その値は０か負です";
        }

        return ret;
	}

	public int ex3_1(int n){

		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
        String ret = "";
        if (a % b == 0) {
            ret = b + "は" + a + "の約数です";
        }
        else {
            ret = b + "は" + a + "の約数ではありません";
        }

		return ret;
	}

	public String ex3_3(int a, int b){
        String ret = "";
        if (a > b) {
            ret = a + "の方が大きいです";
        }
        else if (a == b) {
            ret = "同じ値です";
        }
        else {
            ret = b + "の方が大きいです";
        }

		return ret;

	}

	public String ex3_4(int a){
        String ret = "";
        if (a > 0) {
            if (a % 5 == 0) {
                ret = "その値は5で割り切れます";
            }
            else {
                ret = "その値は5で割り切れません";
            }
        }
        else {
            ret = "正でない整数値です";
        }

		return ret;

	}

	public String ex3_5(int a){
        String ret = "";
        if (a % 10 == 0) {
            ret = "その値は10の倍数です";
        }
        else if (a < 0) {
            ret = "正でない整数値です";
        }
        else {
            ret = "その値は10の倍数ではありません";
        }

		return ret;
	}

	public String ex3_6(int a){
        String ret = "";
        if (a % 3 == 0) {
            ret = "その値は3で割り切れます";
        }
        else if (a % 3 == 1) {
            ret = "その値を3で割った余りは1です";
        }
        else if (a % 3 == 2) {
            ret = "その値を3で割った余りは2です";
        }
        else if (a < 0) {
            ret = "正でない整数値です";
        }

		return ret;
	}

	public String ex3_7(int a){
        String ret = "";
        if (a >= 0 && a <= 100) {
            if (a >= 0 && a < 60) {
                ret = "不可";
            }
            else if (a >= 60 && a < 70) {
                ret = "可";
            }
            else if (a >= 70 && a < 80) {
                ret = "良";
            }
            else if (a >= 80 && a < 101) {
                ret = "優";
            }
        }
        else {
            ret = "範囲(0～100)外の値です";
        }

		return ret;
	}

	public double ex3_8(double a, double b){
        double max_num;
        if (a >= b) {
            max_num = a;
        }
        else {
            max_num = b;
        }

		return max_num;
	}

	public int ex3_9(int a, int b){

		return Math.abs(a - b);
	}

	public String ex3_10(int a, int b){
        String ret = "";
        if (Math.abs(a - b) <= 10) {
            ret = "それらの差は10以下です";
        }
        else {
            ret = "それらの差は11以上です";
        }

		return ret;
	}

	public int ex3_11(int a, int b, int c){
        ArrayList<Integer> data = new ArrayList<Integer>();
        int ret = c;
        data.add(a);
        data.add(b);
        for (int i = 0; i < data.size(); i++) {
            ret = Math.min(ret, data.get(i));
        }
        return ret;

    }

	public int ex3_12(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            }
            else if (a <= c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if (a > c) {
            return a;
        }
        else if (b > c) {
            return c;
        }
        else {
            return b;
        }
	}

	public String ex3_13(int a){
        if (a> 0 &&(a==12 || a<=2)) {
			return "冬";
		}
		else if (a > 0 &&(3<=a && a<=5)) {
			return "春";
		}
		else if (a > 0 &&(6<=a && a<=8)) {
			return "夏";
		}
		else if (a > 0 &&(9<=a && a<=11)) {
			return "秋";
		}
		else {
			return "範囲(1～12)外の値です";
        }
	}
}

