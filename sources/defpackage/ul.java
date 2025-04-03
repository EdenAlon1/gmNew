package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ul implements AbsListView.OnScrollListener {
    final /* synthetic */ uo a;

    public ul(uo uoVar) {
        this.a = uoVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.u() || this.a.r.getContentView() == null) {
            return;
        }
        uo uoVar = this.a;
        uoVar.p.removeCallbacks(uoVar.o);
        this.a.o.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
