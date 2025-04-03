package defpackage;

import androidx.compose.foundation.gestures.ScrollableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exg extends ffkk implements ffjn {
    final /* synthetic */ exk a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exg(exk exkVar, boolean z, dwn dwnVar) {
        super(3);
        this.a = exkVar;
        this.b = z;
        this.c = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(805428266);
        boolean z = this.a.c() == dqs.a || hfdVar.e(jdr.j) != kah.b;
        boolean D = hfdVar.D(this.a);
        exk exkVar = this.a;
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new exc(exkVar);
            hfdVar.y(f);
        }
        hkx a = hku.a((ffji) f, hfdVar);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            Object dneVar = new dne(new dsh(a));
            hfdVar.y(dneVar);
            f2 = dneVar;
        }
        dsg dsgVar = (dsg) f2;
        boolean D2 = hfdVar.D(dsgVar) | hfdVar.D(this.a);
        exk exkVar2 = this.a;
        Object f3 = hfdVar.f();
        if (D2 || f3 == hfc.a) {
            f3 = new exf(dsgVar, exkVar2);
            hfdVar.y(f3);
        }
        exf exfVar = (exf) f3;
        hve hveVar = hvi.e;
        ScrollableElement scrollableElement = new ScrollableElement(exfVar, this.a.c(), this.b && this.a.a() != 0.0f, z, this.c);
        hfdVar.o();
        return scrollableElement;
    }
}
