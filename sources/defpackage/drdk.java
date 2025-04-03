package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdk extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ drdl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdk(drdl drdlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drdlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r6.o(r5) != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L10
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            goto L55
        L10:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L34
        L16:
            defpackage.ffci.b(r6)
            drdl r6 = r5.c
            drdh r1 = r6.f
            drdg r4 = defpackage.drdg.a
            r6.f = r4
            boolean r6 = r1 instanceof defpackage.drdf
            if (r6 == 0) goto L79
            r6 = r1
            drdf r6 = (defpackage.drdf) r6
            ffud r6 = r6.b
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = r6.o(r5)
            if (r6 == r0) goto L78
        L34:
            drdl r6 = r5.c
            r5.a = r1
            r3 = 2
            r5.b = r3
            drdd r6 = r6.d
            ffsk r3 = r6.b
            ffhd r3 = r3.hT()
            drda r4 = new drda
            r4.<init>(r6, r2)
            java.lang.Object r6 = defpackage.ffra.a(r3, r4, r5)
            ffhh r2 = defpackage.ffhh.a
            if (r6 == r2) goto L52
            ffcu r6 = defpackage.ffcu.a
        L52:
            if (r6 == r0) goto L78
            r0 = r1
        L55:
            drdf r0 = (defpackage.drdf) r0
            java.io.OutputStream r6 = r0.c
            r6.close()
            enru r6 = defpackage.drdl.a
            ensk r6 = r6.h()
            java.lang.String r1 = "invokeSuspend"
            r2 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = "com/google/android/libraries/compose/gif/encoder/GifRecorder$stopRecording$2"
            java.lang.String r4 = "GifRecorder.kt"
            ensk r6 = r6.h(r3, r1, r2, r4)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r1 = "Finished GIF recording."
            r6.q(r1)
            android.net.Uri r6 = r0.a
            return r6
        L78:
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drdk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdk(this.c, ffguVar);
    }
}
