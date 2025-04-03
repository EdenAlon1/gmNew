package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajer implements ffjm {
    final /* synthetic */ ajev a;
    final /* synthetic */ Context b;

    public ajer(ajev ajevVar, Context context) {
        this.a = ajevVar;
        this.b = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            ajev ajevVar = this.a;
            Context context = this.b;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            ffbr ffbrVar = ajevVar.a;
            dys dysVar = dys.a;
            String s = ((cjdk) ffbrVar.b()).s();
            String string = context.getString(R.string.gemini_eea_tos_title, s);
            string.getClass();
            int Q = ffpc.Q(string, s, 0, false, 6);
            Integer valueOf2 = Integer.valueOf(Q);
            int length = Q + s.length();
            ffbr ffbrVar2 = ajevVar.a;
            Integer valueOf3 = Integer.valueOf(length);
            String i3 = ((cjdk) ffbrVar2.b()).i();
            String string2 = context.getString(R.string.penpal_sell_page_text);
            string2.getClass();
            List b2 = ffdx.b(new dnlz(string2, null, null, null, null, null, null, new ffix() { // from class: ajeq
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }, 126));
            dmfj a3 = ((ajaz) ajevVar.b.b()).a();
            dnzj.f(dysVar, new dnzm(string, valueOf2, valueOf3, null, null, i3, b2, ffdx.b(new dnyq(a3.a, a3.b)), new dnzl(true)), null, 3, null, ajep.a, hfdVar, 196614, 10);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
