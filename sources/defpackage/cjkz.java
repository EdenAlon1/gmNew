package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkz implements cjkf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager");
    public final cjkk b;
    public final cjls c;
    public final cjkd d;
    public final ffhd e;
    private final Map f;
    private final cjjr g;

    public cjkz(Map map, cjkk cjkkVar, cjls cjlsVar, cjjr cjjrVar, cjkd cjkdVar, ffhd ffhdVar) {
        ffhdVar.getClass();
        this.f = map;
        this.b = cjkkVar;
        this.c = cjlsVar;
        this.g = cjjrVar;
        this.d = cjkdVar;
        this.e = ffhdVar;
    }

    private final cjke g(cjkh cjkhVar) {
        cjke cjkeVar = (cjke) this.f.get(cjkhVar);
        if (cjkeVar == null) {
            this.d.b(cjkhVar, 3);
            ensk j = a.j();
            j.Y(ente.a, "BuglePipeline");
            enrr enrrVar = (enrr) j;
            ensn ensnVar = cjkg.a;
            enrrVar.Y(cjkg.b, cjkhVar);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager", "getEntry", 225, "PwqBackedPipelineManager.kt")).q("No pipeline entry found");
        }
        return cjkeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[Catch: ClassCastException -> 0x0093, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0093, blocks: (B:14:0x007b, B:16:0x0088), top: B:13:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cjkh r9, java.lang.Object r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cjkr
            if (r0 == 0) goto L13
            r0 = r11
            cjkr r0 = (defpackage.cjkr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cjkr r0 = new cjkr
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            cjkh r1 = r0.g
            cjkz r0 = r0.f
            defpackage.ffci.b(r11)     // Catch: java.lang.ClassCastException -> L34
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r0
            r0 = r7
            goto L7b
        L34:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r1
            r1 = r0
            r0 = r7
            goto L98
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            defpackage.ffci.b(r11)
            cjke r11 = r8.g(r9)
            if (r11 == 0) goto Lc8
            cjjt r2 = r11.a()     // Catch: java.lang.ClassCastException -> L96
            r2.getClass()     // Catch: java.lang.ClassCastException -> L96
            cjkd r4 = r8.d     // Catch: java.lang.ClassCastException -> L96
            r9.getClass()     // Catch: java.lang.ClassCastException -> L96
            aujm r5 = r4.b     // Catch: java.lang.ClassCastException -> L96
            boolean r5 = r5.a()     // Catch: java.lang.ClassCastException -> L96
            if (r5 == 0) goto L6a
            akzt r4 = r4.a     // Catch: java.lang.ClassCastException -> L96
            java.lang.String r5 = defpackage.cjkd.a(r9)     // Catch: java.lang.ClassCastException -> L96
            r6 = 2
            r4.e(r5, r6)     // Catch: java.lang.ClassCastException -> L96
        L6a:
            r0.f = r8     // Catch: java.lang.ClassCastException -> L96
            r0.g = r9     // Catch: java.lang.ClassCastException -> L96
            r0.a = r10     // Catch: java.lang.ClassCastException -> L96
            r0.b = r11     // Catch: java.lang.ClassCastException -> L96
            r0.e = r3     // Catch: java.lang.ClassCastException -> L96
            java.lang.Object r0 = r2.b(r10, r0)     // Catch: java.lang.ClassCastException -> L96
            if (r0 == r1) goto L95
            r1 = r8
        L7b:
            cjkd r2 = r1.d     // Catch: java.lang.ClassCastException -> L93
            r9.getClass()     // Catch: java.lang.ClassCastException -> L93
            aujm r4 = r2.b     // Catch: java.lang.ClassCastException -> L93
            boolean r4 = r4.a()     // Catch: java.lang.ClassCastException -> L93
            if (r4 == 0) goto L92
            akzt r2 = r2.a     // Catch: java.lang.ClassCastException -> L93
            java.lang.String r4 = defpackage.cjkd.a(r9)     // Catch: java.lang.ClassCastException -> L93
            r5 = 3
            r2.e(r4, r5)     // Catch: java.lang.ClassCastException -> L93
        L92:
            return r0
        L93:
            r0 = move-exception
            goto L98
        L95:
            return r1
        L96:
            r0 = move-exception
            r1 = r8
        L98:
            cjkd r1 = r1.d
            r1.b(r9, r3)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Class r10 = r10.getClass()
            int r1 = defpackage.fflc.a
            ffkb r1 = new ffkb
            r1.<init>(r10)
            ffmo r10 = r11.d()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "Type mismatch. Provided subject is "
            r11.<init>(r2)
            r11.append(r1)
            java.lang.String r1 = " but the pipeline requires a "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10, r0)
            throw r9
        Lc8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.a(cjkh, java.lang.Object, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r13 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.cjkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjlk r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.b(cjlk, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjkh r12, java.lang.Object r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.cjkv
            if (r0 == 0) goto L13
            r0 = r14
            cjkv r0 = (defpackage.cjkv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjkv r0 = new cjkv
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cjlk r12 = r0.d
            defpackage.ffci.b(r14)
            return r12
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.ffci.b(r14)
            cjke r14 = r11.g(r12)
            if (r14 == 0) goto Lcd
            cjlb r2 = r14.b()
            java.lang.String r9 = r2.a(r12, r13)
            cjkp r2 = r14.e()
            if (r2 == 0) goto La8
            cjkp r14 = r14.e()
            boolean r2 = r14 instanceof defpackage.cjkp
            if (r3 == r2) goto L51
            r14 = 0
        L51:
            if (r14 == 0) goto L88
            r13.getClass()
            cjph r14 = new cjph
            r14.<init>()
            java.lang.Object r13 = defpackage.emwe.a(r14, r13)
            eyhs r13 = (defpackage.eyhs) r13
            byte[] r8 = r13.toByteArray()
            r8.getClass()
            cjlk r6 = new cjlk
            java.util.UUID r13 = java.util.UUID.randomUUID()
            r13.getClass()
            r6.<init>(r13)
            cjkx r4 = new cjkx
            r10 = 0
            r5 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.d = r6
            r0.c = r3
            java.lang.Object r12 = r11.f(r6, r7, r4, r0)
            if (r12 == r1) goto L87
            return r6
        L87:
            return r1
        L88:
            r5 = r11
            r7 = r12
            cjkd r12 = r5.d
            r14 = 6
            r12.b(r7, r14)
            java.lang.Class r12 = r13.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Invalid serializer for subject "
            java.lang.String r12 = r14.concat(r12)
            r13.<init>(r12)
            throw r13
        La8:
            r5 = r11
            r7 = r12
            cjkd r12 = r5.d
            r13 = 5
            r12.b(r7, r13)
            java.lang.String r12 = r7.name()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Pipeline "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = " does not have a serializer."
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r12)
            throw r13
        Lcd:
            r5 = r11
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.c(cjkh, java.lang.Object, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cjkh r9, defpackage.cjke r10, java.lang.Object r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.d(cjkh, cjke, java.lang.Object, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cjlt r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.e(cjlt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [cjlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cjlk r5, defpackage.cjkh r6, defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cjky
            if (r0 == 0) goto L13
            r0 = r8
            cjky r0 = (defpackage.cjky) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjky r0 = new cjky
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r6 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r8)
            enwb r8 = defpackage.enwg.a()
            ensn r2 = defpackage.cjkg.a
            ensn r2 = defpackage.cjkg.a
            r8.b(r2, r5)
            ensn r5 = defpackage.cjkg.b
            r8.b(r5, r6)
            enwd r5 = r8.a()
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r8 == r1) goto L59
        L54:
            r6 = 0
            defpackage.ffig.a(r5, r6)
            return r8
        L59:
            return r1
        L5a:
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            defpackage.ffig.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkz.f(cjlk, cjkh, ffji, ffgu):java.lang.Object");
    }
}
