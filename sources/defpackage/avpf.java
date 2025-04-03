package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avpf extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ List e;
    final /* synthetic */ avpg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avpf(List list, avpg avpgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = list;
        this.f = avpgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avpf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0043 -> B:4:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.d
            if (r1 == 0) goto L10
            java.lang.Object r1 = r4.c
            java.lang.Object r2 = r4.b
            java.lang.Object r3 = r4.a
            defpackage.ffci.b(r5)
            goto L44
        L10:
            defpackage.ffci.b(r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.List r1 = r4.e
            java.util.Iterator r1 = r1.iterator()
            r2 = r1
            r1 = r5
        L20:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r2.next()
            java.util.List r5 = (java.util.List) r5
            avpg r3 = r4.f
            avrk r3 = r3.a
            elfl r5 = r3.a(r5)
            r4.a = r1
            r4.b = r2
            r4.c = r1
            r3 = 1
            r4.d = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L4e
            r3 = r1
        L44:
            r5.getClass()
            java.util.Map r5 = (java.util.Map) r5
            r1.putAll(r5)
            r1 = r3
            goto L20
        L4e:
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avpf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avpf(this.e, this.f, ffguVar);
    }
}
