package cn.ekgc.demo01;

import java.util.Scanner;

/**
 * ��Ա����ϵͳ
 * 
 * @author 11142
 *
 */
public class VipManagement {
	public static void main(String[] args) {
		// һ����ʾ�˵�
		Scanner sc = new Scanner(System.in);
		int num = -1;// num��ʼֵ
		String re = "";// ���ز����ĳ�ʼֵ
		boolean flag = true;// �жϱ�ʶ
		String phone = "";// ����Ҫ������ֻ��ų�ʼֵ
		String pwd = "";// ����Ҫ����������ʼֵ
		String name = "";// ����Ҫ����������ʼֵ
		double money = 0.0;
//		int index = -1;//ѭ����ʹ��index��ʶ�жϣ�����Ҫ����	����ദʹ�õĻ������ܻ���ָ��Ǵ���	
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
		names[0] = "����";
		pwds[0] = "123456";
		moneys[0] = 200;

		while (flag) {
			System.out.println("\t��ӭʹ�û�Ա����ϵͳ");
			System.out.println("********************************************");
			System.out.println("\t1.ע���Ա\n\t2.�����ֻ��Ų�ѯ���\n\t3.��ֵ\n\t4.����\n\t"
					+ "5.�鿴�����û�\n\t6.����������ѯ�û���Ϣ(ģ����ѯ)\n\t7.�齱\n\t8.�޸�����\n\t9.ע���û�\n" + "\t0.�˳�");
			System.out.println("********************************************");
			System.out.print("��ѡ�������");
			num = sc.nextInt();
			switch (num) {
			case 1:
				// ע���Ա
				for(int i=0; i<=phones.length; i++) {
					if(phones[i] == null) {
						System.out.println("\n��Ա����ϵͳ -> ע���Ա");
						System.out.println("********************************************");
						System.out.print("�������Ա�ֻ��ţ�");
						phone = sc.next();
						for (int j = 0; j < phones.length; j++) {
							if (phones[j]!=null && phone.equals(phones[j])) {
								System.out.println("���ֻ����ѱ�ע�ᣡ");
								//index!=-1   �ֻ����Ѵ���
								zhuCe=j;
								System.out.print("\n����or�˳���(y/n)��");
								re = sc.next();
								break;
							} 
						}
						//�ֻ���û���ظ�
						if (zhuCe == -1) {
							//------------------------------------------------------
							System.out.print("�������Ա������");
							name = sc.next();
							System.out.print("�������Ա���룺");
							pwd = sc.next();
							System.out.print("�������Ա��");
							money = sc.nextDouble();		
							
							phones[i] = phone;
							names[i] = name;
							pwds[i] = pwd;
							moneys[i] = money;
							
							System.out.println("ע��ɹ���");
							System.out.println("�ֻ��ţ�" + phones[i] + "  ������" + names[i] + "  ���룺" + pwds[i] + "  ���:" + moneys[i]);
							//-----------------------------------------------------
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
						}
						break;
					}
				}
				break;
			case 2:
				// �����ֻ��Ų�ѯ���
				System.out.println("\n��Ա����ϵͳ -> �����ֻ��Ų�ѯ���");
				System.out.println("********************************************");
				System.out.print("������Ҫ��ѯ�����ֻ��ţ�");
				phone = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i])) {
						System.out.println("������" + names[i] + "  ��" + moneys[i]);
						System.out.print("\n����or�˳���(y/n)��");
						re = sc.next();
						chaXun = i;
						break;
					} 
				}
				if(chaXun == -1) {
					System.out.println("��������ֻ�������");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 3:
				// ��ֵ
				System.out.println("\n��Ա����ϵͳ -> ��ֵ");
				System.out.println("********************************************");
				System.out.print("������Ҫ��ֵ���ֻ��ţ�");
				phone = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i])) {
						System.out.print("�������ֵ��");
						money = sc.nextDouble();
						moneys[i] = moneys[i] + money;
						System.out.println("��ֵ�ɹ���\n������" + names[i] + "  ��" + moneys[i]);
						chongZhi = i;
						System.out.print("\n����or�˳���(y/n)��");
						re = sc.next();
						break;
					} 
				}
				if(chongZhi == -1) {
					System.out.println("��������ֻ�������");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 4:
				// ����
				System.out.println("\n��Ա����ϵͳ -> ����");
				System.out.println("********************************************");
				System.out.print("�������ֻ��ţ�");
				phone = sc.next();
				System.out.print("���������룺");
				pwd = sc.next();
				System.out.print("�����븶���");
				money = sc.nextDouble();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i]) && pwd.equals(pwds[i])) {
						if (moneys[i] >= money) {
							moneys[i] = moneys[i] - money;
							System.out.println("����ɹ�!�������Ϊ��" + moneys[i]);
							fuKuan = i;
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
							break;
						} else {
							System.out.println("�Բ����������㣡");
							fuKuan = i;
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
							break;
						}
					} 
				}
				if(fuKuan == -1) {
					System.out.println("�ֻ��Ż����벻��ȷ��");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 5:
				// �鿴�����û�
				System.out.println("\n��Ա����ϵͳ -> �鿴�����û�");
				System.out.println("********************************************");
				System.out.println("��ǰ�û��У�");
				for (int i = 0; i < phones.length; i++) {
					if (phones[i] != null) {
						System.out.println("�ֻ��ţ�" + phones[i] + "  ������" + names[i] + "  ���룺" + pwds[i] + "  ���:" + moneys[i]);
					}
				}

				System.out.print("\n����or�˳���(y/n)��");
				re = sc.next();
				break;
			case 6:
				// ����������ѯ�û���Ϣ(ģ����ѯ)
				System.out.println("\n��Ա����ϵͳ -> ����������ѯ�û���Ϣ(ģ����ѯ)");
				System.out.println("********************************************");
				System.out.print("������������");
				name = sc.next();
				for (int i = 0; i < names.length; i++) {
					//contains()��������ģ����ѯ
					if (names[i] != null && names[i].contains(name) ) {
						System.out.println("�ֻ��ţ�" + phones[i] + "  ������" + names[i] + "  ���:" + moneys[i]);
						moHu = i;
						System.out.print("\n����or�˳���(y/n)��");
						re = sc.next();
					} 
				}
				if(moHu == -1) {
					System.out.println("�û������ڣ�");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 7:
				// �齱
				System.out.println("\n��Ա����ϵͳ -> �齱");
				System.out.println("********************************************");
				System.out.print("�������ֻ��ţ�");
				phone = sc.next();
				int rd = (int)(Math.random()*100);
//				int rd = 0;//���Ų���
				for(int i=0; i<phones.length; i++) {
					if(rd == i && phones[i] != null) {
						System.out.println("�н��ֻ�����Ϊ��" + phones[i]);
						if(phone.equals(phones[i])) {
							System.out.println("��ϲ�����н��ˣ�");
							chouJiang = i;
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
						}
					}
				}
				if(chouJiang == -1) {
					System.out.println("���ź�����û�н���");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 8:
				// �޸�����
				System.out.println("\n��Ա����ϵͳ -> �޸�����");
				System.out.println("********************************************");
				System.out.print("�������ֻ���:");
				phone = sc.next();
				System.out.print("����������:");
				pwd = sc.next();
				for (int i = 0; i < phones.length; i++) {
					if (phones[i]!=null && phone.equals(phones[i]) && pwd.equals(pwds[i])) {
						System.out.print("������������:");
						String newPwd = sc.next();
						pwds[i] = newPwd;
						System.out.println("�޸ĳɹ���������Ϊ��" + pwds[i]) ;
						xiuGai = i;
						System.out.print("\n����or�˳���(y/n)��");
						re = sc.next();
						break;
					}
				}
				if(xiuGai == -1) {
					System.out.println("�ֻ��Ż����벻��ȷ��");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				break;
			case 9:
				// ע���û�
				System.out.println("\n��Ա����ϵͳ -> ע���û�");
				System.out.println("********************************************");
				System.out.print("�������ֻ���:");
				phone = sc.next();
				for(int i = 0; i < phones.length; i++) {
					if(phones[i]!=null && phone.equals(phones[i])) {
						System.out.print("ȷ��ע����(y/n)");
						String queRen = sc.next();
						if(queRen.equals("y")) {
							phones[i] = null;
							pwds[i] = null;
							names[i] = null;
							moneys[i] = 0.0;
							System.out.println("ע���ɹ����ټ���");
							zhuXiao = i;
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
						}else {
							System.out.println("��������ע��ʧ�ܣ�");
							zhuXiao = i;
							System.out.print("\n����or�˳���(y/n)��");
							re = sc.next();
						}
					}
				}
				if(zhuXiao == -1) {
					System.out.println("�ֻ��Ų���ȷ���û������ڣ�");
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next();
				}
				
				
				break;
			case 0:
				// �˳�
				System.out.println("\n���ѳɹ��˳�ϵͳ��");
				flag = false;
				break;

			default:
				System.out.println("����������������������!");
				break;
			}
			if(re.equals("y")) {
				continue;
			}else if (re.equals("n")) {
				System.out.println("\n���ѳɹ��˳�ϵͳ��");
				flag = false;
			}else {
				for(int i=3; i>0; i--) {
					System.out.println("�����������������룡�㻹��" + (i-1) + "�λ��ᣡ");
					count++;
					System.out.print("\n����or�˳���(y/n)��");
					re = sc.next().trim().toLowerCase();
					if(count == 2) {
						System.out.println("\n����������࣬���˳�ϵͳ��");
						flag =false;
						break;
					}
				}
			}
		}

	}
}
