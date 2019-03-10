/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author IICT (SWE)
 */
public class Dispatch {

    public static void main(String[] args) {
        p0 p = new p0();
        q0 q = new q0();
        r0 r = new r0();

        p0 a;

        a = p;
        a.callme();

        a = q;
        a.callme();

        a = r;
        a.callme();

    }

}
