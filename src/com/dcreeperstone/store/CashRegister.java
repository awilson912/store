/*
 * Copyright (C) 2020 Dr. Creeperstone
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.dcreeperstone.store;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dr. Creeperstone
 */
public class CashRegister {
    
    private RegisterStatus status;
    private final Queue<Customer> line;
    
    public CashRegister() {
        status = RegisterStatus.CLOSED;
        line = new LinkedList<>();
    }
    
    public RegisterStatus getStatus() {
        return status;
    }
    
    public void open() {
        status = RegisterStatus.OPEN;
    }
    
    public void close() {
        status = RegisterStatus.CLOSED;
    }
    
    public void addCustomer(Customer customer) {
        line.add(customer);
    }
    
    public void startService(Customer customer) {
        status = RegisterStatus.BUSY;
    }
    
}
