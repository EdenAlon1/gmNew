package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqe implements cjjt {
    public final coxk a;
    public final batc b;
    public final Context c;
    private final ffhd d;
    private final cjjv e;

    public cjqe(coxk coxkVar, batc batcVar, ffhd ffhdVar, Context context) {
        coxkVar.getClass();
        batcVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        this.a = coxkVar;
        this.b = batcVar;
        this.d = ffhdVar;
        this.c = context;
        this.e = new cjjv("SmsToTelephonyWriter");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.e;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjpg cjpgVar;
        cjpg cjpgVar2 = (cjpg) obj;
        if (cjpgVar2 instanceof cjpf) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.e;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjpf.class).c());
            cjpgVar = cjpgVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.e;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjpf.class).c(), new ffkb(cjpgVar2.getClass()).c());
            cjpgVar = null;
        }
        cjpf cjpfVar = (cjpf) cjpgVar;
        return cjpfVar == null ? cjpgVar2 : ekxl.a(this.d, new cjqd(this, cjpfVar, null), ffguVar);
    }
}
