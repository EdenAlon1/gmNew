package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpn {
    public static final cskc a = cskc.g("Bugle", "ThreadUtilizationLogger");
    public final ffbr b;
    private final ffbr c;
    private final errl d;

    public axpn(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    public final elfl a(final String str) {
        final dtpq dtpqVar = (dtpq) this.c.b();
        return elfl.g(erqt.m(new Callable() { // from class: dtpp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dtpq dtpqVar2 = dtpq.this;
                HashMap h = ennc.h(dtpqVar2.a.size());
                for (Map.Entry entry : dtpqVar2.a.entrySet()) {
                    h.put(((dtpg) entry.getKey()).c(), ((dtpn) entry.getValue()).a());
                }
                return h.values();
            }
        }, dtpqVar.b)).h(new emwl() { // from class: axpm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Collection<dtpl> collection = (Collection) obj;
                cskc cskcVar = axpn.a;
                String str2 = str;
                cskcVar.m("takeSnapshot at ".concat(str2));
                if (collection.isEmpty()) {
                    return null;
                }
                akxl akxlVar = (akxl) axpn.this.b.b();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.THREAD_UTILIZATION;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eqkc eqkcVar = (eqkc) eqkd.a.createBuilder();
                eqkcVar.copyOnWrite();
                eqkd eqkdVar = (eqkd) eqkcVar.instance;
                eqkdVar.b |= 1;
                eqkdVar.c = str2;
                eqkcVar.copyOnWrite();
                eqkd eqkdVar2 = (eqkd) eqkcVar.instance;
                eqkdVar2.d = 1;
                eqkdVar2.b |= 2;
                for (dtpl dtplVar : collection) {
                    axpn.a.m("ThreadPoolStatsSnapshot(" + eqkf.a() + ") at " + str2 + ": " + String.valueOf(dtplVar));
                    eqka eqkaVar = (eqka) eqkb.a.createBuilder();
                    String str3 = dtplVar.a;
                    eqkaVar.copyOnWrite();
                    eqkb eqkbVar = (eqkb) eqkaVar.instance;
                    eqkbVar.b = eqkbVar.b | 1;
                    eqkbVar.c = str3;
                    dtoz dtozVar = (dtoz) dtplVar.a();
                    long millis = TimeUnit.NANOSECONDS.toMillis(dtozVar.b);
                    eqkaVar.copyOnWrite();
                    eqkb eqkbVar2 = (eqkb) eqkaVar.instance;
                    eqkbVar2.b |= 2;
                    eqkbVar2.d = millis;
                    long j = dtozVar.a;
                    long j2 = dtozVar.b + j;
                    int g = j2 == 0 ? 0 : ermn.g((j * 100) / j2);
                    eqkaVar.copyOnWrite();
                    eqkb eqkbVar3 = (eqkb) eqkaVar.instance;
                    eqkbVar3.b |= 4;
                    eqkbVar3.e = g;
                    axpn.a.m("ThreadPoolStats(" + eqkf.a() + ") at " + str2 + ": " + String.valueOf(eqkaVar.build()));
                    eqkb eqkbVar4 = (eqkb) eqkaVar.build();
                    eqkcVar.copyOnWrite();
                    eqkd eqkdVar3 = (eqkd) eqkcVar.instance;
                    eqkbVar4.getClass();
                    eygr eygrVar = eqkdVar3.e;
                    if (!eygrVar.c()) {
                        eqkdVar3.e = eyfy.mutableCopy(eygrVar);
                    }
                    eqkdVar3.e.add(eqkbVar4);
                }
                axpn.a.m("ThreadUtilization(" + eqkf.a() + ") at " + str2 + ": " + String.valueOf(eqkcVar.build()));
                eqkd eqkdVar4 = (eqkd) eqkcVar.build();
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eqkdVar4.getClass();
                eolvVar2.bD = eqkdVar4;
                eolvVar2.g = eolvVar2.g | 64;
                akxlVar.j(eoluVar);
                return null;
            }
        }, this.d);
    }
}
