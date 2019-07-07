package cn.hylexus.jt.core.data;

/**
 * @author hylexus
 * Created At 2019-07-07 16:54
 */
public interface ProtocolDataType {

    byte[] getOriginalBytes();

    default byte[] toBytes() {
        return getOriginalBytes();
    }

}