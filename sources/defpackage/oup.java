package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oup extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ osk[] h;
    final /* synthetic */ our i;
    final /* synthetic */ otx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oup(osk[] oskVarArr, our ourVar, otx otxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.h = oskVarArr;
        this.i = ourVar;
        this.j = otxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oup) c((ovc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (((defpackage.our) r6).d(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((defpackage.our) r6).c(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:6:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.g
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 == r2) goto L16
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            goto L22
        L16:
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
        L22:
            defpackage.ffci.b(r11)
            r11 = r5
            r5 = r4
            goto L88
        L28:
            defpackage.ffci.b(r11)
            osk[] r11 = r10.h
            our r1 = r10.i
            otx r3 = r10.j
            int r4 = r11.length
            r5 = 0
            r7 = r11
            r6 = r1
            r11 = r3
            r1 = r4
            r3 = r5
        L38:
            if (r3 >= r1) goto L8a
            r4 = r7
            osk[] r4 = (defpackage.osk[]) r4
            r4 = r4[r3]
            int r8 = r5 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L87
            if (r4 == r2) goto L6c
            r9 = 2
            if (r4 != r9) goto L66
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r9
            int r4 = defpackage.our.f
            r4 = r6
            our r4 = (defpackage.our) r4
            java.lang.Object r4 = r4.d(r11, r5, r10)
            if (r4 == r0) goto L86
            goto L87
        L66:
            ffcd r11 = new ffcd
            r11.<init>()
            throw r11
        L6c:
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r2
            int r4 = defpackage.our.f
            r4 = r6
            our r4 = (defpackage.our) r4
            java.lang.Object r4 = r4.c(r11, r5, r10)
            if (r4 == r0) goto L86
            goto L87
        L86:
            return r0
        L87:
            r5 = r8
        L88:
            int r3 = r3 + r2
            goto L38
        L8a:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oup.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oup(this.h, this.i, this.j, ffguVar);
    }
}
