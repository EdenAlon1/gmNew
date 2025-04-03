package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcfr implements ctuj {
    final /* synthetic */ Runnable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dcfs c;

    public dcfr(dcfs dcfsVar, Runnable runnable, boolean z) {
        this.a = runnable;
        this.b = z;
        this.c = dcfsVar;
    }

    @Override // defpackage.ctuj
    public final void b() {
        if (this.b || !this.c.i.s()) {
            return;
        }
        this.c.k.h();
    }

    @Override // defpackage.ctuj
    public final void d() {
        this.a.run();
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void c() {
    }
}
