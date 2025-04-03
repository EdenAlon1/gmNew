package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fek {
    public static final hvi a(hvi hviVar, fcp fcpVar, evy evyVar) {
        fef fefVar = new fef(fcpVar, evyVar);
        iki ikiVar = ilv.a;
        return hviVar.a(new SuspendPointerInputElement(fcpVar, evyVar, null, fefVar, 4));
    }

    public static final hvi b(hvi hviVar, ffji ffjiVar) {
        return ilv.a(hviVar, 8675309, new fej(ffjiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.iju r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.feb
            if (r0 == 0) goto L13
            r0 = r8
            feb r0 = (defpackage.feb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            feb r0 = new feb
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
        L34:
            ikk r8 = defpackage.ikk.b
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            iki r8 = (defpackage.iki) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            iku r6 = (defpackage.iku) r6
            boolean r6 = defpackage.ikj.d(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fek.c(iju, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [iju, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.iju r11, defpackage.fcp r12, defpackage.fcl r13, defpackage.iki r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fek.d(iju, fcp, fcl, iki, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.iju r8, defpackage.evy r9, defpackage.iki r10, defpackage.ffgu r11) {
        /*
            boolean r0 = r11 instanceof defpackage.feg
            if (r0 == 0) goto L13
            r0 = r11
            feg r0 = (defpackage.feg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            feg r0 = new feg
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8b
        L2e:
            r8 = move-exception
            goto Lbe
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            iku r8 = r0.e
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.ffci.b(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            defpackage.ffci.b(r11)
            java.util.List r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = defpackage.ffdx.K(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            iku r10 = (defpackage.iku) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.e = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = defpackage.doo.f(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto Lba
        L62:
            iku r11 = (defpackage.iku) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lbb
            jgi r2 = r8.q()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lbb
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.a     // Catch: java.util.concurrent.CancellationException -> L2e
            feh r2 = new feh     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r4 = 0
            r0.e = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = defpackage.doo.j(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == r1) goto Lba
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lb6
            iki r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        L9e:
            if (r11 >= r10) goto Lb2
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            iku r0 = (defpackage.iku) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = defpackage.ikj.e(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Laf
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L2e
        Laf:
            int r11 = r11 + 1
            goto L9e
        Lb2:
            r9.d()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbb
        Lb6:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lbb
        Lba:
            return r1
        Lbb:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lbe:
            r9.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fek.e(iju, evy, iki, ffgu):java.lang.Object");
    }

    public static final boolean f(jgi jgiVar, iku ikuVar, iku ikuVar2) {
        return iak.a(iak.e(ikuVar.c, ikuVar2.c)) < doo.a(jgiVar, ikuVar.i);
    }

    public static final boolean g(iki ikiVar) {
        List list = ikiVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ilq.b(((iku) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }
}
