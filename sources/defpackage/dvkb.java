package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkb extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evyl evylVar;
        evyn evynVar = (evyn) obj;
        eych eychVar = (eych) eycl.a.createBuilder();
        if ((evynVar.b & 1) != 0) {
            String str = evynVar.e;
            eychVar.copyOnWrite();
            eycl eyclVar = (eycl) eychVar.instance;
            str.getClass();
            eyclVar.b |= 1;
            eyclVar.e = str;
        }
        if (evynVar.c == 2 && evym.a(2) == 1) {
            String str2 = (String) evynVar.d;
            eychVar.copyOnWrite();
            eycl eyclVar2 = (eycl) eychVar.instance;
            str2.getClass();
            eyclVar2.c = 2;
            eyclVar2.d = str2;
        }
        if (evynVar.c == 4 && evym.a(4) == 2) {
            Integer num = (Integer) evynVar.d;
            num.intValue();
            eychVar.copyOnWrite();
            eycl eyclVar3 = (eycl) eychVar.instance;
            eyclVar3.c = 4;
            eyclVar3.d = num;
        }
        if (evynVar.c == 5 && evym.a(5) == 3) {
            Boolean bool = (Boolean) evynVar.d;
            bool.booleanValue();
            eychVar.copyOnWrite();
            eycl eyclVar4 = (eycl) eychVar.instance;
            eyclVar4.c = 5;
            eyclVar4.d = bool;
        }
        if (evynVar.c == 3 && evym.a(3) == 4) {
            emwd m = dvly.a.m();
            if (evynVar.c == 3) {
                evylVar = evyl.b(((Integer) evynVar.d).intValue());
                if (evylVar == null) {
                    evylVar = evyl.CLIENT_VALUE_UNKNOWN;
                }
            } else {
                evylVar = evyl.CLIENT_VALUE_UNKNOWN;
            }
            eycj eycjVar = (eycj) m.fP(evylVar);
            eychVar.copyOnWrite();
            eycl eyclVar5 = (eycl) eychVar.instance;
            eyclVar5.d = Integer.valueOf(eycjVar.c);
            eyclVar5.c = 3;
        }
        return (eycl) eychVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycl eyclVar = (eycl) obj;
        evyj evyjVar = (evyj) evyn.a.createBuilder();
        if ((eyclVar.b & 1) != 0) {
            String str = eyclVar.e;
            evyjVar.copyOnWrite();
            evyn evynVar = (evyn) evyjVar.instance;
            str.getClass();
            evynVar.b |= 1;
            evynVar.e = str;
        }
        if (eyclVar.c == 2 && eyck.a(2) == 3) {
            String str2 = (String) eyclVar.d;
            evyjVar.copyOnWrite();
            evyn evynVar2 = (evyn) evyjVar.instance;
            str2.getClass();
            evynVar2.c = 2;
            evynVar2.d = str2;
        }
        if (eyclVar.c == 4 && eyck.a(4) == 5) {
            Integer num = (Integer) eyclVar.d;
            num.intValue();
            evyjVar.copyOnWrite();
            evyn evynVar3 = (evyn) evyjVar.instance;
            evynVar3.c = 4;
            evynVar3.d = num;
        }
        if (eyclVar.c == 5 && eyck.a(5) == 6) {
            Boolean bool = (Boolean) eyclVar.d;
            bool.booleanValue();
            evyjVar.copyOnWrite();
            evyn evynVar4 = (evyn) evyjVar.instance;
            evynVar4.c = 5;
            evynVar4.d = bool;
        }
        if (eyclVar.c == 3 && eyck.a(3) == 4) {
            emwd emwdVar = dvly.a;
            eycj b = eycj.b(((Integer) eyclVar.d).intValue());
            if (b == null) {
                b = eycj.CLIENT_VALUE_UNKNOWN;
            }
            evyl evylVar = (evyl) emwdVar.fP(b);
            evyjVar.copyOnWrite();
            evyn evynVar5 = (evyn) evyjVar.instance;
            evynVar5.d = Integer.valueOf(evylVar.c);
            evynVar5.c = 3;
        }
        return (evyn) evyjVar.build();
    }
}
