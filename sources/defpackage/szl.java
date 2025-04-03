package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ szm b;
    final /* synthetic */ crsd c;
    final /* synthetic */ ResolvedRecipient d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szl(szm szmVar, crsd crsdVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = szmVar;
        this.c = crsdVar;
        this.d = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        if (r8.c(r1, r7) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L7a
        Ld:
            szm r8 = r7.b
            ffbr r8 = r8.d
            java.lang.Object r8 = r8.b()
            crrt r8 = (defpackage.crrt) r8
            crsd r1 = r7.c
            r7.a = r2
            java.lang.Object r8 = r8.c(r1, r7)
            if (r8 == r0) goto L7d
        L21:
            crsd r8 = r7.c
            java.lang.Boolean r1 = r8.b
            r1.getClass()
            java.lang.Boolean r8 = r8.a
            boolean r3 = r1.booleanValue()
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = defpackage.ffkj.e(r8, r4)
            r6 = 0
            if (r5 == 0) goto L42
            if (r3 == 0) goto L42
            ffcf r1 = new ffcf
            r1.<init>(r8, r6)
            goto L56
        L42:
            boolean r5 = defpackage.ffkj.e(r8, r4)
            if (r5 == 0) goto L50
            if (r3 != 0) goto L50
            ffcf r1 = new ffcf
            r1.<init>(r8, r4)
            goto L56
        L50:
            ffcf r8 = new ffcf
            r8.<init>(r6, r1)
            r1 = r8
        L56:
            szm r8 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = r7.d
            java.lang.Object r4 = r1.b
            java.lang.Object r1 = r1.a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            aoku r3 = r3.g()
            aokr r2 = r3.H(r2)
            java.lang.String r2 = r2.toString()
            r3 = 2
            r7.a = r3
            sxq r8 = r8.g
            java.lang.Object r8 = defpackage.sxl.a(r8, r2, r1, r4, r7)
            if (r8 != r0) goto L7a
            goto L7d
        L7a:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new szl(this.b, this.c, this.d, ffguVar);
    }
}
