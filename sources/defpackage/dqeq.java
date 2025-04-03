package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqeq extends ffhv implements ffjm {
    /* synthetic */ int a;
    final /* synthetic */ dqfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqeq(dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqeq) c(Integer.valueOf(((Number) obj).intValue()), (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            defpackage.ffci.b(r6)
            dqfc r6 = r5.b
            int r0 = r5.a
            dqdb r1 = r6.b()
            android.support.v7.widget.RecyclerView r6 = r6.b
            r2 = 0
            if (r6 != 0) goto L16
            java.lang.String r6 = "recyclerView"
            defpackage.ffkj.c(r6)
            r6 = r2
        L16:
            r6.getClass()
            dqcp r3 = r1.c
            if (r3 == 0) goto L34
            ffbz r4 = r1.e
            java.lang.Object r4 = r4.a()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r0 < r4) goto L2c
            r3 = r2
        L2c:
            if (r3 == 0) goto L34
            dqcy r4 = new dqcy
            r4.<init>(r3)
            goto L36
        L34:
            dqcx r4 = defpackage.dqcx.a
        L36:
            r1.f = r4
            dqcz r3 = r1.f
            if (r3 != 0) goto L42
            java.lang.String r3 = "gridState"
            defpackage.ffkj.c(r3)
            goto L43
        L42:
            r2 = r3
        L43:
            dqcx r3 = defpackage.dqcx.a
            boolean r3 = defpackage.ffkj.e(r2, r3)
            if (r3 == 0) goto L87
            android.content.Context r0 = r1.a
            android.content.res.Resources r0 = r0.getResources()
            dqdf r2 = r1.d
            int r2 = r2.c
            int r0 = r0.getDimensionPixelSize(r2)
            vx r2 = r6.o
            boolean r2 = r2 instanceof android.support.v7.widget.GridLayoutManager
            if (r2 != 0) goto Ld9
            dtct r2 = r1.c()
            r2.b(r6)
            dtdg r1 = r1.b
            dtdj r2 = new dtdj
            dtdq r3 = new dtdq
            r3.<init>(r0)
            dqcq r0 = new dqcq
            r0.<init>()
            r2.<init>(r3, r0)
            com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager r0 = r1.a(r2)
            r6.ap(r0)
            dqcr r0 = new dqcr
            r0.<init>()
            r6.post(r0)
            goto Ld9
        L87:
            boolean r3 = r2 instanceof defpackage.dqcy
            if (r3 == 0) goto Ldc
            dqcy r2 = (defpackage.dqcy) r2
            dqcp r2 = r2.a
            dqdf r3 = r1.d
            boolean r3 = r3.j
            vx r4 = r6.o
            boolean r4 = r4 instanceof com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager
            if (r4 != 0) goto Lb0
            com.google.android.libraries.compose.cameragallery.ui.grid.CameraGalleryGridStateController$setUpSpannedGrid$1$1 r4 = new com.google.android.libraries.compose.cameragallery.ui.grid.CameraGalleryGridStateController$setUpSpannedGrid$1$1
            r4.<init>(r2, r3)
            r6.ap(r4)
            dtct r3 = r1.c()
            r3.a(r6)
            dqcs r3 = new dqcs
            r3.<init>()
            r6.post(r3)
        Lb0:
            dtct r1 = r1.c()
            r1.getClass()
            int r1 = r1.a
            int r0 = r0 - r1
            android.util.Size r1 = new android.util.Size
            int r3 = r0 / 6
            int r3 = r3 + r3
            r1.<init>(r3, r3)
            r2.b = r1
            int r0 = r0 / 2
            r2.c = r0
            dpnf r1 = r2.a
            drje r1 = r1.a
            int r0 = r1.a(r0)
            r2.d = r0
            vk r6 = r6.n
            if (r6 == 0) goto Ld9
            r6.p()
        Ld9:
            ffcu r6 = defpackage.ffcu.a
            return r6
        Ldc:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqeq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqeq dqeqVar = new dqeq(this.b, ffguVar);
        dqeqVar.a = ((Number) obj).intValue();
        return dqeqVar;
    }
}
