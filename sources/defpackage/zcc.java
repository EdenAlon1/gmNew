package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zcc implements ffjm {
    public static final zcc a = new zcc();

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            eql eqlVar = zck.a;
            hvi e = eba.e(hveVar, 24.0f, 24.0f);
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, e);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            zdl.k(eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 8.0f, 7), jii.a(R.string.sample_incoming_message_text, hfdVar), false, hfdVar, 6, 12);
            zdl.k(null, jii.a(R.string.sample_outgoing_message_text, hfdVar), true, hfdVar, 3072, 5);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
