package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtjv implements ffjm {
    final /* synthetic */ int a;

    public dtjv(int i) {
        this.a = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-343189303);
            int i = this.a;
            jlj jljVar = new jlj((byte[]) null);
            jljVar.f(jii.a(R.string.noise_cancellation, hfdVar));
            jljVar.f(" ");
            hfdVar.v(-343185502);
            int a = jljVar.a(new jou(0L, 0L, jsy.h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                jljVar.f(jii.a(i, hfdVar));
                jljVar.h(a);
                hfdVar.o();
                jlm b = jljVar.b();
                hfdVar.o();
                grl.c(b, null, gft.a(hfdVar).o, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, gft.d(hfdVar).l, hfdVar, 0, 0, 131066);
            } catch (Throwable th) {
                jljVar.h(a);
                throw th;
            }
        }
        return ffcu.a;
    }
}
