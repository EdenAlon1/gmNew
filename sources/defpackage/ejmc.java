package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmc implements erqj {
    final /* synthetic */ ejmf a;

    public ejmc(ejmf ejmfVar) {
        this.a = ejmfVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        ejmf ejmfVar = this.a;
        ejmfVar.e = obj;
        ejmfVar.b = true;
        ejmfVar.a();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.b(th);
    }
}
