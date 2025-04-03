package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkh implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exza exzaVar = (exza) obj;
        evzv evzvVar = (evzv) evzw.b.createBuilder();
        if ((exzaVar.c & 1) != 0) {
            fava favaVar = exzaVar.d;
            if (favaVar == null) {
                favaVar = fava.a;
            }
            evzvVar.copyOnWrite();
            evzw evzwVar = (evzw) evzvVar.instance;
            favaVar.getClass();
            evzwVar.d = favaVar;
            evzwVar.c |= 1;
        }
        if ((exzaVar.c & 2) != 0) {
            fava favaVar2 = exzaVar.e;
            if (favaVar2 == null) {
                favaVar2 = fava.a;
            }
            evzvVar.copyOnWrite();
            evzw evzwVar2 = (evzw) evzvVar.instance;
            favaVar2.getClass();
            evzwVar2.e = favaVar2;
            evzwVar2.c |= 2;
        }
        eygk eygkVar = new eygk(exzaVar.f, exza.a);
        evzvVar.copyOnWrite();
        evzw evzwVar3 = (evzw) evzvVar.instance;
        eygi eygiVar = evzwVar3.f;
        if (!eygiVar.c()) {
            evzwVar3.f = eyfy.mutableCopy(eygiVar);
        }
        Iterator<E> it = eygkVar.iterator();
        while (it.hasNext()) {
            evzwVar3.f.h(((faus) it.next()).a());
        }
        return (evzw) evzvVar.build();
    }
}
