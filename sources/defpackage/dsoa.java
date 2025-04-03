package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsoa implements ViewTreeObserver.OnGlobalLayoutListener, View.OnApplyWindowInsetsListener {
    public static final enru a = enru.c("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener");
    public final Activity b;
    public final View c;
    public final int d;
    public final Rect e;
    public int f;
    public int g;
    public dsmn h;
    private final dqkk i;
    private final Map j;

    public dsoa(Activity activity, dqkk dqkkVar, View view) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.minimum_keyboard_height);
        this.b = activity;
        this.i = dqkkVar;
        this.c = view;
        this.d = dimensionPixelSize;
        this.e = new Rect();
        this.j = new LinkedHashMap();
    }

    public final dsnx a() {
        Integer valueOf = Integer.valueOf(this.c.getResources().getConfiguration().orientation);
        Map map = this.j;
        Object obj = map.get(valueOf);
        if (obj == null) {
            dsnx dsnxVar = new dsnx(this.d);
            map.put(valueOf, dsnxVar);
            obj = dsnxVar;
        }
        return (dsnx) obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, final WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        return (WindowInsets) this.i.g("KeyboardLayoutListener#onApplyWindowInsets", new ffix() { // from class: dsnz
            @Override // defpackage.ffix
            public final Object invoke() {
                dsmn dsmnVar;
                enrr enrrVar = (enrr) dsoa.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener", "onApplyWindowInsets$lambda$2", 127, "KeyboardLayoutListener.kt");
                WindowInsets windowInsets2 = windowInsets;
                enrrVar.r("onApplyWindowInsets: System window bottom inset is now %d", windowInsets2.getSystemWindowInsetBottom());
                int systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom();
                dsoa dsoaVar = this;
                int i = dsoaVar.d;
                if (systemWindowInsetBottom > i) {
                    dsmn dsmnVar2 = dsoaVar.h;
                    if (dsmnVar2 != null) {
                        dsmnVar2.m(dsmm.a);
                        return windowInsets2;
                    }
                } else if (dsoaVar.f < i && (dsmnVar = dsoaVar.h) != null) {
                    dsmnVar.m(dsmm.d);
                }
                return windowInsets2;
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.i.g("KeyboardLayoutListener#onGlobalLayout", new ffix() { // from class: dsny
            @Override // defpackage.ffix
            public final Object invoke() {
                boolean isInMultiWindowMode;
                dsmn dsmnVar;
                int dimensionPixelSize;
                int statusBars;
                Insets insets;
                dsoa dsoaVar = dsoa.this;
                int i = dsoaVar.c.getResources().getConfiguration().orientation;
                if (i != dsoaVar.g) {
                    dsoaVar.e.set(0, 0, 0, 0);
                }
                dsoaVar.g = i;
                Rect rect = dsoaVar.e;
                View view = dsoaVar.c;
                int height = rect.height();
                view.getWindowVisibleDisplayFrame(rect);
                int height2 = dsoaVar.e.height();
                ((enrr) dsoa.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener", "onGlobalLayout$lambda$0", 66, "KeyboardLayoutListener.kt")).u("onGlobalLayout: Height from %d to %d", height, height2);
                if (height != height2) {
                    dsnx a2 = dsoaVar.a();
                    int i2 = a2.b;
                    if (height2 > i2) {
                        a2.b = height2;
                        i2 = height2;
                    }
                    Integer valueOf = Integer.valueOf(i2 - height2);
                    if (valueOf.intValue() < a2.a) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : 0;
                    dsoaVar.f = intValue;
                    isInMultiWindowMode = dsoaVar.b.isInMultiWindowMode();
                    if (height == 0 && !isInMultiWindowMode) {
                        View view2 = dsoaVar.c;
                        Context context = view2.getContext();
                        context.getClass();
                        int i3 = dskj.c(context).y;
                        if (Build.VERSION.SDK_INT > 29) {
                            WindowInsets rootWindowInsets = view2.getRootWindowInsets();
                            statusBars = WindowInsets.Type.statusBars();
                            insets = rootWindowInsets.getInsets(statusBars);
                            dimensionPixelSize = insets.top;
                        } else {
                            Context context2 = view2.getContext();
                            context2.getClass();
                            int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                            dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0;
                        }
                        int i4 = i3 - dimensionPixelSize;
                        intValue = i4 - height2;
                        if (intValue >= dsoaVar.d) {
                            dsoaVar.a().b = i4;
                        }
                    }
                    boolean z = intValue >= dsoaVar.d;
                    dsmn dsmnVar2 = dsoaVar.h;
                    if (dsmnVar2 != null) {
                        dsmnVar2.m(z ? dsmm.a : dsmm.d);
                    }
                    if (z && (dsmnVar = dsoaVar.h) != null) {
                        dsmnVar.l(intValue);
                    }
                }
                return ffcu.a;
            }
        });
    }
}
