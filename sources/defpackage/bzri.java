package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzri extends ffhv implements ffjm {
    final /* synthetic */ bzrj a;
    final /* synthetic */ bzrh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzri(bzrj bzrjVar, bzrh bzrhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bzrjVar;
        this.b = bzrhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzri) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (defpackage.ffkj.e(r0, r4) == false) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            defpackage.ffci.b(r6)
            bzrh r6 = r5.b
            boolean r0 = r6.e
            r1 = 1
            if (r0 != 0) goto L40
            eygr r0 = r6.b
            r0.getClass()
            eygr r2 = r6.c
            r2.getClass()
            java.lang.Object r0 = defpackage.ffdx.U(r0)
            eyee r0 = (defpackage.eyee) r0
            if (r0 == 0) goto Lb6
            boolean r3 = r0.H()
            r4 = 0
            if (r1 != r3) goto L24
            r0 = r4
        L24:
            if (r0 != 0) goto L28
            goto Lb6
        L28:
            java.lang.Object r2 = defpackage.ffdx.U(r2)
            eyee r2 = (defpackage.eyee) r2
            if (r2 == 0) goto Lb6
            boolean r3 = r2.H()
            if (r1 != r3) goto L37
            goto L38
        L37:
            r4 = r2
        L38:
            if (r4 == 0) goto Lb6
            boolean r0 = defpackage.ffkj.e(r0, r4)
            if (r0 != 0) goto Lb6
        L40:
            bzrj r0 = r5.a
            ffbr r2 = r0.a
            java.lang.Object r2 = r2.b()
            akzt r2 = (defpackage.akzt) r2
            r3 = 4
            int r3 = defpackage.bzwi.a(r3)
            java.lang.String r4 = "Bugle.Etouffee.MonitoredNonExceptionalStates"
            r2.e(r4, r3)
            java.lang.String r6 = r6.d
            r6.getClass()
            ffbr r2 = r0.b
            java.lang.Object r2 = r2.b()
            bczy r2 = (defpackage.bczy) r2
            enip r6 = r2.E(r6)
            r6.getClass()
            engw r6 = defpackage.engq.a(r6)
            ffbr r2 = r0.b
            java.lang.Object r2 = r2.b()
            bczy r2 = (defpackage.bczy) r2
            enhk r6 = r2.D(r6)
            java.util.Collection r6 = r6.values()
            r6.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L88:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r6.next()
            r4 = r3
            bseh r4 = (defpackage.bseh) r4
            int r4 = r4.l()
            if (r4 != r1) goto L88
            r2.add(r3)
            goto L88
        L9f:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto Lb6
            ffbr r6 = r0.a
            java.lang.Object r6 = r6.b()
            akzt r6 = (defpackage.akzt) r6
            int r0 = r2.size()
            java.lang.String r1 = "Bugle.Etouffee.RemoteUserIdentityKeyChange.ImpactedConversations.Count"
            r6.e(r1, r0)
        Lb6:
            ceyt r6 = defpackage.ceyt.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzri.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzri(this.a, this.b, ffguVar);
    }
}
