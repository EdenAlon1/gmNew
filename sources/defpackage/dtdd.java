package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdd extends tx {
    final /* synthetic */ dtde c;
    final /* synthetic */ ReactiveGridLayoutManager d;

    public dtdd(dtde dtdeVar, ReactiveGridLayoutManager reactiveGridLayoutManager) {
        this.c = dtdeVar;
        this.d = reactiveGridLayoutManager;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        vk vkVar;
        RecyclerView recyclerView = this.d.L;
        int i2 = -1;
        if (recyclerView != null && (vkVar = recyclerView.n) != null) {
            i2 = vkVar.dE(i);
        }
        return this.c.a(i, i2, ((GridLayoutManager) this.d).b);
    }
}
