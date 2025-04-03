package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exb extends ffkk implements ffjn {
    final /* synthetic */ ffji a;
    final /* synthetic */ dwn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exb(ffji ffjiVar, dwn dwnVar) {
        super(3);
        this.a = ffjiVar;
        this.b = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-102778667);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        ffsk ffskVar = (ffsk) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            hic hicVar = new hic(null, hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        hkx a = hku.a(this.a, hfdVar);
        dwn dwnVar = this.b;
        boolean D = hfdVar.D(dwnVar);
        dwn dwnVar2 = this.b;
        Object f3 = hfdVar.f();
        if (D || f3 == hfc.a) {
            f3 = new ewv(hhoVar, dwnVar2);
            hfdVar.y(f3);
        }
        hgs.c(dwnVar, (ffji) f3, hfdVar);
        dwn dwnVar3 = this.b;
        hve hveVar = hvi.e;
        boolean F = hfdVar.F(ffskVar) | hfdVar.D(this.b) | hfdVar.D(a);
        dwn dwnVar4 = this.b;
        Object f4 = hfdVar.f();
        if (F || f4 == hfc.a) {
            f4 = new exa(ffskVar, hhoVar, dwnVar4, a);
            hfdVar.y(f4);
        }
        hvi a2 = ilv.a(hveVar, dwnVar3, (PointerInputEventHandler) f4);
        hfdVar.o();
        return a2;
    }
}
