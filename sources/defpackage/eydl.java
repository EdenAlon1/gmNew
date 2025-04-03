package defpackage;

import defpackage.eydk;
import defpackage.eydl;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eydl<MessageType extends eydl<MessageType, BuilderType>, BuilderType extends eydk<MessageType, BuilderType>> implements eyhs {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        eydk.addAll((Iterable) iterable, (List) list);
    }

    protected static void checkByteStringIsUtf8(eyee eyeeVar) {
        if (!eyeeVar.r()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(eyik eyikVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int a = eyikVar.a(this);
        setMemoizedSerializedSize(a);
        return a;
    }

    public eyhx mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public eyjb newUninitializedMessageException() {
        return new eyjb();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eyhs
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            eyer ab = eyer.ab(bArr);
            writeTo(ab);
            ab.ac();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.eyhs
    public eyee toByteString() {
        try {
            int serializedSize = getSerializedSize();
            eyee eyeeVar = eyee.b;
            byte[] bArr = new byte[serializedSize];
            eyer ab = eyer.ab(bArr);
            writeTo(ab);
            return eyea.a(ab, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        eyeq eyeqVar = new eyeq(outputStream, eyer.N(eyer.W(serializedSize) + serializedSize));
        eyeqVar.w(serializedSize);
        writeTo(eyeqVar);
        eyeqVar.aw();
    }

    @Override // defpackage.eyhs
    public void writeTo(OutputStream outputStream) {
        eyeq eyeqVar = new eyeq(outputStream, eyer.N(getSerializedSize()));
        writeTo(eyeqVar);
        eyeqVar.aw();
    }
}
