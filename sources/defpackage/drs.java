package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drs extends ffkk implements ffji {
    final /* synthetic */ dse a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drs(dse dseVar) {
        super(1);
        this.a = dseVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iam f;
        dmt dmtVar = this.a.c;
        dmtVar.f = (ioc) obj;
        if (dmtVar.h && (f = dmtVar.f()) != null && !dmtVar.j(f, dmtVar.i)) {
            dmtVar.g = true;
            dmtVar.g();
        }
        dmtVar.h = false;
        return ffcu.a;
    }
}
