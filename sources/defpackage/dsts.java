package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsts extends ffhu implements ffjm {
    float a;
    long b;
    int c;
    final /* synthetic */ dsss d;
    final /* synthetic */ dstx e;
    final /* synthetic */ dspe f;
    final /* synthetic */ hho g;
    final /* synthetic */ hho h;
    final /* synthetic */ hho i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsts(dsss dsssVar, dstx dstxVar, dspe dspeVar, hho hhoVar, hho hhoVar2, hho hhoVar3, ffgu ffguVar) {
        super(ffguVar);
        this.d = dsssVar;
        this.e = dstxVar;
        this.f = dspeVar;
        this.g = hhoVar;
        this.h = hhoVar2;
        this.i = hhoVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsts) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0039 -> B:4:0x003b). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            long r4 = r9.b
            float r1 = r9.a
            java.lang.Object r6 = r9.j
            iju r6 = (defpackage.iju) r6
            defpackage.ffci.b(r10)
            goto L3b
        L14:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.j
            iju r10 = (defpackage.iju) r10
            hho r1 = r9.g
            defpackage.dstv.c(r1, r3)
            hho r1 = r9.h
            hho r4 = r9.i
            float r1 = defpackage.dstv.a(r1)
            long r4 = defpackage.dstv.b(r4)
            r6 = r10
        L2d:
            r9.j = r6
            r9.a = r1
            r9.b = r4
            r9.c = r2
            java.lang.Object r10 = defpackage.ijt.a(r6, r9)
            if (r10 == r0) goto Lab
        L3b:
            hho r7 = r9.g
            iki r10 = (defpackage.iki) r10
            boolean r7 = defpackage.dstv.d(r7)
            if (r7 != 0) goto L60
            hho r7 = r9.h
            float r7 = defpackage.dstv.a(r7)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L5b
            hho r7 = r9.i
            long r7 = defpackage.dstv.b(r7)
            boolean r7 = defpackage.iak.i(r7, r4)
            if (r7 != 0) goto L60
        L5b:
            hho r7 = r9.g
            defpackage.dstv.c(r7, r2)
        L60:
            java.util.List r10 = r10.a
            boolean r7 = r10.isEmpty()
            if (r7 == 0) goto L69
            goto L7e
        L69:
            java.util.Iterator r10 = r10.iterator()
        L6d:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r10.next()
            iku r7 = (defpackage.iku) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L6d
            goto L2d
        L7e:
            dsss r10 = r9.d
            dsum r10 = (defpackage.dsum) r10
            boolean r10 = r10.c
            if (r10 == 0) goto La3
            dstx r10 = r9.e
            boolean r10 = r10.b()
            if (r10 != 0) goto La3
            dspe r10 = r9.f
            boolean r10 = r10.h()
            if (r10 != 0) goto La3
            hho r10 = r9.g
            boolean r10 = defpackage.dstv.d(r10)
            if (r10 == 0) goto La3
            dspe r10 = r9.f
            r10.f()
        La3:
            hho r10 = r9.g
            defpackage.dstv.c(r10, r3)
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsts.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsts dstsVar = new dsts(this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
        dstsVar.j = obj;
        return dstsVar;
    }
}
