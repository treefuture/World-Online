#include<stdio.h>
int main()
{
    int a,b=0,c=0,d=0,e=0;
    printf("请输入穿刺值:");
    scanf("%d",&a);
    while(a<=1000000) {
        c++;
        if(c>30){
        break;
        }
        b=a-e;//保留a上一回合的值
        d=e;//保留上一回合叠加的值
        a=(a-d)*1.4;//叠加战斗
        e=a-b;//战斗所叠加的值
        printf("【当前为:第%d回合】\n",c);
        printf("顶掉的值(上一回合叠加值):%d\n",d);
        printf("本回合叠加的值:%d\n",e);
        printf("当前的穿刺值:%d\n",a);
    }
    fflush(stdin);
    printf("\n"); 
    printf("按回车键退出......\n"); 
    getchar();
    return 0; 
}
