package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dskj {
    public static final int a(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().orientation;
    }

    public static final Activity b(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            Objects.toString(context);
            throw new IllegalStateException("Couldn't find an Activity from ".concat(context.toString()));
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return b(baseContext);
    }

    public static final Point c(Context context) {
        Point point = new Point();
        d(context).getSize(point);
        return point;
    }

    public static final Display d(Context context) {
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    public static final boolean e(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean f(Context context) {
        return a(context) == 1;
    }

    public static /* synthetic */ void g(Context context, int i) {
        String string = context.getString(i);
        string.getClass();
        Toast.makeText(context, string, 0).show();
    }
}
