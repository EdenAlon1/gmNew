package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxl implements ffjm {
    final /* synthetic */ czxn a;
    final /* synthetic */ ffix b;

    public czxl(czxn czxnVar, ffix ffixVar) {
        this.a = czxnVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final jlm b = czxm.b(this.a, false, hfdVar, 2);
            jpo y = jpo.y(gft.d(hfdVar).l, gft.a(hfdVar).s, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            hvi f = eba.f(hvi.e, 16.0f, 10.0f, 44.0f, 10.0f);
            if (crnx.j((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b))) {
                hfdVar.v(-1507577526);
                dwfj.e(this.b, null, false, null, null, new ebd(), hpx.d(1548711918, new czxk(b, f, y), hfdVar), hfdVar, 817889280, 382);
                hfdVar.o();
            } else {
                hfdVar.v(-1507377390);
                hfdVar.v(1198305202);
                boolean D = hfdVar.D(b) | hfdVar.D(this.b);
                final ffix ffixVar = this.b;
                Object f2 = hfdVar.f();
                if (D || f2 == hfc.a) {
                    f2 = new ffji() { // from class: czxj
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            int intValue = ((Integer) obj3).intValue();
                            if (((jlk) ffdx.M(jlm.this.e(VCardConstants.PROPERTY_URL, intValue, intValue))) != null) {
                                ffixVar.invoke();
                            }
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f2);
                }
                hfdVar.o();
                esg.a(b, f, y, false, 0, 0, null, (ffji) f2, hfdVar, 0, 120);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
