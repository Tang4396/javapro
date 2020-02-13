package com.test;
import java.util.*;

public class LangRenSha {
    /*
     * 狼人杀发牌器
     *    游戏人数   12-18范围之内
     * */
    /*
     * 符合游戏人数
     *   定义3个list
     *       1  发牌的列表
     *       2  发完牌的列表
     *       3  底牌列表
     *
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //接收游戏人数
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("不符合游戏人数");
        }else{
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            //此处用switch，case不大好，推荐用if
            pai(all,player);
            //盗贼只有一个,且一定在游戏的牌中，总牌的盗贼放入游戏中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,di);
            play.addAll(all);
            Collections.shuffle(play);
            System.out.println("手牌"+play);
            System.out.println("底牌"+di);

        }
    }
    //游戏初始化  12个人
    public static void init(List<String> list){
        //循环添加4个狼人
        for(int i = 0;i<4;i++){
            list.add("狼人");
        }
        //循环添加4个村民
        for(int i = 0;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("");
        list.add("预言家");
    }
    //根据不同的人数，初始化不同的牌
    public static void pai(List<String> list,int player){
        if(player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("吹笛者");
    }
    //从总牌中  随意拿出3个底牌来
    public static void dipai(List<String> list,List<String> di){
        //狼人数应该小于等于1
        while(di.size()<3){
            //取list得一个随即下标
            Random random  = new Random();
            int index = random.nextInt(list.size());
            if (di.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index));

        }
    }


}
