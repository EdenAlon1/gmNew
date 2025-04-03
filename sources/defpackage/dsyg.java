package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyg implements dsyj {
    public final dsyc a;
    final /* synthetic */ RecyclerView b;

    public dsyg(final RecyclerView recyclerView) {
        this.b = recyclerView;
        this.a = new dsyc(new ffji() { // from class: dsyd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsyi dsyiVar = (dsyi) obj;
                dsyiVar.getClass();
                return new dsxy(dsyiVar);
            }
        }, new ffji() { // from class: dsye
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsxy dsxyVar = (dsxy) obj;
                dsxyVar.getClass();
                RecyclerView.this.z(dsxyVar);
                return ffcu.a;
            }
        }, new ffji() { // from class: dsyf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsxy dsxyVar = (dsxy) obj;
                dsxyVar.getClass();
                RecyclerView.this.ai(dsxyVar);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dsyj
    public final int a() {
        return this.b.computeVerticalScrollOffset();
    }

    @Override // defpackage.dsyj
    public final /* synthetic */ View b() {
        return null;
    }

    @Override // defpackage.dsyj
    public final dsyc c() {
        return this.a;
    }

    @Override // defpackage.dsyj
    public final void d(int i) {
        this.b.aB(0, i);
    }

    @Override // defpackage.dsyj
    public final void f(int i) {
        RecyclerView recyclerView = this.b;
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.invalidate();
    }

    @Override // defpackage.dsyj
    public final boolean g() {
        return !this.b.canScrollVertically(1);
    }

    @Override // defpackage.dsyj
    public final boolean h() {
        return !this.b.canScrollVertically(-1);
    }

    @Override // defpackage.dsyj
    public final /* synthetic */ boolean i(int i) {
        return false;
    }

    @Override // defpackage.dsyj
    public final void j(int i) {
        this.b.scrollBy(0, i);
    }

    @Override // defpackage.dsyj
    public final void k(boolean z) {
        RecyclerView recyclerView = this.b;
        if (z) {
            recyclerView.ay();
        }
        vx vxVar = recyclerView.o;
        if (vxVar != null) {
            if (vxVar instanceof GridLayoutManager) {
                ((GridLayoutManager) vxVar).ac(0, 0);
                return;
            }
            if (vxVar instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) vxVar;
                yi yiVar = staggeredGridLayoutManager.j;
                if (yiVar != null) {
                    yiVar.a();
                }
                staggeredGridLayoutManager.g = 0;
                staggeredGridLayoutManager.h = 0;
                staggeredGridLayoutManager.be();
            }
        }
    }

    @Override // defpackage.dsyj
    public final /* synthetic */ void e() {
    }
}
