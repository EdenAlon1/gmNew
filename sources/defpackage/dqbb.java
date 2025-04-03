package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbb implements ffjn {
    final /* synthetic */ hkx a;

    public dqbb(hkx hkxVar) {
        this.a = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            grl.b(jii.b(R.string.done_button_with_number_items_selected, new Object[]{Integer.valueOf(dqbw.b(this.a).size())}, hfdVar), null, 0L, kal.c(14), null, null, null, 0L, null, kal.c(20), 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).m, gft.a(hfdVar).p, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hfdVar, 3072, 6, 64502);
        }
        return ffcu.a;
    }
}
