package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhjc implements fhnt {
    final /* synthetic */ fhjh a;
    private final fhna b;
    private boolean c;

    public fhjc(fhjh fhjhVar) {
        this.a = fhjhVar;
        this.b = new fhna(fhjhVar.d.a());
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.aa("0\r\n\r\n");
        fhjh.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fhnn fhnnVar = (fhnn) this.a.d;
        if (fhnnVar.c) {
            throw new IllegalStateException("closed");
        }
        fhnnVar.b.W(j);
        fhnnVar.c();
        this.a.d.aa(VCardBuilder.VCARD_END_OF_LINE);
        this.a.d.id(fhmtVar, j);
        this.a.d.aa(VCardBuilder.VCARD_END_OF_LINE);
    }
}
