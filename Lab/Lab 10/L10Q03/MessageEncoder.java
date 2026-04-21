public interface MessageEncoder {
    String shuffle(String plainText);
    String unshuffle(String cipherText);
}