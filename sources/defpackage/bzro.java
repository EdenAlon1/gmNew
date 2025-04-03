package defpackage;

import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzro implements cheg {
    private final bzrn a;

    public bzro(bzrn bzrnVar) {
        this.a = bzrnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cheg
    public final void a(engw engwVar, final String str) {
        engwVar.getClass();
        str.getClass();
        bqzs a = bqzv.a();
        a.z("getLookupKeys");
        a.f(new Function() { // from class: bzrp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqzu bqzuVar = (bqzu) obj;
                bqzuVar.aq(new dtrt("contacts.phone_number", 1, str));
                return bqzuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = a.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            bqwx bqwxVar = (bqwx) it.next();
            bqwxVar.az(2, "lookup_key");
            arrayList.add(bqwxVar.c);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : engwVar) {
            if (!((eyee) obj).H()) {
                arrayList2.add(obj);
            }
        }
        bzrn bzrnVar = this.a;
        bzsf bzsfVar = (bzsf) bzsg.a.createBuilder();
        bzsfVar.getClass();
        DesugarCollections.unmodifiableList(((bzsg) bzsfVar.instance).b).getClass();
        bzsfVar.copyOnWrite();
        bzsg bzsgVar = (bzsg) bzsfVar.instance;
        eygr eygrVar = bzsgVar.b;
        if (!eygrVar.c()) {
            bzsgVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(arrayList2, bzsgVar.b);
        bzsfVar.copyOnWrite();
        bzsg bzsgVar2 = (bzsg) bzsfVar.instance;
        bzsgVar2.c = str;
        DesugarCollections.unmodifiableList(bzsgVar2.d).getClass();
        bzsfVar.copyOnWrite();
        bzsg bzsgVar3 = (bzsg) bzsfVar.instance;
        eygr eygrVar2 = bzsgVar3.d;
        if (!eygrVar2.c()) {
            bzsgVar3.d = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(arrayList, bzsgVar3.d);
        eyfy build = bzsfVar.build();
        build.getClass();
        bzrnVar.a((bzsg) build);
    }
}
