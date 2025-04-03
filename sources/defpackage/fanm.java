package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanm implements Closeable {
    public fanl a;
    private final InputStream c;
    private final byte[] d = new byte[8];
    public final fann b = new fann();

    public fanm(InputStream inputStream) {
        this.c = inputStream;
    }

    private final void f() {
        this.a = null;
    }

    private final void g(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.c.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        f();
    }

    private final void h(int i) {
        g(this.d, i);
    }

    public final long a() {
        byte b = this.a.b;
        if (b < 24) {
            f();
            return b;
        }
        if (b == 24) {
            int read = this.c.read();
            if (read == -1) {
                throw new EOFException();
            }
            f();
            return read & 255;
        }
        if (b == 25) {
            h(2);
            byte[] bArr = this.d;
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        if (b == 26) {
            h(4);
            byte[] bArr2 = this.d;
            return (bArr2[3] & 255) | ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8);
        }
        if (b != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(b), Integer.valueOf(this.a.a())));
        }
        h(8);
        byte[] bArr3 = this.d;
        return ((bArr3[0] & 255) << 56) | ((bArr3[1] & 255) << 48) | ((bArr3[2] & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8) | (bArr3[7] & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (r0 == (-2)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fanl b() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fanm.b():fanl");
    }

    public final void c() {
        b();
        if (this.a.b == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", (byte) 31));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        this.b.b();
    }

    public final void d(byte b) {
        b();
        if (this.a.a != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.a.a())));
        }
    }

    public final byte[] e() {
        c();
        long a = a();
        if (a < 0 || a > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)));
        }
        if (this.c.available() < a) {
            throw new EOFException();
        }
        int i = (int) a;
        byte[] bArr = new byte[i];
        g(bArr, i);
        return bArr;
    }
}
