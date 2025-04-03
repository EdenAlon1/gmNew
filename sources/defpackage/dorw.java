package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorw implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ hho b;

    public dorw(List list, hho hhoVar) {
        this.a = list;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(dmzz.cs, hfdVar), jii.a(R.string.top_app_bar_more, hfdVar), null, 0L, hfdVar, 0, 12);
            hfdVar.v(-95504471);
            List list = this.a;
            boolean booleanValue = ((Boolean) this.b.a()).booleanValue();
            hfdVar.v(-1665644206);
            final hho hhoVar = this.b;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dorv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dose.g(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dose.l(list, booleanValue, (ffix) f, hfdVar, 3072);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
