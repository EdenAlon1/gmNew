package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahj implements eahg {
    public static final entd a = entd.c("GnpSdk");
    public final Map b;
    public final eafz c;
    private final ffhd d;

    public eahj(Map map, eafz eafzVar, ffhd ffhdVar) {
        ffhdVar.getClass();
        this.b = map;
        this.c = eafzVar;
        this.d = ffhdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v2, types: [ekxy] */
    @Override // defpackage.eahg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pot r7, int r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.eahh
            if (r0 == 0) goto L13
            r0 = r9
            eahh r0 = (defpackage.eahh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eahh r0 = new eahh
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekxy r7 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L57
        L2a:
            r8 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r9)
            elat r9 = defpackage.ekyf.c()
            ekzt r2 = defpackage.ekzt.a
            defpackage.ekyf.g(r2)
            ekxy r2 = new ekxy
            r2.<init>()
            ffhd r9 = r6.d     // Catch: java.lang.Throwable -> L61
            eahi r5 = new eahi     // Catch: java.lang.Throwable -> L61
            r5.<init>(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L61
            r0.d = r2     // Catch: java.lang.Throwable -> L61
            r0.c = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = defpackage.ffra.a(r9, r5, r0)     // Catch: java.lang.Throwable -> L61
            if (r9 == r1) goto L60
            r7 = r2
        L57:
            ppq r9 = (defpackage.ppq) r9     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r7, r3)
            r9.getClass()
            return r9
        L60:
            return r1
        L61:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L64:
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r9 = move-exception
            defpackage.ffig.a(r7, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahj.a(pot, int, ffgu):java.lang.Object");
    }
}
