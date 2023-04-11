#include <iostream>

int main()
{
	int jn = 0, h = 0, cu = 0;
	//jn:技能 h:回合 cu:技能等级对应出手
	//初始出手
	float cs = 0, cs1 = 0, cs2 = 0, cs3 = 0, cs4 = 0;
	float cs5 = 0, cs6 = 0, cs7 = 0, cs8 = 0, cs9 = 0;
	//1-9为后面顶掉叠加值做承接准备
	int cj1 = 0, cj2 = 0, cj3 = 0, cj4 = 0, cj5 = 0;
	int cj6 = 0, cj7 = 0, cj8 = 0, cj9 = 0, cj10 = 0;
	int din1 = 0, din2 = 0, din3 = 0, din4 = 0, din5 = 0;
	int din6 = 0, din7 = 0, din8 = 0, din9 = 0, din10 = 0;
	printf("请输入初始出手:");
	scanf_s("%f", &cs);
	cs += 1400;//幻影马车技能固定1400出手
	cs1 = cs2 = cs3 = cs4 = cs5 = cs6 = cs7 = cs8 = cs9 = cs;
	printf("请输入技能等级:");
	scanf_s("%d", &jn);
	printf("你的技能等级为:%d级\n", jn);
	printf("注意：技能等级输入错误自动默认为0级\n");
	switch (jn) {//根据技能等级判断出手速度
	case 1:
		cu = 200;
		break;
	case 2:
		cu = 350;
		break;
	case 3:
		cu = 500;
		break;
	case 4:
		cu = 650;
		break;
	case 5:
		cu = 800;
		break;
	case 6:
		cu = 950;
		break;
	case 7:
		cu = 1100;
		break;
	case 8:
		cu = 1250;
		break;
	case 9:
		cu = 1400;
		break;
	default:
		cu = 0;//等级错误不加出手
		printf("你的技能等级为:0级");
		break;
	}
	printf("您的技能所对应的出手为:%d\n", cu);
	while (h < 3) {
		h++;
		cs = cs * 1.3;
		if (h == 1) {
			cs += cu;
		}
		if (jn == 9 && h == 2) {
			cs += cu;
		}
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n\n", cs);
	}
	while (h < 6) {
		h++;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;
		if (h == 4) {
			cs1 += cu;
		}
		if (jn == 9 && h == 5) {
			cs1 += cu;
		}

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 9) {
		h++;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;
		if (h == 7) {
			cs2 += cu;
		}
		if (jn == 9 && h == 8) {
			cs2 += cu;
		}

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 12) {
		h++;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;
		if (h == 10) {
			cs3 += cu;
		}
		if (jn == 9 && h == 11) {
			cs3 += cu;
		}

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 15) {
		h++;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;
		if (h == 13) {
			cs4 += cu;
		}
		if (jn == 9 && h == 14) {
			cs4 += cu;
		}

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 18) {
		h++;
		cj5 = cs5;
		cs5 = cs5 * 1.3;
		din5 = cs5 - cj5;
		if (h == 16) {
			cs5 += cu;
		}
		if (jn == 9 && h == 17) {
			cs5 += cu;
		}

		cs4 = cs4 - din5;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 21) {
		h++;
		cj6 = cs6;
		cs6 = cs6 * 1.3;
		din6 = cs6 - cj6;
		if (h == 19) {
			cs6 += cu;
		}
		if (jn == 9 && h == 20) {
			cs6 += cu;
		}

		cs5 = cs5 - din6;
		cj5 = cs5;
		cs5 = cs5 * 1.3;
		din5 = cs5 - cj5;

		cs4 = cs4 - din5;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 24) {
		h++;
		cj7 = cs7;
		cs7 = cs7 * 1.3;
		din7 = cs7 - cj7;
		if (h == 22) {
			cs7 += cu;
		}
		if (jn == 9 && h == 23) {
			cs7 += cu;
		}

		cs6 = cs6 - din7;
		cj6 = cs6;
		cs6 = cs6 * 1.3;
		din6 = cs6 - cj6;

		cs5 = cs5 - din6;
		cj5 = cs5;
		cs5 = cs5 * 1.3;
		din5 = cs5 - cj5;

		cs4 = cs4 - din5;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 27) {
		h++;
		cj8 = cs8;
		cs8 = cs8 * 1.3;
		din8 = cs8 - cj8;
		if (h == 25) {
			cs8 += cu;
		}
		if (jn == 9 && h == 26) {
			cs8 += cu;
		}

		cs7 = cs7 - din8;
		cj7 = cs7;
		cs7 = cs7 * 1.3;
		din7 = cs7 - cj7;

		cs6 = cs6 - din7;
		cj6 = cs6;
		cs6 = cs6 * 1.3;
		din6 = cs6 - cj6;

		cs5 = cs5 - din6;
		cj5 = cs5;
		cs5 = cs5 * 1.3;
		din5 = cs5 - cj5;

		cs4 = cs4 - din5;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	while (h < 30) {
		h++;
		cj9 = cs9;
		cs9 = cs9 * 1.3;
		din9 = cs9 - cj9;
		if (h == 28) {
			cs9 += cu;
		}
		if (jn == 9 && h == 29) {
			cs9 += cu;
		}

		cs8 = cs8 - din9;
		cj8 = cs8;
		cs8 = cs8 * 1.3;
		din8 = cs8 - cj8;

		cs7 = cs7 - din8;
		cj7 = cs7;
		cs7 = cs7 * 1.3;
		din7 = cs7 - cj7;

		cs6 = cs6 - din7;
		cj6 = cs6;
		cs6 = cs6 * 1.3;
		din6 = cs6 - cj6;

		cs5 = cs5 - din6;
		cj5 = cs5;
		cs5 = cs5 * 1.3;
		din5 = cs5 - cj5;

		cs4 = cs4 - din5;
		cj4 = cs4;
		cs4 = cs4 * 1.3;
		din4 = cs4 - cj4;

		cs3 = cs3 - din4;
		cj3 = cs3;
		cs3 = cs3 * 1.3;
		din3 = cs3 - cj3;

		cs2 = cs2 - din3;
		cj2 = cs2;
		cs2 = cs2 * 1.3;
		din2 = cs2 - cj2;

		cs1 = cs1 - din2;
		cj1 = cs1;
		cs1 = cs1 * 1.3;
		din1 = cs1 - cj1;

		cs = cs - din1;
		cs = cs * 1.3;
		printf("【当前为第%d回合】\n", h);
		printf("当前出手为:%.0f\n", cs);
		printf("顶的值为:%d\n\n", din1);
	}
	return 0;
}