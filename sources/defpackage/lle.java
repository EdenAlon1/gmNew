package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lle implements llh {
    final lld a;
    final llh b;
    int c = -1;

    public lle(lld lldVar, llh llhVar) {
        this.a = lldVar;
        this.b = llhVar;
    }

    @Override // defpackage.llh
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    final void b() {
        this.a.g(this);
    }

    final void c() {
        this.a.k(this);
    }
}
