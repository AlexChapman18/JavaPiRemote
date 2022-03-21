import com.pi4j.io.gpio.*;

public class main {

    public static void main(String[] args) throws InterruptedException {
        GpioController gpio = GpioFactory.getInstance();
        GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW);

        while (true){
            System.out.println("toggles");
            Thread.sleep(1000);
            pin.toggle();
        }
    }
}
