package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpeo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpev b;
    final /* synthetic */ ffrp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpeo(dpev dpevVar, ffrp ffrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpevVar;
        this.c = ffrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpeo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (r10.e(r9) == r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/libraries/compose/audio/sink/FileAudioSink$launchInputCoroutine$job$1"
            java.lang.String r5 = "FileAudioSink.kt"
            java.lang.String r6 = "HugoAudio"
            r7 = 0
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L16
            defpackage.ffci.b(r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            goto L7d
        L16:
            defpackage.ffci.b(r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            goto L49
        L1a:
            r10 = move-exception
            goto L80
        L1c:
            defpackage.ffci.b(r10)
            dpev r10 = r9.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            fgcq r10 = r10.h     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpek r1 = new dpek     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            ffrp r8 = r9.c     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r1.<init>(r8, r7)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            fgds r8 = new fgds     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r8.<init>(r10, r1)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpel r10 = new dpel     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r10.<init>(r7)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            fgad r1 = new fgad     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r1.<init>(r8, r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpem r10 = new dpem     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpev r8 = r9.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r10.<init>(r8)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r9.a = r2     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            java.lang.Object r10 = r1.a(r10, r9)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            if (r10 != r0) goto L49
            goto L7c
        L49:
            enru r10 = defpackage.dpev.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            ensk r10 = r10.e()     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r10.Y(r1, r6)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r1 = 97
            ensk r10 = r10.h(r4, r3, r1, r5)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            enrr r10 = (defpackage.enrr) r10     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            java.lang.String r1 = "Reached end of input flow for %s"
            dpev r2 = r9.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpew r2 = r2.f     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            android.net.Uri r2 = r2.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r10.t(r1, r2)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpev r10 = r9.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            dpbk r10 = r10.i     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            if (r10 != 0) goto L73
            java.lang.String r10 = "encoder"
            defpackage.ffkj.c(r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            r10 = r7
        L73:
            r1 = 2
            r9.a = r1     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            java.lang.Object r10 = r10.e(r9)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            if (r10 != r0) goto L7d
        L7c:
            return r0
        L7d:
            ffcu r10 = defpackage.ffcu.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> Lac
            return r10
        L80:
            enru r0 = defpackage.dpev.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensk r0 = r0.g(r10)
            r1 = 103(0x67, float:1.44E-43)
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Unexpected error when encoding input data."
            r0.q(r1)
            dpev r0 = r9.b
            dpen r1 = new dpen
            r1.<init>(r0, r10, r7)
            ffsk r10 = r0.b
            r0 = 3
            defpackage.ffqy.d(r10, r7, r7, r1, r0)
            goto Lc4
        Lac:
            enru r10 = defpackage.dpev.a
            ensk r10 = r10.h()
            ensn r0 = defpackage.ente.a
            r10.Y(r0, r6)
            r0 = 101(0x65, float:1.42E-43)
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Input job cancelled."
            r10.q(r0)
        Lc4:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpeo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpeo(this.b, this.c, ffguVar);
    }
}
