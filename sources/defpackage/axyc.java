package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ ekrb c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyc(ffgu ffguVar, axyy axyyVar, ekrb ekrbVar, List list) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = ekrbVar;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r6 != r0) goto L9;
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
            if (r1 == r2) goto L11
            java.lang.Object r0 = r5.e
            java.util.List r0 = (java.util.List) r0
            defpackage.ffci.b(r6)
            goto L57
        L11:
            defpackage.ffci.b(r6)
            goto L2a
        L15:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            ffsk r6 = (defpackage.ffsk) r6
            axyy r6 = r5.b
            ekrb r1 = r5.c
            axwz r3 = defpackage.axwz.a
            r5.a = r2
            java.lang.Object r6 = r6.A(r1, r3, r5)
            if (r6 == r0) goto L5e
        L2a:
            axyy r1 = r5.b
            java.util.List r6 = (java.util.List) r6
            ffbr r1 = r1.h
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5d
            axyy r1 = r5.b
            java.util.List r2 = r5.d
            axwz r3 = defpackage.axwz.b
            ekrb r1 = r1.u(r2, r3)
            axyy r2 = r5.b
            axwz r3 = defpackage.axwz.b
            r5.e = r6
            r4 = 2
            r5.a = r4
            java.lang.Object r1 = r2.A(r1, r3, r5)
            if (r1 == r0) goto L5e
            r0 = r6
            r6 = r1
        L57:
            java.util.List r6 = (java.util.List) r6
            java.util.List r6 = defpackage.ffdx.ad(r0, r6)
        L5d:
            return r6
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyc axycVar = new axyc(ffguVar, this.b, this.c, this.d);
        axycVar.e = obj;
        return axycVar;
    }
}
