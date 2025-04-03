package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.samsung.appbar.ExpandableAppBarView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akmn {
    static final /* synthetic */ ffmx[] a;
    public final ExpandableAppBarView b;
    public boolean c;
    public AppBarLayout d;
    public final int e;
    public View f;
    private final ffls g;

    static {
        ffko ffkoVar = new ffko(akmn.class, "isTallEnough", "isTallEnough()Z", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public akmn(ExpandableAppBarView expandableAppBarView, TypedArray typedArray) {
        this.b = expandableAppBarView;
        int i = -1;
        if (typedArray != null) {
            int[] iArr = akmv.a;
            i = typedArray.getResourceId(31, -1);
        }
        this.e = i;
        this.g = new akmm(true, this);
    }

    public final void a() {
        int i;
        if (this.c) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.b.getDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            boolean z = i2 >= ((int) TypedValue.applyDimension(1, 580.0f, displayMetrics));
            ffls fflsVar = this.g;
            ffmx[] ffmxVarArr = a;
            fflsVar.d(ffmxVarArr[0], Boolean.valueOf(z));
            ExpandableAppBarView expandableAppBarView = this.b;
            ffls fflsVar2 = this.g;
            ViewGroup.LayoutParams layoutParams = expandableAppBarView.getLayoutParams();
            if (((Boolean) fflsVar2.c(ffmxVarArr[0])).booleanValue()) {
                Context context = this.b.getContext();
                int i3 = ddzd.a;
                i = (int) (i2 * (true != context.getResources().getBoolean(R.bool.is_large_screen_device) ? 0.39f : 0.19f));
            } else {
                i = -2;
            }
            layoutParams.height = i;
            this.b.requestLayout();
        }
    }
}
