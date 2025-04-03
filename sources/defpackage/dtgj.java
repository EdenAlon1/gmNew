package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgj extends ffhv implements ffji {
    int a;
    final /* synthetic */ dtgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgj(dtgp dtgpVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dtgpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (defpackage.ffui.a(r7, r6) != r0) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            r2 = 2
            if (r1 == r2) goto L11
            defpackage.ffci.b(r7)
            goto Lb6
        L11:
            defpackage.ffci.b(r7)
            goto L83
        L15:
            defpackage.ffci.b(r7)
            dtgp r7 = r6.b
            fgcm r7 = r7.k
            java.lang.Object r7 = r7.c()
            boolean r7 = r7 instanceof defpackage.dtfx
            if (r7 != 0) goto L58
            dtgp r7 = r6.b
            fgcm r7 = r7.k
            java.lang.Object r7 = r7.c()
            boolean r7 = r7 instanceof defpackage.dtfw
            if (r7 == 0) goto L31
            goto L58
        L31:
            enru r7 = defpackage.dtgp.a
            ensk r7 = r7.j()
            java.lang.String r0 = "invokeSuspend"
            r1 = 97
            java.lang.String r2 = "com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$startRecording$2"
            java.lang.String r3 = "VoiceRecordingManager.kt"
            ensk r7 = r7.h(r2, r0, r1, r3)
            enrr r7 = (defpackage.enrr) r7
            dtgp r0 = r6.b
            fgcm r0 = r0.k
            java.lang.String r1 = "Cannot start recording while in state '%s'"
            java.lang.Object r0 = r0.c()
            r7.t(r1, r0)
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L58:
            dtgp r7 = r6.b
            r7.j()
            dtgp r7 = r6.b
            dtcg r7 = r7.e
            r7.a()
            dtgp r7 = r6.b
            dtfy r1 = new dtfy
            j$.time.Duration r3 = j$.time.Duration.ZERO
            r3.getClass()
            r1.<init>(r3)
            fgcm r7 = r7.k
            r7.f(r1)
            dtgp r7 = r6.b
            ffud r7 = r7.j
            if (r7 == 0) goto L83
            r6.a = r2
            java.lang.Object r7 = defpackage.ffui.a(r7, r6)
            if (r7 == r0) goto Lb5
        L83:
            dtgp r7 = r6.b
            dtcg r7 = r7.e
            r7.b()
            dtgp r7 = r6.b
            ernh r1 = r7.c
            j$.time.Instant r1 = r1.a()
            r7.i = r1
            dtgp r7 = r6.b
            dtgg r1 = new dtgg
            r2 = 0
            r1.<init>(r7, r2)
            dtgp r3 = r6.b
            dtgh r4 = new dtgh
            r4.<init>(r3, r2)
            dtgp r3 = r6.b
            dtgi r5 = new dtgi
            r5.<init>(r3, r2)
            r2 = 3
            r6.a = r2
            dtfs r7 = r7.b
            java.lang.Object r7 = r7.b(r1, r4, r5, r6)
            if (r7 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto Lc6
            dtgp r0 = r6.b
            r1 = 2132082980(0x7f150124, float:1.980609E38)
            r0.k(r1)
        Lc6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtgj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dtgj(this.b, (ffgu) obj).b(ffcu.a);
    }
}
