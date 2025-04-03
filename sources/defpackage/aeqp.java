package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aerc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqp(aerc aercVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aercVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeqp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r6 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
        if (r6 != r0) goto L12;
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
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.ffci.b(r6)
            goto La3
        Le:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L30
        L14:
            defpackage.ffci.b(r6)
            aerc r6 = r5.c
            android.view.View r6 = r6.g
            if (r6 == 0) goto L22
            r1 = 8
            r6.setVisibility(r1)
        L22:
            aerc r1 = r5.c
            r5.a = r1
            r5.b = r2
            aerd r6 = r1.b
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto Lac
        L30:
            aeqe r6 = (defpackage.aeqe) r6
            boolean r3 = r6 instanceof defpackage.aeqb
            r4 = 0
            if (r3 == 0) goto L39
            r6 = r4
            goto L60
        L39:
            boolean r3 = r6 instanceof defpackage.aeqd
            if (r3 == 0) goto L43
            aeqj r6 = new aeqj
            r6.<init>()
            goto L60
        L43:
            boolean r3 = r6 instanceof defpackage.aeqa
            if (r3 == 0) goto L52
            aeqg r3 = new aeqg
            aeqa r6 = (defpackage.aeqa) r6
            drsq r6 = r6.a
            r3.<init>(r6)
        L50:
            r6 = r3
            goto L60
        L52:
            boolean r3 = r6 instanceof defpackage.aeqc
            if (r3 == 0) goto La6
            aeqi r3 = new aeqi
            aeqc r6 = (defpackage.aeqc) r6
            boolean r6 = r6.a
            r3.<init>(r6)
            goto L50
        L60:
            aerc r1 = (defpackage.aerc) r1
            r1.f(r6)
            aerc r6 = r5.c
            ffmx[] r1 = defpackage.aerc.a
            r1 = r1[r2]
            ffls r6 = r6.h
            java.lang.Object r6 = r6.c(r1)
            aeqk r6 = (defpackage.aeqk) r6
            if (r6 != 0) goto L80
            aerc r6 = r5.c
            android.view.View r6 = r6.g
            if (r6 == 0) goto La3
            r0 = 0
            r6.setVisibility(r0)
            goto La3
        L80:
            aerc r6 = r5.c
            r5.a = r4
            r1 = 2
            r5.b = r1
            aerd r6 = r6.b
            aerk r6 = (defpackage.aerk) r6
            ffhd r1 = r6.a
            ffhd r1 = defpackage.ekxi.a(r1)
            aerh r2 = new aerh
            r2.<init>(r4, r6)
            java.lang.Object r6 = defpackage.ffra.a(r1, r2, r5)
            ffhh r1 = defpackage.ffhh.a
            if (r6 == r1) goto La0
            ffcu r6 = defpackage.ffcu.a
        La0:
            if (r6 != r0) goto La3
            goto Lac
        La3:
            ffcu r6 = defpackage.ffcu.a
            return r6
        La6:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeqp(this.c, ffguVar);
    }
}
