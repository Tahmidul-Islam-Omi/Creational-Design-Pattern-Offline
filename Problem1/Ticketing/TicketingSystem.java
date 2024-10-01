package Ticketing;
import Controller.*;
import InternetConnection.*;
import Display.*;
import Identification.*;
import Microcontroller.*;
import WebServer.*;
import Storage.*;

public class TicketingSystem {
    private Microcontroller microcontroller;
    private Display display;
    private Identification identification;
    private PaymentTerminal paymentTerminal;
    private InternetConnection internetConnection;
    private Storage storage;
    private Controller controller;
    private WebServer webServer;

    public TicketingSystem(Microcontroller microcontroller, Display display, Identification identification,
            PaymentTerminal paymentTerminal, InternetConnection internetConnection, Storage storage,
            Controller controller, WebServer webServer) {
        this.microcontroller = microcontroller;
        this.display = display;
        this.identification = identification;
        this.paymentTerminal = paymentTerminal;
        this.internetConnection = internetConnection;
        this.storage = storage;
        this.controller = controller;
        this.webServer = webServer;
    }

    public String getDetails() {
        return "Ticketing System with " + microcontroller.getDetails() + ", " + display.getDetails() + ", "
                + identification.getDetails() + ", " + paymentTerminal.getDetails() + ", "
                + internetConnection.getDetails() + ", " + storage.getDetails() + ", " + controller.getDetails() + ", "
                + webServer;
    }
}