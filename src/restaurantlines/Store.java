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
package restaurantlines;

/**
 *
 * @author Dr. Creeperstone
 */
public class Store {
    
    private final String name;
    private final CashRegister[] registers;
    private StoreStatus status;
    
    public Store(String storeName, int numRegisters) {
        this.name = storeName;
        registers = new CashRegister[numRegisters];
        status = StoreStatus.CLOSED;
        initializeRegisters();
    }
    
    private void initializeRegisters() {
        for (int i = 0; i < registers.length; i++)
            registers[i] = new CashRegister();
    }
    
    public String getName() {
        return name;
    }
    
    public boolean hasOpenRegister() {
        boolean openRegister;
        
        openRegister = false;
        
        for (CashRegister register : registers)
            if (register.getStatus() == RegisterStatus.OPEN) {
                openRegister = true;
                break;
            }
        
        return openRegister;
    }
    
    public void toggleStoreStatus() {
        if (status == StoreStatus.CLOSED)
            status = StoreStatus.OPEN;
        else
            status = StoreStatus.CLOSED;
    }
    
}
