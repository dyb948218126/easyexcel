package com.example.demo.controller;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: ShowHand
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2020/11/30 19:05
 * @Version: 1.0
 */
public class ShowHand {

    //定义该游戏最多多少个玩家
    private final int PLAY_NUM = 5;

    //定义扑克牌的所有花色和数量
    private String[] types = {"方块","梅花","红桃","黑桃"};
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q",
            "K","A"};
    //cards 是同一局游戏中剩下的扑克牌
    private List<String> cards = new LinkedList<>();

    //定义所有玩家
    private String[] players = new String[PLAY_NUM];

    //所有玩家手上的扑克牌
    private List<String>[] playersCards = new List[PLAY_NUM];

    /**
     * 初始化扑克牌，放入52张扑克牌
     * 并且使用shuffle方法将它们随机排序
     *
     */
    public void initCards(){
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i] + values[j]);
            }
        }
        Collections.shuffle(cards);
    }

    /**
     * 初始化玩家，为每个玩家分派用户名
     */
    public void initPlayer(String... names) throws Exception {
        if (names.length > PLAY_NUM || names.length < 2){
            //校验玩家数量，此处使用异常处理机制更合理
            throw new Exception("玩家数量不对");
        }else {
            //初始化玩家用户名
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }

    /**
     * 初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
     * 程序使用一个长度为0的LinkedList来表示
     */
    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++) {
            if (StringUtils.isNotBlank(players[i])){
                playersCards[i] = new LinkedList<>();
            }
        }
    }
    /**
     * 输出全部扑克牌。该方法没有实际作用，仅用于测试
     */
    public void showAllCards(){
        for (String card : cards){
            System.out.println(card);
        }
    }

    /**
     * 美女发牌官在线发牌
     *
     */
    public void deliverCard(String firstName){
        //调用ArrayUtils工具类的search方法
        //查询出指定元素在数组中的索引
        int firstPos = ArrayUtils.indexOf(players,firstName);
        //依次给位于该指定玩家之后的每个玩家发扑克牌
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i] != null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }

        //依次给位于该指定玩家之前的每个玩家发扑克牌
        for (int i = 0; i < firstPos; i++) {
            if (players[i] != null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }

    public void showPlayerCards(){
        for (int i = 0; i < PLAY_NUM; i++) {
            if (players[i] != null){
                System.out.println(players[i] + ": ");
                for (String player : playersCards[i]) {
                    System.out.println(player + "\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        ShowHand sh = new ShowHand();
        sh.initPlayer("王大治","刘海柱");
        sh.initCards();
        sh.initPlayerCards();

        sh.showAllCards();

        System.out.println("-----------------------------");
        //从王大治开始发牌
        sh.deliverCard("王大治");
        sh.showPlayerCards();

        System.out.println("----------------------------");
        //kobe拿牌
        sh.deliverCard("刘海柱");
        sh.showPlayerCards();


    }
}
