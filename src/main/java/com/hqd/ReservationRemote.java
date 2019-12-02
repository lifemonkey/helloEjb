package com.hqd;

import javax.ejb.Remote;

@Remote
public interface ReservationRemote {
    void ping();
}
