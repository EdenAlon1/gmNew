package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azlv b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azlp(azlv azlvVar, Set set, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azlvVar;
        this.c = set;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azlp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1.b.b(r3, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r7 = r6.b;
        r7.b.d(new defpackage.azln());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0015, code lost:
    
        if (r7 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L17;
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
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L53
        Ld:
            azlv r7 = r6.b
            r6.a = r2
            java.lang.Object r7 = r7.e(r6)
            if (r7 == r0) goto L62
        L17:
            java.util.Set r1 = r6.c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r3.next()
            r5 = r4
            azop r5 = (defpackage.azop) r5
            azsu r5 = r5.b()
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L24
            r2.add(r4)
            goto L24
        L3f:
            azlv r1 = r6.b
            azlo r3 = new azlo
            r4 = 0
            r3.<init>(r7, r2, r4)
            r7 = 2
            r6.a = r7
            azei r7 = r1.b
            java.lang.Object r7 = r7.b(r3, r6)
            if (r7 != r0) goto L53
            goto L62
        L53:
            azlv r7 = r6.b
            azln r0 = new azln
            r0.<init>()
            azei r7 = r7.b
            r7.d(r0)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azlp(this.b, this.c, ffguVar);
    }
}
