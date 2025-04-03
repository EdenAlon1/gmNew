package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqd implements ffjm {
    final /* synthetic */ wqj a;

    public wqd(wqj wqjVar) {
        this.a = wqjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Optional optional = (Optional) this.a.k.b();
            hfdVar.v(-1158473323);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                final ffji ffjiVar = new ffji() { // from class: wpy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        return ((akey) obj3).a();
                    }
                };
                Function function = new Function() { // from class: wpz
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
            akex akexVar = (akex) optional.map(m105m).orElse(akex.a);
            boolean booleanValue = ((Boolean) hkt.b(this.a.a().b.q, false, null, hfdVar, 2).a()).booleanValue();
            wqj wqjVar = this.a;
            hil[] hilVarArr = new hil[7];
            hik hikVar = dnae.a;
            Object b = wqjVar.c.b();
            b.getClass();
            hilVarArr[0] = hikVar.c(b);
            hilVarArr[1] = aaof.a.c(this.a.a().p);
            hilVarArr[2] = abem.a.c(this.a.a().o);
            hilVarArr[3] = axoy.a.c(((axoz) this.a.h.b()).a);
            hik hikVar2 = akfa.a;
            akexVar.getClass();
            hilVarArr[4] = hikVar2.c(akexVar);
            hilVarArr[5] = dsmp.a.c((((atbq) this.a.B.b()).a() || ((aufr) this.a.C.b()).a()) ? (dsma) this.a.y.b() : null);
            hilVarArr[6] = dltl.a.c(this.a.a().q);
            hfz.b(hilVarArr, hpx.d(-1653874800, new wqc(this.a, booleanValue), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
