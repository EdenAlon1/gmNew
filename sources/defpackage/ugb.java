package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugb {
    private static final entd i = entd.c("BugleInputManager");
    public final Activity a;
    public final uhb b;
    public final View c;
    public final ViewGroup d;
    public final ViewGroup e;
    public int f;
    public uga g = uga.NONE;
    public final ugd h;
    private final uhd j;
    private final int k;

    public ugb(Activity activity, ugd ugdVar, uhd uhdVar, uhb uhbVar, View view) {
        this.a = activity;
        this.h = ugdVar;
        this.j = uhdVar;
        this.b = uhbVar;
        this.c = view;
        this.d = (ViewGroup) view.findViewById(R.id.hugo_input_container);
        this.e = (ViewGroup) view.findViewById(R.id.fragment_input_container);
        this.f = a(activity);
        this.k = (int) TypedValue.applyDimension(1, ((Integer) ugk.a.e()).intValue(), activity.getResources().getDisplayMetrics());
        d(this.g);
    }

    public static int a(Activity activity) {
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.minimum_available_space);
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (((Boolean) ctjd.aQ.e()).booleanValue()) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels - dimensionPixelSize;
    }

    private static void g(View view) {
        view.setVisibility(8);
    }

    final void b() {
        d(uga.NONE);
    }

    final void c(ugm ugmVar) {
        uga ugaVar;
        int ordinal = ugmVar.ordinal();
        if (ordinal == 0) {
            ugaVar = uga.HUGO;
        } else if (ordinal == 1) {
            uga ugaVar2 = this.g;
            ugaVar = (ugaVar2 == uga.HUGO || ugaVar2 == uga.FRAGMENT) ? uga.MATCHING_IME_FINAL_HEIGHT : this.h.d() ? uga.MATCHING_IME_TRANSIENT_HEIGHTS : uga.NONE;
        } else {
            if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                throw new IllegalStateException("No display state for surface ".concat(String.valueOf(String.valueOf(ugmVar))));
            }
            ugaVar = uga.FRAGMENT;
        }
        d(ugaVar);
    }

    public final void d(uga ugaVar) {
        ((ensz) ((ensz) i.h()).h("com/google/android/apps/messaging/conversation/input/ContainerController", "setDisplayState", 187, "ContainerController.java")).D("ContainerController: Switching display state from %s to %s", this.g, ugaVar);
        int max = Math.max(this.h.a(), this.k);
        int ordinal = ugaVar.ordinal();
        if (ordinal == 0) {
            this.j.a();
            g(this.c);
            g(this.d);
            g(this.e);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                this.j.b();
                e(this.c, -2);
                e(this.e, max);
                g(this.d);
                if (this.h.e()) {
                    this.h.c(this.e);
                }
            } else if (ordinal == 3) {
                this.j.b();
                e(this.c, this.h.a());
                g(this.d);
                g(this.e);
            } else if (ordinal == 4) {
                this.j.b();
                e(this.c, this.h.b());
                g(this.d);
                g(this.e);
            }
        } else if (this.g != uga.HUGO) {
            this.j.b();
            e(this.c, -2);
            e(this.d, max);
            g(this.e);
            if (this.h.e()) {
                this.h.c(this.d);
            }
        }
        this.g = ugaVar;
    }

    public final void e(View view, int i2) {
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = i2;
        view.requestLayout();
        if (i2 > 0) {
            this.b.d(this.f - i2);
        }
    }

    final void f() {
        this.b.b();
    }
}
