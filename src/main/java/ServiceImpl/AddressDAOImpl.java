package ServiceImpl;

import Dao.AddressDao;
import Entities.Address;
import Services.DAOService;

import java.util.List;

public class AddressDAOImpl implements DAOService<Address> {

    AddressDao addressDao = null;

    public AddressDAOImpl(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public Address getById(int id) {
        return addressDao.getById(id);
    }

    @Override
    public List<Address> getAll() {
        return addressDao.getAll();
    }

    @Override
    public void create(Address address) {
        addressDao.create(address);

    }

    @Override
    public void update(Address address, String[] params) {
        addressDao.update(address, params);

    }

    @Override
    public void delete(Address address) {
        addressDao.delete(address);

    }
}
