package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akyv extends emzi {
    final /* synthetic */ akyw a;

    public akyv(akyw akywVar) {
        this.a = akywVar;
    }

    @Override // defpackage.emzi
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int simCarrierId;
        int intValue = ((Integer) obj).intValue();
        akyw akywVar = this.a;
        ctwi h = akywVar.a.h(intValue);
        int[] E = h.E();
        String u = h.u();
        String q = h.q();
        eoqi eoqiVar = (eoqi) eoqk.a.createBuilder();
        int i = E[0];
        eoqiVar.copyOnWrite();
        eoqk eoqkVar = (eoqk) eoqiVar.instance;
        eoqkVar.b |= 1;
        eoqkVar.c = i;
        int i2 = E[1];
        eoqiVar.copyOnWrite();
        eoqk eoqkVar2 = (eoqk) eoqiVar.instance;
        eoqkVar2.b |= 2;
        eoqkVar2.d = i2;
        if (u == null) {
            u = "UNKNOWN";
        }
        eoqiVar.copyOnWrite();
        eoqk eoqkVar3 = (eoqk) eoqiVar.instance;
        eoqkVar3.b |= 4;
        eoqkVar3.e = u;
        if (q == null) {
            q = "UNKNOWN";
        }
        eoqiVar.copyOnWrite();
        eoqk eoqkVar4 = (eoqk) eoqiVar.instance;
        eoqkVar4.b |= 8;
        eoqkVar4.f = q;
        int i3 = true == (((atrq) akywVar.e.b()).a() ? ((Boolean) akywVar.d.i(intValue).map(new Function() { // from class: akyu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Boolean.valueOf(((cosz) obj2).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() : akywVar.b.t()) ? 2 : 1;
        eoqiVar.copyOnWrite();
        eoqk eoqkVar5 = (eoqk) eoqiVar.instance;
        eoqkVar5.g = i3 - 1;
        eoqkVar5.b |= 16;
        if (ctid.b) {
            simCarrierId = akywVar.c.getSimCarrierId();
            eoqiVar.copyOnWrite();
            eoqk eoqkVar6 = (eoqk) eoqiVar.instance;
            eoqkVar6.b |= 32;
            eoqkVar6.h = simCarrierId;
        }
        return (eoqk) eoqiVar.build();
    }
}
