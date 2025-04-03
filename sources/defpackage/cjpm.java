package defpackage;

import android.content.ContentValues;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpm implements cjjt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/sms/receive/ReceiveSmsInfoGatherer");
    private final coxk b;
    private final batc c;
    private final ffbr d;
    private final ffhd e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final Context l;
    private final cjjv m;

    public cjpm(coxk coxkVar, batc batcVar, ffbr ffbrVar, ffhd ffhdVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Context context) {
        coxkVar.getClass();
        batcVar.getClass();
        ffbrVar.getClass();
        ffhdVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        context.getClass();
        this.b = coxkVar;
        this.c = batcVar;
        this.d = ffbrVar;
        this.e = ffhdVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = context;
        this.m = new cjjv("ReceiveSmsInfoGatherer");
    }

    private final ContentValues f(cjpf cjpfVar, Long l) {
        cjow cjowVar = cjpfVar.c;
        cjqf cjqfVar = cjowVar.e;
        ContentValues contentValues = new ContentValues();
        if (cjqfVar.a.length() > 0) {
            contentValues.put("subject", cjqfVar.a);
        }
        contentValues.put("sub_id", Integer.valueOf(cjqfVar.b));
        contentValues.put("reply_path_present", Integer.valueOf(cjqfVar.c ? 1 : 0));
        if (cjqfVar.d.length() > 0) {
            contentValues.put("service_center", cjqfVar.d);
        }
        contentValues.put("protocol", Integer.valueOf(cjqfVar.e));
        contentValues.put("address", cjowVar.b.o());
        if (this.b.V()) {
            contentValues.put("date_sent", Long.valueOf(cjowVar.c.toEpochMilli()));
        }
        contentValues.put("date", Long.valueOf(cjowVar.d.toEpochMilli()));
        contentValues.put("body", cjowVar.a);
        contentValues.put("m_cls", Integer.valueOf(cjowVar.f - 1));
        if (l != null) {
            contentValues.put("thread_id", Long.valueOf(l.longValue()));
        }
        return contentValues;
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.m;
    }

    @Override // defpackage.cjjt
    public final /* synthetic */ Object b(Object obj, ffgu ffguVar) {
        cjpg cjpgVar;
        cjpg cjpgVar2 = (cjpg) obj;
        if (cjpgVar2 instanceof cjpf) {
            ensk h = cjjs.a.h();
            h.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 65, "Interceptor.kt");
            cjjv cjjvVar = this.m;
            int i = fflc.a;
            enrrVar.D("Running Interceptor %s. Subject is expected type %s", cjjvVar.a, new ffkb(cjpf.class).c());
            cjpgVar = cjpgVar2;
        } else {
            ensk h2 = cjjs.a.h();
            h2.Y(ente.a, "BuglePipeline");
            enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 74, "Interceptor.kt");
            cjjv cjjvVar2 = this.m;
            int i2 = fflc.a;
            enrrVar2.J("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cjjvVar2.a, new ffkb(cjpf.class).c(), new ffkb(cjpgVar2.getClass()).c());
            cjpgVar = null;
        }
        cjpf cjpfVar = (cjpf) cjpgVar;
        return cjpfVar == null ? cjpgVar2 : ekxl.a(this.e, new cjpl(this, cjpfVar, null), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:13:0x0044, B:15:0x018d, B:38:0x007e, B:39:0x00d6, B:41:0x00ec, B:43:0x0110, B:44:0x0126, B:48:0x0156, B:54:0x0099), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjpf r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpm.c(cjpf, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:13:0x0070, B:15:0x007b, B:17:0x00ac, B:18:0x00c5, B:22:0x00dc, B:23:0x00e9, B:38:0x004f), top: B:37:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc A[Catch: all -> 0x00eb, TRY_ENTER, TryCatch #1 {all -> 0x00eb, blocks: (B:13:0x0070, B:15:0x007b, B:17:0x00ac, B:18:0x00c5, B:22:0x00dc, B:23:0x00e9, B:38:0x004f), top: B:37:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cjpf r9, java.lang.String r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpm.d(cjpf, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cjpf r26, defpackage.cjoq r27, boolean r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpm.e(cjpf, cjoq, boolean, ffgu):java.lang.Object");
    }
}
