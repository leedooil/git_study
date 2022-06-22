package nintendo;

public class NintendoSwitch {

    private boolean power = false;
    private AnimalCross game1;
    private Zelda game2;
    private SuperMario game3;

    public void powerOn() {
        if (power) {
            System.out.println("�씠誘� �쟾�썝�씠 耳쒖졇�엳�뒿�땲�떎.");
            return;

        }
        power = true;
        System.out.println("�땶�뀗�룄 �뒪�쐞移� �쟾�썝�쓣 耳곗뒿�땲�떎.");

    }

    public void powerOff() {
        if (!power) {
            System.out.println("�씠誘� �쟾�썝�씠 爰쇱졇�엳�뒿�땲�떎.");
            return;
        }
        power = false;
        System.out.println("�땶�뀗�룄 �뒪�쐞移섏쓽 �쟾�썝�쓣 猿먯뒿�땲�떎.");
    }

    public void checkChip() {
        if (!power) {
            System.out.println("�땶�뀗�룄 �쟾�썝�쓣 癒쇱� 耳쒖＜�떆湲� 諛붾엻�땲�떎.");
            return;
        }
        if (game1 != null) {
            System.out.println("�쁽�옱 �옣李⑸릺�뼱 �엳�뒗 移⑹�" + game1.getName() + "�엯�땲�떎.");

        } else if (game2 != null) {
            System.out.println("�쁽�옱 �옣李⑸릺�뼱 �엳�뒗 移⑹�" + game2.getName() + "�엯�땲�떎.");
        } else if (game3 != null) {
            System.out.println("�쁽�옱 �옣李⑸릺�뼱 �엳�뒗 移⑹�" + game3.getName() + "�엯�땲�떎.");
        } else {
            System.out.println("�쁽�옱 移⑹씠 �옣李⑸릺�뼱 �엳吏� �븡�뒿�땲�떎.");
        }
        public void removeChip(){
            game1=null;
            game2=null;
            game3=null;
            System.out.println("寃뚯엫湲곗뿉 �옣李⑸릺�뼱�엳�뜕 移⑹쓣 �젣嫄� �뻽�뒿�땲�떎.");
        }
        public void setChip(AnimalCross animalcross){
            game1 = animalcross;
            game2 = null;
            game3 = null;
        }
        public void setChip(){}
        public void setChip(){}


    }

}
