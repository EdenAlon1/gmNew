package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgb extends wc {
    final /* synthetic */ dpgc a;
    final /* synthetic */ vx b;

    public dpgb(dpgc dpgcVar, vx vxVar) {
        this.a = dpgcVar;
        this.b = vxVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a.b.h() || ((SpannedGridLayoutManager) this.b).d == 0) {
            recyclerView.ai(this);
            this.a.a.G();
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}
