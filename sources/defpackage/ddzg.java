package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzg extends BaseExpandableListAdapter {
    public final ExpandableListView a;
    private final List b;
    private final LayoutInflater c;
    private final crjb d;
    private final Context e;

    public ddzg(Context context, List list, crjb crjbVar, ExpandableListView expandableListView) {
        this.e = context;
        this.b = list;
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.d = crjbVar;
        this.a = expandableListView;
    }

    private final VCardAttachmentView a(ViewGroup viewGroup) {
        return (VCardAttachmentView) this.c.inflate(R.layout.people_list_item_view_m2, viewGroup, false);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return ((cbaj) this.b.get(i)).b.get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        VCardAttachmentView a = view == null ? a(viewGroup) : (VCardAttachmentView) view;
        a.j(new cbah((cbai) getChild(i, i2)));
        a.l(this.d);
        return a;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return ((cbaj) this.b.get(i)).b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(final int i, boolean z, View view, ViewGroup viewGroup) {
        VCardAttachmentView a = view == null ? a(viewGroup) : (VCardAttachmentView) view;
        cbag cbagVar = new cbag((cbaj) getGroup(i));
        a.j(cbagVar);
        Resources resources = this.e.getResources();
        String m = cbagVar.m();
        a.setContentDescription(m + " " + resources.getString(true != z ? R.string.vcard_expand : R.string.vcard_collapse));
        a.setOnClickListener(new View.OnClickListener() { // from class: ddzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddzg ddzgVar = ddzg.this;
                ExpandableListView expandableListView = ddzgVar.a;
                int i2 = i;
                if (expandableListView.isGroupExpanded(i2)) {
                    ddzgVar.a.collapseGroup(i2);
                } else {
                    ddzgVar.a.expandGroup(i2);
                }
            }
        });
        return a;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
