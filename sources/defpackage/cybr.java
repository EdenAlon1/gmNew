package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cybr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ResolvedRecipient b;
    final /* synthetic */ cybu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybr(ResolvedRecipient resolvedRecipient, cybu cybuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = resolvedRecipient;
        this.c = cybuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cybr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r6 == null) goto L12;
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
            defpackage.ffci.b(r6)
            if (r1 == 0) goto La
            goto L1c
        La:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = r5.b
            aqkh r6 = r6.j()
            if (r6 == 0) goto L20
            r1 = 1
            r5.a = r1
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L1c
            return r0
        L1c:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L22
        L20:
            ffel r6 = defpackage.ffel.a
        L22:
            cybu r0 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r5.b
            aijl r2 = new aijl
            aoku r1 = r1.g()
            r3 = 8
            r4 = 0
            r2.<init>(r4, r1, r3, r6)
            aigz r6 = r0.e
            r6.h(r2)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cybr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cybr(this.b, this.c, ffguVar);
    }
}
