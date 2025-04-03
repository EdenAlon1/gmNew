package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkf implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evwl evwlVar = (evwl) evwm.a.createBuilder();
        Iterator<E> it = ((exwy) obj).b.iterator();
        while (it.hasNext()) {
            Object apply = dvme.a.apply((exxb) it.next());
            evwlVar.copyOnWrite();
            evwm evwmVar = (evwm) evwlVar.instance;
            apply.getClass();
            eygr eygrVar = evwmVar.b;
            if (!eygrVar.c()) {
                evwmVar.b = eyfy.mutableCopy(eygrVar);
            }
            evwmVar.b.add(apply);
        }
        return (evwm) evwlVar.build();
    }
}
