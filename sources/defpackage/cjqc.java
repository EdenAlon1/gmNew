package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqc implements cjjt {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/SmsToBugleDbWriter");
    public final batc b;
    public final ffbr c;
    private final ffhd d;
    private final cjjv e;

    public cjqc(coxk coxkVar, batc batcVar, ffbr ffbrVar, ffhd ffhdVar) {
        coxkVar.getClass();
        batcVar.getClass();
        ffbrVar.getClass();
        ffhdVar.getClass();
        this.b = batcVar;
        this.c = ffbrVar;
        this.d = ffhdVar;
        this.e = new cjjv("SmsToBugleDbWriter");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.e;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjpg cjpgVar;
        cjpg cjpgVar2 = (cjpg) obj;
        if (cjpgVar2 instanceof cjpb) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.e;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjpb.class).c());
            cjpgVar = cjpgVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.e;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjpb.class).c(), new ffkb(cjpgVar2.getClass()).c());
            cjpgVar = null;
        }
        cjpb cjpbVar = (cjpb) cjpgVar;
        return cjpbVar == null ? cjpgVar2 : cjpbVar.e.c ? cjpbVar : ekxl.a(this.d, new cjqb(this, cjpbVar, null), ffguVar);
    }
}
