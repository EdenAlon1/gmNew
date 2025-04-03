package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyv implements ffjm {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;
    final /* synthetic */ dqyz d;

    public dqyv(ComposeView composeView, boolean z, ffix ffixVar, dqyz dqyzVar) {
        this.a = composeView;
        this.b = z;
        this.c = ffixVar;
        this.d = dqyzVar;
    }

    private static final boolean b(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1828468679);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfdVar.y(hicVar);
                f = hicVar;
            }
            hho hhoVar = (hho) f;
            hfdVar.o();
            Boolean valueOf = Boolean.valueOf(b(hhoVar));
            hfdVar.v(-1828466421);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new dqyr(hhoVar, null);
                hfdVar.y(f2);
            }
            hfdVar.o();
            hgs.g(valueOf, (ffjm) f2, hfdVar);
            cru.b(b(hhoVar), null, ctt.l(null, 3), ctt.m(null, 3), null, hpx.d(1604575383, new dqyu(this.a, this.b, this.c, this.d), hfdVar), hfdVar, 200064, 18);
        }
        return ffcu.a;
    }
}
