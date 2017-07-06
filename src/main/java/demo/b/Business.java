package demo.b;

/**
 * Created by mingfei.net@gmail.com
 * 7/6/17 09:10
 * https://github.com/thu/JavaEE_Framework_1702A/
 * 高层应用类 和 底层实现类的 松散耦合
 * 解耦合 *****
 */
public class Business {
    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
