package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjkx extends ffhv implements ffji {
    int a;
    final /* synthetic */ cjkz b;
    final /* synthetic */ cjlk c;
    final /* synthetic */ cjkh d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjkx(cjkz cjkzVar, cjlk cjlkVar, cjkh cjkhVar, byte[] bArr, String str, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cjkzVar;
        this.c = cjlkVar;
        this.d = cjkhVar;
        this.e = bArr;
        this.f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        if (r2 != 1) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.a
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager$queue$5"
            java.lang.String r5 = "PwqBackedPipelineManager.kt"
            java.lang.String r6 = "BuglePipeline"
            r7 = 1
            defpackage.ffci.b(r17)
            if (r2 == 0) goto L17
            if (r2 == r7) goto L4d
            goto L65
        L17:
            enru r2 = defpackage.cjkz.a
            ensk r2 = r2.h()
            ensn r8 = defpackage.ente.a
            r2.Y(r8, r6)
            r8 = 176(0xb0, float:2.47E-43)
            ensk r2 = r2.h(r4, r3, r8, r5)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r8 = "Queuing new pipeline work item"
            r2.q(r8)
            cjkz r2 = r0.b
            cjlk r9 = r0.c
            cjkh r10 = r0.d
            byte[] r11 = r0.e
            java.lang.String r12 = r0.f
            r0.a = r7
            cjls r13 = r2.c
            cjli r14 = defpackage.cjli.a
            cjlr r8 = new cjlr
            r15 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            ffhd r2 = r13.a
            java.lang.Object r2 = defpackage.ekxl.a(r2, r8, r0)
            if (r2 == r1) goto L99
        L4d:
            cjkz r2 = r0.b
            java.lang.String r8 = r0.f
            cjlk r9 = r0.c
            cjkw r10 = new cjkw
            r11 = 0
            r10.<init>(r2, r8, r9, r11)
            r8 = 2
            r0.a = r8
            ffhd r2 = r2.e
            java.lang.Object r2 = defpackage.ekxl.a(r2, r10, r0)
            if (r2 != r1) goto L65
            goto L99
        L65:
            cjkz r1 = r0.b
            cjkh r2 = r0.d
            r2.getClass()
            cjkd r1 = r1.d
            aujm r8 = r1.b
            boolean r8 = r8.a()
            if (r8 == 0) goto L7f
            akzt r1 = r1.a
            java.lang.String r2 = defpackage.cjkd.a(r2)
            r1.e(r2, r7)
        L7f:
            enru r1 = defpackage.cjkz.a
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            r1.Y(r2, r6)
            r2 = 188(0xbc, float:2.63E-43)
            ensk r1 = r1.h(r4, r3, r2, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Successfully queued pipeline work item"
            r1.q(r2)
            ffcu r1 = defpackage.ffcu.a
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjkx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cjkx(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
