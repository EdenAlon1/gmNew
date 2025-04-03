package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljf extends cljh {
    @Override // defpackage.cljh
    public final void a(awtv awtvVar, clnh clnhVar) {
        awwf awwfVar = awtvVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awwf awwfVar2 = awtvVar.c;
        if (awwfVar2 == null) {
            awwfVar2 = awwf.a;
        }
        clns a = clkl.a(awuiVar, awwfVar2.c);
        clnhVar.copyOnWrite();
        clni clniVar = (clni) clnhVar.instance;
        clni clniVar2 = clni.a;
        a.getClass();
        clniVar.d = a;
        clniVar.b |= 4;
    }

    @Override // defpackage.cljh
    public final void b(awtv awtvVar, clnh clnhVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = awtvVar.e;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        clnhVar.copyOnWrite();
        clni clniVar = (clni) clnhVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clni clniVar2 = clni.a;
        eydqVar2.getClass();
        clniVar.c = eydqVar2;
        clniVar.b |= 1;
    }

    @Override // defpackage.cljh
    public final void c(awtv awtvVar, clnh clnhVar) {
        Stream map = Collection.EL.stream(awtvVar.d).map(new Function() { // from class: clje
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
        clnhVar.copyOnWrite();
        clni clniVar = (clni) clnhVar.instance;
        clni clniVar2 = clni.a;
        eygr eygrVar = clniVar.e;
        if (!eygrVar.c()) {
            clniVar.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clniVar.e);
    }
}
