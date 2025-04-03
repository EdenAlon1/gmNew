package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeaw extends edzq {
    final /* synthetic */ eeax a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeaw(eeax eeaxVar, OutputStream outputStream) {
        super(outputStream);
        this.a = eeaxVar;
    }

    @Override // defpackage.edzq, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.d();
        super.flush();
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(int i) {
        this.a.d();
        super.write(i);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.d();
        super.write(bArr);
    }

    @Override // defpackage.edzq, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d();
        super.write(bArr, i, i2);
    }
}
