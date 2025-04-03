package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmnz implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ dmof b;
    final /* synthetic */ boolean c;

    public dmnz(boolean z, dmof dmofVar, boolean z2) {
        this.a = z;
        this.b = dmofVar;
        this.c = z2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long f;
        long j;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dyh) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(1953569145);
            boolean z = this.a;
            hvi hviVar = hvi.e;
            if (z) {
                hviVar = eau.c(hvi.e, 1.0f, 0.0f, 2);
            }
            if (this.b.e != null) {
                hviVar = hviVar.a(eau.c(hvi.e, 0.0f, -4.0f, 1));
            }
            if (this.b.a.ordinal() != 55) {
                hviVar = hviVar.a(dmzy.a(hvi.e, (kah) hfdVar.e(jdr.j)));
            }
            hvi hviVar2 = hviVar;
            hfdVar.o();
            igq a = dnaa.a(this.b.a, hfdVar);
            dmof dmofVar = this.b;
            hfdVar.v(1953575198);
            String str = dmofVar.d;
            if (str == null) {
                str = jii.a(R.string.compose_icon_send_content_description, hfdVar);
            }
            String str2 = str;
            hfdVar.o();
            if (this.b.f) {
                hfdVar.v(431428589);
                if (this.c) {
                    hfdVar.v(431464704);
                    f = gft.a(hfdVar).b;
                    hfdVar.o();
                } else {
                    hfdVar.v(431531106);
                    f = gft.a(hfdVar).a;
                    hfdVar.o();
                }
                hfdVar.o();
            } else {
                hfdVar.v(431612109);
                if (this.c) {
                    hfdVar.v(431646705);
                    f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.38f, ibw.f(gft.a(hfdVar).b));
                    hfdVar.o();
                } else {
                    hfdVar.v(431759793);
                    f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.38f, ibw.f(gft.a(hfdVar).q));
                    hfdVar.o();
                }
                hfdVar.o();
            }
            dmmi.c(a, str2, hviVar2, f, hfdVar, 0, 0);
            String str3 = this.b.e;
            if (str3 != null) {
                boolean z2 = this.a;
                boolean z3 = this.c;
                hvi c = eau.c(hvi.e, 0.0f, 10.0f, 1);
                if (z2) {
                    c = c.a(eau.c(hvi.e, 1.0f, 0.0f, 2));
                }
                jpo jpoVar = dooy.d(hfdVar).e;
                if (z3) {
                    hfdVar.v(1583525601);
                    j = gft.a(hfdVar).b;
                    hfdVar.o();
                } else {
                    hfdVar.v(1583592003);
                    j = gft.a(hfdVar).a;
                    hfdVar.o();
                }
                dolc.a(str3, c, j, null, 0, 0, jpoVar, hfdVar, 0, 56);
            }
        }
        return ffcu.a;
    }
}
