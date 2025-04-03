package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmi implements ffjp {
    public static final xmi a = new xmi();

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dspe dspeVar = (dspe) obj;
        hvi hviVar = (hvi) obj2;
        xqb xqbVar = (xqb) obj3;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        dspeVar.getClass();
        hviVar.getClass();
        xqbVar.getClass();
        View view = (View) hfdVar.e(AndroidCompositionLocals_androidKt.g);
        dsma dsmaVar = (dsma) hfdVar.e(dsmp.a);
        hfdVar.v(-1238990906);
        hvi j = eba.j(dspeVar.d(hviVar, hfdVar), 0.0f, 0.0f, 0.0f, 10.0f, 7);
        hfdVar.v(1302998044);
        dsma dsmaVar2 = (dsma) hfdVar.e(dsmp.a);
        boolean z = false;
        if (dsmaVar2 != null && dsly.b(dsmaVar2)) {
            z = true;
        }
        hfdVar.o();
        if (z) {
            hve hveVar = hvi.e;
            ffcu ffcuVar = ffcu.a;
            hfdVar.v(1838002473);
            boolean F = hfdVar.F(dsmaVar) | hfdVar.F(view);
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new xmh(dsmaVar, view);
                hfdVar.y(f);
            }
            hfdVar.o();
            j = j.a(ilv.a(hveVar, ffcuVar, (PointerInputEventHandler) f));
        }
        hfdVar.o();
        xnd.b(dspeVar, j, xqbVar, hfdVar, (intValue & 896) | (intValue & 14) | 512);
        return ffcu.a;
    }
}
