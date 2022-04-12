
CREATE TABLE TRAVEL(
   DESTINATION VARCHAR2(1000) PRIMARY KEY,
   NATION VARCHAR2(1000),
   FESTIVAL VARCHAR2(1000),
   FOOD VARCHAR2(1000),
   ACTIVITY VARCHAR2(1000)
);




SELECT* FROM travel;


/*nation2 �÷� �߰�*/
ALTER TABLE Travel add(NATION2 varchar2(1000));

/*nation2 �÷��� �Է��ϱ�*/
update TRAVEL SET NATION2 ='�̱�' WHERE DESTINATION = '�׷���ĳ��';
update TRAVEL SET NATION2 ='�߽���' WHERE DESTINATION = '��������';
update TRAVEL SET NATION2 ='�߽���' WHERE DESTINATION = '���̵�������';
update TRAVEL SET NATION2 ='�׸���' WHERE DESTINATION = '���ڽ� ����';
update TRAVEL SET NATION2 ='�ɶ���' WHERE DESTINATION = '���ö���';
update TRAVEL SET NATION2 ='������' WHERE DESTINATION = '��ī���߸���';
update TRAVEL SET NATION2 ='���̽�����' WHERE DESTINATION = '����ļ��ũ';
update TRAVEL SET NATION2 ='�븣����' WHERE DESTINATION = '���߹ٸ�����';
update TRAVEL SET NATION2 ='������' WHERE DESTINATION = '�����';
update TRAVEL SET NATION2 ='����' WHERE DESTINATION = '��������Ʈ';
update TRAVEL SET NATION2 ='�ε�' WHERE DESTINATION = '����Ǫ��';
update TRAVEL SET NATION2 ='������' WHERE DESTINATION = '�ú����̽�ġ��';
update TRAVEL SET NATION2 ='���' WHERE DESTINATION = '�Ϲٳ�';
update TRAVEL SET NATION2 ='�׸���' WHERE DESTINATION = '���丮��';
update TRAVEL SET NATION2 ='�����̽þ�' WHERE DESTINATION = '��ŸŰ���߷�';
update TRAVEL SET NATION2 ='�����' WHERE DESTINATION = '�����';
update TRAVEL SET NATION2 ='��Ż����' WHERE DESTINATION = '����ġ��';
update TRAVEL SET NATION2 ='��Ÿ' WHERE DESTINATION = '��Ÿ';
update TRAVEL SET NATION2 ='ȫ��' WHERE DESTINATION = 'ȫ��';
update TRAVEL SET NATION2 ='�̱�' WHERE DESTINATION = '�Ͽ���';
update TRAVEL SET NATION2 ='�ʸ���' WHERE DESTINATION = '����ī��';
update TRAVEL SET NATION2 ='�ȶ��' WHERE DESTINATION = '�ȶ��';
update TRAVEL SET NATION2 ='ȣ��' WHERE DESTINATION = '����';
update TRAVEL SET NATION2 ='�̱�' WHERE DESTINATION = '�󽺺�����';
update TRAVEL SET NATION2 ='����' WHERE DESTINATION = '����ī����';
update TRAVEL SET NATION2 ='��ī��' WHERE DESTINATION = '��ī��';
update TRAVEL SET NATION2 ='�̰�����' WHERE DESTINATION = '�̰�����';
update TRAVEL SET NATION2 ='�����' WHERE DESTINATION = '�����ɽ�';
update TRAVEL SET NATION2 ='��Ż����' WHERE DESTINATION = '�ж��';
update TRAVEL SET NATION2 ='�Ϻ�' WHERE DESTINATION = '����ī';
update TRAVEL SET NATION2 ='ü��' WHERE DESTINATION = '������';
update TRAVEL SET NATION2 ='������' WHERE DESTINATION = '�ĸ�';
update TRAVEL SET NATION2 ='����' WHERE DESTINATION = '����';
update TRAVEL SET NATION2 ='�̱�' WHERE DESTINATION = '������DC';
update TRAVEL SET NATION2 ='��Ʈ��' WHERE DESTINATION = '�ٳ�';
update TRAVEL SET NATION2 ='ȫ��' WHERE DESTINATION = 'ȫ��';
update TRAVEL SET NATION2 ='�̱�' WHERE DESTINATION = '����';


/*�ڷ� �Է�*/
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�׷���ĳ��', '�̱�', '(�ų� 11�� ��)�Ǵн� ���� �۽�Ʈ �ָ����� ���� ����', '�ξؾƿ� ���� ', '�׷��� ĳ�Ͼ� ����Ʈ�� �︮���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��������', '�߽���', '(�ų� 5�� 15��)San Isidro Labrador�� 2 �� ', '��īī -(���������� ���� ���, ���� ��� �� ���� �Ǵ� ���� ���)', '2.3km�� ���̿��� ���� �� ¤���� �ڽ�');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('���̵�������', '�߽���', '(�ų� 10��31��~ 12��2��)������ �� ����', '�θ��� ', '���̵��� ���� ��Ʈ ü��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('���ڽ� ����', '�׸���', '(�ų� 4�� �߼�) ����ϼҽ� ����', '�����Ű (������ �׸����� �н�Ʈ Ǫ��)', '���ڽ� ������ ���迡�� ���� ���� �����ε�...�� ��ü�� �̻�ü���̴�...');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('���ö���', '�ɶ���', '(�ų� 12��)��Ÿ���� ����', 'Į������(������ ���� ���� ä�� �ɶ���� ������ ��������)', '���� ���ĸ�, �㽺Ű ���');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��ī���߸���', '������', '(�ų� 4��30��)��Ǫ���⽺ ������', '�׶�����(���������� ��ܸԴ� ��ǥ���� ����� ���� ����)', '�� ���, ���� ���, ������ ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����ļ��ũ', '���̽�����', '(�ų� 6�� ��)����ŷ �佺Ƽ��', '����� (��Ӹ� ���� ����)', '���̽������� ���� ǳ���� �� �� �ִ� ������ & ���� �ؾ� ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('���߹ٸ�����', '�븣���� ', '(�ų� 1�� ��~ 2�� ��) Ʈ�Ҽ� ���ζ� ����', '�׶�����(������ �ұ� ����� ������ ���� ����(����)�� �Ϸ���Ʋ ������ ���� �丮)', '��쳪ü��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�����', '������', '(�ų� 2��)�Ͻ� ī�Ϲ�', '����ī����(�����̿丮) or �����', '350km�� ��ģ Ʈ��ŷ�ڽ��� ���� �ȴ� ����� ����� Ʈ��ŷ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��������Ʈ', '����', '(�ų� 9��~ 10��)����������', 'ź�θ� ġŲ (��ŷḦ �ְ� �䱸��Ʈ�� ����)', '�з�ȣŷ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����Ǫ��', '�ε�', '(�ų� 3��2��)Ȧ���佺Ƽ��', '�񸮾ߴ�(���� �ֵ� ����̰�, ���⿡ ��ŷ�, ���, ���, ä��, ���� ���� ���� �־� �����丮)', '�ڳ��� Ʈ��ŷ ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�ú����̽�ġ��', '������', '(�ų� 6�� �߼�~��)����������(ǳ������)', '�ǿ��α� (�ӿ� ���Ŀ� ġ��� ���ڸ� ä�� �������� ��ǥ���� ������ ����)', '�ұݱ��� ���� ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�Ϲٳ�', '���', '(�ų� 8��) ������ ������ ���縦 �ڶ��ϴ� ī������ ����', '�Ұ��� �信 Ƣ�� �ٳ����� ����� ���ĺ���', '�Ϲٳ��� �������� ������� Ŭ������ �õ�ī�� ���ø� ���ƴٴϴ� �ƹٳ� �õ�ī ���� ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('���丮��', '�׸���', '(�ų� 6��~ 8��) �� �޿� ���ļ� ���ֵǴ� ��ũ���������� ���׳��� ��ε��� ��Ƽ�� �߿� ���Ǵ��� ����� �������� �ﷹ�Ͻ� ����', '�Ƕ�� �� �ӿ� ���� ��ä�� ��⸦ �θԴ� �׸����� ��ǥ �丮 �ߵ� �귡��', '������ ȭ��Ȱ���� ����ϰ� �ִ� Ȱȭ��� �� ������ �Ȱ� ������ �� �ִ� ���丮�� ũ���� ü��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��ŸŰ���߷�', '�����̽þ�', '(�ų� 5��) �� ������ ������ ���������� ������ �� �ִ� ��� �佺Ƽ��', '���ڳ� ��ũ�� ���� ��� �ް� ��� �ҽ� ���� ��鿩 �Դ� ���ø���', '�ϴ��� ���� ����� ���� �� �ִ� ���Ǽ� ¤����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�����', '�����', '(�ų� 7��) ����� �ִ��� ���� ����� ���������', '�ϸ� ���� �� �Ҹ��� ���׿� ���� ����Ḧ ���� ä�� �� Ű �̾�', '�ٴ� ���� ü���� �� �� �ִ� ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����ġ��', '��Ż����', '(�ų� 1��~ 2��) ȭ���� ����� ���� ���� �԰� ����ġ�� ������ ����� ������ ���� �޿�� ����ġ�� ���� ����', '��Ÿ���� ġ��� ���� �������ҿ� �ٻ��ϰ� ���� ������', '��Ʈ�� ��Ż�ؼ� ���� ������ó�� ����ġ�� ���� ����� Ŭ���� ���Ͻ� ��Ʈ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��Ÿ', '��Ÿ', '(�ų� 2�� 4��~ 5��) ��Ÿ�� ������ ���� �� ���� �� �ִ� ��Ÿ�� ī�Ϲ� �佺Ƽ��', '���� ���� ������� �䳢���� ���� ����Ḧ ���� ���� ���� ���', '��Ÿ���� ���� ������ �ڿ� ������� ������ ����� �����츦 �� �� �ִ� ������ ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('ȫ��', 'ȫ��', '(�ų� 2��(����1��)) ȭ���ϰ� �پ��� ���� ����� �������� �� �� �ִ� ���� ����', '������ ������ ���̽��� �����ϰ� �����ϰ� ��� �� �ִ� � �ұ���', 'ȫ�ἶ�� �ѷ��� ������ �ٴٸ� �����ϸ� �����̺��� ��Ƽ�� ��� �� �ִ� ȫ�� ��Ʈ Ʈ��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�ٳ�', '��Ʈ��', '(�ų� 4�� �� ~ 6��) �ƽþ� �ִ��� �Ҳ� ������ �ٳ� ���� �Ҳ�����', '�ұ��� �Ǵ� �ұ����� ���ҿ� ���� ������⸦ ���� ��帰 ��¥', 'ũ���� ������ �ٳ��� ���� ��ġ�� �Բ� ������ ���ָ� ��ܺ� �� �ִ� �ٳ� �Ѱ� ������ ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�Ͽ���', '�Ͽ���', '(�ų� 2��) ���, �����, ����, ��Ʈ �� �˷��� ���� ���踦 ���캸�� ���� ����ŰŰ ��Ʈ �佺Ʈ', '�Ͽ��� ��Ÿ�� �ܹ��� ������ũ��� �Ҹ��� ���ڸ���', '���۵��� õ�� �Ͽ��̿��� ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����ī��', '�ʸ���', '(�ų� 4��) ���� ���� �����Ͽ� ���� ��Ʈ�� ���̽� ��ȸ�� ��ġ�� �巡�� ��Ʈ ����', '����ī���� �̽��� �ػ깰�� ���� ���� ������', '���� �� �� �ִ� ����� �����ϰ� �ٴ� ���� �Ŵϴ� ����ī�� ������ ');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�ȶ��', '�ȶ��', '(�ų� 6��) ����� ���̺��� �ٴ� �� ǳ���� �������� ��� �ȶ�� ���̺� ����', '���־�� �е��ϴ� �ͱ׷κ� ũ��', '���� �Ƹ��߾� ���̹���� �Բ� �ϴ� ����� ���̺�');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����', 'ȣ��', '(�ų� 8��) �ε��׽þ� ���뿹���������� ���� �˿� �̸������ �پ��� �帣�� �����Ǿ��ִ� ���� �ξ� ����', '���� ��⸦ ������ ���� ��Ʈ����', '�Ƶ巹������ �����ϴ� ��������ü��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�󽺺�����', '�̱�', '(�ų� 5�� ��) �Ϸ�Ʈ�δ� ���� ���� EDC', '�ܹ���, ����Ŀ��, ������ġ, ������ũ', '�󽺺������� �� �� ���� �αⰡ ���� ���߼���  �������');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����ī����', '����', '(�ų� 5�� �߼�) �׶� ���� �ڵ��� ���ִ�ȸ', '�а��� ���׿� �ٴ�, �ñ�ġ, ����, ����Ÿ, �ĸ��� ġ�� ���� �ְ� �⸧�� Ƣ�� �ٸ������', '1õ�� ���� ��� �Ĺ��� ������, ���� �������� �� �� �ִ� ���� ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('��ī��', '�߱�', '(�ų� 12��) ��ī�� ����Ʈ �佺Ƽ��', '�ε巯�� ������⸦ �ٻ��ϰ� ������ �� ���̿� ���� �ֺ�����', '��ī���� ī����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�̰�����', '�̰�����', '(�ų� 1����) ���� ������ ����ϴ� ��ķ� ���۵� �۷��̵��, Ÿ�̿� ������ ��� ������ ��� �����ϴ� �������� ����� Ī���� �۷��̵�', '����� ���ڳӹ�ũ�� ���� ������ �ұ���, ����, �ް�, �, ���ָ� �־� ���� ���� �丮�� Ŀ�� �׷���', '�ƽþ� �ִ� �Ը��� �������� �̰����� �ö��̾�');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�����ɽ�', '�����', '(�ų� 9��) ���ƽý� ����', '�ؿ��� �Ұ�⳪ ���� �Ǵ� �߰�⸦ ���� �� ���� ����, ���, ȣ��, �ϵ� ���� ��� ���� ����� �Ѳ��� ��� �������� ���� ������ Ÿ��', 'Hop-on_Hop-off ��Ƽ ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�ж��', '��Ż����', '(�ų� 4�� ��) �ж�� ������ ��ũ', '�� �����̸� ��°�� ��� �һ��� ���� ���� ��� �� �丮 ����β�, �ְ�� ��ŷ��� �������� ����, ġ� ����� �ж��� ������, ��° �ڸ� �Ұ�⸦ ��� �����縦 ���� �̵������ ������ �Ұ�� ĿƲ��', '����߷� �����̳� �ƿ﷿ ���� ü��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����ī', '�Ϻ�', '(�ų� 7�� ��) ���� ����̳� �ĳ����쿡�� �ŷ��� �¿� �踦 ���� ����� ����� ���� ������', 'Ÿ�ھ߳�, ��⳪ ä�Ҹ� ��ġ�� ����� Ƣ����� ���� �⸧�� Ƣ�� ��ġƢ���� ���ī��, �����, ���, ��⳪ ��¡� ���� �����ϰ� ���� ����ī�� ���ڳ�̾߳�', '���Ϲ��� ��Ʃ��� �н�, ������ ��Ŀ���� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����', '�̱�', '(�ų� 7�� 4��) ��������Ͽ� ������ �Ҳɳ���', '���̱�, ġ������ũ, ����ǳ����, �ȶ���,�ɹ� ��', '���� ����̼���, ���� ������, �����̾� ������Ʈ ���� �� ���÷��̽��� ���ϰ� �湮�� �� �ִ� ���� �ͽ��÷η� �н�- GO ī��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('������', 'ü��', '(�ų� 5��) ü���� �پ��� ����ָ� ���� �� �ִ� ���� ����', '��������� ������ �� �κ��� ��°�� �������� �÷���', '�ϴÿ��� �������� �����ϴ� ¥���� ��ī�̴��̺�');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('�ĸ�', '������', '(�ų� 2��~ 3��) ȭ���� �������� �ٹ� ������� ��Ÿ��� �����ϴ� ī�Ϲ� ����', '�Ŀ� �����̷� ���� �������� �������� �����ϰ� �ٻ�ٻ��� ũ��ƻ�', '�پ��� �귣����� ���� �� �ִ� ���� ������, ���Ŀ�Ʈ ��ȭ������ �����ϰų�, ��긣 �ڹ���, ������ �ڹ���, �����ָ� �ڹ��� �� �������� �̼��� ����');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('����', '����', '(�ų� 1�� 1��)���迡�� ���� ū �Ը��� ���� ������ ���ظ��� �۷��̵�', '�� ���ڿ� ������ Ƣ����� ���� Ƣ�� ���� �ǽþ�Ĩ��', '�ظ����� �ҵ��� ���� ���� �ظ����� ��Ʃ��� �湮 �Ǵ� ������ ��ǥ���� ���帶ũ�� �������� ž��');
INSERT INTO TRAVEL
(DESTINATION, NATION, FESTIVAL, FOOD, ACTIVITY)
VALUES('������DC', '�̱�', '(�ų� 3�� �߼�~ 4�� �߼�) ���� ������ ������ �⿬, ������ DC ���� ����', '�ܹ���, ġŲ, �ֵ���, ���� �� �پ��� �н�ƮǪ��', '���� �ڿ��� �ڹ���,  �̱� ���� �ڹ��� �� �������� �ڹ��� ����');

/*ȫ�� �����*/
DELETE FROM TRAVEL WHERE NATION ='ȫ��';


