package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajes implements ffjm {
    final /* synthetic */ ajev a;

    public ajes(ajev ajevVar) {
        this.a = ajevVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
            hfz.a(dojg.a.c(new ibw(iby.c(context.getColor(R.color.google_default_color_background)))), hpx.d(117602897, new ajer(this.a, context), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
