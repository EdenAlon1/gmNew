package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efoj {
    public static iu a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new ehft(new ContextThemeWrapper(context, R.style.SurveyMaterialComponentsTheme), R.style.SurveyMaterialAlertDialogStyle) : new iu(context, R.style.SurveyAlertDialogTheme);
    }
}
