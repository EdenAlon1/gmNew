package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebh extends edzp {
    public final ByteBuffer a;

    public eebh(InputStream inputStream) {
        super(inputStream);
        this.a = ByteBuffer.allocate(1024);
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.a.put((byte) read);
        }
        return read;
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final long skip(long j) {
        if (((int) j) >= j) {
            return read(new byte[r0], 0, r0);
        }
        throw new IllegalArgumentException(j + " cannot be cast without changing its value");
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = super.read(bArr);
        if (read >= 0) {
            this.a.put(Arrays.copyOf(bArr, read));
        }
        return read;
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.a.put(bArr, i, i2);
        }
        return read;
    }
}
