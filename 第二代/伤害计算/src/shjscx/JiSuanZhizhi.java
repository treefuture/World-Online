package shjscx;

import java.util.Scanner;

public class JiSuanZhizhi extends JiShuanZhiFu {
    JiSuanZhizhi() {
        System.out.println("------------欢迎使用世界OL属性计算器-------------");
    }

    public static void main(String[] args) {
        JiSuanZhizhi hrth = new JiSuanZhizhi();
        Scanner wc = new Scanner(System.in);
//        System.out.println("在这里您可以计算各种数值：");
//        System.out.println("1为魔化叠加");
//            System.out.println("单魔化叠加");
//            System.out.println("混魔化叠加");
//        System.out.println("2为战斗叠加");
//            System.out.println("战斗叠加");
//            System.out.println("混战斗命中叠加");
//            System.out.println("单战斗命中叠加");
//            System.out.println("一个半战斗命中叠加");
//        System.out.println("3为魔化+战斗叠加");
//            System.out.println("魔化战斗叠加");
//            System.out.println("战斗魔化叠加");
//            System.out.println("混魔化单战斗叠加");
//            System.out.println("单魔化混战斗叠加");
//        System.out.println("4为打副本回合模拟");
//            System.out.println("单魔化打副本回合");
//            System.out.println("魔化战斗打副本回合");
//            System.out.println("战斗魔化打副本回合");
//        System.out.println("5为刷伤害计算");
//        System.out.println("您的选择是：");

        //输入武商攻次
        int a = 0, b = 0, c = 0, d = 0;
        //最终攻次
        int z = 0;
        //输入强命值,接收强命伤害
        double qm = 0, q = 0;
        //qq为格挡次数，格挡次数默认为0，sum为武商均值
        int sum = 0, qq = 0;
        //xz1为一级选择，xz2为二级选择
        int xz1 = 0, xz2 = 0;
        //JiSuan计算为劈砍穿刺初始值
        int JiSuan = 0;
        one:
        while (true) {
            System.out.println("在这里您可以计算各种数值：");
            System.out.println("1为魔化叠加");
            System.out.println("2为战斗叠加");
            System.out.println("3为魔化+战斗叠加");
            System.out.println("4为打副本回合模拟");
            System.out.println("5为刷伤害计算");
            System.out.print("您的选择是：");
            xz1 = wc.nextInt();
            switch (xz1) {
                case 1:
                    two:
                    while (true) {
                        System.out.println("1为单魔化叠加");
                        System.out.println("2为混魔化叠加");
                        System.out.print("您的选择是：");
                        xz2 = wc.nextInt();
                        if (xz2 == 1 || xz2 == 2) {
                            System.out.print("请输入您的劈砍穿刺初始值：");
                            JiSuan = wc.nextInt();
                        }
                        switch (xz2) {
                            case 1:
                                DanZhiJiSuan(JiSuan, xz1);
                                break two;
                            case 2:
                                HunZhiJiSuan(JiSuan, xz1);
                                break two;
                            default:
                                JiHui();
                        }
                    }
                    break one;
                case 2:
                    two:
                    while (true) {
                        double mz = 0;
                        System.out.println("1为战斗叠加");
                        System.out.println("2为混战斗命中叠加");
                        System.out.println("3为单战斗命中叠加");
                        System.out.println("4为一个半战斗命中叠加");
                        System.out.print("您的选择是：");
                        xz2 = wc.nextInt();
                        switch (xz2) {
                            case 1:
                                DanZhanDouJiSuan(JiSuan);
                                break two;
                            case 2:
                                System.out.print("请输入您的命中");
                                mz = wc.nextInt();
                                HunZhiJiSuan(mz, xz1);
                                break two;
                            case 3:
                                System.out.print("请输入您的命中");
                                mz = wc.nextInt();
                                DanZhiJiSuan(mz, xz1);
                                break two;
                            case 4:
                                System.out.print("请输入您的命中");
                                mz = wc.nextInt();
                                YiGeBanZhiJiSuan(mz, xz1);
                                break two;
                            default:
                                JiHui();
                        }
                    }
                    break one;
                case 3:
                    two:
                    while (true) {
                        System.out.println("1为魔化战斗叠加");
                        System.out.println("2为战斗魔化叠加");
                        System.out.println("3为混魔化单战斗叠加");
                        System.out.println("4为单魔化混战斗叠加");
                        System.out.print("您的选择是：");
                        xz2 = wc.nextInt();
                        if (xz2 == 1 || xz2 == 2 || xz2 == 3 || xz2 == 4) {
                            System.out.print("请输入您的劈砍穿刺初始值：");
                            JiSuan = wc.nextInt();
                        }
                        switch (xz2) {
                            case 1:
                                MoHuaZanDouDieJia(JiSuan);
                                break two;
                            case 2:
                                ZanDouMoHuaDieJia(JiSuan);
                                break two;
                            case 3:
                                HunMoHuaDanZanDouDieJia(JiSuan);
                                break two;
                            case 4:
                                DanMoHuaHunZanDouDieJia(JiSuan);
                                break two;
                            default:
                                JiHui();
                        }
                    }
                    break one;
                case 4:
                    int gwxl = 0;
                    two:
                    while (true) {
                        System.out.println("1为单魔化打副本回合");
                        System.out.println("2为魔化战斗打副本回合");
                        System.out.println("3为战斗魔化打副本回合");
                        System.out.println("4为单魔化打副本回合纯净版");
                        System.out.println("5为魔化战斗打副本回合纯净版");
                        System.out.println("6为战斗魔化打副本回合纯净版");
                        System.out.print("您的选择是：");
                        xz2 = wc.nextInt();
                        if (xz2 == 1 || xz2 == 2 || xz2 == 3 || xz2 == 4 || xz2 == 5 || xz2 == 6) {
                            System.out.print("请输入最低武商：");
                            a = wc.nextInt();
                            System.out.print("请输入最高武商：");
                            b = wc.nextInt();
                            System.out.print("请输入攻次：");
                            c = wc.nextInt();
                            System.out.print("请输入主动技能攻次：");
                            d = wc.nextInt();
                            System.out.print("请输入您的劈砍穿刺初始值：");
                            JiSuan = wc.nextInt();
                            System.out.print("请输入强命值：");
                            qm = wc.nextInt();
                            System.out.print("请输入怪物的血量:");
                            gwxl = wc.nextInt();
                        }
                        switch (xz2) {
                            case 1:
                                //a,b最高最低武商     c攻次     d技能攻次      gwxl怪物总血量      qm强命     JiSuan武商劈砍值
                                DanMoHuaDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            case 2:
                                MoHuaZhanDouDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            case 3:
                                ZhanDouMoHuaDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            case 4:
                                DanMoHuaDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            case 5:
                                MoHuaZhanDouDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            case 6:
                                ZhanDouMoHuaDaFuBen(a, b, c, d, gwxl, qm, JiSuan, xz2);
                                break two;
                            default:
                                JiHui();
                        }
                    }
                    break one;
                case 5:
                    //接收循环，至少循环1次
                    int jsxh = 1;
                    //zhiye为刷伤害时职业的选择
                    int zhiye = 0;

                    loop:
                    while (true) {
                        System.out.println("以下为您可选计算类型：");
                        System.out.println("1为武商平均值\t2为动态计算武商均值\t3为刷伤害计算");
                        System.out.println("第三种默认为动态生成武商值，且攻次默认为99");
                        System.out.print("请选择您希望计算的类型：");
                        int cs = wc.nextInt();
                        if (cs == 1 || cs == 2 || cs == 3) {
                            while (true) {
                                System.out.println("请选择您的职业物理请输入1，法师请输入2");
                                System.out.print("请问您是物理还是法师:");
                                zhiye = wc.nextInt();
                                if (zhiye != 1 && zhiye != 2) {
                                    System.out.println("虽然您输入错误，但我依然选择再给您一次选择的机会");
                                } else {
                                    break;
                                }
                            }
                            System.out.print("请输入最低武商：");
                            a = wc.nextInt();
                            System.out.print("请输入最高武商：");
                            b = wc.nextInt();
                            //第三种情况不考虑攻次
                            if (cs != 3) {
                                System.out.print("请输入攻次：");
                                c = wc.nextInt();
                                System.out.print("请输入主动技能攻次：");
                                d = wc.nextInt();
                                if (zhiye == 1) {
                                    z = c + 30 + d <= 99 ? c + 30 + d : 99;
                                    //物理才配拥有强命值
                                    System.out.print("请输入强命值：");
                                    qm = wc.nextInt();
                                    qm = qm > 30 ? qm : 30;
                                    qm = qm <= 100 ? qm : 100;
                                    qm = qm / 100;
                                } else {
                                    z = c + d <= 99 ? c + d : 99;
                                }
                            }
                        }
                        switch (cs) {
                            case 1:

                                //计算输出
                                JiShuanShuChu(a, b, zhiye, z, q, qm);

                                break loop;
                            case 2:
                                while (true) {
                                    System.out.println("请问需要循环计算值吗？(y or n)");
                                    System.out.print("您的选择是：");
                                    char cen = wc.next().charAt(0);
                                    if (cen == 'y') {
                                        System.out.print("请输入您想循环的次数：");
                                        jsxh = wc.nextInt();
                                        break;
                                    } else if (cen == 'n') {
                                        System.out.println("好吧，如果您真的不需要");
                                        break;
                                    } else {
                                        System.out.println("虽然您输入错误，但我依然选择再给您一次选择的机会");
                                    }
                                }

                                //动态计算输出
                                JiShuanDongTaiShuChu(jsxh, z, a, b, zhiye, q, qm);

                                break loop;
                            case 3:
                                z = 99;
                                System.out.print("请输入你想计算的次数：");
                                jsxh = wc.nextInt();

                                //刷伤害输出
                                SuaShangHaiShuChu(jsxh, z, a, b, zhiye);

                                break loop;
                            default:
                                JiHui();
                        }
                    }
                    break one;
                default:
                    JiHui();
            }
        }
    }
}