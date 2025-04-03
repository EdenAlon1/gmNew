package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenh implements cenb {
    public final cqoh a;
    public final cenw b;
    public final Context c;
    public final csxu d;
    public final ffsk e;
    public final ffsk f;
    public final ffhd g;

    public cenh(cqoh cqohVar, cenw cenwVar, Context context, csxu csxuVar, ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar) {
        cqohVar.getClass();
        cenwVar.getClass();
        context.getClass();
        csxuVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        this.a = cqohVar;
        this.b = cenwVar;
        this.c = context;
        this.d = csxuVar;
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = ffhdVar;
    }

    public final Object a(String str, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.g), new cenc(null, this, str), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cenl r6, java.lang.Exception r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cenf
            if (r0 == 0) goto L13
            r0 = r8
            cenf r0 = (defpackage.cenf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cenf r0 = new cenf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "BugleCmsBackupTiming"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            cenw r6 = r0.f
            java.lang.String r7 = r0.e
            cenh r0 = r0.d
            defpackage.ffci.b(r8)
            goto L76
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.ffci.b(r8)
            if (r7 == 0) goto L41
            java.lang.String r8 = r7.getMessage()
            goto L42
        L41:
            r8 = 0
        L42:
            if (r8 == 0) goto L4d
            java.lang.String r7 = r7.getMessage()
            r7.getClass()
            r6.f = r7
        L4d:
            cqoh r7 = r6.a
            long r7 = r7.a()
            r6.b = r7
            cenw r2 = r5.b
            java.util.concurrent.atomic.AtomicLong r2 = r2.a
            r2.set(r7)
            java.lang.String r7 = r6.toString()
            cenw r6 = r5.b
            csjw r8 = r6.b
            if (r8 != 0) goto L7b
            r0.d = r5
            r0.e = r7
            r0.f = r6
            r0.c = r4
            java.lang.Object r8 = r5.a(r3, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            r0 = r5
        L76:
            csjw r8 = (defpackage.csjw) r8
            r6.b = r8
            goto L7c
        L7b:
            r0 = r5
        L7c:
            cenw r6 = r0.b
            csjw r6 = r6.b
            if (r6 == 0) goto L86
            r8 = 4
            r6.b(r8, r3, r7)
        L86:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cenh.b(cenl, java.lang.Exception, ffgu):java.lang.Object");
    }
}
