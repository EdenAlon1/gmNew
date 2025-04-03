package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrc implements ffjm {
    final /* synthetic */ cvri a;

    public cvrc(cvri cvriVar) {
        this.a = cvriVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Optional optional = (Optional) this.a.i.b();
            hfdVar.v(-748059168);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                final ffji ffjiVar = new ffji() { // from class: cvqy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        return ((akey) obj3).a();
                    }
                };
                Function function = new Function() { // from class: cvqz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ffji.this.invoke(obj3);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                hfdVar.y(function);
                f = function;
            }
            Function m105m = afg$$ExternalSyntheticApiModelOutline0.m105m(f);
            hfdVar.o();
            cwoi.a(null, null, false, null, false, hpx.d(704378719, new cvrb(this.a, (akex) optional.map(m105m).orElse((((Boolean) this.a.k.a()).booleanValue() && this.a.d()) ? akex.b : akex.a)), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
