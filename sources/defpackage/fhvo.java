package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhvo {
    public static final void a(ficu ficuVar, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(ficuVar.s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static final void b(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            byteArrayOutputStream.write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static final void c(int i, ByteArrayOutputStream byteArrayOutputStream) {
        while (byteArrayOutputStream.size() < i) {
            byteArrayOutputStream.write(0);
        }
    }

    public static final void d(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(i >> 24);
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    public static final void e(long j, ByteArrayOutputStream byteArrayOutputStream) {
        d((int) (j >>> 32), byteArrayOutputStream);
        d((int) j, byteArrayOutputStream);
    }
}
