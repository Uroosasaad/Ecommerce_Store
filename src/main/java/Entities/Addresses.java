package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public class Addresses {
    @JsonProperty("addresses")
    private List<Address> addressList;

    public Addresses(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
