package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtcy b;
    final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtcw(dtcy dtcyVar, Integer num, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtcyVar;
        this.c = num;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtcw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx d;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtcy dtcyVar = this.b;
            int intValue = ((Number) dtcyVar.e.invoke(dtcyVar.d)).intValue();
            RecyclerView recyclerView = dtcyVar.c;
            if (intValue == 0) {
                ((enrr) dtcy.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2", "invokeSuspend", 58, "LayoutManagerSizeObserver.kt")).q("Started observing height of RecyclerView");
                d = ffyy.a(new dskx(dslh.b(recyclerView)));
            } else {
                ((enrr) dtcy.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2", "invokeSuspend", 61, "LayoutManagerSizeObserver.kt")).q("Started observing width of RecyclerView");
                d = dslh.d(recyclerView);
            }
            ffzu ffzuVar = new ffzu(d, new dtcu(this.c, null));
            dtcv dtcvVar = new dtcv(this.b);
            this.a = 1;
            if (ffzuVar.a(dtcvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtcw(this.b, this.c, ffguVar);
    }
}
