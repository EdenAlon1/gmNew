package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final dede a;
    private int b = -1;
    private final ddzb c;
    private final Activity d;
    private final View e;
    private final boolean f;
    private final cwpe g;
    private final cwpe h;

    public cwpf(dede dedeVar, ddzb ddzbVar, Activity activity, View view, boolean z) {
        this.a = dedeVar;
        this.c = ddzbVar;
        this.d = activity;
        this.e = view;
        this.f = z;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.c2o_ime_minimum_height);
        this.g = new cwpe(this, dimensionPixelSize);
        this.h = new cwpe(this, dimensionPixelSize);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.d.getWindow().getAttributes().softInputMode == 48) {
            return;
        }
        if (ctid.e(this.d, this.f)) {
            this.a.f(false);
            return;
        }
        Rect rect = new Rect();
        Point point = new Point();
        this.e.getWindowVisibleDisplayFrame(rect);
        this.d.getWindowManager().getDefaultDisplay().getSize(point);
        int height = rect.height() > point.y ? -1 : rect.height();
        if (height == -1 || height == this.b) {
            return;
        }
        if (this.c.n()) {
            this.h.a(height);
        } else {
            this.g.a(height);
        }
        this.b = height;
    }
}
