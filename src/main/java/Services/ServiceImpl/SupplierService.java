package Services.ServiceImpl;
import Dao.SupplierDao;
import Entities.Supplier;
import Services.CRUService;
import java.util.List;
public class SupplierService implements CRUService<Supplier> {
    SupplierDao supplierDao = null;
    public SupplierService(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }
    @Override
    public Supplier getById(int id) {
        return supplierDao.getById(id);
    }
    @Override
    public List<Supplier> getAll() {
        return supplierDao.getAll();
    }
    @Override
    public void create(Supplier supplier) {
        supplierDao.create(supplier);
    }
    @Override
    public void update(Supplier supplier) {
        supplierDao.update(supplier);
    }
}