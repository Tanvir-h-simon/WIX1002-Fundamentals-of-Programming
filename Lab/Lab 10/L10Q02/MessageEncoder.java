// public abstract class MessageEncoder {
public interface MessageEncoder {
    String encode(String plainText);
    String decode(String cipherText);
}