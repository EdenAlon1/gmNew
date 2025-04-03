package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebi extends edzq {
    public final ByteBuffer a;

    public eebi(OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(1024);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(int i) {
        this.a.put((byte) i);
        super.write(i);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.put(bArr);
        super.write(bArr);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
        super.write(bArr, i, i2);
    }
}
