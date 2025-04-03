package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azep extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ List f;
    final /* synthetic */ azfe g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azep(List list, azfe azfeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = list;
        this.g = azfeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azep) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:8:0x005f). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.e
            r2 = 10
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r9)
            return r9
        Lf:
            java.lang.Object r1 = r8.d
            java.lang.Object r4 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            java.lang.Object r7 = r8.h
            ffsk r7 = (defpackage.ffsk) r7
            defpackage.ffci.b(r9)
            goto L5f
        L1f:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.h
            ffsk r9 = (defpackage.ffsk) r9
            java.util.List r1 = r8.f
            azfe r4 = r8.g
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = defpackage.ffdx.n(r1, r2)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
            r7 = r9
            r6 = r4
            r4 = r1
        L3a:
            r1 = r5
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L65
            java.lang.Object r9 = r4.next()
            awvy r9 = (defpackage.awvy) r9
            r5 = r6
            azfe r5 = (defpackage.azfe) r5
            azfr r5 = r5.h
            r8.h = r7
            r8.a = r6
            r8.b = r1
            r8.c = r4
            r8.d = r1
            r8.e = r3
            java.lang.Object r9 = r5.b(r9, r8)
            if (r9 == r0) goto Lb0
            r5 = r1
        L5f:
            azfh r9 = (defpackage.azfh) r9
            r1.add(r9)
            goto L3a
        L65:
            int r9 = defpackage.ffdx.n(r1, r2)
            int r9 = defpackage.ffew.a(r9)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 16
            int r9 = defpackage.ffmk.f(r9, r3)
            r2.<init>(r9)
            java.util.Iterator r9 = r1.iterator()
        L7c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r9.next()
            r3 = r1
            azfh r3 = (defpackage.azfh) r3
            azhq r3 = r3.a
            r2.put(r3, r1)
            goto L7c
        L8f:
            azfe r9 = r8.g
            azeo r1 = new azeo
            r3 = 0
            r1.<init>(r9, r2, r3)
            emar r9 = r9.g
            ffss r9 = defpackage.emau.a(r7, r9, r1)
            r8.h = r3
            r8.a = r3
            r8.b = r3
            r8.c = r3
            r8.d = r3
            r1 = 2
            r8.e = r1
            java.lang.Object r9 = r9.c(r8)
            if (r9 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azep.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azep azepVar = new azep(this.f, this.g, ffguVar);
        azepVar.h = obj;
        return azepVar;
    }
}
