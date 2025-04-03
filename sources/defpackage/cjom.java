package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjom implements cjjt {
    private final eijz a;
    private final cjjv b = new cjjv("SerializeProtoInterceptor");

    public cjom(eijz eijzVar) {
        this.a = eijzVar;
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.b;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjod cjodVar;
        cjod cjodVar2 = (cjod) obj;
        if (cjodVar2 instanceof cjoc) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.b;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjoc.class).c());
            cjodVar = cjodVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.b;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjoc.class).c(), new ffkb(cjodVar2.getClass()).c());
            cjodVar = null;
        }
        cjoc cjocVar = (cjoc) cjodVar;
        if (cjocVar == null) {
            return cjodVar2;
        }
        cjmd cjmdVar = cjocVar.b;
        if (cjmdVar.a != null) {
            return cjocVar;
        }
        cjoe cjoeVar = cjocVar.a;
        eijz eijzVar = this.a;
        cjmt cjmtVar = (cjmt) cjoeVar.f;
        return new cjoc(cjoeVar, cjmd.a(cjmdVar, eijzVar.a(cjmtVar.a, cjmtVar.b), null, null, 6));
    }
}
