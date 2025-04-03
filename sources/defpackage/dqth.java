package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqth {
    public final RecyclerView a;
    public final View b;
    public final TabLayout c;
    public final ImageButton d;
    public final View e;

    public dqth(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        findViewById.getClass();
        View findViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        findViewById2.getClass();
        this.a = (RecyclerView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        findViewById3.getClass();
        this.b = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.emoji_categories_tab_layout);
        findViewById4.getClass();
        this.c = (TabLayout) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        findViewById5.getClass();
        this.d = (ImageButton) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.emoji_bar_backspace_background);
        findViewById6.getClass();
        this.e = findViewById6;
    }
}
