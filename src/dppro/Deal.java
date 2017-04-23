/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dppro;

/**
 *
 * @author Sam
 */
class Deal implements Order {
    private CentralHub stock;
    public Deal ( CentralHub st) {
        stock = st;
    }
    @Override
    public void execute() {
      stock.Dealer();
    }
}
