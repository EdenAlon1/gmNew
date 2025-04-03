package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopm implements ffjm {
    public static final dopm a = new dopm();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        ((Number) obj2).intValue();
        hfdVar.v(-422724762);
        Object systemService = ((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getSystemService("activity");
        systemService.getClass();
        doos c = doox.c(((ActivityManager) systemService).isLowRamDevice());
        hfdVar.o();
        return c;
    }
}
