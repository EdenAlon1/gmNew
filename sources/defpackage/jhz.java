package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhz {
    public static final long a(int i, hfd hfdVar) {
        Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = kpp.a;
        return iby.c(resources.getColor(i, theme));
    }
}
