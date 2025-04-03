package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyd {
    public static Context a(Context context, boolean z) {
        if (fdql.m()) {
            return context;
        }
        return new ContextThemeWrapper(context, true != z ? R.style.LighterTheme_Light : R.style.LighterTheme_DayNight);
    }

    public static boolean b(Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    public static boolean c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (true != context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true)) {
            typedValue = null;
        }
        return (typedValue != null && typedValue.type == 18 && typedValue.data == 0) ? false : true;
    }
}
