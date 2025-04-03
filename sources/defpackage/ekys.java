package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekys {
    public static boolean a(View view) {
        return b(view.getContext());
    }

    private static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof eg) {
            return !((eg) context).a().ai();
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }
}
