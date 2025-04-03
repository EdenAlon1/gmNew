package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzwk implements erqj {
    final /* synthetic */ dzwl a;

    public dzwk(dzwl dzwlVar) {
        this.a = dzwlVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        synchronized (this.a) {
            dzwl dzwlVar = this.a;
            dzwlVar.d = (dzwu) dzwlVar.a.apply(obj);
            dzwl dzwlVar2 = this.a;
            if (!dzwlVar2.c) {
                dzwlVar2.d.j(dzwlVar2.b);
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
