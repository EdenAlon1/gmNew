package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.homeview.CategoryGroupItemView;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddnf implements ejxk {
    final /* synthetic */ ddnj a;

    public ddnf(ddnj ddnjVar) {
        this.a = ddnjVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ejxj.a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ZeroStateSearchHomeView zeroStateSearchHomeView = this.a.A;
        engw<SearchFilterDataItem> n = engw.n((List) obj);
        final ddop H = zeroStateSearchHomeView.c.H();
        n.getClass();
        boolean a = ((auyd) H.c.b()).a();
        int dimensionPixelOffset = H.a.getContext().getResources().getDimensionPixelOffset(a ? R.dimen.grid_layout_items_margin_top_and_bottom_coolranch : R.dimen.grid_layout_items_margin_top_and_bottom);
        int dimensionPixelOffset2 = H.a.getContext().getResources().getDimensionPixelOffset(true != a ? R.dimen.grid_layout_items_margin_start_and_end : R.dimen.grid_layout_items_margin_start_and_end_coolranch);
        int i = 0;
        for (final SearchFilterDataItem searchFilterDataItem : n) {
            int i2 = i + 1;
            searchFilterDataItem.getClass();
            View inflate = H.d.inflate(true != ((auyd) H.c.b()).a() ? R.layout.zero_state_search_category_group_item_view : R.layout.zero_state_search_category_group_item_view_coolranch, (ViewGroup) H.a, false);
            inflate.getClass();
            CategoryGroupItemView categoryGroupItemView = (CategoryGroupItemView) inflate;
            ddof H2 = categoryGroupItemView.H();
            int dimensionPixelSize = H2.a.getContext().getResources().getDimensionPixelSize(R.dimen.zero_state_search_content_group_item_icon_padding);
            ViewGroup.LayoutParams layoutParams = H2.a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = dimensionPixelSize + H2.a.getPaddingTop() + H2.a.getPaddingBottom();
            }
            int dimensionPixelSize2 = H2.b.getContext().getResources().getDimensionPixelSize(R.dimen.zero_state_search_content_group_item_label_side_padding);
            H2.b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            H2.a.setImageResource(((ddpw) searchFilterDataItem).c());
            String e = searchFilterDataItem.e();
            H2.b.setText(e);
            H2.b.setContentDescription(e);
            categoryGroupItemView.setOnClickListener(new View.OnClickListener() { // from class: ddon
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ddop ddopVar = ddop.this;
                    ddqp ddqpVar = ddopVar.e;
                    SearchFilterDataItem searchFilterDataItem2 = searchFilterDataItem;
                    if (ddqpVar != null) {
                        ddqpVar.h(searchFilterDataItem2);
                    }
                    ((ddpl) ddopVar.b.b()).f(3, searchFilterDataItem2.b());
                }
            });
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(categoryGroupItemView.getLayoutParams());
            layoutParams2.width = 0;
            layoutParams2.columnSpec = GridLayout.spec(i % H.a(), 1.0f);
            layoutParams2.rowSpec = GridLayout.spec(i / H.a(), 1.0f);
            layoutParams2.setMargins(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            H.a.addView(categoryGroupItemView, layoutParams2);
            i = i2;
        }
        zeroStateSearchHomeView.c.setVisibility(0);
    }
}
