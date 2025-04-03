package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzb implements ffxx {
    final /* synthetic */ ffxx a;
    final /* synthetic */ ffjn b;

    public ffzb(ffxx ffxxVar, ffjn ffjnVar) {
        this.a = ffxxVar;
        this.b = ffjnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ffza
            if (r0 == 0) goto L13
            r0 = r10
            ffza r0 = (defpackage.ffza) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffza r0 = new ffza
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.d
            fgfi r9 = (defpackage.fgfi) r9
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7b
        L32:
            r10 = move-exception
            goto L85
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.ffci.b(r10)
            goto L9f
        L44:
            java.lang.Object r9 = r0.e
            java.lang.Object r2 = r0.d
            ffzb r2 = (defpackage.ffzb) r2
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8b
        L50:
            defpackage.ffci.b(r10)
            ffxx r10 = r8.a     // Catch: java.lang.Throwable -> L89
            r0.d = r8     // Catch: java.lang.Throwable -> L89
            r0.e = r9     // Catch: java.lang.Throwable -> L89
            r0.b = r5     // Catch: java.lang.Throwable -> L89
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L89
            if (r10 != r1) goto L62
            goto L9e
        L62:
            r2 = r8
        L63:
            fgfi r10 = new fgfi
            ffhd r4 = r0.u()
            r10.<init>(r9, r4)
            ffjn r9 = r2.b     // Catch: java.lang.Throwable -> L81
            r0.d = r10     // Catch: java.lang.Throwable -> L81
            r0.e = r6     // Catch: java.lang.Throwable -> L81
            r0.b = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.a(r10, r6, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 == r1) goto L9e
            r9 = r10
        L7b:
            r9.g()
            ffcu r9 = defpackage.ffcu.a
            return r9
        L81:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L85:
            r9.g()
            throw r10
        L89:
            r9 = move-exception
            r2 = r8
        L8b:
            fgdt r10 = new fgdt
            r10.<init>(r9)
            ffjn r2 = r2.b
            r0.d = r9
            r0.e = r6
            r0.b = r4
            java.lang.Object r10 = defpackage.ffzi.a(r10, r2, r9, r0)
            if (r10 != r1) goto L9f
        L9e:
            return r1
        L9f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzb.a(ffxy, ffgu):java.lang.Object");
    }
}
