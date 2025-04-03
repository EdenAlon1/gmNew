package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rph extends BufferedInputStream implements InputStreamRetargetInterface {
    private boolean a;
    private boolean b;

    public rph(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    private final void b() {
        if (this.a) {
            throw new IllegalStateException();
        }
    }

    public final synchronized InputStream a() {
        byte[] bArr;
        b();
        if (this.b) {
            throw new IllegalStateException();
        }
        this.a = true;
        int i = this.count - this.pos;
        bArr = new byte[i];
        System.arraycopy(this.buf, this.pos, bArr, 0, i);
        this.pos = 0;
        this.count = 0;
        return new rpf(new InputStream[]{new ByteArrayInputStream(bArr), this.in});
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        b();
        this.b = true;
        super.mark(i);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        b();
        this.b = false;
        super.reset();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
