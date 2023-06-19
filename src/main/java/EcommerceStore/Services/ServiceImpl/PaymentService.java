package EcommerceStore.Services.ServiceImpl;
import EcommerceStore.Dao.PaymentDao;
import EcommerceStore.Entities.Payment;
import EcommerceStore.Services.CRUService;

import java.util.List;
public class PaymentService implements CRUService<Payment> {
    PaymentDao paymentDao = null;
    public PaymentService(PaymentDao paymentDao) {
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
    public void update(Payment payment) {
        paymentDao.update(payment);
    }
}