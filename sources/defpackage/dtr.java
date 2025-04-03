package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtr {
    public static final ffjn a = new dsq(null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.iju r6, boolean r7, defpackage.ikk r8, defpackage.ffgu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dsr
            if (r0 == 0) goto L13
            r0 = r9
            dsr r0 = (defpackage.dsr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsr r0 = new dsr
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.b
            ikk r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.ffci.b(r9)
        L3c:
            r0.a = r6
            r0.e = r8
            r0.b = r7
            r0.d = r3
            java.lang.Object r9 = r6.r(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            iki r9 = (defpackage.iki) r9
            r2 = 0
            boolean r4 = m(r9, r7, r2)
            if (r4 != 0) goto L55
            goto L3c
        L55:
            java.util.List r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtr.a(iju, boolean, ikk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:11:0x0049->B:12:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.iju r8, defpackage.ffgu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dsu
            if (r0 == 0) goto L13
            r0 = r9
            dsu r0 = (defpackage.dsu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsu r0 = new dsu
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
        L34:
            r0.a = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.ijt.a(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            iki r9 = (defpackage.iki) r9
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            iku r7 = (defpackage.iku) r7
            r7.b()
            int r6 = r6 + 1
            goto L49
        L57:
            java.util.List r9 = r9.a
            int r2 = r9.size()
        L5d:
            if (r5 >= r2) goto L6d
            java.lang.Object r4 = r9.get(r5)
            iku r4 = (defpackage.iku) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6a
            goto L34
        L6a:
            int r5 = r5 + 1
            goto L5d
        L6d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtr.b(iju, ffgu):java.lang.Object");
    }

    public static final Object c(ild ildVar, ffjn ffjnVar, ffji ffjiVar, ffgu ffguVar) {
        Object a2 = ffsl.a(new dta(ildVar, ffjnVar, ffjiVar, new dqx(ildVar), null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public static final Object d(ild ildVar, ffji ffjiVar, ffji ffjiVar2, ffjn ffjnVar, ffji ffjiVar3, ffgu ffguVar) {
        Object a2 = ffsl.a(new dtm(ildVar, ffjnVar, ffjiVar2, ffjiVar, ffjiVar3, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.iju r7, defpackage.ikk r8, defpackage.ffgu r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dto
            if (r0 == 0) goto L13
            r0 = r9
            dto r0 = (defpackage.dto) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dto r0 = new dto
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fflb r7 = r0.c
            defpackage.ffci.b(r9)     // Catch: defpackage.ikl -> L5a
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r9)
            fflb r9 = new fflb
            r9.<init>()
            dpw r2 = defpackage.dpw.a
            r9.a = r2
            jgi r2 = r7.q()     // Catch: defpackage.ikl -> L5a
            long r4 = r2.f()     // Catch: defpackage.ikl -> L5a
            dtp r2 = new dtp     // Catch: defpackage.ikl -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: defpackage.ikl -> L5a
            r0.c = r9     // Catch: defpackage.ikl -> L5a
            r0.b = r3     // Catch: defpackage.ikl -> L5a
            java.lang.Object r7 = r7.s(r4, r2, r0)     // Catch: defpackage.ikl -> L5a
            if (r7 == r1) goto L59
            r7 = r9
        L56:
            java.lang.Object r7 = r7.a
            return r7
        L59:
            return r1
        L5a:
            dpy r7 = defpackage.dpy.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtr.e(iju, ikk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b3 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.iju r17, defpackage.ikk r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtr.f(iju, ikk, ffgu):java.lang.Object");
    }

    public static /* synthetic */ Object g(iju ijuVar, ikk ikkVar, ffgu ffguVar, int i) {
        if ((i & 2) != 0) {
            ikkVar = ikk.b;
        }
        return a(ijuVar, 1 == (i & 1), ikkVar, ffguVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.iju r6, defpackage.ikk r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dss
            if (r0 == 0) goto L13
            r0 = r8
            dss r0 = (defpackage.dss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dss r0 = new dss
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ikk r6 = r0.d
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.ffci.b(r8)
        L39:
            r0.a = r6
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r6.r(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            iki r8 = (defpackage.iki) r8
            r2 = 0
            boolean r4 = m(r8, r2, r3)
            if (r4 != 0) goto L50
            goto L39
        L50:
            java.util.List r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtr.h(iju, ikk, ffgu):java.lang.Object");
    }

    public static /* synthetic */ Object i(ild ildVar, ffji ffjiVar, ffji ffjiVar2, ffjn ffjnVar, ffji ffjiVar3, ffgu ffguVar, int i) {
        if ((i & 4) != 0) {
            ffjnVar = a;
        }
        ffjn ffjnVar2 = ffjnVar;
        int i2 = i & 2;
        int i3 = i & 1;
        return d(ildVar, 1 != i3 ? ffjiVar : null, i2 != 0 ? null : ffjiVar2, ffjnVar2, ffjiVar3, ffguVar);
    }

    private static final boolean m(iki ikiVar, boolean z, boolean z2) {
        if (z2) {
            List list = ikiVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!ilq.b(((iku) list.get(i)).i, 2)) {
                        break;
                    }
                    i++;
                } else if (!ikn.a(ikiVar.c)) {
                    return false;
                }
            }
        }
        List list2 = ikiVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            iku ikuVar = (iku) list2.get(i2);
            if (!(z ? ikj.c(ikuVar) : ikj.d(ikuVar))) {
                return false;
            }
        }
        return true;
    }
}
