package drawcard;

import java.util.Random;

public class DrawCard {

    public static void main(String[] args) {
        
        //三星 5%, 二星 35%, 一星 60% (三星:二星:一星 = 1:7:12)
        int[] num = {1, 1, 2, 1, 1, 2, 1, 1, 1, 2,
                    2, 1, 3, 2, 1, 1, 2, 2, 1, 1};
        character c = new character();
        Random random = new Random();
        
        switch(num[random.nextInt(20)]) {
            case 1:
                System.out.println("挖哩勒... 消業障囉~~~");
                System.out.println("恭喜你抽到一星角色 \"" + c.getOneStar(random.nextInt(20)) + "\"");
                break;
            case 2:
                System.out.println("差一點哦~ 不過也不錯啦>_<");
                System.out.println("恭喜你抽到二星角色 \"" + c.getTwoStar(random.nextInt(10)) + "\"");
                break;
            case 3:
                System.out.println("人品大爆發!!!");
                System.out.println("恭喜你抽到三星角色 \"" + c.getThreeStar(random.nextInt(6)) + "\"");
                break;
            default:
                break;
        }
        
    }
    
}
