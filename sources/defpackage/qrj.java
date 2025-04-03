package defpackage;

import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qrj {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    int f;
    int g;
    int l;
    int m;
    int n;
    int r;
    private final byte[] t;
    final int[] h = new int[5003];
    final int[] i = new int[5003];
    int j = 0;
    boolean k = false;
    int o = 0;
    int p = 0;
    final int[] q = {0, 1, 3, 7, 15, 31, 63, 127, PrivateKeyType.INVALID, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    final byte[] s = new byte[256];

    public qrj(int i, int i2, byte[] bArr, int i3) {
        this.a = i;
        this.b = i2;
        this.t = bArr;
        this.c = Math.max(2, i3);
    }

    static final int e(int i) {
        return (1 << i) - 1;
    }

    public final int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        this.d = i - 1;
        byte[] bArr = this.t;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2] & 255;
    }

    final void b(byte b, OutputStream outputStream) {
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        this.s[i] = b;
        if (i2 >= 254) {
            c(outputStream);
        }
    }

    final void c(OutputStream outputStream) {
        int i = this.r;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.s, 0, this.r);
            this.r = 0;
        }
    }

    final void d(int i, OutputStream outputStream) {
        int[] iArr = this.q;
        int i2 = this.o;
        int i3 = this.p;
        int i4 = iArr[i3] & i2;
        if (i3 > 0) {
            this.o = i4 | (i << i3);
        } else {
            this.o = i;
        }
        this.p = i3 + this.f;
        while (this.p >= 8) {
            b((byte) (this.o & PrivateKeyType.INVALID), outputStream);
            this.o >>= 8;
            this.p -= 8;
        }
        if (this.j > this.g || this.k) {
            if (this.k) {
                int i5 = this.l;
                this.f = i5;
                this.g = e(i5);
                this.k = false;
            } else {
                int i6 = this.f + 1;
                this.f = i6;
                this.g = i6 == 12 ? 4096 : e(i6);
            }
        }
        if (i == this.n) {
            while (this.p > 0) {
                b((byte) (this.o & PrivateKeyType.INVALID), outputStream);
                this.o >>= 8;
                this.p -= 8;
            }
            c(outputStream);
        }
    }

    final void f() {
        for (int i = 0; i < 5003; i++) {
            this.h[i] = -1;
        }
    }
}
