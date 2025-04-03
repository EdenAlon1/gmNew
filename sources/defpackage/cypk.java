package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypk implements ffjm {
    final /* synthetic */ String a;

    public cypk(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = this.a;
            Locale c = ctid.c((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b));
            c.getClass();
            String upperCase = str.toUpperCase(c);
            upperCase.getClass();
            grl.b(upperCase, null, gft.a(hfdVar).s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65530);
        }
        return ffcu.a;
    }
}
