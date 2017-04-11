package GasPump;

import AbstractFactory.AbstractFactory;
import InputProcessor.IPGasPump2;

public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        System.out.println(
                "GasPump-2 " +
                        "\nMENU of Operations: " +
                        "\n(0) Activate" +
                        "\n(1) Start" +
                        "\n(2) Pay Cash" +
                        "\n(3) Select Regular Gas " +
                        "\n(4) Select Super Gas " +
                        "\n(5) Select Premium Gas " +
                        "\n(6) Cancel" +
                        "\n(7) Start Pump" +
                        "\n(8) Pump Liter" +
                        "\n(9) Stop " +
                        "\n(p) Print Receipt" +
                        "\n(n) No Receipt" +
                        "\n(q) Quit the program"
        );
    }

    public void Activate(Integer a, Integer b, Integer c) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Activate(a, b, c);
    }

    public void Start() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Start();
    }

    public void PayCash(Float cash) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PayCash(cash);
    }

    public void Cancel() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Cancel();
    }

    public void Regular() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Regular();
    }

    public void Super() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Super();
    }

    public void Premium() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Premium();
    }

    public void StartPump() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.StartPump();
    }

    public void PumpLiter() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PumpLiter();
    }

    public void Stop() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Stop();
    }

    public void Receipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Receipt();
    }

    public void NoReceipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.NoReceipt();
    }

}