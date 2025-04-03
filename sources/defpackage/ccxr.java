package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Collection b;
    final /* synthetic */ ccxy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxr(ffgu ffguVar, Collection collection, ccxy ccxyVar) {
        super(2, ffguVar);
        this.b = collection;
        this.c = ccxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r8 != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            if (r1 == r3) goto Le
            defpackage.ffci.b(r8)
            return r8
        Le:
            defpackage.ffci.b(r8)
            goto L62
        L12:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.d
            ffsk r8 = (defpackage.ffsk) r8
            java.util.Collection r8 = r7.b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r4 = 10
            int r4 = defpackage.ffdx.n(r8, r4)
            int r4 = defpackage.ffew.a(r4)
            r5 = 16
            int r4 = defpackage.ffmk.f(r4, r5)
            r1.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L34:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r8.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            ffch r6 = new ffch
            r6.<init>(r5)
            r1.put(r4, r6)
            goto L34
        L4e:
            ccxy r8 = r7.c
            ccxs r4 = new ccxs
            r4.<init>(r8)
            ccxt r5 = new ccxt
            r5.<init>(r8, r2)
            r7.a = r3
            java.lang.Object r8 = defpackage.ccyx.a(r1, r4, r5, r7)
            if (r8 == r0) goto L7b
        L62:
            ccxy r1 = r7.c
            java.util.Map r8 = (java.util.Map) r8
            ccxu r3 = new ccxu
            r3.<init>(r1)
            ccxv r4 = new ccxv
            r4.<init>(r1, r2)
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.ccyx.a(r8, r3, r4, r7)
            if (r8 != r0) goto L7a
            goto L7b
        L7a:
            return r8
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccxr ccxrVar = new ccxr(ffguVar, this.b, this.c);
        ccxrVar.d = obj;
        return ccxrVar;
    }
}
