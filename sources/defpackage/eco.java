package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eco extends ffkk implements ffjn {
    public eco() {
        super(3);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(359872873);
        WeakHashMap weakHashMap = ech.a;
        ech b = ecg.b(hfdVar);
        boolean D = hfdVar.D(b);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new eak(b.d);
            hfdVar.y(f);
        }
        eak eakVar = (eak) f;
        hfdVar.o();
        return eakVar;
    }
}
