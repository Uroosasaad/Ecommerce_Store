package ServiceImpl;

import Dao.SupplierDao;
import Entities.Supplier;
import Services.DAOService;

import java.util.List;

public class SupplierDAOImpl implements DAOService<Supplier> {

    SupplierDao supplierDao = null;

    public SupplierDAOImpl(SupplierDao supplierDao) {
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
    public void update(Supplier supplier, String[] params) {
        supplierDao.update(supplier, params );

    }

    @Override
    public void delete(Supplier supplier) {
        supplierDao.delete(supplier);

    }
}
