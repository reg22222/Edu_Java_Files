//�ڹٿ��� Ŭ������ �������̽� ��� ����
class A12{}
interface B12{}
//Ŭ������ Ŭ������ ��ӹ��� �� �ִ�
class C12 extends A12{}
//Ŭ������ �������̽��� ��ӹ��� �� �ִ�
class D12 implements B12{}
//Ŭ������ Ŭ������ ��ӹް� �������̽��� ��ӹ��� �� �ִ�
class E12 extends A12 implements B12{}
//�������̽��� �������̽��� ��ӹ��� �� �ִ�
interface F12 extends B12{}
//�������̽��� �������̽��� ���߻�� ���� �� �ִ�
interface G12 extends B12, F12{}
//�������̽��� Ŭ������ ��ӹ��� ���Ѵ�
//Ŭ������ �������̽��� ���߻�� ���� �� �ִ�
class H12 implements B12, F12{}
//Ŭ������ Ŭ������ ��ӹް� �������̽��� ���߻�� ���� �� �ִ�
class I12 extends A12 implements B12, F12{}

public class Exam_12 {

}
