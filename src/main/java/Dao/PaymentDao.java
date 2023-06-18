package Dao;
import Entities.Payment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PaymentDao extends AbstractDao<Payment> {
    @Override
    public Payment getById(int id) {
        String SQL_SELECT = "Select * from payments where payment_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Payment(rs.getLong("payment_id"), rs.getLong("order_id"),
                        rs.getTimestamp("payment_Date"),
                        rs.getLong("payment_Amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Payment> getAll() {
        List<Payment> payments = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from payments";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                payments.add(new Payment(rs.getLong("payment_id"), rs.getLong("order_id"), rs.getTimestamp("payment_Date"),
                        rs.getLong("payment_Amount")
                ));
            }
            return payments;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void create(Payment payment) {
        String SQL_INSERT = "Insert into payments (payment_id, order_id, payment_Date, payment_Amount) values(?,?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, payment.getPaymentId());
            ps.setLong(2, payment.getOrderId());
            ps.setTimestamp(3, payment.getPaymentDate());
            ps.setLong(4, payment.getPaymentAmount());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(Payment payment) {
        String SQL_UPDATE = "Update payments set  order_id=?, payment_Date=?, payment_Amount=? where payment_id =?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_UPDATE)) {
            ps.setLong(1, payment.getPaymentId());
            ps.setLong(2, payment.getOrderId());
            ps.setTimestamp(3, payment.getPaymentDate());
            ps.setLong(4, payment.getPaymentAmount());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}