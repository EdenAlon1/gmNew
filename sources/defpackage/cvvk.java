package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Optional b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvk(Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvk) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r1.fQ(r4, r5) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6 != r0) goto L11;
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r6)
            goto L4b
        Le:
            java.lang.Object r1 = r5.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r6)
            goto L3c
        L16:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            ffxy r1 = (defpackage.ffxy) r1
            int r6 = defpackage.aixt.a
            j$.util.Optional r6 = r5.b
            aixr r4 = defpackage.aixq.a
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L3f
            j$.util.Optional r6 = r5.b
            java.lang.Object r6 = r6.get()
            aixt r6 = (defpackage.aixt) r6
            r5.c = r1
            r5.a = r3
            java.lang.Object r6 = defpackage.aixp.a(r6, r2, r3, r5, r3)
            if (r6 == r0) goto L4a
        L3c:
            r4 = r6
            aixr r4 = (defpackage.aixr) r4
        L3f:
            r5.c = r2
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = r1.fQ(r4, r5)
            if (r6 != r0) goto L4b
        L4a:
            return r0
        L4b:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvvk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvvk cvvkVar = new cvvk(this.b, ffguVar);
        cvvkVar.c = obj;
        return cvvkVar;
    }
}
