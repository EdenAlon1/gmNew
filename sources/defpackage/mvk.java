package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvk implements mvc {
    public final mvc a;
    private final long b;

    public mvk(mvc mvcVar, long j) {
        this.a = mvcVar;
        this.b = j;
    }

    @Override // defpackage.mvc
    public final int a(mgz mgzVar, lxz lxzVar, int i) {
        int a = this.a.a(mgzVar, lxzVar, i);
        if (a != -4) {
            return a;
        }
        lxzVar.f += this.b;
        return -4;
    }

    @Override // defpackage.mvc
    public final int b(long j) {
        return this.a.b(j - this.b);
    }

    @Override // defpackage.mvc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.mvc
    public final boolean d() {
        return this.a.d();
    }
}
