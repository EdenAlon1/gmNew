package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwb {
    public static final Locale a(hfd hfdVar) {
        LocaleList locales;
        Locale locale;
        hfdVar.v(-1190822718);
        locales = ((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).getLocales();
        locale = locales.get(0);
        ((hfm) hfdVar).Z();
        return locale;
    }
}
