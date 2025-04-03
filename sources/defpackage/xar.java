package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xar extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ xax d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xar(xax xaxVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = xaxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        xar xarVar = new xar(this.d, (ffgu) obj3);
        xarVar.b = (engw) obj;
        xarVar.c = booleanValue;
        return xarVar.b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r14.a
            r2 = 0
            if (r1 == 0) goto L11
            boolean r0 = r14.c
            java.lang.Object r1 = r14.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.ffci.b(r15)
            goto L57
        L11:
            defpackage.ffci.b(r15)
            java.lang.Object r15 = r14.b
            engw r15 = (defpackage.engw) r15
            boolean r1 = r14.c
            emyl r3 = defpackage.cudz.a
            java.lang.Object r3 = r3.get()
            cfup r3 = (defpackage.cfup) r3
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L2f
            return r2
        L2f:
            java.lang.Object r15 = defpackage.ffdx.U(r15)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r15
            if (r15 != 0) goto L38
            return r2
        L38:
            boolean r3 = r15.B()
            if (r3 != 0) goto L3f
            return r2
        L3f:
            boolean r3 = r15.D()
            if (r3 != 0) goto L64
            xax r3 = r14.d
            r14.b = r15
            r14.c = r1
            r4 = 1
            r14.a = r4
            java.lang.Object r3 = r3.c(r14)
            if (r3 == r0) goto L63
            r0 = r1
            r1 = r15
            r15 = r3
        L57:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L62
            r15 = r1
            r1 = r0
            goto L64
        L62:
            return r2
        L63:
            return r0
        L64:
            xax r0 = r14.d
            dlsr r2 = new dlsr
            if (r1 == 0) goto L77
            android.content.Context r0 = r0.a
            r3 = 2132088694(0x7f151776, float:1.9817679E38)
            java.lang.String r0 = r0.getString(r3)
            r0.getClass()
            goto L83
        L77:
            android.content.Context r0 = r0.a
            r3 = 2132087814(0x7f151406, float:1.9815894E38)
            java.lang.String r0 = r0.getString(r3)
            r0.getClass()
        L83:
            r3 = r0
            xax r0 = r14.d
            xao r12 = new xao
            r12.<init>()
            r13 = 1014(0x3f6, float:1.421E-42)
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xar.b(java.lang.Object):java.lang.Object");
    }
}
