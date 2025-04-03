package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpga extends mr {
    private final RecyclerView a;

    public dpga(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ((drnm) obj).getClass();
        ((drnm) obj2).getClass();
        RecyclerView recyclerView = this.a;
        return !((recyclerView != null ? recyclerView.o : null) instanceof SpannedGridLayoutManager);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        drnm drnmVar = (drnm) obj;
        drnm drnmVar2 = (drnm) obj2;
        drnmVar.getClass();
        drnmVar2.getClass();
        return ffkj.e(drnmVar.f(), drnmVar2.f());
    }
}
