package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuqs b;
    final /* synthetic */ cujo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuqp(ffgu ffguVar, cuqs cuqsVar, cujo cujoVar) {
        super(2, ffguVar);
        this.b = cuqsVar;
        this.c = cujoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuqp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r6 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        if (r6 != r0) goto L11;
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 == r4) goto L15
            if (r1 == r3) goto L11
            defpackage.ffci.b(r6)
            goto L5b
        L11:
            defpackage.ffci.b(r6)
            goto L43
        L15:
            defpackage.ffci.b(r6)
            goto L2c
        L19:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            cuqs r6 = r5.b
            cujo r1 = r5.c
            r5.a = r4
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 == r0) goto L93
        L2c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L37
            ffcu r6 = defpackage.ffcu.a
            return r6
        L37:
            cujo r6 = r5.c
            r5.a = r3
            ffss r6 = r6.a
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L93
        L43:
            culu r6 = (defpackage.culu) r6
            if (r6 == 0) goto L4e
            boolean r6 = r6.e
            if (r6 != 0) goto L4e
            ffcu r6 = defpackage.ffcu.a
            return r6
        L4e:
            cujo r6 = r5.c
            r5.a = r2
            ffji r6 = r6.c
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L5b
            goto L93
        L5b:
            byyt r6 = (defpackage.byyt) r6
            r0 = 0
            if (r6 == 0) goto L7b
            byyt[] r1 = new defpackage.byyt[r2]
            byyt r2 = defpackage.byyt.SPAM_FOLDER
            r1[r0] = r2
            byyt r2 = defpackage.byyt.BLOCKED_FOLDER
            r1[r4] = r2
            byyt r2 = defpackage.byyt.CROSS_COUNTRY_FOLDER
            r1[r3] = r2
            java.util.Set r1 = defpackage.fffi.d(r1)
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L7b
            ffcu r6 = defpackage.ffcu.a
            return r6
        L7b:
            cuqs r6 = r5.b
            ffbr r6 = r6.a
            java.lang.Object r6 = r6.b()
            croc r6 = (defpackage.croc) r6
            cujo r1 = r5.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r1.h
            byyt r2 = defpackage.byyt.CROSS_COUNTRY_FOLDER
            eoko r3 = defpackage.eoko.CONVERSATION_FROM_CROSS_COUNTRY_HIDE
            r6.b(r1, r2, r3, r0)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuqp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuqp cuqpVar = new cuqp(ffguVar, this.b, this.c);
        cuqpVar.d = obj;
        return cuqpVar;
    }
}
