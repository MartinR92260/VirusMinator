package modele;


public class Action extends Thread{
    public void run(){
        int j = 0;
        for (int i=0; !interrupted();i++){
            if (i%60 == 0 && i != 0){
                j++;
                i = 0;
            }
            System.out.println(j+":"+i);
            try {
                currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

    }
}