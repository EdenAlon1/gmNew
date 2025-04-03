package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class etln {
    int[] a;
    private final int b;

    public etln(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = etlk.f(bArr);
        this.b = i;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(etlk.f(bArr), i);
        int[] iArr = (int[]) b.clone();
        etlk.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer c = c(bArr, this.b + i2);
            if (i2 == i) {
                euhs.a(byteBuffer, byteBuffer2, c, remaining % 64);
            } else {
                euhs.a(byteBuffer, byteBuffer2, c, 64);
            }
        }
    }
}
