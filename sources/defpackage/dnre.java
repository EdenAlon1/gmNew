package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnre implements ffjn {
    final /* synthetic */ dnsh a;
    final /* synthetic */ iir b;
    final /* synthetic */ ffix c;

    public dnre(dnsh dnshVar, iir iirVar, ffix ffixVar) {
        this.a = dnshVar;
        this.b = iirVar;
        this.c = ffixVar;
    }

    public static final dnsh b(hkx hkxVar) {
        return (dnsh) hkxVar.a();
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(1811941631);
        hkx a = hku.a(this.a, hfdVar);
        hfdVar.v(1254474672);
        boolean D = hfdVar.D(a) | hfdVar.F(this.b) | hfdVar.D(this.c);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            dnrd dnrdVar = new dnrd(a, this.b, this.c);
            hfdVar.y(dnrdVar);
            f = dnrdVar;
        }
        dnsh dnshVar = this.a;
        hfdVar.o();
        hvi a2 = ilv.a(hviVar, dnshVar.a, (PointerInputEventHandler) f);
        hfdVar.o();
        return a2;
    }
}
