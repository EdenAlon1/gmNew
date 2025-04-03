package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cysg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cysj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cysg(cysj cysjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cysjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cysg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r7 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r7 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        r7 = (android.net.Uri) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        r7 = (android.net.Uri) r7;
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
            java.lang.String r2 = "has_pending_profile_photo_picker_result"
            r3 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Lf
            if (r1 == r3) goto L3a
            goto L69
        Lf:
            cysj r7 = r6.b
            llv r7 = r7.f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r7.d(r2, r1)
            cysj r7 = r6.b
            atzo r7 = r7.j
            boolean r7 = r7.a()
            if (r7 == 0) goto L3d
            cysj r7 = r6.b
            ffbr r7 = r7.k
            java.lang.Object r7 = r7.b()
            aigz r7 = (defpackage.aigz) r7
            cysj r1 = r6.b
            r6.a = r3
            aihu r1 = r1.d
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 == r0) goto L68
        L3a:
            android.net.Uri r7 = (android.net.Uri) r7
            goto L6b
        L3d:
            cysj r7 = r6.b
            ffbr r7 = r7.k
            java.lang.Object r7 = r7.b()
            aigz r7 = (defpackage.aigz) r7
            aiir r1 = new aiir
            aeh r3 = new aeh
            r3.<init>()
            aed r4 = defpackage.aed.a
            defpackage.aea.a()
            defpackage.aea.a()
            ads r4 = defpackage.adr.a(r4)
            java.lang.String r5 = "com.google.android.apps.messaging.ui.profilephotopicker"
            r1.<init>(r5, r3, r4)
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            android.net.Uri r7 = (android.net.Uri) r7
        L6b:
            cysj r0 = r6.b
            llv r0 = r0.f
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.d(r2, r1)
            cysj r0 = r6.b
            r0.b(r7)
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cysg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cysg(this.b, ffguVar);
    }
}
