package defpackage;

import android.support.v7.widget.GridLayoutManager;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdx(dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dsed dsedVar = this.b;
                this.a = 1;
                obj = dsed.bx(dsedVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            dsed dsedVar2 = this.b;
            List list = (List) obj;
            if (list.isEmpty()) {
                dsedVar2.bt();
            } else {
                dseo dseoVar = dsedVar2.c;
                dseo dseoVar2 = null;
                if (dseoVar == null) {
                    ffkj.c("stickerPacksListAdapter");
                    dseoVar = null;
                }
                dseoVar.m(list, true);
                GridLayoutManager gridLayoutManager = dsedVar2.b;
                if (gridLayoutManager == null) {
                    ffkj.c("stickerPacksListLayoutManager");
                    gridLayoutManager = null;
                }
                dseo dseoVar3 = dsedVar2.c;
                if (dseoVar3 == null) {
                    ffkj.c("stickerPacksListAdapter");
                } else {
                    dseoVar2 = dseoVar3;
                }
                dsedVar2.bg(gridLayoutManager, dseoVar2);
            }
        } catch (Exception e) {
            if (!(e instanceof RuntimeException) && (!(e instanceof IOException) || !dsed.bm(this.b).b)) {
                throw e;
            }
            ((enrr) ((enrr) dsed.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$showAllStickerPacks$1", "invokeSuspend", 389, "StickerScreen.kt")).q("Unable to fetch sticker packs.");
            this.b.bt();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdx(this.b, ffguVar);
    }
}
