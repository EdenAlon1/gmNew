package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lib extends FilterOutputStream {
    final DataOutputStream a;
    public ByteOrder b;

    public lib(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.a = new DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    public final void a(int i) {
        this.a.write(i);
    }

    public final void b(int i) {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            int i2 = i >>> 8;
            int i3 = i >>> 16;
            int i4 = i >>> 24;
            int i5 = i & PrivateKeyType.INVALID;
            int i6 = i3 & PrivateKeyType.INVALID;
            int i7 = i2 & PrivateKeyType.INVALID;
            this.a.write(i5);
            this.a.write(i7);
            this.a.write(i6);
            this.a.write(i4);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            int i8 = i >>> 8;
            int i9 = i >>> 16;
            int i10 = i >>> 24;
            int i11 = i & PrivateKeyType.INVALID;
            int i12 = i9 & PrivateKeyType.INVALID;
            int i13 = i8 & PrivateKeyType.INVALID;
            this.a.write(i10);
            this.a.write(i12);
            this.a.write(i13);
            this.a.write(i11);
        }
    }

    public final void c(short s) {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            int i = (s >>> 8) & PrivateKeyType.INVALID;
            this.a.write(s & 255);
            this.a.write(i);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            this.a.write((s >>> 8) & PrivateKeyType.INVALID);
            this.a.write(s & 255);
        }
    }

    public final void d(long j) {
        b((int) j);
    }

    public final void e(int i) {
        if (i > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
