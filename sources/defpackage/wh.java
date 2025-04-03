package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wh extends vm {
    final /* synthetic */ RecyclerView a;

    public wh(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.vm
    public final void a() {
        this.a.A(null);
        RecyclerView recyclerView = this.a;
        recyclerView.O.f = true;
        recyclerView.ab(true);
        if (this.a.g.l()) {
            return;
        }
        this.a.requestLayout();
    }

    @Override // defpackage.vm
    public final void c(int i, int i2, Object obj) {
        this.a.A(null);
        qm qmVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        qmVar.a.add(qmVar.c(4, i, i2, obj));
        qmVar.d |= 4;
        if (qmVar.a.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        this.a.A(null);
        qm qmVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        qmVar.a.add(qmVar.c(1, i, i2, null));
        qmVar.d |= 1;
        if (qmVar.a.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        this.a.A(null);
        qm qmVar = this.a.g;
        if (i2 <= 0) {
            return;
        }
        qmVar.a.add(qmVar.c(2, i, i2, null));
        qmVar.d |= 2;
        if (qmVar.a.size() == 1) {
            h();
        }
    }

    @Override // defpackage.vm
    public final void f() {
        vk vkVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView.f == null || (vkVar = recyclerView.n) == null || !vkVar.D()) {
            return;
        }
        this.a.requestLayout();
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        this.a.A(null);
        qm qmVar = this.a.g;
        if (i == i2) {
            return;
        }
        qmVar.a.add(qmVar.c(8, i, i2, null));
        qmVar.d |= 8;
        if (qmVar.a.size() == 1) {
            h();
        }
    }

    final void h() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.s || !recyclerView.r) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.k;
            int[] iArr = kvo.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
