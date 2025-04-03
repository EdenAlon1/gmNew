package defpackage;

import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eegj {
    public final SecureRandom a = new SecureRandom();
    public final int b;

    public eegj(int i) {
        this.b = i;
    }

    public static void a(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put(eefu.c);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) i);
        byteBuffer.put(eefu.b);
    }

    public static void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        byteBuffer.put(bArr);
        byteBuffer.put(eefu.e);
        byteBuffer.put(bArr2);
        byteBuffer.put(eefu.b);
    }

    public static void c(ByteBuffer byteBuffer, String str, String str2) {
        byteBuffer.put(eefu.a);
        byteBuffer.put((byte) 32);
        byteBuffer.put(str.getBytes());
        byteBuffer.put((byte) 32);
        byteBuffer.put(str2.getBytes());
        byteBuffer.put(eefu.b);
    }
}
