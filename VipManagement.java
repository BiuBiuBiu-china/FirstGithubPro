package cn.ekgc.demo01;

import java.util.Scanner;

/**
 * 会员管理系统
 * 
 * @author 11142
 *
 */
public class VipManagement {
	public static void main(String[] args) {
		// 一、显示菜单
		Scanner sc = new Scanner(System.in);
		int num = -1;// num初始值
		String re = "";// 返回操作的初始值
		boolean flag = true;// 判断标识
		String phone = "";// 设置要输入的手机号初始值
		String pwd = "";// 设置要输入的密码初始值
		String name = "";// 设置要输入的密码初始值
		double money = 0.0;
//		int index = -1;//循环中使用index标识判断，很重要。。	如果多处使用的话，可能会出现覆盖错误。	
		int zhuCe = -1;
		int chaXun = -1;
		int chongZhi = -1;
		int fuKuan = -1;
		int moHu = -1;
		int chouJiang = -1;
		int xiuGai = -1;
		int zhuXiao = -1;
		int count = 0;
		
		
		String[] phones = new String[100];
		String[] names = new String[100];
		String[] pwds = new String[100];
		double[] moneys = new double[100];

		phones[0] = "13811111111";
		names[0] = "张三";
		pwds[0] = "123456";
		moneys[0] = 200;

		while (flag) {
			System.out.println("\t欢迎使用会员管理系统");
			System.out.println("********************************************");
			System.out.println("\t1.注册会员\n\t2.根据手机号查询余额\n\t3.充值\n\t4.付款\n\t"
					+ "5.查看所有用户\n\t6.根据姓名查询用户信息(模糊查询)\n\t7.抽奖\n\t8.修改密码\n\t9.注销用户\n" + "\t0.退出");
			System.out.println("********************************************");
			System.out.print("请选择操作：");
			num = sc.nextInt();
			switch (num) {
			case 1:
				// 注册会员
				for(int i=0; i<=phones.length; i++) {
					if(phones[i] == null) {
						System.out.println("\n会员管理系统 -> 注册会员");
						System.out.println("********************************************");
						System.out.print("请输入会员手机号：");
						phone = sc.next();
						for (int j = 0; j < phones.length; j++) {
							if (phones[j]!=null && phone.equals(phones[j])) {
								System.out.println("该手机号已被注册！");
								//index!=-1   手机号已存在
								zhuCe=j;
								System.out.print("\n返回or退出？(y/n)：");
								re = sc.next();
								break;
							} 
						}
						//手机号没有重复
						if (zhuCe == -1) {
							//------------------------------------------------------
							System.out.print("请输入会员姓名：");
							name = sc.next();
							System.out.print("请输入会员密码：");
							pwd = sc.next();
							System.out.print("请输入会员余额：");
							money = sc.nextDouble();		
							
							phones[i] = phone;
							names[i] = name;
							pwds[i] = pwd;
							moneys[i] = money;
							
							System.out.println("注册成功！");
							System.out.println("手机号：" + phones[i] + "  姓名：" + names[i] + "  密码：" + pwds[i] + "  余额:" + moneys[i]);
							//-----------------------------------------------------
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
						}
						break;
					}
				}
				break;
			case 2:
				// 根据手机号查询余额
				System.out.println("\n会员管理系统 -> 根据手机号查询余额");
				System.out.println("********************************************");
				System.out.print("请输入要查询余额的手机号：");
				phone = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i])) {
						System.out.println("姓名：" + names[i] + "  余额：" + moneys[i]);
						System.out.print("\n返回or退出？(y/n)：");
						re = sc.next();
						chaXun = i;
						break;
					} 
				}
				if(chaXun == -1) {
					System.out.println("您输入的手机号有误！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 3:
				// 充值
				System.out.println("\n会员管理系统 -> 充值");
				System.out.println("********************************************");
				System.out.print("请输入要充值的手机号：");
				phone = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i])) {
						System.out.print("请输入充值金额：");
						money = sc.nextDouble();
						moneys[i] = moneys[i] + money;
						System.out.println("充值成功！\n姓名：" + names[i] + "  余额：" + moneys[i]);
						chongZhi = i;
						System.out.print("\n返回or退出？(y/n)：");
						re = sc.next();
						break;
					} 
				}
				if(chongZhi == -1) {
					System.out.println("您输入的手机号有误！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 4:
				// 付款
				System.out.println("\n会员管理系统 -> 付款");
				System.out.println("********************************************");
				System.out.print("请输入手机号：");
				phone = sc.next();
				System.out.print("请输入密码：");
				pwd = sc.next();
				System.out.print("请输入付款金额：");
				money = sc.nextDouble();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i]) && pwd.equals(pwds[i])) {
						if (moneys[i] >= money) {
							moneys[i] = moneys[i] - money;
							System.out.println("付款成功!您的余额为：" + moneys[i]);
							fuKuan = i;
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
							break;
						} else {
							System.out.println("对不起，您的余额不足！");
							fuKuan = i;
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
							break;
						}
					} 
				}
				if(fuKuan == -1) {
					System.out.println("手机号或密码不正确！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 5:
				// 查看所有用户
				System.out.println("\n会员管理系统 -> 查看所有用户");
				System.out.println("********************************************");
				System.out.println("当前用户有：");
				for (int i = 0; i < phones.length; i++) {
					if (phones[i] != null) {
						System.out.println("手机号：" + phones[i] + "  姓名：" + names[i] + "  密码：" + pwds[i] + "  余额:" + moneys[i]);
					}
				}

				System.out.print("\n返回or退出？(y/n)：");
				re = sc.next();
				break;
			case 6:
				// 根据姓名查询用户信息(模糊查询)
				System.out.println("\n会员管理系统 -> 根据姓名查询用户信息(模糊查询)");
				System.out.println("********************************************");
				System.out.print("请输入姓名：");
				name = sc.next();
				for (int i = 0; i < names.length; i++) {
					//contains()方法进行模糊查询
					if (names[i] != null && names[i].contains(name) ) {
						System.out.println("手机号：" + phones[i] + "  姓名：" + names[i] + "  余额:" + moneys[i]);
						moHu = i;
						System.out.print("\n返回or退出？(y/n)：");
						re = sc.next();
					} 
				}
				if(moHu == -1) {
					System.out.println("用户不存在！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 7:
				// 抽奖
				System.out.println("\n会员管理系统 -> 抽奖");
				System.out.println("********************************************");
				System.out.print("请输入手机号：");
				phone = sc.next();
				int rd = (int)(Math.random()*100);
//				int rd = 0;//后门测试
				for(int i=0; i<phones.length; i++) {
					if(rd == i && phones[i] != null) {
						System.out.println("中奖手机号码为：" + phones[i]);
						if(phone.equals(phones[i])) {
							System.out.println("恭喜您！中奖了！");
							chouJiang = i;
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
						}
					}
				}
				if(chouJiang == -1) {
					System.out.println("很遗憾，您没中奖。");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 8:
				// 修改密码
				System.out.println("\n会员管理系统 -> 修改密码");
				System.out.println("********************************************");
				System.out.print("请输入手机号:");
				phone = sc.next();
				System.out.print("请输入密码:");
				pwd = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i]) && pwd.equals(pwds[i])) {
						System.out.print("请输入新密码:");
						String newPwd = sc.next();
						pwds[i] = newPwd;
						System.out.println("修改成功！新密码为：" + pwds[i]) ;
						xiuGai = i;
						System.out.print("\n返回or退出？(y/n)：");
						re = sc.next();
						break;
					}
				}
				if(xiuGai == -1) {
					System.out.println("手机号或密码不正确！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				break;
			case 9:
				// 注销用户
				System.out.println("\n会员管理系统 -> 注销用户");
				System.out.println("********************************************");
				System.out.print("请输入手机号:");
				phone = sc.next();
				for(int i = 0; i < phones.length; i++) {
					if(phones[i]!=null && phone.equals(phones[i])) {
						System.out.print("确认注销吗？(y/n)");
						String queRen = sc.next();
						if(queRen.equals("y")) {
							phones[i] = null;
							pwds[i] = null;
							names[i] = null;
							moneys[i] = 0.0;
							System.out.println("注销成功！再见！");
							zhuXiao = i;
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
						}else {
							System.out.println("悬崖勒马，注销失败！");
							zhuXiao = i;
							System.out.print("\n返回or退出？(y/n)：");
							re = sc.next();
						}
					}
				}
				if(zhuXiao == -1) {
					System.out.println("手机号不正确！用户不存在！");
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next();
				}
				
				
				break;
			case 0:
				// 退出
				System.out.println("\n您已成功退出系统！");
				flag = false;
				break;

			default:
				System.out.println("您的输入有误，请重新输入!");
				break;
			}
			if(re.equals("y")) {
				continue;
			}else if (re.equals("n")) {
				System.out.println("\n您已成功退出系统！");
				flag = false;
			}else {
				for(int i=3; i>0; i--) {
					System.out.println("输入有误！请重新输入！你还有" + (i-1) + "次机会！");
					count++;
					System.out.print("\n返回or退出？(y/n)：");
					re = sc.next().trim().toLowerCase();
					if(count == 2) {
						System.out.println("\n错误次数过多，已退出系统！");
						flag =false;
						break;
					}
				}
			}
		}

	}
}
