package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eapm b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ exuk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eapj(eapm eapmVar, List list, String str, exuk exukVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eapmVar;
        this.c = list;
        this.d = str;
        this.e = exukVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eapj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r10 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L3b
        Ld:
            r6 = r9
            goto L22
        Lf:
            eapm r3 = r9.b
            java.util.List r4 = r9.c
            java.lang.String r5 = r9.d
            exuk r6 = r9.e
            r9.a = r2
            r7 = 0
            r8 = r9
            java.lang.Object r10 = r3.g(r4, r5, r6, r7, r8)
            r6 = r8
            if (r10 == r0) goto L3e
        L22:
            eafl r10 = (defpackage.eafl) r10
            boolean r1 = r10 instanceof defpackage.eaoq
            if (r1 == 0) goto L3d
            eapm r1 = r6.b
            java.util.List r2 = r6.c
            java.lang.String r3 = r6.d
            exuk r4 = r6.e
            r10 = 2
            r6.a = r10
            r5 = 1
            java.lang.Object r10 = r1.g(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L3b
            goto L3e
        L3b:
            eafl r10 = (defpackage.eafl) r10
        L3d:
            return r10
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eapj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eapj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
