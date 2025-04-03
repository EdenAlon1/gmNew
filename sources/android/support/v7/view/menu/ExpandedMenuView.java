package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.oc;
import defpackage.od;
import defpackage.og;
import defpackage.os;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, oc, os {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private od b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.os
    public final void a(od odVar) {
        this.b = odVar;
    }

    @Override // defpackage.oc
    public final boolean b(og ogVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((og) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        yt l = yt.l(context, attributeSet, a, i, 0);
        if (l.q(0)) {
            setBackgroundDrawable(l.h(0));
        }
        if (l.q(1)) {
            setDivider(l.h(1));
        }
        l.o();
    }
}
