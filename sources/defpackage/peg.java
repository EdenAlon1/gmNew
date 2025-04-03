package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peg extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public peg(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void W(wo woVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.i == -1) {
            super.W(woVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.f;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.vx
    public final boolean bp(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.vx
    public final void cg(wf wfVar, wo woVar, View view, kxu kxuVar) {
        pel pelVar = (pel) this.a.j;
        kxuVar.u(kxt.a(pelVar.b.a() == 1 ? LinearLayoutManager.bv(view) : 0, 1, pelVar.b.a() == 0 ? LinearLayoutManager.bv(view) : 0, 1, false));
    }
}
