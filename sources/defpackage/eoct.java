package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoct extends eocs {
    final eocu a;
    final /* synthetic */ eocv b;

    public eoct(eocv eocvVar, int i) {
        this.b = eocvVar;
        this.a = new eocu(i);
    }

    @Override // defpackage.eodd
    public final void c(byte b) {
        this.a.write(b);
    }

    @Override // defpackage.eocs, defpackage.eodd
    public final void f(ByteBuffer byteBuffer) {
        this.a.b(byteBuffer);
    }

    @Override // defpackage.eocs, defpackage.eodd
    public final void g(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
    }

    @Override // defpackage.eodd
    public final eodb q() {
        eocu eocuVar = this.a;
        return this.b.e(eocuVar.c(), eocuVar.a());
    }
}
