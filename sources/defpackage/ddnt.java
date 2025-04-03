package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnt extends BaseAdapter implements Filterable {
    public static final cskc a = cskc.g("Bugle", "ZeroStateSearchBoxAdapter");
    public final Filter b;
    private final LayoutInflater d;
    private final int f;
    private final rig e = (rig) new rig().A();
    public List c = new ArrayList();

    public ddnt(Context context, ddqu ddquVar) {
        this.b = new ddns(this, ddquVar);
        this.d = LayoutInflater.from(context);
        this.f = Math.round(context.getResources().getDisplayMetrics().density * 24.0f);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SearchFilterDataItem getItem(int i) {
        return (SearchFilterDataItem) this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return getItem(i).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ddnr ddnrVar;
        if (view == null) {
            ddnrVar = new ddnr();
            view2 = this.d.inflate(R.layout.zero_state_search_box_dropdown_item_gm3, viewGroup, false);
            ddnrVar.b = (TextView) view2.findViewById(R.id.zero_state_search_box_dropdown_item);
            view2.setTag(ddnrVar);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setSingleLine();
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            Object tag = view.getTag();
            tag.getClass();
            ddnr ddnrVar2 = (ddnr) tag;
            view2 = view;
            ddnrVar = ddnrVar2;
        }
        SearchFilterDataItem item = getItem(i);
        ddnrVar.a = item;
        ddnrVar.b.setText(ddnrVar.a.f());
        if (item instanceof ddpw) {
            ddnrVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(((ddpw) item).c(), 0, 0, 0);
            return view2;
        }
        if (item instanceof ContactFilterDataItem) {
            Uri uri = ((ContactFilterDataItem) item).a;
            csix.l(uri);
            qqo q = qpt.e(ddnrVar.b).f(uri).q(this.e);
            int i2 = this.f;
            q.w(new ddnq(i2, i2, ddnrVar, item));
        }
        return view2;
    }
}
