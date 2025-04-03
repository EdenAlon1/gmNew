package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djig implements erqj {
    final /* synthetic */ clrv a;

    public djig(clrv clrvVar) {
        this.a = clrvVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dktn dktnVar = djih.a;
        clqx clqxVar = this.a.f;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        dkty.l(dktnVar, "[%s] Notification completed.", clqxVar.c);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dktn dktnVar = djih.a;
        clqx clqxVar = this.a.f;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        dkty.h(dktnVar, "[%s] Error while notifying operation completed: %s", clqxVar.c, th);
    }
}
