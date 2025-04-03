package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zay extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zba b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zay(zba zbaVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zbaVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zay) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5.h.fQ(false, r4) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r5 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L1e
            goto L3a
        Ld:
            zba r5 = r4.b
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.a = r2
            fgcm r5 = r5.h
            java.lang.Object r5 = r5.fQ(r1, r4)
            if (r5 == r0) goto L3d
        L1e:
            zba r5 = r4.b
            ffbr r5 = r5.d
            java.lang.Object r5 = r5.b()
            cuem r5 = (defpackage.cuem) r5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r4.c
            aqkv r1 = r1.F()
            cuen r2 = defpackage.cuen.HIDE
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = defpackage.cuem.d(r5, r1, r2, r4)
            if (r5 != r0) goto L3a
            goto L3d
        L3a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zay.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zay(this.b, this.c, ffguVar);
    }
}
