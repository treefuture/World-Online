#include"stdio.h" 
int main()
{
    int a,b=0,c=0,d=0;
    int e=0,f=0,g=0,h,i,j,k=1000000;
    int a1=0,a2=0,a3=0,a4=0,a5=0;
    //叠加魔化(a后面的值为返回的伦数)
    int d1=0,d2=0,d3=0,d4=0,d5=0;
    //返回值(b后面得值为返回的伦数)
    int c1=0,c2=0,c3=0,c4=0,c5=0;
    //叠加得值(c后面得值为返回的伦数)
    printf("请输入劈砍(穿刺得值):");
    scanf("%d",&a);
    a1=a2=a3=a4=a5=a;
    //保存a的初值
    while(b<5) {
        if(a>=k) {
            break;
        }
        //魔化持续5回合
        d=a;//保存a的返回值
        a=a*1.24;//叠魔化得值
        b++;//回合
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
    }
    while(b<10) {
        if(a>=k) {
            break;
        }
        b++;//回合
        d1=a1;//保存e的返回值(第一轮顶得值)
        a1=a1*1.24;//魔化叠加(第一轮顶得值)
        c1=a1-d1;//叠加的值(第一轮顶得值)
        d=a-c1;//保存a的返回值
        a=(a-c1)*1.24;//魔化叠加
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("顶的值%d\n",c1);
    }
    while(b<15) {
        if(a>=k) {
            break;
        }
        b++;//回合
        d2=a2;//保留a2的返回值(第二轮顶得值)
        a2=a2*1.24;//魔化叠加(第二轮顶得值)
        c2=a2-d2;//叠加的值(第二轮顶的值)
        d1=a1-c2;//保存a1的返回值(第一轮顶得值)
        a1=(a1-c2)*1.24;//魔化叠加(第一轮轮顶得值)
        c1=a1-d1;//叠加的值(第一轮顶的值)
        d=a-c1;//保存a的返回值
        a=(a-c1)*1.24;//魔化叠加
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("顶的值%d\n",c1);
    }
    while(b<20) {
        if(a>=k) {
            break;
        }
        b++;//回合
        d3=a3;//保留a3的返回值(第三轮顶的值)
        a3=a3*1.24;//魔化叠加(第三轮顶的值)
        c3=a3-d3;//顶得值(第三轮顶的值)
        d2=a2-c3;//保留a2的返回值(第二轮顶得值)
        a2=(a2-c3)*1.24;//魔化叠加(第二轮顶得值)
        c2=a2-d2;//叠加的值(第二轮顶的值)
        d1=a1-c2;//保存a1的返回值(第一轮顶得值)
        a1=(a1-c2)*1.24;//魔化叠加(第一轮轮顶得值)
        c1=a1-d1;//叠加的值(第一轮顶的值)
        d=a-c1;//保存a的返回值
        a=(a-c1)*1.24;//魔化叠加
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("顶的值%d\n",c1);
    }
    while(b<25) {
        if(a>=k) {
            break;
        }
        b++;//回合
        d4=a4;//保留a4的返回值(第四轮顶的值)
        a4=a4*1.24;//魔化叠加的值(第四轮顶的值)
        c4=a4-d4;//顶的值(第四轮顶的值)
        d3=a3-c4;//保留a3的返回值(第三轮顶的值)
        a3=(a3-c4)*1.24;//魔化叠加(第三轮顶的值)
        c3=a3-d3;//顶得值(第三轮顶的值)
        d2=a2-c3;//保留a2的返回值(第二轮顶得值)
        a2=(a2-c3)*1.24;//魔化叠加(第二轮顶得值)
        c2=a2-d2;//叠加的值(第二轮顶的值)
        d1=a1-c2;//保存a1的返回值(第一轮顶得值)
        a1=(a1-c2)*1.24;//魔化叠加(第一轮轮顶得值)
        c1=a1-d1;//叠加的值(第一轮顶的值)
        d=a-c1;//保存a的返回值
        a=(a-c1)*1.24;//魔化叠加
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("顶的值%d\n",c1);
    }
    while(b<30) {
        if(a>=k) {
            break;
        }
        b++;//回合
        d5=a5;//保留a5的返回值(第五轮顶的值)
        a5=a5*1.24;//魔化叠加的值(第五轮顶的值)
        c5=a5-d5;//顶的值(第五轮顶的值)
        d4=a4-c5;//保留a4的返回值(第四轮顶的值)
        a4=(a4-c5)*1.24;//魔化叠加的值(第四轮顶的值)
        c4=a4-d4;//顶的值(第四轮顶的值)
        d3=a3-c4;//保留a3的返回值(第三轮顶的值)
        a3=(a3-c4)*1.24;//魔化叠加(第三轮顶的值)
        c3=a3-d3;//顶得值(第三轮顶的值)
        d2=a2-c3;//保留a2的返回值(第二轮顶得值)
        a2=(a2-c3)*1.24;//魔化叠加(第二轮顶得值)
        c2=a2-d2;//叠加的值(第二轮顶的值)
        d1=a1-c2;//保存a1的返回值(第一轮顶得值)
        a1=(a1-c2)*1.24;//魔化叠加(第一轮轮顶得值)
        c1=a1-d1;//叠加的值(第一轮顶的值)
        d=a-c1;//保存a的返回值
        a=(a-c1)*1.24;//魔化叠加
        c=a-d;//叠加的值
        printf("【当前的回合:%d】\n",b);
        printf("当前所叠加的值:%d\n",c);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("顶的值%d\n",c1);
    }
    fflush(stdin);
    printf("\n"); 
    printf("按回车键退出......\n"); 
    getchar();
    return 0; 
}
