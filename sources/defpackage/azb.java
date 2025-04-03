package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azb implements bjt {
    final /* synthetic */ bad a;
    final /* synthetic */ aze b;

    public azb(aze azeVar, bad badVar) {
        this.b = azeVar;
        this.a = badVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        biw.b();
        if (this.a == this.b.a) {
            avw.f("CaptureNode", "request aborted, id=" + this.b.a.a);
            aze azeVar = this.b;
            azq azqVar = azeVar.g;
            if (azqVar != null) {
                azqVar.a = null;
            }
            azeVar.a = null;
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
