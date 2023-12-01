package baseball;

public class BaseBallTeam {
  //フィールド
    private String name ;
    private int win ;
    private int lose ;
    private int draw ;

    //引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    //引数ありのコンストラクタ
    public BaseBallTeam(String name , int win , int lose , int draw) {
    this.name = name ;
    this.win = win ;
    this.lose = lose ;
    this.draw = draw ;

    }

    //勝率メソッド
    public double getRate(){
        double rate = (double)win / ( (double)win + (double)lose );
        return rate;
    }

  //結果表示
    public void report(){
      System.out.println(this.name + "の2022年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + getRate() + "です。");
    }
    }