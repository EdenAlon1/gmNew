package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxu implements View.OnApplyWindowInsetsListener {
    private final ddxt a;

    public ddxu(ddxt ddxtVar) {
        this.a = ddxtVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.a(view, windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
