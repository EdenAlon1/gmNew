package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnc implements cjjt {
    private final ffbr a;
    private final ffbr b;
    private final cjjv c;

    public cjnc(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = new cjjv("PreSendMetricsInterceptor");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.c;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjns cjnsVar;
        cjns cjnsVar2 = (cjns) obj;
        if (cjnsVar2 instanceof cjnq) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.c;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjnq.class).c());
            cjnsVar = cjnsVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.c;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjnq.class).c(), new ffkb(cjnsVar2.getClass()).c());
            cjnsVar = null;
        }
        cjnq cjnqVar = (cjnq) cjnsVar;
        if (cjnqVar == null) {
            return cjnsVar2;
        }
        cjnj cjnjVar = cjnqVar.a;
        if (cjnjVar.h == awzn.DELIVERY) {
            ((avkz) this.a.b()).a(cjnjVar.g, cjnjVar.i);
        }
        ((cpev) this.b.b()).d(cjnjVar.g.f(), cjnjVar.a.c);
        return cjnqVar;
    }
}
