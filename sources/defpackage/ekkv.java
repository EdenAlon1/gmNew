package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkv {
    public static Context a(View view) {
        if (view.getParent() instanceof View) {
            return c(((View) view.getParent()).getContext(), fbal.a.class, Activity.class);
        }
        return null;
    }

    public static boolean b(Context context) {
        Context c = c(context, fbal.a.class);
        if (c instanceof fbal.a) {
            fbal.a aVar = (fbal.a) c;
            if (aVar.a != null && aVar.a().s) {
                return true;
            }
        }
        return false;
    }

    private static Context c(Context context, Class... clsArr) {
        loop0: while (context instanceof ContextWrapper) {
            for (Class cls : clsArr) {
                if (cls.isInstance(context)) {
                    break loop0;
                }
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
