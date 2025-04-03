package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jg implements kud {
    final /* synthetic */ jz a;

    public jg(jz jzVar) {
        this.a = jzVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        int i;
        int i2;
        kxh kxhVar2;
        int i3;
        int i4;
        int i5;
        Insets of;
        WindowInsets.Builder systemWindowInsets;
        WindowInsets build;
        Insets systemWindowInsets2;
        int i6;
        int i7;
        int i8;
        int i9;
        jz jzVar = this.a;
        int d = kxhVar.d();
        int d2 = kxhVar.d();
        ActionBarContextView actionBarContextView = jzVar.s;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jzVar.s.getLayoutParams();
            if (jzVar.s.isShown()) {
                if (jzVar.M == null) {
                    jzVar.M = new Rect();
                    jzVar.N = new Rect();
                }
                Rect rect = jzVar.M;
                Rect rect2 = jzVar.N;
                rect.set(kxhVar.b(), kxhVar.d(), kxhVar.c(), kxhVar.a());
                ViewGroup viewGroup = jzVar.y;
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets.Builder builder = new WindowInsets.Builder();
                    of = Insets.of(rect);
                    systemWindowInsets = builder.setSystemWindowInsets(of);
                    build = systemWindowInsets.build();
                    systemWindowInsets2 = viewGroup.computeSystemWindowInsets(build, rect2).getSystemWindowInsets();
                    i6 = systemWindowInsets2.left;
                    i7 = systemWindowInsets2.top;
                    i8 = systemWindowInsets2.right;
                    i9 = systemWindowInsets2.bottom;
                    rect.set(i6, i7, i8, i9);
                    i4 = 0;
                } else {
                    if (zu.a) {
                        i4 = 0;
                    } else {
                        zu.a = true;
                        i4 = 0;
                        try {
                            zu.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!zu.b.isAccessible()) {
                                zu.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = zu.b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i4] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = jzVar.y;
                int[] iArr = kvo.a;
                kxh a = kve.a(viewGroup2);
                int b = a == null ? i4 : a.b();
                int c = a == null ? i4 : a.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    i5 = i4;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    i5 = 1;
                }
                if (i10 <= 0 || jzVar.z != null) {
                    View view2 = jzVar.z;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            jzVar.z.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    jzVar.z = new View(jzVar.k);
                    jzVar.z.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    jzVar.y.addView(jzVar.z, -1, layoutParams);
                }
                View view3 = jzVar.z;
                i2 = view3 != null ? 1 : i4;
                if (i2 != 0 && view3.getVisibility() != 0) {
                    View view4 = jzVar.z;
                    view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? jzVar.k.getColor(R.color.abc_decor_view_status_guard_light) : jzVar.k.getColor(R.color.abc_decor_view_status_guard));
                }
                if (jzVar.C || i2 == 0) {
                    i3 = i5;
                    i = i4;
                } else {
                    i3 = i5;
                    d2 = i4;
                    i = d2;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                i = 0;
                marginLayoutParams.topMargin = 0;
                i2 = 0;
                i3 = 1;
            } else {
                i = 0;
                i3 = 0;
                i2 = 0;
            }
            if (i3 != 0) {
                jzVar.s.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = jzVar.z;
        if (view5 != null) {
            view5.setVisibility(1 == i2 ? i : 8);
        }
        if (d != d2) {
            int b2 = kxhVar.b();
            int c2 = kxhVar.c();
            int a2 = kxhVar.a();
            kww kwvVar = Build.VERSION.SDK_INT >= 34 ? new kwv(kxhVar) : Build.VERSION.SDK_INT >= 30 ? new kwu(kxhVar) : Build.VERSION.SDK_INT >= 29 ? new kwt(kxhVar) : new kws(kxhVar);
            kwvVar.c(kpt.d(b2, d2, c2, a2));
            kxhVar2 = kwvVar.a();
        } else {
            kxhVar2 = kxhVar;
        }
        return kvo.g(view, kxhVar2);
    }
}
