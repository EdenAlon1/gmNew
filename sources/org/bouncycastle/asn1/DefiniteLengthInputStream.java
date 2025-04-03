package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.fidk;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] e = new byte[0];
    public final int a;
    public int b;

    public DefiniteLengthInputStream(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            b();
            i = 0;
        }
        this.a = i;
        this.b = i;
    }

    final byte[] a() {
        int i = this.b;
        if (i == 0) {
            return e;
        }
        int i2 = this.d;
        if (i >= i2) {
            throw new IOException(a.r(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
        }
        byte[] bArr = new byte[i];
        int b = i - fidk.b(this.c, bArr, i);
        this.b = b;
        if (b == 0) {
            b();
            return bArr;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        int read = this.c.read();
        if (read >= 0) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                b();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int read = this.c.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.b - read;
            this.b = i4;
            if (i4 == 0) {
                b();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.a + " object truncated by " + this.b);
    }
}
