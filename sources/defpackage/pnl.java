package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnl implements pnj {
    public static final pnl b = new pnl();

    private pnl() {
    }

    @Override // defpackage.pnj
    public final Rect a(Activity activity) {
        boolean isInMultiWindowMode;
        boolean isInMultiWindowMode2;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        boolean isInMultiWindowMode3;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            isInMultiWindowMode3 = activity.isInMultiWindowMode();
            if (isInMultiWindowMode3) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            Log.w(pni.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            int a = pno.a(activity);
            if (rect.bottom + a == point.y) {
                rect.bottom += a;
            } else if (rect.right + a == point.x) {
                rect.right += a;
            } else if (rect.left == a) {
                rect.left = 0;
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            isInMultiWindowMode2 = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode2) {
                defaultDisplay.getClass();
                DisplayCutout displayCutout = null;
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(new Object[0]);
                    Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(defaultDisplay, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (od$$ExternalSyntheticApiModelOutline0.m$1(obj2)) {
                        displayCutout = od$$ExternalSyntheticApiModelOutline0.m500m(obj2);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                        throw e2;
                    }
                    Log.w(pni.b, e2);
                }
                if (displayCutout != null) {
                    int i = rect.left;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (i == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int i2 = point.x - rect.right;
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (i2 == safeInsetRight) {
                        int i3 = rect.right;
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = i3 + safeInsetRight2;
                    }
                    int i4 = rect.top;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (i4 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int i5 = point.y - rect.bottom;
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (i5 == safeInsetBottom) {
                        int i6 = rect.bottom;
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = i6 + safeInsetBottom2;
                    }
                }
            }
        }
        return rect;
    }
}
