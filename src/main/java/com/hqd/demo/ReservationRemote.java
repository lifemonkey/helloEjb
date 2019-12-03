package com.hqd.demo;

import javax.ejb.Remote;

@Remote
public interface ReservationRemote {
    void ping();
}
