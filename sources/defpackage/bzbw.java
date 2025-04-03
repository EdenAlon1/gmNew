package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbw implements erqj {
    final /* synthetic */ bzby a;

    public bzbw(bzby bzbyVar) {
        this.a = bzbyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bzby.a.m("Settings update processed.");
        synchronized (this.a) {
            bzby bzbyVar = this.a;
            if (bzbyVar.j) {
                bzbyVar.d();
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        bzby.a.o("Settings update failed to process.", th);
    }
}
