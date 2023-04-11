#include<iostream>
using namespace std;

int main()
{
    int a,c=0,d=0,e=0,f=0;
    float b=1.4;
    printf("请输入劈砍(穿刺)值:");
    scanf("%d",&a);
    while(c<5) {
        c++;
        if(c%2==0) {
            b=1;
        } else {
            b=1.4;
        }
        f=e;//顶的值
        d=a;//保留a的返回值
        a=a*b;
        e=a-d;
        printf("【当前为第%d回合】\n",c);
        printf("顶的值:%d\n",f);
        printf("b当前的值:%f\n",b);
        printf("当前的劈砍(穿刺)值:%d\n",a);
        printf("当前叠加的值:%d\n",e);
    }
}