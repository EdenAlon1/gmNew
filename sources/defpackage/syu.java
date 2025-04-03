package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ syv b;
    final /* synthetic */ crsd c;
    final /* synthetic */ ResolvedRecipient d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syu(syv syvVar, crsd crsdVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = syvVar;
        this.c = crsdVar;
        this.d = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
    
        if (r7.c(r1, r6) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L24;
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
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L22
            goto L80
        Le:
            syv r7 = r6.b
            ffbr r7 = r7.d
            java.lang.Object r7 = r7.b()
            crrt r7 = (defpackage.crrt) r7
            crsd r1 = r6.c
            r6.a = r2
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 == r0) goto L83
        L22:
            crsd r7 = r6.c
            java.lang.Boolean r1 = r7.b
            r3 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r1.booleanValue()
            goto L2f
        L2e:
            r1 = r3
        L2f:
            java.lang.Boolean r7 = r7.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = defpackage.ffkj.e(r7, r3)
            r5 = 0
            if (r4 == 0) goto L44
            if (r1 == 0) goto L44
            ffcf r1 = new ffcf
            r1.<init>(r7, r5)
            goto L5c
        L44:
            boolean r4 = defpackage.ffkj.e(r7, r3)
            if (r4 == 0) goto L52
            if (r1 != 0) goto L52
            ffcf r1 = new ffcf
            r1.<init>(r7, r3)
            goto L5c
        L52:
            ffcf r7 = new ffcf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.<init>(r5, r1)
            r1 = r7
        L5c:
            syv r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = r6.d
            java.lang.Object r4 = r1.b
            java.lang.Object r1 = r1.a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            aoku r3 = r3.g()
            aokr r2 = r3.H(r2)
            java.lang.String r2 = r2.toString()
            r3 = 2
            r6.a = r3
            sxq r7 = r7.g
            java.lang.Object r7 = defpackage.sxl.a(r7, r2, r1, r4, r6)
            if (r7 != r0) goto L80
            goto L83
        L80:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new syu(this.b, this.c, this.d, ffguVar);
    }
}
