package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqx extends OutputStream {
    final /* synthetic */ feqz a;

    public feqx(feqz feqzVar) {
        this.a = feqzVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d(bArr, i, i2);
    }
}
