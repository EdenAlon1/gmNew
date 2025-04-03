package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdw implements lms {
    private final egjb a;
    private final egiv b;

    public egdw(egjb egjbVar, egiv egivVar) {
        this.b = egivVar;
        this.a = egjbVar;
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        if (!cls.isAssignableFrom(egdv.class)) {
            throw new IllegalArgumentException("Unknown model class ".concat(cls.toString()));
        }
        egjb egjbVar = this.a;
        egcn egcnVar = (egcn) egjbVar.a.b();
        egcnVar.getClass();
        errl errlVar = (errl) egjbVar.b.b();
        errlVar.getClass();
        ewjg ewjgVar = (ewjg) egjbVar.c.b();
        ewjgVar.getClass();
        egdu egduVar = (egdu) egjbVar.d.b();
        egduVar.getClass();
        egct egctVar = (egct) egjbVar.e.b();
        egctVar.getClass();
        egja egjaVar = new egja(egcnVar, errlVar, ewjgVar, egduVar, egctVar);
        egiv egivVar = this.b;
        errl errlVar2 = (errl) egivVar.a.b();
        errlVar2.getClass();
        dydc dydcVar = (dydc) egivVar.b.b();
        dydcVar.getClass();
        efzz efzzVar = (efzz) egivVar.c.b();
        efzzVar.getClass();
        egdu egduVar2 = (egdu) egivVar.d.b();
        egduVar2.getClass();
        egaa egaaVar = (egaa) egivVar.e.b();
        egaaVar.getClass();
        return (lml) cls.cast(new egdn(egjaVar, new egiu(errlVar2, dydcVar, efzzVar, egduVar2, egaaVar)));
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml b(Class cls, lnx lnxVar) {
        return lmr.c(this, cls);
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
