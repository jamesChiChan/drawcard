package drawcard;

public class character {
    private String[] ThreeStar = {"克莉絲", "艾莉絲", "詹姆斯", "艾瑞克", "豪欣擎", "百萬王"};
    private String[] TwoStar = {"姆咪", "提克", "宙斯", "石像", "書齊",
                             "睡魔", "勒勒", "菲哥", "晝琴", "幸來"};
    private String[] OneStar = {"星", "炛", "楓", "恭", "唋",
                             "觔", "炤", "慕", "渚", "磯",
                             "晴", "雯", "獄", "柚", "俱",
                             "睲", "癮", "菸", "秉", "敖"};
    
    public String getThreeStar(int num) {
       return ThreeStar[num];
    }
    
    public String getTwoStar(int num) {
        return TwoStar[num];
    }
    
    public String getOneStar(int num) {
        return OneStar[num];
    }
}
