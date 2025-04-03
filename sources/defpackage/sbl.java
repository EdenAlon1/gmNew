package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbl implements erqj {
    final /* synthetic */ sbo a;

    public sbl(sbo sboVar) {
        this.a = sboVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        synchronized (this.a.f) {
            this.a.g = null;
        }
    }
}
