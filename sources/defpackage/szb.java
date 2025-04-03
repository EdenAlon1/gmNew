package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ szc b;
    final /* synthetic */ crsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szb(szc szcVar, crsd crsdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = szcVar;
        this.c = crsdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001f, code lost:
    
        if (r6.c(r1, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L17;
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
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L4a
        Ld:
            szc r6 = r5.b
            ffbr r6 = r6.d
            java.lang.Object r6 = r6.b()
            crrt r6 = (defpackage.crrt) r6
            crsd r1 = r5.c
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 == r0) goto L4d
        L21:
            szc r6 = r5.b
            crsd r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r1.g
            r3 = 0
            if (r1 == 0) goto L35
            aoku r1 = r1.g()
            if (r1 == 0) goto L35
            aokr r1 = r1.H(r2)
            goto L36
        L35:
            r1 = r3
        L36:
            sxq r6 = r6.e
            crsd r2 = r5.c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4 = 2
            r5.a = r4
            java.lang.Boolean r2 = r2.b
            java.lang.Object r6 = defpackage.sxl.a(r6, r1, r3, r2, r5)
            if (r6 != r0) goto L4a
            goto L4d
        L4a:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new szb(this.b, this.c, ffguVar);
    }
}
