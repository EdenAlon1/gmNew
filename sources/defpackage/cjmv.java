package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmv implements cjjt {
    private final cjjv a = new cjjv("MessageStatusToResultInterceptor");

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.a;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjod cjodVar;
        cjod cjodVar2 = (cjod) obj;
        if (cjodVar2 instanceof cjoa) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.a;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjoa.class).c());
            cjodVar = cjodVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.a;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjoa.class).c(), new ffkb(cjodVar2.getClass()).c());
            cjodVar = null;
        }
        cjoa cjoaVar = (cjoa) cjodVar;
        if (cjoaVar == null) {
            return cjodVar2;
        }
        int i3 = ((ckax) cjoaVar.b).a;
        int i4 = 1;
        if (i3 != -1 && i3 != 0) {
            i4 = i3 != 1 ? 3 : 2;
        }
        return new cjob(cjoaVar.a, i4, i3);
    }
}
