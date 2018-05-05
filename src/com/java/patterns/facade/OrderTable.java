package com.java.patterns.facade;

/**
 * 点餐台
 *
 * Created by zhengxianyou on 2018/5/5 0005.
 */
public class OrderTable {
    private ChestnutStick chestnutStick;
    private ChickenNugget chickenNugget;
    private ChickenWings chickenWings;
    private Cola cola;
    private Hamburger hamburger;
    private MashedPotatoes mashedPotatoes;

    /**
     * 构造初始化菜品
     */
    public OrderTable() {
        chestnutStick = new ChestnutStick();
        chickenNugget = new ChickenNugget();
        chickenWings = new ChickenWings();
        cola = new Cola();
        hamburger = new Hamburger();
        mashedPotatoes = new MashedPotatoes();
    }

    /**
     * 全家桶
     */
    public void familyBucket(){
        System.out.println("全家桶套餐.....");
        chestnutStick.getChestnutStick(1);
        chickenNugget.getChickenNugget(5);
        chickenWings.getChickenWings(6);
        mashedPotatoes.getMashedPotatoes(1);
        cola.getMiddleCola(3);
    }

    /**
     * 单人套餐
     */
    public void SinglePackage(){
        System.out.println("单人套餐.....");
        chickenWings.getChickenWings(2);
        hamburger.getHamburger(1);
        cola.getMiddleCola(1);
    }

}
