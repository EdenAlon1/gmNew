package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxtt implements erqj {
    final /* synthetic */ erih a;
    final /* synthetic */ long b;
    final /* synthetic */ dxtu c;
    final /* synthetic */ int d;

    public dxtt(dxtu dxtuVar, int i, erih erihVar, long j) {
        this.d = i;
        this.a = erihVar;
        this.b = j;
        this.c = dxtuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        emxc emxcVar = (emxc) obj;
        if (emxcVar.g()) {
            this.c.r(this.d, this.a, this.b, (erjw) emxcVar.c());
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.k(th, "%s: failure when sampling log!", "MddEventLogger");
    }
}
