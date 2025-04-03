package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llx implements AutoCloseable, lkp {
    public final llv a;
    public boolean b;
    private final String c;

    public llx(String str, llv llvVar) {
        this.c = str;
        this.a = llvVar;
    }

    public final void b(owv owvVar, lkk lkkVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        lkkVar.c(this);
        owvVar.b(this.c, this.a.a());
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_DESTROY) {
            this.b = false;
            lkrVar.P().d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
