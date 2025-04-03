package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fok {
    public static final String a(int i, hfd hfdVar) {
        hfdVar.e(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getResources();
        return foj.a(i, 0) ? resources.getString(R.string.navigation_menu) : foj.a(i, 1) ? resources.getString(R.string.close_drawer) : foj.a(i, 2) ? resources.getString(R.string.close_sheet) : foj.a(i, 3) ? resources.getString(R.string.default_error_message) : foj.a(i, 4) ? resources.getString(R.string.dropdown_menu) : foj.a(i, 5) ? resources.getString(R.string.range_start) : foj.a(i, 6) ? resources.getString(R.string.range_end) : foj.a(i, 7) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }
}
