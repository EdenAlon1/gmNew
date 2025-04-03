package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvm {
    public static final Object a(long j, ffjm ffjmVar, ffgu ffguVar) {
        if (j > 0) {
            return d(new ffvk(j, ffguVar), ffjmVar);
        }
        throw new ffvj("Timed out immediately", null);
    }

    public static final Object b(long j, ffjm ffjmVar, ffgu ffguVar) {
        return a(ffsw.a(j), ffjmVar, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, defpackage.ffjm r9, defpackage.ffgu r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ffvl
            if (r0 == 0) goto L13
            r0 = r10
            ffvl r0 = (defpackage.ffvl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffvl r0 = new ffvl
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            fflb r7 = r0.c
            defpackage.ffci.b(r10)     // Catch: defpackage.ffvj -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            fflb r10 = new fflb
            r10.<init>()
            r0.c = r10     // Catch: defpackage.ffvj -> L56
            r0.b = r4     // Catch: defpackage.ffvj -> L56
            ffvk r2 = new ffvk     // Catch: defpackage.ffvj -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.ffvj -> L56
            r10.a = r2     // Catch: defpackage.ffvj -> L56
            java.lang.Object r7 = d(r2, r9)     // Catch: defpackage.ffvj -> L56
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            ffud r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffvm.c(long, ffjm, ffgu):java.lang.Object");
    }

    private static final Object d(ffvk ffvkVar, ffjm ffjmVar) {
        Object ffrtVar;
        ffgu ffguVar;
        ffui.b(ffvkVar, true, new fftg(ffsw.e(ffvkVar.e.u()).c(ffvkVar.b, ffvkVar, ((ffqq) ffvkVar).a)));
        try {
            if (ffjmVar instanceof ffhp) {
                fflf.e(ffjmVar, 2);
                ffrtVar = ffjmVar.a(ffvkVar, ffvkVar);
            } else {
                ffrtVar = ffhi.a(ffjmVar, ffvkVar, ffvkVar);
            }
        } catch (Throwable th) {
            ffrtVar = new ffrt(th);
        }
        ffhh ffhhVar = ffhh.a;
        if (ffrtVar == ffhhVar) {
            return ffhhVar;
        }
        Object F = ffvkVar.F(ffrtVar);
        if (F == ffur.b) {
            return ffhh.a;
        }
        if (!(F instanceof ffrt)) {
            return ffur.b(F);
        }
        Throwable th2 = ((ffrt) F).b;
        if (!(th2 instanceof ffvj) || ((ffvj) th2).a != ffvkVar) {
            ffguVar = ffvkVar.e;
            if (!ffso.b) {
                throw th2;
            }
            if (!(ffguVar instanceof ffhs)) {
                throw th2;
            }
        } else {
            if (!(ffrtVar instanceof ffrt)) {
                return ffrtVar;
            }
            th2 = ((ffrt) ffrtVar).b;
            ffguVar = ffvkVar.e;
            if (!ffso.b) {
                throw th2;
            }
            if (!(ffguVar instanceof ffhs)) {
                throw th2;
            }
        }
        throw fghn.a(th2, (ffhs) ffguVar);
    }
}
