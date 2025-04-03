package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eyel {
    private static volatile int a = 100;
    public static final /* synthetic */ int g = 0;
    int b;
    int c;
    final int d = a;
    public int e = Alert.DURATION_SHOW_INDEFINITELY;
    eyem f;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int I(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new eygu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new eygu("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static eyel K(InputStream inputStream) {
        return N(inputStream, 4096);
    }

    public static eyel L(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return R(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.isDirect()) {
            int i = eyek.a;
            if (eyjj.a) {
                return new eyek(byteBuffer);
            }
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return R(bArr, 0, remaining);
    }

    public static eyel M(byte[] bArr) {
        int length = bArr.length;
        return R(bArr, 0, 0);
    }

    public static eyel N(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? M(eygs.b) : new eyej(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static eyel R(byte[] bArr, int i, int i2) {
        eyeh eyehVar = new eyeh(bArr, i, i2);
        try {
            eyehVar.e(i2);
            return eyehVar;
        } catch (eygu e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void O() {
        if (this.b + this.c >= this.d) {
            throw new eygu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void P() {
        if (this.c == 0) {
            z(0);
        }
    }

    public final void Q() {
        int m;
        do {
            m = m();
            if (m == 0) {
                return;
            }
            O();
            this.c++;
            this.c--;
        } while (E(m));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract eyee w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
