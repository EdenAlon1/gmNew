package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpa implements cjjt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/RawSmsExtractor");
    private final aolr b;
    private final ffbr c;
    private final cqoh d;
    private final cjjv e;

    public cjpa(aolr aolrVar, ffbr ffbrVar, cqoh cqohVar) {
        aolrVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        this.b = aolrVar;
        this.c = ffbrVar;
        this.d = cqohVar;
        this.e = new cjjv("RawSmsExtractor");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.e;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        Object obj2;
        Object obj3 = (cjpg) obj;
        if (obj3 instanceof cjpe) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.e;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjpe.class).c());
            obj2 = obj3;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.e;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjpe.class).c(), new ffkb(obj3.getClass()).c());
            obj2 = null;
        }
        cjpe cjpeVar = (cjpe) obj2;
        return cjpeVar == null ? obj3 : c(cjpeVar, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjpe r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpa.c(cjpe, ffgu):java.lang.Object");
    }
}
