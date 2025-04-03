package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class row extends OutputStream {
    final /* synthetic */ rox a;
    private final byte b;
    private final rou c = new rou();

    public row(rox roxVar, byte b) {
        this.a = roxVar;
        this.b = b;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.a();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.c.b();
        if (i2 > 0) {
            try {
                synchronized (this.a) {
                    this.a.d(this.b, i2);
                    this.a.e.write(bArr, i, i2);
                    this.a.e.flush();
                }
            } catch (IOException e) {
                throw new rop(e);
            }
        }
    }
}
