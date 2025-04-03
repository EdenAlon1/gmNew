package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxyp implements erqj {
    final /* synthetic */ dwqd a;
    final /* synthetic */ dxys b;

    public dxyp(dxys dxysVar, dwqd dwqdVar) {
        this.a = dwqdVar;
        this.b = dxysVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof dwqn) {
            this.b.e((dwqn) th, this.a);
            return;
        }
        dxys dxysVar = this.b;
        dwql a = dwqn.a();
        a.c = th;
        a.a = dwqm.UNKNOWN_ERROR;
        a.b = "Refresh failed.";
        dxysVar.e(a.a(), this.a);
    }
}
