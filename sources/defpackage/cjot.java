package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjot implements cjjt {
    public final batc a;
    private final ffhd b;
    private final Context c;
    private final bbfo d;
    private final cisl e;
    private final cjjv f;

    public cjot(batc batcVar, ffhd ffhdVar, Context context, bbfo bbfoVar, cisl cislVar) {
        batcVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        bbfoVar.getClass();
        cislVar.getClass();
        this.a = batcVar;
        this.b = ffhdVar;
        this.c = context;
        this.d = bbfoVar;
        this.e = cislVar;
        this.f = new cjjv("LaunchActionsForReceiveSms");
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjjt
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjpg r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cjor
            if (r0 == 0) goto L13
            r0 = r11
            cjor r0 = (defpackage.cjor) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjor r0 = new cjor
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cjpb r10 = r0.d
            defpackage.ffci.b(r11)
            return r10
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.ffci.b(r11)
            boolean r11 = r10 instanceof defpackage.cjpb
            r2 = 0
            java.lang.String r4 = "checkSubjectType"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion"
            java.lang.String r6 = "Interceptor.kt"
            java.lang.String r7 = "BuglePipeline"
            if (r11 == 0) goto L6c
            enru r11 = defpackage.cjjs.a
            ensk r11 = r11.h()
            ensn r8 = defpackage.ente.a
            r11.Y(r8, r7)
            r7 = 65
            ensk r11 = r11.h(r5, r4, r7, r6)
            enrr r11 = (defpackage.enrr) r11
            cjjv r4 = r9.f
            int r5 = defpackage.fflc.a
            ffkb r5 = new ffkb
            java.lang.Class<cjpb> r6 = defpackage.cjpb.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r6 = "Running Interceptor %s. Subject is expected type %s"
            java.lang.String r4 = r4.a
            r11.D(r6, r4, r5)
            r11 = r10
            goto La3
        L6c:
            enru r11 = defpackage.cjjs.a
            ensk r11 = r11.h()
            ensn r8 = defpackage.ente.a
            r11.Y(r8, r7)
            r7 = 74
            ensk r11 = r11.h(r5, r4, r7, r6)
            enrr r11 = (defpackage.enrr) r11
            cjjv r4 = r9.f
            int r5 = defpackage.fflc.a
            ffkb r5 = new ffkb
            java.lang.Class<cjpb> r6 = defpackage.cjpb.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.Class r6 = r10.getClass()
            ffkb r7 = new ffkb
            r7.<init>(r6)
            java.lang.String r6 = r7.c()
            java.lang.String r7 = "Skipping Interceptor %s. Expected type is %s but received subject of type %s"
            java.lang.String r4 = r4.a
            r11.J(r7, r4, r5, r6)
            r11 = r2
        La3:
            cjpb r11 = (defpackage.cjpb) r11
            if (r11 != 0) goto La8
            return r10
        La8:
            cjov r10 = r11.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r10 = r10.g
            if (r10 != 0) goto Laf
            goto Ld9
        Laf:
            android.content.Context r10 = r9.c
            boolean r10 = defpackage.ctid.h(r10)
            if (r10 != 0) goto Lc3
            bbfo r10 = r9.d
            r4 = 2
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r10 = r10.b(r4)
            r4 = 0
            r10.x(r4)
        Lc3:
            cisl r10 = r9.e
            r10.b()
            ffhd r10 = r9.b
            cjos r4 = new cjos
            r4.<init>(r9, r11, r2)
            r0.d = r11
            r0.c = r3
            java.lang.Object r10 = defpackage.ekxl.a(r10, r4, r0)
            if (r10 == r1) goto Lda
        Ld9:
            return r11
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjot.b(cjpg, ffgu):java.lang.Object");
    }
}
