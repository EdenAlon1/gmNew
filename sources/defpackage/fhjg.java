package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhjg extends fhjb {
    private boolean c;

    public fhjg(fhjh fhjhVar) {
        super(fhjhVar);
    }

    @Override // defpackage.fhjb, defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long b = super.b(fhmtVar, 8192L);
        if (b != -1) {
            return b;
        }
        this.c = true;
        c();
        return -1L;
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
