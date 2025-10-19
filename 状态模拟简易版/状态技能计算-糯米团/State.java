package com.nomitr.springsecuritytest.state;

import java.util.*;
import java.util.stream.Collectors;

interface States{
    Integer info = Integer.MAX_VALUE; //全部打印
    Integer expire = 3; //过期日志
    Integer clear = 6; //清曾
    Integer extrude = 9;//挤出日志
    Integer add = 8; // 添加属性日志
    Integer noPrint = -1;//不打印

    //属性
    String unmatched = "无敌";
    String addAttr = "属性增加";
    String magicInvalid = "魔攻无效";
    String attackInvalid = "物攻无效";
    String immuneProhibition = "免疫禁言";
    String totalImmunity = "全减益免疫";
    String noState = "";

}
class Attr {
    private int mg; // 魔攻
    private int pk; // 劈砍
    private int cc; // 穿刺
    private int hit; // 命中
    private int mh; // 魔命
    private int an; // 攻击次数

    //最大值
    private static final int HIT_MAX = 32767;
    private static final int AN_MAX = 100;
    private static final int OTHER_MAX = 1000000;

    //构造方法
    public Attr() {
    }

    public int getHit() {
        return hit;
    }

    public int setHit(int increment) {
        int newValue = this.hit + increment;
        if (newValue > HIT_MAX) {
            newValue = HIT_MAX;
            increment = newValue - this.hit;
        }
        this.hit = newValue;
        return increment;
    }

    public int getMh() {
        return mh;
    }

    public int setMh(int increment) {
        int newValue = this.mh + increment;
        if (newValue > OTHER_MAX) {
            newValue = OTHER_MAX;
            increment = newValue - this.mh;
        }
        this.mh = newValue;
        return increment;
    }

    public int getAn() {
        return an;
    }

    public int setAn(int increment) {
        int newValue = this.an + increment;
        if (newValue > AN_MAX) {
            newValue = AN_MAX;
            increment = newValue - this.an;
        }
        this.an = newValue;
        return increment;
    }

    public Attr(int mg, int pk, int cc, int hit, int mh, int an) {
        this.mg = mg;
        this.pk = pk;
        this.cc = cc;
        this.hit = Math.min(hit, HIT_MAX);
        this.mh = Math.min(mh, OTHER_MAX);
        this.an = Math.min(an, AN_MAX);
    }

    public int getMg() {
        return mg;
    }

    public int setMg(int increment) {
        int newValue = this.mg + increment;
        if (newValue > OTHER_MAX) {
            newValue = OTHER_MAX;
            increment = newValue - this.mg;
        }
        this.mg = newValue;
        return increment;
    }

    public int getPk() {
        return pk;
    }

    public int setPk(int increment) {
        int newValue = this.pk + increment;
        if (newValue > OTHER_MAX) {
            newValue = OTHER_MAX;
            increment = newValue - this.pk;
        }
        this.pk = newValue;
        return increment;
    }

    public int getCc() {
        return cc;
    }

    public int setCc(int increment) {
        int newValue = this.cc + increment;
        if (newValue > OTHER_MAX) {
            newValue = OTHER_MAX;
            increment = newValue - this.cc;
        }
        this.cc = newValue;
        return increment;
    }

    @Override
    public String toString() {
        return "属性{" +
                "魔法攻击力=" + mg +
                ", 劈砍攻击力=" + pk +
                ", 穿刺攻击力=" + cc +
                ", 物理命中=" + hit +
                ", 魔法命中=" + mh +
                ", 攻击次数=" + an +
                '}';
    }
}

//操作类
class Operate{
    //一个枚举类，用来标注操作所操作的属性
    enum Type{
        cc,pk,mg,hit,an,mh,other
    }

    private Type type = Type.other; //操作的属性，默认其他
    private Integer integer = 0; //所改变的数值
    private int round = 0;//持续回合
    private String state = States.noState; //操作的状态，默认没有状态
    private double val = 0.0;//操作的百分比属性

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int nextRound(){
        return --this.round;
    }
    public boolean eqType(Type t){
        return t.equals(this.type);
    }

    //操作对象的深拷贝
    public Operate copy(){
        Operate o = new Operate();
        o.setType(this.type);//枚举
        o.setInteger(this.integer);//integer
        o.setRound(this.round);//int
        o.setState(this.state);//string
        o.setVal(this.val);
        return o;
    }

    //操作枚举对应的汉字
    public String getType() {
        switch (this.type){
            case pk -> {
                return "劈砍攻击力";
            }
            case mg -> {
                return "魔法攻击力";
            }
            case cc -> {
                return "穿刺攻击力";
            }
            case mh -> {
                return "魔法命中";
            }
            case hit -> {
                return "物理命中";
            }
            case an -> {
                return "攻击次数";
            }
        }
        return "其他";
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //把操作对象改变的值添加到对象（玩家）本身
    public void add(Attr attr){
        if (this.val != 0.0) {
            //更新操作新增的的数值
            switch (type){
                case cc ->  this.integer = (int) (attr.getCc()*this.val);
                case mg ->  this.integer = (int) (attr.getMg()*this.val);
                case pk ->  this.integer = (int) (attr.getPk()*this.val);
                case hit ->  this.integer = (int) (attr.getHit()*this.val);
                case mh ->  this.integer = (int) (attr.getMh()*this.val);
                case an ->  this.integer = (int) (attr.getAn()*this.val);
            }
        }
        //添加
        switch (type){
            case cc -> this.integer = attr.setCc(this.integer);
            case mg -> this.integer = attr.setMg(this.integer);
            case pk -> this.integer = attr.setPk(this.integer);
            case hit -> this.integer = attr.setHit(this.integer);
            case mh -> this.integer = attr.setMh(this.integer);
            case an -> this.integer = attr.setAn(this.integer);
        }
    }

    //弹出操作所增加的值
    public void pop(Attr attr){
        switch (type){
            case cc -> attr.setCc(-integer);
            case mg -> attr.setMg(-integer);
            case pk -> attr.setPk(-integer);
            case hit -> attr.setHit(-integer);
            case mh -> attr.setMh(-integer);
            case an -> attr.setAn(-integer);
        }
    }

    @Override
    public String toString() {
        return "操作{" +
                "操作值=" + type +
                ", 增加值=" + integer +
                ", 回合数=" + round +
                ", 状态=" + state +
                '}';
    }
}

class FixedList{

    private Integer printGrade = 3;//打印等级，默认只打印过期

    public boolean isPrintNoState() {
        return printNoState;
    }

    public void setPrintNoState(boolean printNoState) {
        this.printNoState = printNoState;
    }

    private boolean printNoState = false;//打印无状态增益，默认不打印无状态增益

    public Integer getPrintGrade() {
        return printGrade;
    }

    public void setPrintGrade(Integer printGrade) {
        this.printGrade = printGrade;
    }

    private static final int MAX_SIZE = 3;//状态栏最大值
    private int index = 0;
    private Operate[] list;//状态增加栏

    private Boolean unmatched = false;//是否无敌

    private List<Operate> noStateList;//无状态增益栏

    private Attr attr;//玩家属性
    public FixedList(Attr attr) {
        this.attr = attr;
        this.list = new Operate[MAX_SIZE];
        this.noStateList = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "FixedList{" +
                "index=" + index +
                ", list=" + Arrays.toString(list) +
                ", attr=" + attr +
                '}';
    }

    //把技能拆分成操作
    public void add(List<Operate> operates){
        for (Operate o:operates) {
            add(o);
        }
    }
    //执行操作
    public void add(Operate operate){
        //无状态
        if (States.noState.equals(operate.getState())) {
            operate.add(attr);
            noStateList.add(operate);
            p("添加",operate,States.add);
            return;
        }
        //有状态，  有无敌状态直接返回
        if (unmatched) return;

        operate.add(attr);
        Operate temp = list[index % MAX_SIZE];
        p("挤出",temp,States.extrude);
        p("添加",operate,States.add);
        if (States.unmatched.equals(operate.getState())){
            pop(temp);
            list[index++ % MAX_SIZE ] = operate;
            this.unmatched = true;
            return;
        }
        pop(temp);
        list[index++ % MAX_SIZE ] = operate;
    }

    //弹出操作
    private void pop(Operate operate){
        if (operate == null) {
            return;
        }
        if (States.unmatched.equals(operate.getState())){
            operate.pop(attr);
            this.unmatched = false;
            return;
        }
        operate.pop(attr);
    }

    //打印日志
    private void p(String type,Operate operate,Integer grade){
        if (operate == null) {
            return;
        }
        if (printGrade >= grade) {
            System.out.println(type+"值"+operate.getInteger()+
                    "\t"+type+"类型"+operate.getType()+"\t"+
                    type+"状态"+ (States.noState.equals(operate.getState()) ? "无状态" : operate.getState()));
        }
    }
    //有状态下一个回合数
    public void next(){
        noStateNext();
        Operate temp = null;
        for (int i = 2,j = 0; i >= j; i--) {
            temp = list[(index + i) % MAX_SIZE];
            int round = 1;
            if (temp != null) {
                round = temp.nextRound();
            }
            if (round <= 0) {
                pop(list[(index + i) % MAX_SIZE]);
                p("过期",temp,States.expire);
//                list[(index + i) % MAX_SIZE] = list[(index + i - 1) % MAX_SIZE];
                list[(index + i) % MAX_SIZE] = null;
                sort(i);
                j++;
                i++;
            }
        }
    }
    //无状态下一个回合数
    public void noStateNext(){
        Iterator<Operate> iterator = noStateList.iterator();
        while (iterator.hasNext()) {
            Operate o = iterator.next();
            int round = (o != null) ? o.nextRound() : 1;
            if (round <= 0) {
                pop(o);
                p("过期", o, States.expire);
                iterator.remove();
            }
        }
    }

    //清除所有buff
    public void clearBuff(){
        Operate o = null;
        for (int i = 0; i < 3; i++) {
            o = list[i];
            if (o != null) {
                o.pop(this.attr);
                p("清除增益",o,States.clear);
            }
            list[i] = null;
        }
        this.unmatched = false;

    }

    //状态栏排序规则，把过期的状态栏位置补充
    public void sort(int i){
        if ((index + i) == index){
            return;
        }
        Operate o = null;
        o = list[(index + i) % MAX_SIZE];
        if (o == null) {
            list[(index + i) % MAX_SIZE] = list[(index + i - 1) % MAX_SIZE];
            list[(index + i - 1) % MAX_SIZE] = null;
        }
        this.sort(i-1);
    }

    //打印所有属性
    public void show(int i){
        System.out.println("第" + i + "回合状态详情");
        System.out.println(attr);
        System.out.println("------------------状态增益---------------------");
        for (Operate o:list) {
            if (o == null) continue;
            System.out.print("操作值"+o.getType());
            System.out.print(" 增加值"+o.getInteger());
            System.out.print(" 状态"+o.getState());
            System.out.println(" 剩余回合"+o.getRound());
        }
        if (this.printNoState) {
            System.out.println("----------------无状态增益--------------------");
            for (Operate o:noStateList) {
                if (o == null) continue;
                System.out.print("操作值"+o.getType());
                System.out.print(" 增加值"+o.getInteger());
                System.out.println(" 剩余回合"+o.getRound());
            }
        }
        System.out.println();
    }
}

//技能
class Skill{
    //技能名字
    private String name;
    //技能操作
    private List<Operate> skills;
    //技能回合
    private int round;

    public Skill(String name, int round,Operate... operates) {
        for (Operate o:operates) {
            o.setRound(round);
        }
        this.name = name;
        this.skills = new ArrayList<>(Arrays.asList(operates));
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Skill(){
        this.skills = new ArrayList<>();
    }

    public Skill(String name,Operate... operates){
        this.name = name;
        this.skills = new ArrayList<>(Arrays.asList(operates));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Operate> getSkills() {
        return skills;
    }

    public void setSkill(Operate operate) {
        this.skills.add(operate);
    }
    //实现深copy
    public Skill copy(){
        Skill temp = new Skill();
        temp.setName(this.getName());
        temp.skills = this.skills.stream().map(Operate::copy).collect(Collectors.toList());
        return temp;
    }

}

//技能表，方便技能的使用
class SkillList{
    private static Map<String,Skill> skills = new HashMap<>();

    /**
     *
     * @return 1添加成功，0已存在，-1添加失败
     */
    public static int addSkill(Skill s){
        if (s == null) {
            return -1;
        }
        if (skills.containsKey(s.getName())) {
            return 0;
        }
        skills.put(s.getName(),s);
        return 1;
    }

    /**
     * 根据技能名字获取技能（copy，两个对象的内存地址不一样）
     * @param name 技能名字
     * @return 技能
     */
    public static Skill getSkill(String name){
        return skills.get(name).copy();
    }
    //初始化技能
    public static void init(){
        //战斗怒吼
        Operate zdnh1 = new Operate();
        Operate zdnh2 = new Operate();
        Operate zdnh3 = new Operate();
        zdnh1.setType(Operate.Type.pk);
        zdnh1.setVal(0.4);
        zdnh1.setState(States.addAttr);
        zdnh2.setType(Operate.Type.cc);
        zdnh2.setVal(0.4);
        zdnh2.setState(States.addAttr);
        zdnh3.setType(Operate.Type.hit);
        zdnh3.setVal(0.26);
        Skill zdnh = new Skill("战斗怒吼",4, zdnh1, zdnh2, zdnh3);

        //魔化武器
        Operate mhwq1 = new Operate();
        Operate mhwq2 = new Operate();
        Operate mhwq3 = new Operate();
        mhwq1.setType(Operate.Type.an);
        mhwq1.setInteger(6);
        mhwq2.setType(Operate.Type.pk);
        mhwq2.setVal(0.24);
        mhwq3.setType(Operate.Type.cc);
        mhwq3.setVal(0.24);
        Skill mhwq = new Skill("魔化武器",5, mhwq1, mhwq2, mhwq3);

        //魔力增幅
        Operate mlzf1 = new Operate();
        Operate mlzf2 = new Operate();
        mlzf1.setType(Operate.Type.mg);
        mlzf1.setVal(0.42);
        mlzf1.setState(States.immuneProhibition);
        Skill mlzf = new Skill("魔力增幅",4,mlzf1,mlzf2);

        //土之阵术
        Operate tzzs1 = new Operate();
        Operate tzzs2 = new Operate();
        tzzs1.setType(Operate.Type.mg);
        tzzs1.setVal(0.48);
        tzzs1.setState(States.addAttr);
        tzzs2.setInteger(600);
        tzzs2.setState(States.addAttr);
        Skill tzzs = new Skill("土之阵术",3,tzzs1,tzzs2);

        //骑士的奉献
        Operate qsdfx61 = new Operate();
        qsdfx61.setState(States.unmatched);
        Skill qsdfx6 = new Skill("骑士的奉献-6",1,qsdfx61);

        Operate qsdfx81 = new Operate();
        qsdfx61.setState(States.unmatched);
        Skill qsdfx8 = new Skill("骑士的奉献-8",2,qsdfx81);

        Operate qsdfx91 = new Operate();
        qsdfx61.setState(States.unmatched);
        Skill qsdfx9 = new Skill("骑士的奉献-9",3,qsdfx91);

        Operate xwdjj1 = new Operate();
        xwdjj1.setState(States.attackInvalid);
        Skill xwdjj = new Skill("血舞的结界",2,xwdjj1);

        Operate qn1 = new Operate();
        Operate qn2 = new Operate();

        addSkill(zdnh);
        addSkill(mhwq);
        addSkill(mlzf);
        addSkill(tzzs);
        addSkill(qsdfx6);
        addSkill(qsdfx8);
        addSkill(qsdfx9);
        addSkill(xwdjj);

    }
}

public class State {
    public static void main(String[] args) {

        Attr attr = new Attr(10000,20000,20000,100,100,10);
        FixedList fixedList = new FixedList(attr);

        //设置打印等级
        fixedList.setPrintGrade(States.noPrint);

        //打印无状态增益
        fixedList.setPrintNoState(false);

        //初始化技能
        SkillList.init();

        for (int i = 0; i < 30; i++) {

            Skill zdnh = SkillList.getSkill("战斗怒吼");
            fixedList.add(zdnh.getSkills());

            Skill mhwq = SkillList.getSkill("魔化武器");
            fixedList.add(mhwq.getSkills());

            Skill xw = SkillList.getSkill("血舞的结界");
            fixedList.add(xw.getSkills());


            fixedList.show(i+1);
            fixedList.next();
        }
    }
}
