package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zam extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zam(zao zaoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zaoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zam) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r1.b(r5, r2, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L31
        Ld:
            zao r5 = r4.b
            r4.a = r2
            ffxx r5 = r5.e
            java.lang.Object r5 = defpackage.fgbj.a(r5, r4)
            if (r5 == r0) goto L34
        L19:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.ffdx.U(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 == 0) goto L31
            zao r1 = r4.b
            erfe r2 = defpackage.erfe.REPORTED_NOT_SPAM
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.b(r5, r2, r4)
            if (r5 != r0) goto L31
            goto L34
        L31:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zam.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zam(this.b, ffguVar);
    }
}
