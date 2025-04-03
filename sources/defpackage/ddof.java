package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.homeview.CategoryGroupItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddof {
    public final ImageView a;
    public final TextView b;
    private final LinearLayout c;

    public ddof(CategoryGroupItemView categoryGroupItemView) {
        this.a = (ImageView) categoryGroupItemView.findViewById(R.id.content_group_item_icon);
        this.b = (TextView) categoryGroupItemView.findViewById(R.id.content_group_item_label);
        this.c = categoryGroupItemView;
        categoryGroupItemView.setClipToOutline(true);
    }
}
