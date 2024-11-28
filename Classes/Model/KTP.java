package Classes.Model;

public class KTP {
    private String nik, nama, tempatLahir, tanggalLahir, jenisKelamin;
    private String golonganDarah, alamat, rtrw, kelDesa, kecamatan;
    private String agama, statusPerkawinan, pekerjaan, negaraAsal;
    private String profilePath, ttdPath, berlakuHingga, kotaPembuatan, tanggalPembuatan;

    public KTP(String agama, String alamat, String berlakuHingga, String golonganDarah, String jenisKelamin, String kecamatan, String kelDesa, String kotaPembuatan, String nama, String negaraAsal, String nik, String pekerjaan, String profilePath, String rtrw, String statusPerkawinan, String tanggalLahir, String tanggalPembuatan, String tempatLahir, String ttdPath) {
        this.agama = agama;
        this.alamat = alamat;
        this.berlakuHingga = berlakuHingga;
        this.golonganDarah = golonganDarah;
        this.jenisKelamin = jenisKelamin;
        this.kecamatan = kecamatan;
        this.kelDesa = kelDesa;
        this.kotaPembuatan = kotaPembuatan;
        this.nama = nama;
        this.negaraAsal = negaraAsal;
        this.nik = nik;
        this.pekerjaan = pekerjaan;
        this.profilePath = profilePath;
        this.rtrw = rtrw;
        this.statusPerkawinan = statusPerkawinan;
        this.tanggalLahir = tanggalLahir;
        this.tanggalPembuatan = tanggalPembuatan;
        this.tempatLahir = tempatLahir;
        this.ttdPath = ttdPath;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }

    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    public String getTtdPath() {
        return ttdPath;
    }

    public void setTtdPath(String ttdPath) {
        this.ttdPath = ttdPath;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }

    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }
}