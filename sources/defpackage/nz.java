package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nz implements AdapterView.OnItemClickListener, oq {
    Context a;
    public LayoutInflater b;
    od c;
    public ExpandedMenuView d;
    public op e;
    public ny f;

    public nz(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.oq
    public final int a() {
        return 0;
    }

    @Override // defpackage.oq
    public final void c(Context context, od odVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = odVar;
        ny nyVar = this.f;
        if (nyVar != null) {
            nyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq
    public final void d(od odVar, boolean z) {
        op opVar = this.e;
        if (opVar != null) {
            opVar.a(odVar, z);
        }
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        throw null;
    }

    @Override // defpackage.oq
    public final void f(boolean z) {
        ny nyVar = this.f;
        if (nyVar != null) {
            nyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.oq
    public final boolean h(oy oyVar) {
        if (!oyVar.hasVisibleItems()) {
            return false;
        }
        oe oeVar = new oe(oyVar);
        od odVar = oeVar.a;
        iu iuVar = new iu(odVar.a);
        oeVar.c = new nz(iuVar.getContext());
        nz nzVar = oeVar.c;
        nzVar.e = oeVar;
        oeVar.a.g(nzVar);
        ListAdapter k = oeVar.c.k();
        ir irVar = iuVar.a;
        irVar.r = k;
        irVar.s = oeVar;
        View view = odVar.g;
        if (view != null) {
            irVar.e = view;
        } else {
            iuVar.b(odVar.f);
            iuVar.setTitle(odVar.e);
        }
        iuVar.a.p = oeVar;
        oeVar.b = iuVar.create();
        oeVar.b.setOnDismissListener(oeVar);
        WindowManager.LayoutParams attributes = oeVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oeVar.b.show();
        op opVar = this.e;
        if (opVar == null) {
            return true;
        }
        opVar.b(oyVar);
        return true;
    }

    @Override // defpackage.oq
    public final boolean i(og ogVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean j(og ogVar) {
        return false;
    }

    public final ListAdapter k() {
        if (this.f == null) {
            this.f = new ny(this);
        }
        return this.f;
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
