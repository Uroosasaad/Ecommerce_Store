package Services.ServiceImpl;

import Dao.PaymentDao;
import Entities.Payment;
import Services.CRUService;

import java.util.List;

public class PaymentCRUImpl implements CRUService<Payment> {


    PaymentDao paymentDao = null;

    public PaymentCRUImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }


    @Override
    public Payment getById(int id) {
        return paymentDao.getById(id);
    }

    @Override
    public List<Payment> getAll() {
        return paymentDao.getAll();
    }

    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);

    }

    @Override
    public void update(Payment payment, String[] params) {
        paymentDao.update(payment, params);

    }

}
