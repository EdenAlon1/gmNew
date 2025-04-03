package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axo implements bjt {
    final /* synthetic */ Runnable a;

    public axo(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.run();
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
    }
}
