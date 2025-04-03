package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pny implements pnv {
    public static final pny a = new pny();

    private pny() {
    }

    @Override // defpackage.pnv
    public final pme a(Activity activity, pnq pnqVar) {
        activity.getClass();
        return new pme(new pgm(pnj.a.a().a(activity)), pnqVar.a(activity));
    }

    @Override // defpackage.pnv
    public final pme b(Context context, pnq pnqVar) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return a((Activity) context2, pnqVar);
            }
            if (context2 instanceof InputMethodService) {
                Object systemService = context.getSystemService("window");
                systemService.getClass();
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                defaultDisplay.getClass();
                Point a2 = pnt.a(defaultDisplay);
                return new pme(new Rect(0, 0, a2.x, a2.y), pnqVar.a(context));
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                Objects.toString(context);
                throw new IllegalArgumentException(context.toString().concat(" is not a UiContext"));
            }
            context2 = contextWrapper.getBaseContext();
            context2.getClass();
        }
        throw new IllegalArgumentException(a.i(context, "Context ", " is not a UiContext"));
    }

    @Override // defpackage.pnv
    public final pme c(WindowMetrics windowMetrics, float f) {
        throw new UnsupportedOperationException("translateWindowMetrics not available before API30");
    }
}
