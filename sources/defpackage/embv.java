package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embv implements erqj {
    final /* synthetic */ embw a;

    public embv(embw embwVar) {
        this.a = embwVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.set((embu) obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.setException(th);
    }
}
