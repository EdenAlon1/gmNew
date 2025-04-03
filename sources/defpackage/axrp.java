package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrp extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffiy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrp(ffgu ffguVar, ffiy ffiyVar) {
        super(3, ffguVar);
        this.c = ffiyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axrp axrpVar = new axrp((ffgu) obj3, this.c);
        axrpVar.d = (ffxy) obj;
        axrpVar.b = (Object[]) obj2;
        return axrpVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if (r13.fQ(r0, r16) == r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r0 != r11) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [ffxy] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            ffhh r11 = defpackage.ffhh.a
            int r0 = r10.a
            r12 = 2
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 == r1) goto L10
            defpackage.ffci.b(r17)
            goto L5c
        L10:
            java.lang.Object r0 = r10.d
            defpackage.ffci.b(r17)
            r13 = r0
            r0 = r17
            goto L50
        L19:
            defpackage.ffci.b(r17)
            java.lang.Object r13 = r10.d
            java.lang.Object r0 = r10.b
            r2 = r0
            ffiy r0 = r10.c
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
            r3 = r2[r3]
            r4 = r2
            r2 = r4[r1]
            r5 = r3
            r3 = r4[r12]
            r6 = 3
            r6 = r4[r6]
            r7 = 4
            r7 = r4[r7]
            r8 = 5
            r8 = r4[r8]
            r9 = 6
            r9 = r4[r9]
            r14 = 7
            r14 = r4[r14]
            r15 = 8
            r4 = r4[r15]
            r10.a = r1
            r1 = r5
            r5 = r7
            r7 = r9
            r9 = r4
            r4 = r6
            r6 = r8
            r8 = r14
            java.lang.Object r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == r11) goto L5f
        L50:
            r1 = 0
            r10.d = r1
            r10.a = r12
            java.lang.Object r0 = r13.fQ(r0, r10)
            if (r0 != r11) goto L5c
            goto L5f
        L5c:
            ffcu r0 = defpackage.ffcu.a
            return r0
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axrp.b(java.lang.Object):java.lang.Object");
    }
}
