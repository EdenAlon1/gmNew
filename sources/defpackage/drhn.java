package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhn implements ffjn {
    final /* synthetic */ drht a;

    public drhn(drht drhtVar) {
        this.a = drhtVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String string = ((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(true != this.a.b() ? R.string.magic_compose_dismiss_error_button_text : R.string.magic_compose_retry_error_button_text);
            string.getClass();
            dwjt.b(string, null, gft.a(hfdVar).b, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65018);
        }
        return ffcu.a;
    }
}
