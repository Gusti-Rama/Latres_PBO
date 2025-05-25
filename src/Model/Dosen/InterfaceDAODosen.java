package Model.Dosen;

import java.util.List;

public interface InterfaceDAODosen {
    // Method untuk memasukkan suatu data mahasiswa
    public void insert(ModelDosen dosen);
    
    // Method untuk mengupdate (mengedit) suatu data mahasiswa
    public void update(ModelDosen dosen);
    
    // Method untuk menghapus suatu data mahasiswa
    public void delete(int id);
    
    // Method untuk mengambil data mahasiswa
    public List<ModelDosen> getAll();
}
