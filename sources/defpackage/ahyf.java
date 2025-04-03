package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyf extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahyk c;
    final /* synthetic */ xhu d;
    final /* synthetic */ fjay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyf(ahyk ahykVar, xhu xhuVar, fjay fjayVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ahykVar;
        this.d = xhuVar;
        this.e = fjayVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyf) c((ffes) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r2.d(r7, r1, r3, r6) != r0) goto L21;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r7)
            goto L69
        Ld:
            java.lang.Object r1 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r1
            defpackage.ffci.b(r7)
            goto L51
        L15:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.b
            ffes r7 = (defpackage.ffes) r7
            int r1 = r7.a
            java.lang.Object r7 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r7
            ahyk r3 = r6.c
            auhp r3 = r3.p
            auhk r3 = (defpackage.auhk) r3
            ffbr r3 = r3.a
            java.lang.Object r3 = r3.b()
            ersq r3 = (defpackage.ersq) r3
            java.lang.String r4 = "bugle.fix_multi_share_copy_draft"
            boolean r3 = r3.a(r4)
            if (r3 != 0) goto L3e
            if (r1 <= 0) goto L3b
            goto L3e
        L3b:
            xhu r1 = r6.d
            goto L58
        L3e:
            ahyk r1 = r6.c
            xhu r3 = r6.d
            r6.b = r7
            r6.a = r2
            ahxk r1 = r1.l
            java.lang.Object r1 = r1.a(r3, r6)
            if (r1 == r0) goto L82
            r5 = r1
            r1 = r7
            r7 = r5
        L51:
            xhu r7 = (defpackage.xhu) r7
            if (r7 == 0) goto L6c
            r5 = r1
            r1 = r7
            r7 = r5
        L58:
            ahyk r2 = r6.c
            fjay r3 = r6.e
            r4 = 0
            r6.b = r4
            r4 = 2
            r6.a = r4
            java.lang.Object r7 = r2.d(r7, r1, r3, r6)
            if (r7 != r0) goto L69
            goto L82
        L69:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6c:
            ahyk r7 = r6.c
            android.content.Context r0 = r7.f
            r1 = 2132084325(0x7f150665, float:1.9808817E38)
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            cwos r7 = r7.s
            r7.a(r0)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahyf ahyfVar = new ahyf(this.c, this.d, this.e, ffguVar);
        ahyfVar.b = obj;
        return ahyfVar;
    }
}
