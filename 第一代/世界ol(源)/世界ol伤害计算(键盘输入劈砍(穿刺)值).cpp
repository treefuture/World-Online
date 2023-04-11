#include"stdio.h"
int main()
{
    int a,b,c,k,z;//创建武商变量
    int a1;//最低伤害
    float q;//接收强命伤害
    float q1;//强命值
    printf("【输入武商时请将最高和最低武商用逗号隔开】\n");
    printf("请输入基础武商:");
    scanf( "%d,%d",&a,&b);//输入武商变量
    c=(a+b)/2;
    printf("平均武商为:%d\n",c);
    int d,e;//创建攻次变量
    printf("请输入基础攻次:");
    scanf("%d",&d);//输入攻次
    printf("请输入主动技能加的攻次:");
    scanf("%d",&k);//k为主动技能加的攻次
    z=d+30+k<=99?d+30+k:99;
    printf("当前攻次为:%d\n",z);
    // e=c*z+1000000;
    printf("请输入强命值:");
    scanf("%f",&q1);
    q1=q1<=100?q1:100;
    q1=q1/100;  
    int p;//创建劈砍(穿刺)值
    printf("当前的劈砍(穿刺)值:");
    scanf("%d",&p);
    e=c*z+p;
   double f,g,h,i,j,l,m;
    f=e*1.5;
    g=f*1.2*1.1*0.3;
    printf("魔免双状态伤害为:%.2f\n",g);
    a1=g/z*(z-7);
    printf("魔免双状态最低伤害为:%.2f\n",a1);
    printf("损失值:%.2f\n",g-a1);
    q=g*q1;
    printf("强命双状态伤害为:%.2f\n",q);
    h=f*0.3;
    printf("全减免疫伤害为:%.2f\n",h);
    a1=h/z*(z-7);
    printf("全减免疫最低伤害为:%.2f\n",a1);
    printf("损失值:%.2f\n",h-a1);
    q=h*q1;
    printf("强命伤害为:%.2f\n",q);
    i=f*1.1*1.2;
    printf("刷伤害为:%.2f\n",f);
    printf("刷伤害双状态为:%.2f\n",i);
    printf("\n\n");
    
    printf("完全狂暴:\n");
    printf("完全狂暴攻次为:24\n\n");
    z=z+24;
    z=z<=99?z:99;
    m=(c*z+p)*1.5*1.2*1.1;
    
    printf("当前攻次为:%d\n",z);  
    printf("完全狂暴伤害为:%.2f\n",m);
    printf("\n\n");
    
    printf("完全狂暴+狂暴术:\n");
    printf("狂暴术攻次为:7\n\n");
    
    z=z+7<=99?z+7:99;
    j=(c*z+p)*1.5*1.1*1.2;
    
    printf("当前攻次为:%d\n",z);
    printf("一个狂暴术伤害为:%.2f\n",j);
    z=z+7<=99?z+7:99;
    l=(c*z+p)*1.5*1.1*1.2;
    
    printf("当前攻次为:%d\n",z);
    printf("两个狂暴术伤害为:%.2f\n",l);
    z=z+7<=99?z+7:99;
    m=(c*z+p)*1.5*1.2*1.1;
    
    printf("当前攻次为:%d\n",z);
    printf("三个狂暴术伤害为:%.2f\n",m);
    
    fflush(stdin);
    printf("\n"); 
    printf("按回车键退出......\n"); 
    getchar();
    return 0; 
}
