package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzz implements Closeable, dkzw {
    private static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/classifiers/Classifier");
    private final ffji b;
    private final dlfo c;

    public dkzz(ffji ffjiVar, dlfo dlfoVar) {
        this.b = ffjiVar;
        this.c = dlfoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.dkzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlfy r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.dkzy
            if (r0 == 0) goto L13
            r0 = r10
            dkzy r0 = (defpackage.dkzy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkzy r0 = new dkzy
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "classify"
            java.lang.String r4 = "com/google/android/libraries/abuse/hades/moirai/classifiers/Classifier"
            java.lang.String r5 = "Classifier.kt"
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L36
            if (r2 != r6) goto L2e
            defpackage.ffci.b(r10)
            goto L63
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ffci.b(r10)
            ffji r10 = r8.b
            java.lang.Object r9 = r10.invoke(r9)
            if (r9 != 0) goto L55
            enru r9 = defpackage.dkzz.a
            ensk r9 = r9.h()
            r10 = 19
            ensk r9 = r9.h(r4, r3, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Nothing found to evaluate in payload."
            r9.q(r10)
            return r7
        L55:
            dlfo r10 = r8.c
            r0.c = r6
            dlfr r10 = (defpackage.dlfr) r10
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 == r1) goto L8d
        L63:
            java.util.Map r10 = (java.util.Map) r10
            if (r10 != 0) goto L68
            return r7
        L68:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L87
            dkzx r9 = new dkzx
            r9.<init>(r7)
            enru r10 = defpackage.dkzz.a
            ensk r10 = r10.i()
            r0 = 26
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Inference returned unknown prediction."
            r10.q(r0)
            return r9
        L87:
            dkzx r9 = new dkzx
            r9.<init>(r10)
            return r9
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzz.a(dlfy, ffgu):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
