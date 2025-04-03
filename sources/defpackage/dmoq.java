package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoq implements ffjm {
    final /* synthetic */ dmog a;
    final /* synthetic */ dmov b;
    final /* synthetic */ hho c;

    public dmoq(dmog dmogVar, dmov dmovVar, hho hhoVar) {
        this.a = dmogVar;
        this.b = dmovVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmog dmogVar = this.a;
            Integer num = this.b.b;
            dmou.h(dmogVar.c, jii.b(R.string.compose_icon_sim_content_description, new Object[]{Integer.valueOf((num != null ? num.intValue() : 0) + 1), Integer.valueOf(this.b.a.size())}, hfdVar), eba.j(hvi.e, 0.0f, 0.0f, 0.0f, true != ((Boolean) dooy.b(hfdVar).i.invoke()).booleanValue() ? 0.0f : 8.0f, 7), hfdVar, 0);
            dmov dmovVar = this.b;
            boolean f = dmou.f(this.c);
            hfdVar.v(-1237383672);
            final hho hhoVar = this.c;
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffix() { // from class: dmop
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmou.c(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            dmou.d(dmovVar, f, (ffix) f2, hfdVar, 384);
        }
        return ffcu.a;
    }
}
