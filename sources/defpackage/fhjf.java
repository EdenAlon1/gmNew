package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhjf implements fhnt {
    final /* synthetic */ fhjh a;
    private final fhna b;
    private boolean c;

    public fhjf(fhjh fhjhVar) {
        this.a = fhjhVar;
        this.b = new fhna(fhjhVar.d.a());
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        fhjh.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
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
        fhhl.B(fhmtVar.b, j);
        this.a.d.id(fhmtVar, j);
    }
}
