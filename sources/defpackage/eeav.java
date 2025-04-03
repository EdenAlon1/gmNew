package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeav extends edzp {
    final /* synthetic */ eeax a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeav(eeax eeaxVar, InputStream inputStream) {
        super(inputStream);
        this.a = eeaxVar;
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int available() {
        this.a.d();
        return super.available();
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read() {
        this.a.d();
        return super.read();
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(byte[] bArr) {
        this.a.d();
        return super.read(bArr);
    }

    @Override // defpackage.edzp, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.a.d();
        return super.read(bArr, i, i2);
    }
}
