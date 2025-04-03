package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ zch b;
    final /* synthetic */ ffji c;

    public zdk(List list, zch zchVar, ffji ffjiVar) {
        this.a = list;
        this.b = zchVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((efx) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zch zchVar = intValue == 0 ? null : (zch) this.a.get(intValue - 1);
            boolean e = ffkj.e(this.b, zchVar);
            String a = jii.a(zchVar != null ? zchVar.c : R.string.default_theme, hfdVar);
            int i = intValue + 1;
            int size = this.a.size() + 1;
            hfdVar.v(-300708558);
            String b = jii.b(true != e ? R.string.unselected_theme_content_description : R.string.selected_theme_content_description, new Object[]{a, Integer.valueOf(i), Integer.valueOf(size)}, hfdVar);
            hfdVar.o();
            zdl.i(zchVar != null ? zchVar.b : null, hpx.d(1722176193, new zdj(intValue, b, e, zchVar, this.c), hfdVar), hfdVar, 48);
        }
        return ffcu.a;
    }
}
