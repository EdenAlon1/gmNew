package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dseb extends ffhv implements ffjm {
    final /* synthetic */ dsed a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dseb(dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dseb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dsed dsedVar = this.a;
        GridLayoutManager gridLayoutManager = dsedVar.b;
        dseo dseoVar = null;
        if (gridLayoutManager == null) {
            ffkj.c("stickerPacksListLayoutManager");
            gridLayoutManager = null;
        }
        dseo dseoVar2 = this.a.c;
        if (dseoVar2 == null) {
            ffkj.c("stickerPacksListAdapter");
        } else {
            dseoVar = dseoVar2;
        }
        dsedVar.bg(gridLayoutManager, dseoVar);
        if (dsed.bm(this.a).d) {
            TabLayout tabLayout = this.a.ao;
            tabLayout.getClass();
            if (tabLayout.b() > 0) {
                tabLayout.m(tabLayout.d(tabLayout.a()));
            }
            dsed dsedVar2 = this.a;
            TabLayout tabLayout2 = dsedVar2.ao;
            tabLayout2.getClass();
            RecyclerView r = dsedVar2.r();
            Context z = dsedVar2.z();
            z.getClass();
            r.setPadding(r.getPaddingLeft(), r.getPaddingTop(), r.getPaddingRight(), z.getResources().getDimensionPixelOffset(R.dimen.gifsticker_tab_height));
            tabLayout2.setVisibility(0);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dseb(this.a, ffguVar);
    }
}
