package testdemo;

import java.util.Scanner;
public class ZhanDouMoHuaDaFuBen {
public static void ZhanDouMoHuaDaFuBenGongJu(int b, int z, double a, double m, double o1, double o2, double o3, double y
        , double o4, double o5, double o6, double x, double x1, double r, double y1, int k1, int k2, int k3
        , int k4, int k5, int k6) {
        System.out.printf("【当前的回合%d】\n", b);
        System.out.printf("当前的攻次:%d\n", z);
        System.out.printf("当前的劈砍(穿刺)值%.0f\n", a);

        if (o1 <= 0) {
        if (k1 == 1) {
        System.out.printf("全减免疫伤害(魔攻无效):%.0f\n", m);
        }
        System.out.printf("全减免疫(魔攻无效)伤害任务已完成\n");
        } else {
        System.out.printf("全减免疫伤害(魔攻无效):%.0f\n", m);
        System.out.printf("全减免疫(魔攻无效)剩余生命:%.0f\n\n", o1);
        }

        if (o2 <= 0) {
        if (k2 == 1) {
        System.out.printf("全减免疫魔免伤害(强命):%.2f\n", y);
        }
        System.out.printf("全减免疫魔免(强命)伤害任务已完成\n");
        } else {
        System.out.printf("全减免疫魔免伤害(强命):%.2f\n", y);
        System.out.printf("全减免疫魔免(强命)剩余生命:%.0f\n\n", o2);
        }

        if (o3 <= 0) {
        if (k3 == 1) {
        System.out.printf("全减免疫魔免最低伤害:%.0f\n", x);
        }
        System.out.printf("全减免疫魔免最低伤害任务已完成\n");
        } else {
        System.out.printf("全减免疫魔免最低伤害:%.0f\n", x);
        System.out.printf("全减免疫魔免最低伤害剩余生命:%.0f\n\n", o3);
        }

        if (o4 <= 0) {
        if (k4 == 1) {
        System.out.printf("全减免疫伤害(魔攻有效):%.0f\n", r);
        }
        System.out.printf("全减免疫伤害(魔攻有效)任务已完成\n");
        } else {
        System.out.printf("全减免疫伤害(魔攻有效):%.0f\n", r);
        System.out.printf("全减免疫伤害(魔攻有效)剩余生命:%.0f\n\n", o4);
        }

        if (o5 <= 0) {
        if (k5 == 1) {
        System.out.printf("全减魔攻有效伤害(强命):%.2f\n", y1);
        }
        System.out.printf("全减魔攻有效伤害(强命)任务已完成\n");
        } else {
        System.out.printf("全减魔攻有效伤害(强命):%.2f\n", y1);
        System.out.printf("全减魔攻有效伤害(强命)剩余生命:%.0f\n\n", o5);
        }

        if (o6 <= 0) {
        if (k6 == 1) {
        System.out.printf("全减魔攻有效最低伤害:%.0f\n", x1);
        }
        System.out.printf("全减魔攻有效最低伤害任务已完成\n\n");
        } else {
        System.out.printf("全减魔攻有效最低伤害:%.0f\n", x1);
        System.out.printf("全减魔攻有效最低伤害剩余生命:%.0f\n", o6);
        }
        }

    public static void main(String[] args) {
        Scanner wc = new Scanner(System.in);

        //叠加魔化(a后面的值为返回的伦数)
        double a;

        double a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;

        double d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        double c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        int i, j, h = 1000000, b = 0, z, v;
        double k, l = 0, m = 0, r = 0;
        //o为怪物总血量
        int o = 0;
        //对应怪物所剩血量
        double o1 = 0, o2 = 0, o3 = 0, o4 = 0, o5 = 0, o6 = 0;
        //完成结束语只会出现在第一次
        int k1 = 1, k2 = 1, k3 = 1, k4 = 1, k5 = 1, k6 = 1;
        //魔攻有效/无效最低伤害
        double x = 0, x1 = 0;
        double y = 0, y1 = 0;//强命伤害
        //强命值
        double qm = 0;
        //战斗叠加的值
        double f=0,f1=0,f2=0,f3=0,f4=0,f5=0;
        double e=0,e1=0,e2=0,e3=0,e4=0,e5=0;


        System.out.print("请输入最低武商:");
        i = wc.nextInt();
        System.out.print("请输入最高武商:");
        j = wc.nextInt();
        k = (i + j) / 2;//武商
        System.out.println("当前的武商值:" + k);
        System.out.print("请输入攻次:");
        z = wc.nextInt();
        System.out.print("请输入主动技能加的攻次:");
        v = wc.nextInt();
        System.out.print("请输入劈砍(穿刺)值:");
        a = wc.nextInt();
        System.out.print("请输入强命值:");
        qm = wc.nextInt();
        qm = qm > 30 ? qm : 30;
        qm = qm < 100 ? qm : 100;
        qm = qm / 100;
        z = z + v;
        a1 = a2 = a3 = a4 = a5 = a;
        //保存a的初值
        System.out.print("请输入怪物总血量:");
        o = wc.nextInt();
        o1 = o2 = o3 = o4 = o5 = o6 = o;

        while(b<5) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            z=z+6;//攻次叠加
            z=z>99?99:z;//判断攻次
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
        while(b<10) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e1 = a1 - f1;//保留a1上一回合的值
                a1 = (a1 - f1) * 1.4;//叠加战斗
                f1 = a1 - e1;//叠加战斗的值
                d1 = a1;//保留a的返回值
                a1 = a1 * 1.24;//叠加魔化
                c1 = a1 - d1;//魔化叠加的值
                a = a - c1;//魔化的值消失
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
        while(b<15) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e2 = a2 - f2;//保留a2上一回合的值
                a2 = (a2 - f2) * 1.4;//叠加战斗
                f2 = a2 - e2;//战斗叠加的值
                d2 = a2;//保留a2的返回值
                a2 = a2 * 1.24;//叠加魔化
                c2 = a2 - d2;//魔化叠加的值
                a1 = a1 - c2;//魔化的值消失
                e1 = a1 - f1;//保留a1上一回合的值
                a1 = (a1 - f1) * 1.4;//叠加战斗
                f1 = a1 - e1;//战斗叠加的值
                d1 = a1;//保留a1的返回值
                a1 = a1 * 1.24;//叠加魔化
                c1 = a1 - d1;//叠加的值
                a = a - c1;//魔化的值消失
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
        while(b<20) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e3 = a3 - f3;//保留a3上一回合的值
                a3 = (a3 - f3) * 1.4;//叠加战斗
                f3 = a3 - e3;//战斗叠加的值
                d3 = a3;//保留a3的返回值
                a3 = a3 * 1.24;//叠加魔化
                c3 = a3 - d3;//魔化叠加的值
                a2 = a2 - c3;//魔化的值消失
                e2 = a2 - f2;//保留a2上一回合的值
                a2 = (a2 - f2) * 1.4;//叠加战斗
                f2 = a2 - e2;//战斗叠加的值
                d2 = a2;//保留a2的返回值
                a2 = a2 * 1.24;//叠加魔化
                c2 = a2 - d2;//魔化叠加的值
                a1 = a1 - c2;//魔化的值消失
                e1 = a1 - f1;//保留a1上一回合的值
                a1 = (a1 - f1) * 1.4;//叠加战斗
                f1 = a1 - e1;//战斗叠加的值
                d1 = a1;//保留a1的返回值
                a1 = a1 * 1.24;//叠加魔化
                c1 = a1 - d1;//魔化叠加的值
                a = a - c1;//魔化的值消失
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
        while(b<25) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e4 = a4 - f4;//保留a4上一回合的值
                a4 = (a4 - f4) * 1.4;//叠加战斗
                f4 = a4 - e4;//战斗叠加的值
                d4 = a4;//保留a4的返回值
                a4 = a4 * 1.24;//叠加魔化
                c4 = a4 - d4;//魔化叠加的值
                a3 = a3 - c4;//魔化的值消失
                e3 = a3 - f3;//保留a3上一回合的值
                a3 = (a3 - f3) * 1.4;//叠加战斗
                f3 = a3 - e3;//战斗叠加的值
                d3 = a3;//保留a3的返回值
                a3 = a3 * 1.24;//叠加魔化
                c3 = a3 - d3;//魔化叠加的值
                a2 = a2 - c3;//魔化的值消失
                e2 = a2 - f2;//保留a2上一回合叠加的值
                a2 = (a2 - f2) * 1.4;//叠加战斗
                f2 = a2 - e2;//战斗叠加的值
                d2 = a2;//保留a2的返回值
                a2 = a2 * 1.24;//叠加魔化
                c2 = a2 - d2;//魔化叠加的值
                a1 = a1 - c2;//魔化的值消失
                e1 = a1 - f1;//保留a1上一回合的值
                a1 = (a1 - f1) * 1.4;//叠加战斗
                f1 = a1 - e1;//战斗叠加的值
                d1 = a1;//保留a1的返回值
                a1 = a1 * 1.24;//叠加魔化
                c1 = a1 - d1;//魔化叠加的值
                a = a - c1;//魔化的值消失
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
        while(b<30) {
            if (o1 <= 0 && o2 <= 0 && o3 <= 0 && o4 <= 0 && o5 <= 0 && o6 <= 0) {
                break;
            }
            b++;//回合
            if (a < h) {
                e5 = a5 - f5;//保留a5上一回合的值
                a5 = (a5 - f5) * 1.4;//叠加战斗
                f5 = a5 - e5;//战斗叠加的值
                d5 = a5;//保留a5的返回值
                a5 = a5 * 1.24;//叠加魔化
                c5 = a5 - d5;//魔化叠加的值
                a4 = a4 - c5;//魔化的值消失
                e4 = a4 - f4;//保留a4上一回合的值
                a4 = (a4 - f4) * 1.4;//叠加战斗
                f4 = a4 - e4;//战斗叠加的值
                d4 = a4;//保留a4的返回值
                a4 = a4 * 1.24;//叠加魔化
                c4 = a4 - d4;//魔化叠加的值
                a3 = a3 - c4;//魔化的值消失
                e3 = a3 - f3;//保留a3上一回合的值
                a3 = (a3 - f3) * 1.4;//叠加战斗
                f3 = a3 - e3;//战斗叠加的值
                d3 = a3;//保留a3的返回值
                a3 = a3 * 1.24;//叠加魔化
                c3 = a3 - d3;//魔化叠加的值
                a2 = a2 - c3;//魔化的值消失
                e2 = a2 - f2;//保留a2上一回合的值
                a2 = (a2 - f2) * 1.4;//叠加战斗
                f2 = a2 - e2;//战斗叠加的值
                d2 = a2;//保留a2的返回值
                a2 = a2 * 1.24;//叠加魔化
                c2 = a2 - d2;//魔化叠加的值
                a1 = a1 - c2;//魔化的值消失
                e1 = a1 - f1;//保留a1上一回合的值
                a1 = (a1 - f1) * 1.4;//叠加魔化
                f1 = a1 - e1;//魔化叠加的值
                d1 = a1;//保留a1的返回值
                a1 = a1 * 1.24;//叠加魔化
                c1 = a1 - d1;//魔化叠加的值
                a = a - c1;//魔化的值消失
                e = a - f;//保留a上一回合的值
                a = (a - f) * 1.4;//叠加战斗
                f = a - e;//战斗叠加的值
                a = a * 1.24;//叠加魔化
            }
            a=a>h?h:a;//判断劈砍(穿刺值)
            l=(k*z+a)*1.5;//基础伤害值
            m = l * 0.3 < o1 ? l * 0.3 : o1;//全减免疫伤害(魔攻无效)
            y = l * 0.3 * qm < o2 ? l * 0.3 * qm : o2;//全减免疫(魔攻无效)强命伤害
            x = (k * (z - 7) + a) * 1.5 * 0.3 < o3 ? (k * (z - 7) + a) * 1.5 * 0.3 : o3;//全减免疫(魔攻无效)最低伤害
            r = l < o4 ? l : o4;//全减免疫伤害(魔攻有效)
            y1 = l * qm < o5 ? l * qm : o5;//全减免疫(魔攻有效)强命伤害
            x1 = (k * (z - 7) + a) * 1.5 < o6 ? (k * (z - 7) + a) : o6;//全减免疫(魔攻有效)最低伤害

            o1 = o1 - m > 0 ? o1 - m : 0;
            o2 = o2 - y > 0 ? o2 - y : 0;
            o3 = o3 - x > 0 ? o3 - x : 0;
            o4 = o4 - r > 0 ? o4 - r : 0;
            o5 = o5 - y1 > 0 ? o5 - y1 : 0;
            o6 = o6 - x1 > 0 ? o6 - x1 : 0;
            ZhanDouMoHuaDaFuBenGongJu(b, z, a, m, o1, o2, o3, y, o4, o5, o6, x, x1, r, y1, k1, k2, k3, k4, k5, k6);
            if (k1 == 1 && o1 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻无效)┉┉┉┉┉┉┉\n\n");
                k1++;
            }
            if (k2 == 1 && o2 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免伤害(强命)┉┉┉┉┉┉┉\n\n");
                k2++;
            }
            if (k3 == 1 && o3 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫魔免最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k3++;
            }
            if (k4 == 1 && o4 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减免疫伤害(魔攻有效)┉┉┉┉┉┉┉\n\n");
                k4++;
            }
            if (k5 == 1 && o5 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效伤害(强命)┉┉┉┉┉┉┉\n\n");
                k5++;
            }
            if (k6 == 1 && o6 <= 0) {
                System.out.printf("┉┉┉┉┉┉┉全减魔攻有效最低伤害┉┉┉┉┉┉┉┉┉\n\n");
                k6++;
            }
        }
    }
}
