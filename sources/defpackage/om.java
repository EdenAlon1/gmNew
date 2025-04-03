package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class om implements AdapterView.OnItemClickListener, ou, oq {
    public Rect g;

    protected static int A(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    protected static oa y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (oa) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (oa) listAdapter;
    }

    protected static boolean z(od odVar) {
        int size = odVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = odVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oq
    public final int a() {
        return 0;
    }

    @Override // defpackage.oq
    public final boolean i(og ogVar) {
        return false;
    }

    @Override // defpackage.oq
    public final boolean j(og ogVar) {
        return false;
    }

    public abstract void l(od odVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).a.A((MenuItem) listAdapter.getItem(i), this, true != w() ? 4 : 0);
    }

    public abstract void p(boolean z);

    public abstract void q(int i);

    public abstract void r(int i);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z);

    public abstract void u(int i);

    protected boolean w() {
        return true;
    }

    @Override // defpackage.oq
    public final void c(Context context, od odVar) {
    }
}
