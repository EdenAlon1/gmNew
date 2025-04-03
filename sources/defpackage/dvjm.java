package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjm extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvx evvxVar = (evvx) obj;
        eybn eybnVar = (eybn) eybq.a.createBuilder();
        if ((evvxVar.b & 1) != 0) {
            String str = evvxVar.c;
            eybnVar.copyOnWrite();
            eybq eybqVar = (eybq) eybnVar.instance;
            str.getClass();
            eybqVar.b |= 1;
            eybqVar.c = str;
        }
        if ((evvxVar.b & 2) != 0) {
            String str2 = evvxVar.d;
            eybnVar.copyOnWrite();
            eybq eybqVar2 = (eybq) eybnVar.instance;
            str2.getClass();
            eybqVar2.b |= 2;
            eybqVar2.d = str2;
        }
        if ((evvxVar.b & 4) != 0) {
            String str3 = evvxVar.e;
            eybnVar.copyOnWrite();
            eybq eybqVar3 = (eybq) eybnVar.instance;
            str3.getClass();
            eybqVar3.b |= 4;
            eybqVar3.e = str3;
        }
        if ((evvxVar.b & 8) != 0) {
            String str4 = evvxVar.f;
            eybnVar.copyOnWrite();
            eybq eybqVar4 = (eybq) eybnVar.instance;
            str4.getClass();
            eybqVar4.b |= 8;
            eybqVar4.f = str4;
        }
        if ((evvxVar.b & 16) != 0) {
            emwd m = dvlc.a.m();
            evvw b = evvw.b(evvxVar.g);
            if (b == null) {
                b = evvw.UNKNOWN;
            }
            eybp eybpVar = (eybp) m.fP(b);
            eybnVar.copyOnWrite();
            eybq eybqVar5 = (eybq) eybnVar.instance;
            eybqVar5.g = eybpVar.f;
            eybqVar5.b |= 16;
        }
        Iterator<E> it = evvxVar.h.iterator();
        while (it.hasNext()) {
            eycl eyclVar = (eycl) dvlc.b.m().fP((evyn) it.next());
            eybnVar.copyOnWrite();
            eybq eybqVar6 = (eybq) eybnVar.instance;
            eyclVar.getClass();
            eygr eygrVar = eybqVar6.h;
            if (!eygrVar.c()) {
                eybqVar6.h = eyfy.mutableCopy(eygrVar);
            }
            eybqVar6.h.add(eyclVar);
        }
        if ((evvxVar.b & 32) != 0) {
            int i = evvxVar.i;
            eybnVar.copyOnWrite();
            eybq eybqVar7 = (eybq) eybnVar.instance;
            eybqVar7.b |= 32;
            eybqVar7.i = i;
        }
        return (eybq) eybnVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eybq eybqVar = (eybq) obj;
        evvu evvuVar = (evvu) evvx.a.createBuilder();
        if ((eybqVar.b & 1) != 0) {
            String str = eybqVar.c;
            evvuVar.copyOnWrite();
            evvx evvxVar = (evvx) evvuVar.instance;
            str.getClass();
            evvxVar.b |= 1;
            evvxVar.c = str;
        }
        if ((eybqVar.b & 2) != 0) {
            String str2 = eybqVar.d;
            evvuVar.copyOnWrite();
            evvx evvxVar2 = (evvx) evvuVar.instance;
            str2.getClass();
            evvxVar2.b |= 2;
            evvxVar2.d = str2;
        }
        if ((eybqVar.b & 4) != 0) {
            String str3 = eybqVar.e;
            evvuVar.copyOnWrite();
            evvx evvxVar3 = (evvx) evvuVar.instance;
            str3.getClass();
            evvxVar3.b |= 4;
            evvxVar3.e = str3;
        }
        if ((eybqVar.b & 8) != 0) {
            String str4 = eybqVar.f;
            evvuVar.copyOnWrite();
            evvx evvxVar4 = (evvx) evvuVar.instance;
            str4.getClass();
            evvxVar4.b |= 8;
            evvxVar4.f = str4;
        }
        if ((eybqVar.b & 16) != 0) {
            emwd emwdVar = dvlc.a;
            eybp b = eybp.b(eybqVar.g);
            if (b == null) {
                b = eybp.UNKNOWN;
            }
            evvw evvwVar = (evvw) emwdVar.fP(b);
            evvuVar.copyOnWrite();
            evvx evvxVar5 = (evvx) evvuVar.instance;
            evvxVar5.g = evvwVar.f;
            evvxVar5.b |= 16;
        }
        Iterator<E> it = eybqVar.h.iterator();
        while (it.hasNext()) {
            evyn evynVar = (evyn) dvlc.b.fP((eycl) it.next());
            evvuVar.copyOnWrite();
            evvx evvxVar6 = (evvx) evvuVar.instance;
            evynVar.getClass();
            eygr eygrVar = evvxVar6.h;
            if (!eygrVar.c()) {
                evvxVar6.h = eyfy.mutableCopy(eygrVar);
            }
            evvxVar6.h.add(evynVar);
        }
        if ((eybqVar.b & 32) != 0) {
            int i = eybqVar.i;
            evvuVar.copyOnWrite();
            evvx evvxVar7 = (evvx) evvuVar.instance;
            evvxVar7.b |= 32;
            evvxVar7.i = i;
        }
        return (evvx) evvuVar.build();
    }
}
