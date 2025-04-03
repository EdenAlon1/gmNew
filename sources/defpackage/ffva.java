package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffva extends ffuj {
    private final ffrh a;

    public ffva(ffrh ffrhVar) {
        this.a = ffrhVar;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        Object E = e().E();
        boolean z = ffso.a;
        if (E instanceof ffrt) {
            this.a.w(ffci.a(((ffrt) E).b));
        } else {
            this.a.w(ffur.b(E));
        }
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return false;
    }
}
