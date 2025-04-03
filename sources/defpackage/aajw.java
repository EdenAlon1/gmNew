package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aajx b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajw(aajx aajxVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aajxVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aajw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r5 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x006a, code lost:
    
        r5 = (java.lang.Void) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008e, code lost:
    
        r5 = (java.lang.Void) r5;
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
            if (r1 == 0) goto Le
            if (r1 == r2) goto L6a
            goto L8e
        Le:
            aajx r5 = r4.b
            aspz r5 = r5.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L6d
            alxr r5 = r4.c
            boolean r1 = r5 instanceof defpackage.aaca
            if (r1 == 0) goto L45
            aaca r5 = (defpackage.aaca) r5
            java.util.List r5 = r5.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ffdx.n(r5, r3)
            r1.<init>(r3)
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r5.next()
            alxr r3 = (defpackage.alxr) r3
            com.google.android.apps.messaging.shared.api.messaging.MessageId r3 = r3.b()
            r1.add(r3)
            goto L31
        L45:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r5.b()
            java.util.List r1 = defpackage.ffdx.b(r5)
        L4d:
            aajx r5 = r4.b
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            alye r5 = (defpackage.alye) r5
            engw r1 = defpackage.engq.a(r1)
            elfl r5 = r5.o(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L8d
        L6a:
            java.lang.Void r5 = (java.lang.Void) r5
            goto L90
        L6d:
            aajx r5 = r4.b
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            alye r5 = (defpackage.alye) r5
            alxr r1 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            elfl r5 = r5.n(r1)
            r5.getClass()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L8e
        L8d:
            return r0
        L8e:
            java.lang.Void r5 = (java.lang.Void) r5
        L90:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aajw(this.b, this.c, ffguVar);
    }
}
