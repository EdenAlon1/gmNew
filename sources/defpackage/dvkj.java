package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvkj implements emwl {
    public abstract void a(exzb exzbVar, ewaf ewafVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exzb exzbVar = (exzb) obj;
        ewaf ewafVar = (ewaf) ewag.a.createBuilder();
        b(exzbVar, ewafVar);
        if ((exzbVar.b & 4) != 0) {
            int i = exzbVar.e;
            ewafVar.copyOnWrite();
            ewag ewagVar = (ewag) ewafVar.instance;
            ewagVar.b |= 2;
            ewagVar.d = i;
        }
        if ((exzbVar.b & 2) != 0) {
            boolean z = exzbVar.d;
            ewafVar.copyOnWrite();
            ewag ewagVar2 = (ewag) ewafVar.instance;
            ewagVar2.b |= 4;
            ewagVar2.e = z;
        }
        a(exzbVar, ewafVar);
        Iterator<E> it = exzbVar.g.iterator();
        while (it.hasNext()) {
            Object apply = dvmi.a.apply((exza) it.next());
            ewafVar.copyOnWrite();
            ewag ewagVar3 = (ewag) ewafVar.instance;
            apply.getClass();
            eygr eygrVar = ewagVar3.h;
            if (!eygrVar.c()) {
                ewagVar3.h = eyfy.mutableCopy(eygrVar);
            }
            ewagVar3.h.add(apply);
        }
        if ((exzbVar.b & 16) != 0) {
            emwd emwdVar = dvmi.c;
            exyt b = exyt.b(exzbVar.h);
            if (b == null) {
                b = exyt.DASHER_DEVICE_FILTER_UNSPECIFIED;
            }
            ewae ewaeVar = (ewae) emwdVar.fP(b);
            ewafVar.copyOnWrite();
            ewag ewagVar4 = (ewag) ewafVar.instance;
            ewagVar4.i = ewaeVar.c;
            ewagVar4.b |= 32;
        }
        return (ewag) ewafVar.build();
    }

    public abstract void b(exzb exzbVar, ewaf ewafVar);
}
