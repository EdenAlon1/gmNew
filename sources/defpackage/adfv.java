package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adfv implements erqj {
    final /* synthetic */ elfl a;

    public adfv(elfl elflVar) {
        this.a = elflVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.cancel(false);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.cancel(false);
    }
}
