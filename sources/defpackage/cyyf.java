package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyyf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyyg b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ cjwi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyyf(cyyg cyygVar, ResolvedRecipient resolvedRecipient, cjwi cjwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyygVar;
        this.c = resolvedRecipient;
        this.d = cjwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyyf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        r7.e("Bugle.PhotoSelector.Save.Selection.Count", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (defpackage.fgfz.c(r7, r6) != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        if (defpackage.fgfz.c(r7, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        r6.b.o.a();
        r7 = r6.b;
        r0 = r6.d;
        r7 = (defpackage.akzt) r7.n.c.h.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (r0 != defpackage.cjwi.PROFILE_PEOPLE_SHARING_SOURCE) goto L18;
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
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L36
            goto L4c
        Le:
            cyyg r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r6.c
            cjwi r4 = r6.d
            aqkv r1 = r1.F()
            int r4 = r4.ordinal()
            if (r4 == r3) goto L21
            cjwe r4 = defpackage.cjwe.PREFER_PROFILE_PHOTO
            goto L23
        L21:
            cjwe r4 = defpackage.cjwe.PREFER_CONTACT_PHOTO
        L23:
            eisx r5 = r7.d
            aqkp r7 = r7.f
            elfl r7 = r7.A(r5, r1, r4)
            r7.getClass()
            r6.a = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L71
        L36:
            cyyg r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r6.c
            alxl r7 = r7.g
            elfl r7 = r7.r(r1)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto L4c
            goto L71
        L4c:
            cyyg r7 = r6.b
            cyxs r7 = r7.o
            r7.a()
            cyyg r7 = r6.b
            cjwi r0 = r6.d
            cyyc r7 = r7.n
            cyyg r7 = r7.c
            ffbr r7 = r7.h
            java.lang.Object r7 = r7.b()
            akzt r7 = (defpackage.akzt) r7
            cjwi r1 = defpackage.cjwi.PROFILE_PEOPLE_SHARING_SOURCE
            if (r0 != r1) goto L68
            goto L69
        L68:
            r2 = r3
        L69:
            java.lang.String r0 = "Bugle.PhotoSelector.Save.Selection.Count"
            r7.e(r0, r2)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyyf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyyf(this.b, this.c, this.d, ffguVar);
    }
}
