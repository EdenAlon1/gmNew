package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkg implements bjt {
    final /* synthetic */ kfb a;

    public bkg(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.bjt
    public final void b(Object obj) {
        try {
            this.a.b(obj);
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
