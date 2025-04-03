package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakk {
    public final ffbr a;
    private final ffhd b;
    private final ffbr c;
    private final ffbr d;

    public cakk(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.d = ffbrVar3;
    }

    private static final List e(List list) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bxgq) it.next()).l());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[Catch: all -> 0x0111, LOOP:0: B:47:0x00a7->B:49:0x00ad, LOOP_END, TryCatch #0 {all -> 0x0111, blocks: (B:46:0x007a, B:47:0x00a7, B:49:0x00ad, B:51:0x00bc), top: B:45:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awui r11, defpackage.eozn r12, java.util.List r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakk.a(awui, eozn, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cakg
            if (r0 == 0) goto L13
            r0 = r7
            cakg r0 = (defpackage.cakg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cakg r0 = new cakg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.b
            ffhd r7 = defpackage.ekxi.a(r7)
            cakf r2 = new cakf
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakk.b(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[LOOP:0: B:11:0x005c->B:13:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cakh
            if (r0 == 0) goto L13
            r0 = r8
            cakh r0 = (defpackage.cakh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cakh r0 = new cakh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L3e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 == r1) goto Ld0
        L3e:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = 10
            int r1 = defpackage.ffdx.n(r8, r0)
            int r1 = defpackage.ffew.a(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 16
            int r1 = defpackage.ffmk.f(r1, r3)
            r2.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L5c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r8.next()
            r4 = r1
            boqd r4 = (defpackage.boqd) r4
            java.lang.String r4 = r4.g()
            r2.put(r4, r1)
            goto L5c
        L71:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r0 = defpackage.ffdx.n(r7, r0)
            int r0 = defpackage.ffew.a(r0)
            int r0 = defpackage.ffmk.f(r0, r3)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo r3 = new com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo
            java.lang.Object r1 = r2.get(r1)
            boqd r1 = (defpackage.boqd) r1
            fffs r4 = new fffs
            r5 = 0
            r4.<init>(r5)
            if (r1 == 0) goto Lb9
            boolean r5 = r1.j()
            if (r5 == 0) goto Lae
            capm r5 = defpackage.capm.b
            r4.add(r5)
        Lae:
            boolean r1 = r1.k()
            if (r1 == 0) goto Lb9
            capm r1 = defpackage.capm.c
            r4.add(r1)
        Lb9:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lc4
            capm r1 = defpackage.capm.a
            r4.add(r1)
        Lc4:
            java.util.List r1 = defpackage.ffdx.a(r4)
            r3.<init>(r1)
            r8.put(r0, r3)
            goto L86
        Lcf:
            return r8
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakk.c(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.caki
            if (r0 == 0) goto L13
            r0 = r9
            caki r0 = (defpackage.caki) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caki r0 = new caki
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r8 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L55
        L2a:
            r9 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            java.lang.String r9 = "E2eeInfoDataLoader#getRegistrations"
            ekzz r9 = defpackage.eleg.f(r9)
            ffhd r2 = r7.b     // Catch: java.lang.Throwable -> L5c
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L5c
            cakj r5 = new cakj     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L5c
            r0.d = r9     // Catch: java.lang.Throwable -> L5c
            r0.c = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r8 == r1) goto L5b
            r6 = r9
            r9 = r8
            r8 = r6
        L55:
            engw r9 = (defpackage.engw) r9     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r8, r3)
            return r9
        L5b:
            return r1
        L5c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            throw r9     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            defpackage.ffig.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cakk.d(java.util.List, ffgu):java.lang.Object");
    }
}
