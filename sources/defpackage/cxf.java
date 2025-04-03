package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxf extends ffkk implements ffji {
    final /* synthetic */ cxj a;
    final /* synthetic */ cxv b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxf(cxj cxjVar, cxv cxvVar, ffji ffjiVar, ffkx ffkxVar) {
        super(1);
        this.a = cxjVar;
        this.b = cxvVar;
        this.c = ffjiVar;
        this.d = ffkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        dap.f(cxsVar, this.a.b);
        Object b = this.a.b(cxsVar.a());
        if (ffkj.e(b, cxsVar.a())) {
            ffji ffjiVar = this.c;
            if (ffjiVar != null) {
                ffjiVar.invoke(this.a);
            }
        } else {
            this.a.b.c(b);
            this.b.c(b);
            ffji ffjiVar2 = this.c;
            if (ffjiVar2 != null) {
                ffjiVar2.invoke(this.a);
            }
            cxsVar.c();
            this.d.a = true;
        }
        return ffcu.a;
    }
}
