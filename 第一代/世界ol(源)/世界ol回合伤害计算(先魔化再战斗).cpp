#include"stdio.h" 
int main()
{
    int a,a1,a2,a3,a4,a5;//a��ֵ
    int b=0,b1=0,b2=0,b3=0,b4=0,b5=0;
    //a�ĳ�ֵֵ����
    int c=0,c1=0,c2=0,c3=0,c4=0,c5=0;
    //ħ�����ӵ�ֵ
    int e=0,e1=0,e2=0,e3=0,e4=0,e5=0;
    //a�ķ���ֵ����
    int f=0,f1=0,f2=0,f3=0,f4=0,f5=0;
    //ս�����ӵ�ֵ
    int d=0,h=1000000,g;
    int i,j,k,v,z,l=0,m=0,n=0,o=0,p=0,q=0;
    int r=0,s=0,t=0,u=0;
    float qm,qm1,qm2,qm3,qm4;//ǿ����ǿ���˺�
    float v1;//�н�����˺�
    printf("������ʱ���ö��Ÿ��������������̡�\n");
    printf("����������:");
    scanf("%d,%d",&i,&j);
    k=(i+j)/2;//����
    printf("��ǰ������ֵ:%d\n",k);
    printf("�����빥��:");
    scanf("%d",&z);
    printf("�������������ܼӵĹ���:");
    scanf("%d",&v);
    printf("����������(����)ֵ:");
    scanf("%d",&a);
    printf("������ǿ��ֵ:");
    scanf("%f",&qm);
    qm=qm<=100?qm:100;
    qm=qm/100;
    a1=a2=a3=a4=a5=a;
    z=z+v;
    while(d<5) {
        if(a>=h) {
            break;
        }
        d++;
        b=a;//����a�ķ���ֵ
        a=a*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;//�ж�����(����ֵ)
        z=z+6;//���ε���
        z=z>99?99:z;//�жϹ���
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    while(d<10) {
        if(a>=h) {
            break;
        }
        d++;
        b1=a1;//����a�ķ���ֵ
        a1=a1*1.24;//����ħ��
        c1=a1-b1;//ħ�����ӵ�ֵ
        e1=a1-f1;//����a1��һ�غϵ�ֵ
        a1=(a1-f1)*1.4;//����ħ��
        f1=a1-e1;//����ħ����ֵ
        b=(a-c1);//����a�ķ���ֵ
        a=(a-c1)*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    while(d<15) {
        if(a>=h) {
            break;
        }
        d++;
        b2=a2;//����a2�ķ���ֵ
        a2=a2*1.24;//����ħ��
        c2=a2-b2;//ħ�����ӵ�ֵ
        e2=a2-f2;//����a2��һ�غϵ�ֵ
        a2=(a2-f2)*1.4;//����ս��
        f2=a2-e2;//ս�����ӵ�ֵ
        b1=(a1-c2);//����a1�ķ���ֵ
        a1=(a1-c2)*1.24;//����ħ��
        c1=a1-b1;//���ӵ�ֵ
        e1=a1-f1;//����a1��һ�غϵ�ֵ
        a1=(a1-f1)*1.4;//����ս��
        f1=a1-e1;//ս�����ӵ�ֵ
        b=(a-c1);//����a�ķ���ֵ
        a=(a-c1)*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    while(d<20) {
        if(a>=h) {
            break;
        }
        d++;
        b3=a3;//����a3�ķ���ֵ
        a3=a3*1.24;//����ħ��
        c3=a3-b3;//ħ�����ӵ�ֵ
        e3=a3-f3;//����a3��һ�غϵ�ֵ
        a3=(a3-f3)*1.4;//����ս��
        f3=a3-e3;//ս�����ӵ�ֵ
        b2=(a2-c3);//����a2�ķ���ֵ
        a2=(a2-c3)*1.24;//����ħ��
        c2=a2-b2;//ħ�����ӵ�ֵ
        e2=a2-f2;//����a2��һ�غϵ�ֵ
        a2=(a2-f2)*1.4;//����ս��
        f2=a2-e2;//ս�����ӵ�ֵ
        b1=(a1-c2);//����a1�ķ���ֵ
        a1=(a1-c2)*1.24;//����ħ��
        c1=a1-b1;//ħ�����ӵ�ֵ
        e1=a1-f1;//����a1��һ�غϵ�ֵ
        a1=(a1-f1)*1.4;//����ս��
        f1=a1-e1;//ս�����ӵ�ֵ
        b=(a-c1);//����a�ķ���ֵ
        a=(a-c1)*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    while(d<25) {
        if(a>=h) {
            break;
        }
        d++;
        b4=a4;//����a4�ķ���ֵ
        a4=a4*1.24;//����ħ��
        c4=a4-b4;//ħ�����ӵ�ֵ
        e4=a4-f4;//����a4��һ�غϵ�ֵ
        a4=(a4-f4)*1.4;//����ս��
        f4=a4-e4;//ս�����ӵ�ֵ
        b3=(a3-c4);//����a3�ķ���ֵ
        a3=(a3-c4)*1.24;//����ħ��
        c3=a3-b3;//ħ�����ӵ�ֵ
        e3=a3-f3;//����a3��һ�غϵ�ֵ
        a3=(a3-f3)*1.4;//����ս��
        f3=a3-e3;//ս�����ӵ�ֵ
        b2=(a2-c3);//����a2�ķ���ֵ
        a2=(a2-c3)*1.24;//����ħ��
        c2=a2-b2;//ħ�����ӵ�ֵ
        e2=a2-f2;//����a2��һ�غϵ��ӵ�ֵ
        a2=(a2-f2)*1.4;//����ս��
        f2=a2-e2;//ս�����ӵ�ֵ
        b1=(a1-c2);//����a1�ķ���ֵ
        a1=(a1-c2)*1.24;//����ħ��
        c1=a1-b1;//ħ�����ӵ�ֵ
        e1=a1-f1;//����a1��һ�غϵ�ֵ
        a1=(a1-f1)*1.4;//����ս��
        f1=a1-e1;//ս�����ӵ�ֵ
        b=(a-c1);//����a�ķ���ֵ
        a=(a-c1)*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    while(d<30) {
        if(a>=h) {
            break;
        }
        d++;
        b5=a5;//����a5�ķ���ֵ
        a5=a5*1.24;//����ħ��
        c5=a5-b5;//ħ�����ӵ�ֵ
        e5=a5-f5;//����a5��һ�غϵ�ֵ
        a5=(a5-f5)*1.4;//����ս��
        f5=a5-e5;//ս�����ӵ�ֵ
        b4=(a4-c5);//����a4�ķ���ֵ
        a4=(a4-c5)*1.24;//����ħ��
        c4=a4-b4;//ħ�����ӵ�ֵ
        e4=a4-f4;//����a4��һ�غϵ�ֵ
        a4=(a4-f4)*1.4;//����ս��
        f4=a4-e4;//ս�����ӵ�ֵ
        b3=(a3-c4);//����a3�ķ���ֵ
        a3=(a3-c4)*1.24;//����ħ��
        c3=a3-b3;//ħ�����ӵ�ֵ
        e3=a3-f3;//����a3��һ�غϵ�ֵ
        a3=(a3-f3)*1.4;//����ս��
        f3=a3-e3;//ս�����ӵ�ֵ
        b2=(a2-c3);//����a2�ķ���ֵ
        a2=(a2-c3)*1.24;//����ħ��
        c2=a2-b2;//ħ�����ӵ�ֵ
        e2=a2-f2;//����a2��һ�غϵ�ֵ
        a2=(a2-f2)*1.4;//����ս��
        f2=a2-e2;//ս�����ӵ�ֵ
        b1=(a1-c2);//����a1�ķ���ֵ
        a1=(a1-c2)*1.24;//����ħ��
        c1=a1-b1;//ħ�����ӵ�ֵ
        e1=a1-f1;//����a1��һ�غϵ�ֵ
        a1=(a1-f1)*1.4;//����ħ��
        f1=a1-e1;//ħ�����ӵ�ֵ
        b=(a-c1);//����a�ķ���ֵ
        a=(a-c1)*1.24;//����ħ��
        c=a-b;//ħ�����ӵ�ֵ
        g=f;//����ս�����ӵ�ֵ
        e=a-f;//����a��һ�غϵ�ֵ
        a=(a-f)*1.4;//����ս��
        f=a-e;//ս�����ӵ�ֵ
        a=a>h?h:a;
        l=(k*z+a)*1.5;//�����˺�ֵ
        m=l*0.3;//ȫ�������˺�(ħ��)
        qm1=m*qm;//ȫ������ǿ���˺�(ħ��)
        o=l*1.1*0.3;//��Ѫ״̬���˺�(ħ��)
        p=l*1.2*0.3;//˥��״̬���˺�(ħ��)
        q=l*1.1*1.2*0.3;//˫״̬���˺�(ħ��)
        qm2=q*qm;//˫״̬ǿ���˺�(ħ��)
        r=l;//ȫ�������˺�
        qm3=r*qm;//ȫ������ǿ���˺�
        s=l*1.1;//��Ѫ״̬���˺�
        t=l*1.2;//˥��״̬���˺�
        u=l*1.1*1.2;//˫״̬���˺�
        qm4=u*qm;//˫״̬ǿ���˺�
        printf("����ǰ�Ļغ�%d��\n",d);
        printf("��ǰ�Ĺ���:%d\n",z);
        printf("��ǰ������(����)ֵ%d\n",a);
        printf("ȫ������(ħ��)�˺�:%d\n",m);
        v1=m/z*(z-7);
        printf("ȫ������(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",m-v1);
        printf("ȫ������(ħ��)ǿ���˺�:%.2f\n",qm1);
        printf("ǿ����ʧֵ:%.2f\n",m-qm1);
        printf("��Ѫ״̬��(ħ��)�˺�:%d\n",o);
        printf("˥��״̬��(ħ��)�˺�:%d\n",p);
        printf("˫״̬��(ħ��)�˺�:%d\n",q);
        v1=q/z*(z-7);
        printf("˫״̬��(ħ��)����˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",q-v1);
        printf("˫״̬ǿ��(ħ��)�˺�:%.2f\n",qm2);
        printf("ǿ����ʧֵ:%.2f\n",q-qm2);
        printf("ȫ�������˺�:%d\n",r);
        v1=r/z*(z-7);
        printf("ȫ����������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",r-v1);
        printf("ȫ������ǿ���˺�:%.2f\n",qm3);
        printf("ǿ����ʧֵ:%.2f\n",r-qm3);
        printf("��Ѫ״̬���˺�:%d\n",s);
        printf("˥��״̬���˺�:%d\n",t);
        printf("˫״̬���˺�:%d\n",u);
        v1=u/z*(z-7);
        printf("˫״̬������˺�:%.2f\n",v1);
        printf("��ʧֵ:%.2f\n",u-v1);
        printf("˫״̬ǿ���˺�:%.2f\n",qm4);
        printf("ǿ����ʧֵ:%.2f\n",u-qm4);
    }
    fflush(stdin);
    printf("\n"); 
    printf("���س����˳�......\n"); 
    getchar();
    return 0; 
}
