package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqn implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    public ehqn(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        if (baseTransientBottomBar.j == null || (context = baseTransientBottomBar.i) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.a;
        ehqz ehqzVar = baseTransientBottomBar2.j;
        int height = rect.height();
        int[] iArr = new int[2];
        ehqzVar.getLocationInWindow(iArr);
        int height2 = height - (iArr[1] + baseTransientBottomBar2.j.getHeight());
        int translationY = (int) this.a.j.getTranslationY();
        BaseTransientBottomBar baseTransientBottomBar3 = this.a;
        int i = height2 + translationY;
        int i2 = baseTransientBottomBar3.p;
        if (i >= i2) {
            baseTransientBottomBar3.q = i2;
            return;
        }
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.j.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(BaseTransientBottomBar.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar4 = this.a;
        baseTransientBottomBar4.q = baseTransientBottomBar4.p;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.a.p - i;
        this.a.j.requestLayout();
    }
}
