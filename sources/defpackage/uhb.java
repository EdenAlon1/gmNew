package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhb {
    public final cxzh a;
    public View b;
    public View c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public final emyl h;
    private final Activity i;
    private int j;
    private float k;

    public uhb(Activity activity, ddwp ddwpVar, cxzh cxzhVar) {
        activity.getClass();
        ddwpVar.getClass();
        cxzhVar.getClass();
        this.i = activity;
        this.a = cxzhVar;
        this.e = true;
        this.f = this.k;
        this.g = 1.0f;
        emyl x = cfvl.x(223336947, "enable_set_toolbar_visibility_by_alpha");
        x.getClass();
        this.h = x;
    }

    private final void e(boolean z, float f, float f2, boolean z2) {
        View view = this.c;
        if (view != null) {
            this.a.a(z);
            view.setTranslationY(f);
            view.setAlpha(f2);
            if (((Boolean) ((cfup) this.h.get()).e()).booleanValue()) {
                view.setVisibility(true == z2 ? 0 : 8);
            }
            c(f2 == 1.0f);
        } else {
            View view2 = this.b;
            if (view2 != null) {
                this.a.a(z);
                view2.setTranslationY(f);
                view2.setAlpha(f2);
                if (((Boolean) ((cfup) this.h.get()).e()).booleanValue()) {
                    view2.setVisibility(true == z2 ? 0 : 8);
                }
            }
        }
        this.d = z;
        this.f = f;
        this.g = f2;
        this.e = z2;
    }

    public final void a() {
        if (this.b == null) {
            View findViewById = this.i.findViewById(R.id.toolbar);
            if (findViewById != null) {
                if (findViewById.getMeasuredHeight() != 0) {
                    this.b = findViewById;
                } else if (findViewById.getWidth() <= 0 || findViewById.getHeight() <= 0) {
                    findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new uha(findViewById, this));
                } else {
                    findViewById.getWidth();
                    findViewById.getHeight();
                    a();
                }
            }
            View view = this.b;
            if (view != null) {
                this.j = view.getMeasuredHeight() + ddzb.d(this.i);
                this.k = view.getTranslationY();
            }
            View findViewById2 = this.i.findViewById(R.id.appBarLayout);
            if (findViewById2 != null) {
                this.c = findViewById2;
                this.j = findViewById2.getMeasuredHeight();
                this.k = findViewById2.getTranslationY();
            }
        }
    }

    public final void b() {
        e(false, this.k, 1.0f, true);
    }

    public final void c(boolean z) {
        if (this.c != null) {
            if (z) {
                this.i.getWindow().setStatusBarColor(0);
            } else {
                Activity activity = this.i;
                activity.getWindow().setStatusBarColor(ehdr.d(activity, android.R.attr.statusBarColor, "ToolbarController"));
            }
        }
    }

    public final void d(int i) {
        a();
        View view = this.c;
        if (view == null) {
            view = this.b;
        }
        if (view != null) {
            int i2 = this.j;
            if (i >= i2) {
                b();
                return;
            }
            float e = ffmk.e(i / i2, 0.0f, 1.0f);
            e(true, i - this.j, e, e > 0.0f);
        }
    }
}
