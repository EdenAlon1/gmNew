package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssf implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ ffmj b;
    final /* synthetic */ List c;

    public dssf(hho hhoVar, ffmj ffmjVar, List list) {
        this.a = hhoVar;
        this.b = ffmjVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean booleanValue = ((Boolean) this.a.a()).booleanValue();
            hfdVar.v(232392576);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dssd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dssg.d(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwhw.b(booleanValue, (ffix) f, null, 0L, null, null, null, 0L, 0.0f, hpx.d(224003254, new dsse(this.b, this.c), hfdVar), hfdVar, 48, 48, 2044);
        }
        return ffcu.a;
    }
}
