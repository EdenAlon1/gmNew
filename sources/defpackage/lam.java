package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lam extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lam(List list, List list2, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lam) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L13
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.e
            java.util.List r3 = (java.util.List) r3
            defpackage.ffci.b(r8)
            goto L31
        L13:
            java.lang.Object r1 = r7.c
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            java.lang.Object r5 = r7.e
            java.util.List r5 = (java.util.List) r5
            defpackage.ffci.b(r8)
            r6 = r5
            r5 = r3
            r3 = r6
            goto L52
        L24:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.e
            java.util.List r1 = r7.f
            java.util.List r3 = r7.g
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r1.next()
            lai r4 = (defpackage.lai) r4
            r7.e = r3
            r7.a = r1
            r7.b = r4
            r7.c = r8
            r7.d = r2
            java.lang.Object r5 = r4.c()
            if (r5 == r0) goto L78
            r6 = r1
            r1 = r8
            r8 = r5
            r5 = r4
            r4 = r6
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            lal r8 = new lal
            r1 = 0
            r8.<init>(r5, r1)
            r3.add(r8)
            r7.e = r3
            r7.a = r4
            r7.b = r1
            r7.c = r1
            r8 = 2
            r7.d = r8
            java.lang.Object r8 = r5.b()
            if (r8 == r0) goto L78
            goto L76
        L75:
            r8 = r1
        L76:
            r1 = r4
            goto L31
        L78:
            return r0
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lam.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lam lamVar = new lam(this.f, this.g, ffguVar);
        lamVar.e = obj;
        return lamVar;
    }
}
