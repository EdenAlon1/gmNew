package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpfe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfa(dpfe dpfeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpfeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpfa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (defpackage.ffvt.a(r10) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r10.b.f.fQ(r1, r10) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x0019, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:19:0x0045, B:21:0x004b, B:23:0x0068, B:25:0x001d), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:10:0x0019, B:11:0x0026, B:13:0x002c, B:15:0x0032, B:19:0x0045, B:21:0x004b, B:23:0x0068, B:25:0x001d), top: B:2:0x000e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006e -> B:11:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/audio/source/FileAudioSource$launchInputCoroutine$1"
            java.lang.String r4 = "FileAudioSource.kt"
            java.lang.String r5 = "HugoAudio"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L23
            if (r1 == r7) goto L1d
            if (r1 == r6) goto L19
            defpackage.ffci.b(r11)
            goto La7
        L19:
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L21
            goto L26
        L1d:
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L21
            goto L45
        L21:
            r11 = move-exception
            goto L71
        L23:
            defpackage.ffci.b(r11)
        L26:
            dpfe r11 = r10.b     // Catch: java.lang.Throwable -> L21
            boolean r11 = r11.c     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto La7
            dpfe r11 = r10.b     // Catch: java.lang.Throwable -> L21
            boolean r1 = r11.d     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto La7
            dpbj r11 = r11.b     // Catch: java.lang.Throwable -> L21
            r10.a = r7     // Catch: java.lang.Throwable -> L21
            ffhd r1 = r11.b     // Catch: java.lang.Throwable -> L21
            dpbh r8 = new dpbh     // Catch: java.lang.Throwable -> L21
            r9 = 0
            r8.<init>(r11, r9)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r11 = defpackage.ffra.a(r1, r8, r10)     // Catch: java.lang.Throwable -> L21
            if (r11 != r0) goto L45
            goto La6
        L45:
            dpbm r11 = (defpackage.dpbm) r11     // Catch: java.lang.Throwable -> L21
            dpbm r1 = defpackage.dpbm.c     // Catch: java.lang.Throwable -> L21
            if (r11 != r1) goto L68
            enru r11 = defpackage.dpfe.a     // Catch: java.lang.Throwable -> L21
            ensk r11 = r11.e()     // Catch: java.lang.Throwable -> L21
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Throwable -> L21
            r11.Y(r1, r5)     // Catch: java.lang.Throwable -> L21
            r1 = 93
            ensk r11 = r11.h(r3, r2, r1, r4)     // Catch: java.lang.Throwable -> L21
            enrr r11 = (defpackage.enrr) r11     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "Reached end of input file, stopping input coroutine."
            r11.q(r1)     // Catch: java.lang.Throwable -> L21
            dpfe r11 = r10.b     // Catch: java.lang.Throwable -> L21
            r11.d = r7     // Catch: java.lang.Throwable -> L21
            goto La7
        L68:
            r10.a = r6     // Catch: java.lang.Throwable -> L21
            java.lang.Object r11 = defpackage.ffvt.a(r10)     // Catch: java.lang.Throwable -> L21
            if (r11 == r0) goto La6
            goto L26
        L71:
            enru r1 = defpackage.dpfe.a
            ensk r1 = r1.j()
            ensn r6 = defpackage.ente.a
            r1.Y(r6, r5)
            enrr r1 = (defpackage.enrr) r1
            ensk r1 = r1.g(r11)
            r5 = 100
            ensk r1 = r1.h(r3, r2, r5, r4)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Error in decoding input coroutine."
            r1.q(r2)
            dpfe r1 = r10.b
            defpackage.dpfe.f(r1)
            dpdd r1 = new dpdd
            r1.<init>(r11)
            r11 = 3
            r10.a = r11
            dpfe r11 = r10.b
            fgcl r11 = r11.f
            java.lang.Object r11 = r11.fQ(r1, r10)
            if (r11 != r0) goto La7
        La6:
            return r0
        La7:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpfa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpfa(this.b, ffguVar);
    }
}
