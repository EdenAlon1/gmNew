package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjv {
    public final String a;

    public cjjv(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cjju
            if (r0 == 0) goto L13
            r0 = r7
            cjju r0 = (defpackage.cjju) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjju r0 = new cjju
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            java.lang.String r7 = r5.a
            ffhd r2 = r0.u()
            boolean r2 = defpackage.ekxi.b(r2)
            if (r2 == 0) goto L63
            ekzz r7 = defpackage.eleg.f(r7)
            r0.d = r7     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L59
            if (r6 != r1) goto L51
            return r1
        L51:
            r4 = r7
            r7 = r6
            r6 = r4
        L54:
            r0 = 0
            defpackage.ffig.a(r6, r0)
            return r7
        L59:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5d:
            throw r7     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjjv.a(ffji, ffgu):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjjv) && ffkj.e(this.a, ((cjjv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InterceptorMetadata(_name=" + this.a + ")";
    }
}
