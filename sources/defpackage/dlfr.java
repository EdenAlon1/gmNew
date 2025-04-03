package defpackage;

import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfr implements dlfo {
    private static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/models/TextModelRunner");
    private final NLClassifier b;
    private final ffji c;
    private final fgjb d;

    public dlfr(NLClassifier nLClassifier, final dlfn dlfnVar) {
        final ffpa ffpaVar = dlfnVar.d;
        ffji ffjiVar = ffpaVar != null ? new ffji() { // from class: dlfp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                String str2 = dlfnVar.e;
                str2.getClass();
                return ffpa.this.a(str, str2);
            }
        } : null;
        this.b = nLClassifier;
        this.c = ffjiVar;
        this.d = new fgjf();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dlfq
            if (r0 == 0) goto L13
            r0 = r9
            dlfq r0 = (defpackage.dlfq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlfq r0 = new dlfq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            fgjf r8 = r0.f
            java.lang.String r1 = r0.e
            dlfr r0 = r0.d
            defpackage.ffci.b(r9)
            goto L5a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ffci.b(r9)
            ffji r9 = r7.c
            if (r9 == 0) goto L41
            java.lang.Object r8 = r9.invoke(r8)
        L41:
            fgjb r9 = r7.d
            r0.d = r7
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r0.e = r2
            r2 = r9
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.c = r4
            java.lang.Object r0 = r9.a(r3, r0)
            if (r0 == r1) goto Lc6
            r0 = r7
            r1 = r8
            r8 = r9
        L5a:
            org.tensorflow.lite.task.text.nlclassifier.NLClassifier r9 = r0.b     // Catch: java.lang.Throwable -> Lc1
            long r5 = r9.a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc1
            java.util.List r9 = org.tensorflow.lite.task.text.nlclassifier.NLClassifier.classifyNative(r5, r1)     // Catch: java.lang.Throwable -> Lc1
            r8.b(r3)
            if (r9 == 0) goto La5
            int r8 = r9.size()
            if (r8 != r4) goto La5
            r8 = 10
            int r8 = defpackage.ffdx.n(r9, r8)
            int r8 = defpackage.ffew.a(r8)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            int r8 = defpackage.ffmk.f(r8, r1)
            r0.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L88:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La4
            java.lang.Object r9 = r8.next()
            org.tensorflow.lite.support.label.Category r9 = (org.tensorflow.lite.support.label.Category) r9
            java.lang.String r1 = r9.a
            r1.getClass()
            float r9 = r9.b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r9)
            r0.put(r1, r2)
            goto L88
        La4:
            return r0
        La5:
            enru r8 = defpackage.dlfr.a
            ensk r8 = r8.i()
            java.lang.String r9 = "run"
            r0 = 43
            java.lang.String r1 = "com/google/android/libraries/abuse/hades/moirai/models/TextModelRunner"
            java.lang.String r2 = "TextModelRunner.kt"
            ensk r8 = r8.h(r1, r9, r0, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "L2CInferencer returned classification with incorrect number of results."
            r8.q(r9)
            ffem r8 = defpackage.ffem.a
            return r8
        Lc1:
            r9 = move-exception
            r8.b(r3)
            throw r9
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlfr.a(java.lang.String, ffgu):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
