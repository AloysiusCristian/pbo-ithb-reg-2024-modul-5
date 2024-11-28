package View;

public class Input {
    public static void inputDataKTP(){
        Frame inputFrame = new Frame();

        Label label1 = new Label("NIK");
        inputFrame.add(label1);
        TextField nik = new TextField();
        inputFrame.add(nik);
        
        Label label2 = new Label("Nama");
        inputFrame.add(label2);
        TextField nama = new TextField();
        inputFrame.add(nama);
        
        Label label3 = new Label("Tempat Lahir");
        inputFrame.add(label3);
        TextField tempatLahir = new TextField();
        inputFrame.add(tempatLahir);

        inputFrame.setVisible(true);
    }

    public void inputNIK(){
        
    }
}
