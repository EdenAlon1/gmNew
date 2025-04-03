package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpee implements dped {
    private final dpds a;
    private final fgcq b;
    private final Set c;

    public dpee(dpdu dpduVar, dpdt dpdtVar) {
        ffsk ffskVar = (ffsk) dpduVar.a.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) dpduVar.b.b();
        ffskVar2.getClass();
        dtll dtllVar = (dtll) dpduVar.c.b();
        dtllVar.getClass();
        dpdv dpdvVar = (dpdv) dpduVar.d.b();
        dpdvVar.getClass();
        dpds dpdsVar = new dpds(ffskVar, ffskVar2, dtllVar, dpdvVar, dpdtVar);
        this.a = dpdsVar;
        this.b = dpdsVar.g;
        this.c = fffi.b(dpdsVar);
    }

    @Override // defpackage.dped
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.dped
    public final fgcq b() {
        return this.b;
    }
}
