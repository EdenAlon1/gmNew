package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exlz implements exmb {
    public final ByteBuffer a;
    private final exmd b;

    public exlz(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        exls exlsVar = new exls();
        exlsVar.c(2);
        exlsVar.b(10);
        this.b = exlsVar.a();
    }

    @Override // defpackage.exmb
    public final exmd a() {
        return this.b;
    }

    @Override // defpackage.exmb
    public final void b() {
    }
}
