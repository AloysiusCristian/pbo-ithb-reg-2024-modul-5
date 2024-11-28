package View;

import Classes.Model.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ShowKTP {
    public static void showKTP(KTP ktp){
        Frame frame = new Frame("KTP");
        frame.setBounds(350, 200, 700, 400);
        Panel panel = new Panel();
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        
        Label titleKTP = new Label("REPUBLIK HARAPAN BANGSA");
        titleKTP.setFont(new Font("Helvetica", Font.PLAIN, 30));
        titleKTP.setBounds(120,0,600,50);
        panel.add(titleKTP);

        Label lnik = new Label("NIK");
        lnik.setFont(new Font("Helvetica", Font.PLAIN, 20));
        lnik.setBounds(20, 055, 50, 40);
        panel.add(lnik);
        Label nik = new Label(ktp.getNik());
        nik.setFont(new Font("Helvetica", Font.PLAIN, 20));
        nik.setBounds(160, 055, 300, 40);
        panel.add(nik);

        Label lNama = new Label("Nama");
        lNama.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lNama.setBounds(20, 75, 150, 30);
        panel.add(lNama);
        Label Nama = new Label(ktp.getNama().toUpperCase());
        Nama.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Nama.setBounds(160, 75, 300, 30);
        panel.add(Nama);

        Label lTempatTanggalLahir = new Label("Tempat/Tgl Lahir");
        lTempatTanggalLahir.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lTempatTanggalLahir.setBounds(20, 95, 150, 30);
        panel.add(lTempatTanggalLahir);
        Label TempatTanggalLahir = new Label(ktp.getTempatLahir().toUpperCase() + ", " +  ktp.getTanggalLahir().toUpperCase());
        TempatTanggalLahir.setFont(new Font("Helvetica", Font.PLAIN, 15));
        TempatTanggalLahir.setBounds(160, 95, 300, 30);
        panel.add(TempatTanggalLahir);

        Label lJenisKelamin = new Label("Jenis Kelamin");
        lJenisKelamin.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lJenisKelamin.setBounds(20, 115, 150, 30);
        panel.add(lJenisKelamin);
        Label JenisKelamin = new Label(ktp.getJenisKelamin().toUpperCase());
        JenisKelamin.setFont(new Font("Helvetica", Font.PLAIN, 15));
        JenisKelamin.setBounds(160, 115, 300, 30);
        panel.add(JenisKelamin);

        Label lGolonganDarah = new Label("Gol.Darah : ");
        lGolonganDarah.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lGolonganDarah.setBounds(300, 115, 150, 30);
        panel.add(lGolonganDarah);
        Label golonganDarah = new Label(ktp.getGolonganDarah().toUpperCase());
        golonganDarah.setFont(new Font("Helvetica", Font.PLAIN, 15));
        golonganDarah.setBounds(380, 115, 300, 30);
        panel.add(golonganDarah);

        Label lAlamat = new Label("Alamat");
        lAlamat.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lAlamat.setBounds(20, 135, 150, 30);
        panel.add(lAlamat);
        Label Alamat = new Label(ktp.getAlamat().toUpperCase());
        Alamat.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Alamat.setBounds(160, 135, 300, 30);
        panel.add(Alamat);

        Label lRTRW = new Label("RT/RW");
        lRTRW.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lRTRW.setBounds(40, 155, 150, 30);
        panel.add(lRTRW);
        Label RTRW = new Label(ktp.getRtrw().toUpperCase());
        RTRW.setFont(new Font("Helvetica", Font.PLAIN, 15));
        RTRW.setBounds(160, 155, 300, 30);
        panel.add(RTRW);
        
        Label lKelDesa = new Label("Kel/Desa");
        lKelDesa.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lKelDesa.setBounds(40, 175, 150, 30);
        panel.add(lKelDesa);
        Label KelDesa = new Label(ktp.getKelDesa().toUpperCase());
        KelDesa.setFont(new Font("Helvetica", Font.PLAIN, 15));
        KelDesa.setBounds(160, 175, 300, 30);
        panel.add(KelDesa);
        
        Label lKecamatan = new Label("Kecamatan");
        lKecamatan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lKecamatan.setBounds(40, 195, 150, 30);
        panel.add(lKecamatan);
        Label Kecamatan = new Label(ktp.getKecamatan().toUpperCase());
        Kecamatan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Kecamatan.setBounds(160, 195, 300, 30);
        panel.add(Kecamatan);
        
        Label lAgama = new Label("Agama");
        lAgama.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lAgama.setBounds(20, 215, 150, 30);
        panel.add(lAgama);
        Label Agama = new Label(ktp.getAgama().toUpperCase());
        Agama.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Agama.setBounds(160, 215, 300, 30);
        panel.add(Agama);
        
        Label lStatusPerkawinan = new Label("Status Perkawinan");
        lStatusPerkawinan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lStatusPerkawinan.setBounds(20, 235, 150, 30);
        panel.add(lStatusPerkawinan);
        Label StatusPerkawinan = new Label(ktp.getStatusPerkawinan().toUpperCase());
        StatusPerkawinan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        StatusPerkawinan.setBounds(160, 235, 300, 30);
        panel.add(StatusPerkawinan);
        
        Label lPekerjaan = new Label("Pekerjaan");
        lPekerjaan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lPekerjaan.setBounds(20, 255, 150, 30);
        panel.add(lPekerjaan);
        Label Pekerjaan = new Label(ktp.getPekerjaan().toUpperCase());
        Pekerjaan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Pekerjaan.setBounds(160, 255, 300, 30);
        panel.add(Pekerjaan);
        
        Label lKewarganegaraan = new Label("Kewarganegaraan");
        lKewarganegaraan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lKewarganegaraan.setBounds(20, 275, 150, 30);
        panel.add(lKewarganegaraan);
        Label Kewarganegaraan = new Label(ktp.getNegaraAsal().toUpperCase());
        Kewarganegaraan.setFont(new Font("Helvetica", Font.PLAIN, 15));
        Kewarganegaraan.setBounds(160, 275, 300, 30);
        panel.add(Kewarganegaraan);
        
        Label lBerlakuHingga = new Label("Berlaku Hingga");
        lBerlakuHingga.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lBerlakuHingga.setBounds(20, 295, 150, 30);
        panel.add(lBerlakuHingga);
        Label BerlakuHingga = new Label(ktp.getBerlakuHingga().toUpperCase());
        BerlakuHingga.setFont(new Font("Helvetica", Font.PLAIN, 15));
        BerlakuHingga.setBounds(160, 295, 300, 30);
        panel.add(BerlakuHingga);
        
        ImageIcon profile = new ImageIcon(ktp.getProfilePath());
        JLabel profileLabel = new JLabel();
        profileLabel.setBounds(470, 80, 135,180);
        profileLabel.setIcon(profile);
        panel.add(profileLabel);
        Label labelKotaProfil = new Label(ktp.getKotaPembuatan().toUpperCase());
        labelKotaProfil.setBounds(470, 270, 120,30);
        Label labelTanggalProfil = new Label(ktp.getTanggalPembuatan().toUpperCase());
        labelTanggalProfil.setBounds(450, 290, 150,30);
        panel.add(labelKotaProfil);
        panel.add(labelTanggalProfil);


        frame.setVisible(true);
    }
}
