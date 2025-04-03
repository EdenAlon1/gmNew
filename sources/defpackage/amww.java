package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amww extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amwx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amww(amwx amwxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amwxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amww) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r4 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L30
        Ld:
            amwx r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L34
        L17:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r4 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r4
            if (r4 != 0) goto L1e
            ffel r4 = defpackage.ffel.a
            return r4
        L1e:
            cfzm r4 = r4.j()
            elfl r4 = r4.d()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L30
            goto L34
        L30:
            r4.getClass()
            return r4
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amww.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amww(this.b, ffguVar);
    }
}
