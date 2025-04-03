package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbt extends ffhv implements ffjm {
    int a;
    int b;
    final /* synthetic */ dqzc c;
    final /* synthetic */ drcf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drbt(dqzc dqzcVar, drcf drcfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqzcVar;
        this.d = drcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drbt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r10.c(r1.a, r9) != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b6  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen$onStickerLongClicked$1$1"
            java.lang.String r4 = "EmotifyScreen.kt"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1a
            if (r1 == r5) goto L16
            int r0 = r9.a
            defpackage.ffci.b(r10)
            goto L85
        L16:
            defpackage.ffci.b(r10)
            goto L46
        L1a:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.drcf.a
            ensk r10 = r10.h()
            r1 = 211(0xd3, float:2.96E-43)
            ensk r10 = r10.h(r3, r2, r1, r4)
            enrr r10 = (defpackage.enrr) r10
            dqzc r1 = r9.c
            java.lang.String r7 = "Deleting custom sticker %s"
            java.lang.String r1 = r1.a
            r10.t(r7, r1)
            drcf r10 = r9.d
            dqzc r1 = r9.c
            dqze r10 = r10.b()
            r9.b = r5
            java.lang.String r1 = r1.a
            java.lang.Object r10 = r10.c(r1, r9)
            if (r10 == r0) goto Lcd
        L46:
            drcf r10 = r9.d
            android.content.Context r10 = r10.a()
            android.content.ContentResolver r10 = r10.getContentResolver()
            dqzc r1 = r9.c
            java.lang.String r1 = r1.b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            int r10 = r10.delete(r1, r6, r6)
            drcf r1 = r9.d
            dqiy r1 = r1.al
            if (r1 != 0) goto L68
            java.lang.String r1 = "usageProcessor"
            defpackage.ffkj.c(r1)
            r1 = r6
        L68:
            dqzc r7 = r9.c
            drap r8 = new drap
            java.lang.String r7 = r7.a
            r8.<init>(r7)
            r9.a = r10
            r7 = 2
            r9.b = r7
            dqki r1 = r1.c
            java.lang.Object r1 = r1.b(r8, r9)
            ffhh r7 = defpackage.ffhh.a
            if (r1 == r7) goto L82
            ffcu r1 = defpackage.ffcu.a
        L82:
            if (r1 == r0) goto Lcd
            r0 = r10
        L85:
            if (r0 != 0) goto L9b
            enru r10 = defpackage.drcf.a
            ensk r10 = r10.i()
            r0 = 216(0xd8, float:3.03E-43)
            ensk r10 = r10.h(r3, r2, r0, r4)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Failed to delete custom sticker"
            r10.q(r0)
            goto Lb0
        L9b:
            if (r0 <= r5) goto Lb0
            enru r10 = defpackage.drcf.a
            ensk r10 = r10.i()
            r1 = 220(0xdc, float:3.08E-43)
            ensk r10 = r10.h(r3, r2, r1, r4)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r1 = "Deleted more than one matching custom sticker (%d)"
            r10.r(r1, r0)
        Lb0:
            drcf r10 = r9.d
            j$.util.Optional r10 = r10.ak
            if (r10 != 0) goto Lbc
            java.lang.String r10 = "emotifyEventLogger"
            defpackage.ffkj.c(r10)
            goto Lbd
        Lbc:
            r6 = r10
        Lbd:
            drbr r10 = new drbr
            r10.<init>()
            drbs r0 = new drbs
            r0.<init>()
            r6.ifPresent(r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drbt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drbt(this.c, this.d, ffguVar);
    }
}
