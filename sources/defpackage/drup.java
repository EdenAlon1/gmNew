package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drup extends ffhv implements ffji {
    int a;
    final /* synthetic */ drur b;
    final /* synthetic */ drnm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drup(drur drurVar, drnm drnmVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drurVar;
        this.c = drnmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return (defpackage.drwg) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r11 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        return r0;
     */
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
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L68
        Ld:
            drur r11 = r10.b
            drnm r1 = r10.c
            drva r1 = defpackage.drur.b(r1)
            r10.a = r2
            drwd r11 = r11.c
            java.lang.Object r11 = r11.b(r1, r10)
            if (r11 == r0) goto L6b
        L1f:
            drwg r11 = (defpackage.drwg) r11
            if (r11 != 0) goto L6a
            drur r11 = r10.b
            drnm r1 = r10.c
            r3 = 2
            r10.a = r3
            ffrh r5 = new ffrh
            ffgu r3 = defpackage.ffhi.c(r10)
            r5.<init>(r3, r2)
            r5.B()
            drwc r4 = new drwc
            r4.<init>()
            drka r2 = r1.l()
            drlw r2 = r2.b()
            java.lang.String r8 = r2.toString()
            drwd r6 = r11.c
            aepl r7 = r11.d
            r9 = 0
            r4.bi(r5, r6, r7, r8, r9)
            drva r1 = defpackage.drur.b(r1)
            r4.bg(r1)
            ea r11 = r11.b
            fr r11 = r11.I()
            java.lang.String r1 = "photos_sharing_option_tray"
            r4.t(r11, r1)
            java.lang.Object r11 = r5.m()
            if (r11 != r0) goto L68
            goto L6b
        L68:
            drwg r11 = (defpackage.drwg) r11
        L6a:
            return r11
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drup.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drup(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
