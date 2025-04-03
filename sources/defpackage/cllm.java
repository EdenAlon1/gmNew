package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllm extends cljs {
    @Override // defpackage.cljs
    public final void b(awyl awylVar, clrc clrcVar) {
        awwf awwfVar = awylVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awwf awwfVar2 = awylVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        clns a = clkl.a(awuiVar, awwfVar2.c);
        clrcVar.copyOnWrite();
        clrd clrdVar = (clrd) clrcVar.instance;
        clrd clrdVar2 = clrd.a;
        a.getClass();
        clrdVar.d = a;
        clrdVar.b |= 4;
    }

    @Override // defpackage.cljs
    public final void c(awyl awylVar, clrc clrcVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = awylVar.e;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        clrcVar.copyOnWrite();
        clrd clrdVar = (clrd) clrcVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clrd clrdVar2 = clrd.a;
        eydqVar2.getClass();
        clrdVar.c = eydqVar2;
        clrdVar.b |= 1;
    }

    @Override // defpackage.cljs
    public final void d(awyl awylVar, clrc clrcVar) {
        Stream map = Collection.EL.stream(awylVar.d).map(new Function() { // from class: clll
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cllk.b((awui) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        Iterable iterable = (Iterable) map.collect(endq.a);
        clrcVar.copyOnWrite();
        clrd clrdVar = (clrd) clrcVar.instance;
        clrd clrdVar2 = clrd.a;
        eygr eygrVar = clrdVar.e;
        if (!eygrVar.c()) {
            clrdVar.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clrdVar.e);
    }
}
