package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ouk extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ our c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouk(our ourVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ourVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ouk) c((otx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        if (r6 != r0) goto L10;
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
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)     // Catch: android.database.SQLException -> L48
            goto L45
        Ld:
            java.lang.Object r1 = r5.b
            otx r1 = (defpackage.otx) r1
            defpackage.ffci.b(r6)
            goto L27
        L15:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            otx r1 = (defpackage.otx) r1
            r5.b = r1
            r5.a = r2
            java.lang.Object r6 = r1.c()
            if (r6 == r0) goto L4e
        L27:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4b
            otw r6 = defpackage.otw.b     // Catch: android.database.SQLException -> L48
            ouj r2 = new ouj     // Catch: android.database.SQLException -> L48
            our r3 = r5.c     // Catch: android.database.SQLException -> L48
            r4 = 0
            r2.<init>(r3, r4)     // Catch: android.database.SQLException -> L48
            r5.b = r4     // Catch: android.database.SQLException -> L48
            r3 = 2
            r5.a = r3     // Catch: android.database.SQLException -> L48
            java.lang.Object r6 = r1.b(r6, r2, r5)     // Catch: android.database.SQLException -> L48
            if (r6 != r0) goto L45
            goto L4e
        L45:
            java.util.Set r6 = (java.util.Set) r6     // Catch: android.database.SQLException -> L48
            return r6
        L48:
            ffen r6 = defpackage.ffen.a
            return r6
        L4b:
            ffen r6 = defpackage.ffen.a
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ouk oukVar = new ouk(this.c, ffguVar);
        oukVar.b = obj;
        return oukVar;
    }
}
