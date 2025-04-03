package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzi extends vk {
    private final emwl a;
    private final emwj d;
    private final emwl e;
    private final ejze f;
    private List g;
    private final ejzd h;

    public ejzi(ejzn ejznVar, emwj emwjVar) {
        this(new emwn(ejznVar), null, emwjVar, emwjVar != null ? new ejzf() : null, new ejzd());
    }

    @Override // defpackage.vk
    public final int a() {
        List list = this.g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        this.g.get(i);
        return this.h.a((ejzn) ((emwn) this.a).a);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new ejzh(this.h.b(i).a(viewGroup));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ejzh ejzhVar = (ejzh) wrVar;
        ejzn b = this.h.b(ejzhVar.f);
        try {
            b.b(ejzhVar.s, this.g.get(i));
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Attempting to bind data with an incompatible ViewBinder class (%s). Check that your ViewBinder function is correct.", b), e);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        emwl emwlVar;
        if (this.g == null || (emwlVar = this.e) == null) {
            return -1L;
        }
        return emwlVar.apply(r0.get(i)).hashCode();
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        boolean z = true;
        if (recyclerView.s && a() <= 0 && (layoutParams.height == -2 || layoutParams.width == -2)) {
            z = false;
        }
        emxf.m(z, "RecyclerViews that use WRAP_CONTENT with setHasFixedSize(true) won't resize on new data. If you have static data, you should set it on the adapter before setAdapter().");
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        ejzh ejzhVar = (ejzh) wrVar;
        this.h.b(ejzhVar.f).c(ejzhVar.s);
    }

    public final void m(List list) {
        efbd.c();
        List list2 = this.g;
        this.g = list;
        if (list2 == null && list != null) {
            w(0, list.size());
            return;
        }
        if (list2 != null && list == null) {
            x(0, list2.size());
            return;
        }
        if (list2 == null || this.d == null || this.f == null) {
            p();
            return;
        }
        if (!ekyf.v()) {
            this.f.a(list2, list, this.d, this);
            return;
        }
        ekzz f = eleg.f("RecyclerView Data Diff");
        try {
            this.f.a(list2, list, this.d, this);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ejzi(emwl emwlVar, emwl emwlVar2, emwj emwjVar, ejze ejzeVar, ejzd ejzdVar) {
        this.a = emwlVar;
        this.e = emwlVar2;
        this.d = emwjVar;
        this.f = ejzeVar;
        this.h = ejzdVar;
    }
}
