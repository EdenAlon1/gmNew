package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmux implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffjn c;

    public dmux(boolean z, hvi hviVar, ffjn ffjnVar) {
        this.a = z;
        this.b = hviVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Window a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1278290199);
            if (this.a) {
                ViewParent parent = ((View) hfdVar.e(AndroidCompositionLocals_androidKt.g)).getParent();
                kei keiVar = parent instanceof kei ? (kei) parent : null;
                if (keiVar != null && (a = keiVar.a()) != null) {
                    a.setDimAmount(1.0f);
                }
            }
            hfdVar.o();
            gpa.c(this.b, dwek.c(hfdVar), dwek.a(hfdVar), 0L, 6.0f, 0.0f, null, hpx.d(-419454138, new dmuw(this.c), hfdVar), hfdVar, 104);
        }
        return ffcu.a;
    }
}
