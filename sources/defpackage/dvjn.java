package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjn implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evyr evyrVar = (evyr) evys.b.createBuilder();
        Iterator<E> it = new eygk(((eybg) obj).c, eybg.a).iterator();
        while (it.hasNext()) {
            Object apply = dvld.a.apply((eybs) it.next());
            evyrVar.copyOnWrite();
            evys evysVar = (evys) evyrVar.instance;
            apply.getClass();
            eygi eygiVar = evysVar.c;
            if (!eygiVar.c()) {
                evysVar.c = eyfy.mutableCopy(eygiVar);
            }
            evysVar.c.h(((evsn) apply).a());
        }
        return (evys) evyrVar.build();
    }
}
