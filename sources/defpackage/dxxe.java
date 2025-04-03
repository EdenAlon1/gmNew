package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxxe implements erqj {
    final /* synthetic */ dxxf a;

    public dxxe(dxxf dxxfVar) {
        this.a = dxxfVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dwtm dwtmVar = this.a.a.c;
        if (dwtmVar == null) {
            dwtmVar = dwtm.a;
        }
        dxth.c("%s: Successfully incremented LoggingStateStore network usage for %s", "NetworkUsageMonitor", dwtmVar.c);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dwtm dwtmVar = this.a.a.c;
        if (dwtmVar == null) {
            dwtmVar = dwtm.a;
        }
        dxth.k(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", dwtmVar.c);
    }
}
