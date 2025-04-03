package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmuh implements ffjn {
    final /* synthetic */ doas a;
    final /* synthetic */ doas b;
    final /* synthetic */ ffjm c;

    public dmuh(doas doasVar, doas doasVar2, ffjm ffjmVar) {
        this.a = doasVar;
        this.b = doasVar2;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(jii.a(R.string.time_picker_dialog_title, hfdVar), eba.j(hvi.e, 24.0f, 0.0f, 24.0f, 20.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65532);
            hvi j = eba.j(hvi.e, 24.0f, 0.0f, 24.0f, 0.0f, 10);
            ffjm ffjmVar = this.c;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, j);
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
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
            dmuy.b(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
