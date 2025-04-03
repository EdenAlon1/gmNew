package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcar extends dcae implements dcau {
    public final int a;
    public RecyclerView b;
    private final cuxz c;
    private LinearLayoutManager d;

    protected dcar(cuxz cuxzVar, eymn eymnVar, int i) {
        this(cuxzVar, eymnVar, i, 1);
    }

    protected abstract dbzy A();

    @Override // defpackage.dcau
    public final List B() {
        if (z() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = z().a.iterator();
        while (it.hasNext()) {
            arrayList.add(((wr) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.dcau
    public final void C(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.d;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.ac(i, i2);
        CategoryToggleView categoryToggleView = this.j;
        if (categoryToggleView != null) {
            categoryToggleView.getHandler().postDelayed(new Runnable() { // from class: dcap
                @Override // java.lang.Runnable
                public final void run() {
                    dcar.this.D();
                }
            }, 200L);
        }
    }

    public final void D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || this.j == null) {
            return;
        }
        if (this.c.d(recyclerView, false)) {
            this.j.c();
        } else {
            this.j.d();
        }
    }

    public final boolean E() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // defpackage.dcae
    public void gB(View view) {
        super.gB(view);
        this.b = (RecyclerView) view.findViewById(R.id.c2o_category_recycler_view);
        if (this.a == 1) {
            view.getContext();
            this.d = new LinearLayoutManager(0);
        } else {
            view.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.a, 0);
            gridLayoutManager.g = l();
            this.d = gridLayoutManager;
        }
        this.b.ap(this.d);
        A().d = this;
        this.b.am(z());
        this.b.z(y());
        int k = k();
        csix.k(true);
        this.b.setContentDescription(view.getResources().getString(k));
    }

    protected abstract int k();

    protected tx l() {
        return new tv();
    }

    @Override // defpackage.dcae
    public int n() {
        return R.layout.compose2o_category_recycler_view_m2;
    }

    protected wc y() {
        return new dcaq(this);
    }

    protected abstract dbzx z();

    protected dcar(cuxz cuxzVar, eymn eymnVar, int i, int i2) {
        super(eymnVar, i);
        this.c = cuxzVar;
        this.a = i2;
    }
}
