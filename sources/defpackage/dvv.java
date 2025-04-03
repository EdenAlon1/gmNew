package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvv {
    public static final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? ffmk.d(f, f2) : ffmk.c(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.drd r9, float r10, float r11, defpackage.cxv r12, defpackage.cxt r13, defpackage.ffji r14, defpackage.ffgu r15) {
        /*
            boolean r0 = r15 instanceof defpackage.dvt
            if (r0 == 0) goto L13
            r0 = r15
            dvt r0 = (defpackage.dvt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvt r0 = new dvt
            r0.<init>(r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.d
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            float r9 = r6.b
            float r10 = r6.a
            ffky r11 = r6.f
            cxv r12 = r6.e
            defpackage.ffci.b(r15)
            goto L7d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.ffci.b(r15)
            ffky r15 = new ffky
            r15.<init>()
            java.lang.Object r1 = r12.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            r1 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            java.lang.Object r3 = r12.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L62
            r3 = 0
            r4 = r3
            goto L63
        L62:
            r4 = r1
        L63:
            dvu r5 = new dvu
            r5.<init>(r11, r15, r9, r14)
            r6.e = r12
            r6.f = r15
            r6.a = r10
            r6.b = r8
            r6.d = r1
            r1 = r12
            r3 = r13
            java.lang.Object r9 = defpackage.dap.d(r1, r2, r3, r4, r5, r6)
            if (r9 == r0) goto L9f
            r11 = r15
            r12 = r1
            r9 = r8
        L7d:
            java.lang.Object r13 = r12.b()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = a(r13, r9)
            dvb r13 = new dvb
            float r11 = r11.a
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            cxv r9 = defpackage.cxw.d(r12, r7, r9, r10)
            r13.<init>(r11, r9)
            return r13
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvv.b(drd, float, float, cxv, cxt, ffji, ffgu):java.lang.Object");
    }

    public static final void c(cxs cxsVar, drd drdVar, ffji ffjiVar, float f) {
        float f2;
        try {
            f2 = drdVar.a(f);
        } catch (CancellationException unused) {
            cxsVar.c();
            f2 = 0.0f;
        }
        ffjiVar.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            cxsVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.drd r5, float r6, defpackage.cxv r7, defpackage.cyj r8, defpackage.ffji r9, defpackage.ffgu r10) {
        /*
            boolean r0 = r10 instanceof defpackage.dvr
            if (r0 == 0) goto L13
            r0 = r10
            dvr r0 = (defpackage.dvr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvr r0 = new dvr
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.a
            ffky r5 = r0.e
            cxv r7 = r0.d
            defpackage.ffci.b(r10)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r10)
            ffky r10 = new ffky
            r10.<init>()
            java.lang.Object r2 = r7.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = 0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            dvs r4 = new dvs
            r4.<init>(r6, r10, r5, r9)
            r0.d = r7
            r0.e = r10
            r0.a = r6
            r0.c = r3
            java.lang.Object r5 = defpackage.dap.g(r7, r8, r2, r4, r0)
            if (r5 == r1) goto L71
            r5 = r10
        L63:
            dvb r8 = new dvb
            float r5 = r5.a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvv.d(drd, float, cxv, cyj, ffji, ffgu):java.lang.Object");
    }
}
