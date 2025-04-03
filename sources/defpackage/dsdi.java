package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdi extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dsed c;
    final /* synthetic */ dscj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdi(dsed dsedVar, dscj dscjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dsedVar;
        this.d = dscjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        dsek dsekVar = null;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (dsed.bm(this.c).d) {
                this.c.ba();
            }
            dsek dsekVar2 = this.c.e;
            if (dsekVar2 == null) {
                ffkj.c("stickerPackAdapter");
                dsekVar2 = null;
            }
            dsed dsedVar = this.c;
            dscj dscjVar = this.d;
            dscd bl = dsedVar.bl();
            this.a = dsekVar2;
            this.b = 1;
            Object b = bl.b(dscjVar, this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
            obj2 = dsekVar2;
            obj = b;
        }
        dscj dscjVar2 = (dscj) obj;
        dscjVar2.getClass();
        ((dsek) obj2).f = dscjVar2;
        dsed dsedVar2 = this.c;
        GridLayoutManager gridLayoutManager = dsedVar2.d;
        if (gridLayoutManager == null) {
            ffkj.c("stickerPackLayoutManager");
            gridLayoutManager = null;
        }
        dsek dsekVar3 = this.c.e;
        if (dsekVar3 == null) {
            ffkj.c("stickerPackAdapter");
        } else {
            dsekVar = dsekVar3;
        }
        dsedVar2.bg(gridLayoutManager, dsekVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdi(this.c, this.d, ffguVar);
    }
}
