package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.search.SearchBar;
import defpackage.ehua;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public class OpenSearchBar extends SearchBar {

    /* compiled from: PG */
    @Deprecated
    public static class ScrollingViewBehavior extends SearchBar.ScrollingViewBehavior {
        @Override // com.google.android.material.search.SearchBar.ScrollingViewBehavior, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.egzy, defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }
    }

    public OpenSearchBar(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.search.SearchBar
    protected final int F() {
        return R.dimen.google_opensearchbar_margin_vertical;
    }

    @Override // com.google.android.material.search.SearchBar
    protected final int G() {
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_GoogleMaterial_OpenSearchBar), attributeSet, i);
    }
}
