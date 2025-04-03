package defpackage;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxb {
    public final View a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final ViewGroup f;
    public final EditText g;
    public final ComposeView h;
    public final TabLayout i;
    public final View j;
    public final FrameLayout k;
    public final RecyclerView l;

    public drxb(View view) {
        this.a = view;
        View findViewById = view.findViewById(R.id.proxy_screen_container);
        findViewById.getClass();
        this.b = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.proxy_screen_header);
        findViewById2.getClass();
        this.c = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.proxy_screen_search_icon);
        findViewById3.getClass();
        this.d = (AppCompatImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.proxy_screen_clear_icon);
        findViewById4.getClass();
        this.e = (AppCompatImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.proxy_screen_search_bar_wrapper);
        findViewById5.getClass();
        this.f = (ViewGroup) findViewById5;
        View findViewById6 = view.findViewById(R.id.proxy_screen_search_bar);
        findViewById6.getClass();
        this.g = (EditText) findViewById6;
        View findViewById7 = view.findViewById(R.id.proxy_screen_button);
        findViewById7.getClass();
        this.h = (ComposeView) findViewById7;
        View findViewById8 = view.findViewById(R.id.proxy_screen_tabs);
        findViewById8.getClass();
        this.i = (TabLayout) findViewById8;
        View findViewById9 = view.findViewById(R.id.proxy_screen_tabs_bottom_border);
        findViewById9.getClass();
        this.j = findViewById9;
        View findViewById10 = view.findViewById(R.id.proxy_screen_screens_container);
        findViewById10.getClass();
        this.k = (FrameLayout) findViewById10;
        View findViewById11 = view.findViewById(R.id.search_rows_recycler_view);
        findViewById11.getClass();
        this.l = (RecyclerView) findViewById11;
    }
}
