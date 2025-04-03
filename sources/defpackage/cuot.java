package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuot implements cuom {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl");
    public final ffbr b;
    public final ffhd c;
    private final fazb d;
    private final ffhd e;
    private final ffbr f;

    public cuot(ffbr ffbrVar, fazb fazbVar, ffhd ffhdVar, ffhd ffhdVar2, ffbr ffbrVar2) {
        ffbrVar.getClass();
        fazbVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.d = fazbVar;
        this.c = ffhdVar;
        this.e = ffhdVar2;
        this.f = ffbrVar2;
    }

    @Override // defpackage.cuom
    public final Object a(culh culhVar, String str, eylu eyluVar, eylw eylwVar, ffgu ffguVar) {
        return e(culhVar, str, eyluVar, eylwVar, ffguVar);
    }

    @Override // defpackage.cuom
    public final Object b(String str, ffgu ffguVar) {
        if (!TextUtils.isEmpty(str)) {
            return c(cupq.b, dlfx.b(str), ffguVar);
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl", "classifyDestination", 76, "BugleMoiraiApiV2Impl.kt")).q("BugleMoiraiApiV2Impl#classify: empty phone number");
        return new dlgu((String) null, (dlfs) null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cupq r7, defpackage.dlfy r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cuoq
            if (r0 == 0) goto L13
            r0 = r9
            cuoq r0 = (defpackage.cuoq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuoq r0 = new cuoq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            dlfy r8 = r0.e
            cuot r7 = r0.d
            defpackage.ffci.b(r9)
            goto L56
        L3b:
            defpackage.ffci.b(r9)
            r0.d = r6
            r0.e = r8
            r0.c = r4
            ffhd r9 = r6.e
            ffhd r9 = defpackage.ekxi.a(r9)
            cuos r2 = new cuos
            r2.<init>(r5, r6, r7)
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto L9a
            r7 = r6
        L56:
            cupp r9 = (defpackage.cupp) r9
            if (r9 != 0) goto L81
            enru r7 = defpackage.cuot.a
            ensk r7 = r7.g()
            ensn r8 = defpackage.ente.a
            java.lang.String r9 = "BugleSpam"
            r7.Y(r8, r9)
            java.lang.String r8 = "callHadesClassify"
            r9 = 191(0xbf, float:2.68E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl"
            java.lang.String r1 = "BugleMoiraiApiV2Impl.kt"
            ensk r7 = r7.h(r0, r8, r9, r1)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "moiraiApi is null"
            r7.q(r8)
            dlgu r7 = new dlgu
            r8 = 7
            r7.<init>(r5, r5, r8)
            return r7
        L81:
            ffhd r7 = r7.c
            ffhd r7 = defpackage.ekxi.a(r7)
            cuoo r2 = new cuoo
            r2.<init>(r5, r9, r8)
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L99
            goto L9a
        L99:
            return r7
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuot.c(cupq, dlfy, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|12|13|(2:15|16)(2:18|19)))|31|6|7|(0)(0)|11|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        defpackage.cuon.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        defpackage.cuon.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cuor
            if (r0 == 0) goto L13
            r0 = r8
            cuor r0 = (defpackage.cuor) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuor r0 = new cuor
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            defpackage.ffci.b(r8)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            goto L73
        L28:
            r7 = move-exception
            goto L77
        L2a:
            r7 = move-exception
            goto L7b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r8)
            fazb r8 = r6.d     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            java.lang.Object r8 = r8.b()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            ctit r8 = (defpackage.ctit) r8     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbup r2 = defpackage.fbup.a     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            eyfq r2 = r2.createBuilder()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbuo r2 = (defpackage.fbuo) r2     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r2.getClass()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            defpackage.fboo.c(r2)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbun r5 = defpackage.fbun.a     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            eyfq r5 = r5.createBuilder()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbum r5 = (defpackage.fbum) r5     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            defpackage.fbon.b(r7, r5)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbun r7 = defpackage.fbon.a(r5)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r2.b(r7)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            fbup r7 = defpackage.fboo.a(r2)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            elfl r7 = r8.a(r7)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r0.c = r4     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            if (r8 != r1) goto L73
            return r1
        L73:
            java.util.Locale r8 = (java.util.Locale) r8     // Catch: java.lang.IllegalStateException -> L28 java.lang.IllegalArgumentException -> L2a
            r3 = r8
            goto L7e
        L77:
            defpackage.cuon.a(r7)
            goto L7e
        L7b:
            defpackage.cuon.a(r7)
        L7e:
            java.lang.String r7 = "getLanguage"
            java.lang.String r8 = "com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiV2Impl"
            java.lang.String r0 = "BugleMoiraiApiV2Impl.kt"
            java.lang.String r1 = "BugleSpam"
            if (r3 == 0) goto La8
            enru r2 = defpackage.cuot.a
            ensk r2 = r2.g()
            ensn r4 = defpackage.ente.a
            r2.Y(r4, r1)
            r1 = 246(0xf6, float:3.45E-43)
            ensk r7 = r2.h(r8, r7, r1, r0)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "Detected language."
            r7.q(r8)
            java.lang.String r7 = r3.getLanguage()
            r7.getClass()
            return r7
        La8:
            enru r2 = defpackage.cuot.a
            ensk r2 = r2.j()
            ensn r3 = defpackage.ente.a
            r2.Y(r3, r1)
            r1 = 249(0xf9, float:3.49E-43)
            ensk r7 = r2.h(r8, r7, r1, r0)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "Unable to detect language."
            r7.q(r8)
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuot.d(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.culh r10, java.lang.String r11, defpackage.eylu r12, defpackage.eylw r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuot.e(culh, java.lang.String, eylu, eylw, ffgu):java.lang.Object");
    }
}
