package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjps implements cjjt {
    public final batc a;
    private final ffhd b;
    private final cjjv c;

    public cjps(coxk coxkVar, batc batcVar, ffhd ffhdVar) {
        coxkVar.getClass();
        batcVar.getClass();
        ffhdVar.getClass();
        this.a = batcVar;
        this.b = ffhdVar;
        this.c = new cjjv("SimpleSmsToTelephonyWriter");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.c;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjpg cjpgVar;
        cjpg cjpgVar2 = (cjpg) obj;
        if (cjpgVar2 instanceof cjpb) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.c;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjpb.class).c());
            cjpgVar = cjpgVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.c;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjpb.class).c(), new ffkb(cjpgVar2.getClass()).c());
            cjpgVar = null;
        }
        cjpb cjpbVar = (cjpb) cjpgVar;
        return cjpbVar == null ? cjpgVar2 : cjpbVar.e.d ? cjpbVar : ekxl.a(this.b, new cjpr(this, cjpbVar, null), ffguVar);
    }
}
