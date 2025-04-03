package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzm extends vk {
    public final emwj a;
    public List e;
    private final emwl f;
    private final ejzd g = new ejzd();
    public final ejze d = new ejzj(this);

    public ejzm(emwl emwlVar, emwj emwjVar) {
        this.f = emwlVar;
        this.a = emwjVar;
    }

    @Override // defpackage.vk
    public final int a() {
        List list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return this.g.a((ejzn) this.f.apply(this.e.get(i)));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new ejzl(this.g.b(i).a(viewGroup));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ejzl ejzlVar = (ejzl) wrVar;
        ejzn b = this.g.b(ejzlVar.f);
        try {
            b.b(ejzlVar.s, this.e.get(i));
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", b), e);
        }
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        wt wtVar = recyclerView.S;
        if (wtVar instanceof ejzk) {
            recyclerView.al(((ejzk) wtVar).c);
        }
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.s && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        emxf.m(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data.");
        recyclerView.al(new ejzk(this, recyclerView));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        ejzl ejzlVar = (ejzl) wrVar;
        this.g.b(ejzlVar.f).c(ejzlVar.s);
    }
}
