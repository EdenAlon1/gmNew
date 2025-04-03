package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwu {
    public static final void a(eplb eplbVar, Duration duration, Optional optional, Optional optional2, int i, int i2, Optional optional3, ffbr ffbrVar, List list) {
        int i3 = optional3.isPresent() ? true != ((Boolean) optional3.get()).booleanValue() ? 3 : 2 : 4;
        epkx epkxVar = (epkx) eplc.a.createBuilder();
        eyev a = eykj.a(duration);
        epkxVar.copyOnWrite();
        eplc eplcVar = (eplc) epkxVar.instance;
        a.getClass();
        eplcVar.g = a;
        eplcVar.b |= 8;
        int b = cptn.b(optional);
        epkxVar.copyOnWrite();
        eplc eplcVar2 = (eplc) epkxVar.instance;
        eplcVar2.d = b - 1;
        eplcVar2.b |= 2;
        int b2 = cptn.b(optional2);
        epkxVar.copyOnWrite();
        eplc eplcVar3 = (eplc) epkxVar.instance;
        eplcVar3.e = b2 - 1;
        eplcVar3.b |= 4;
        int b3 = cptn.b(Optional.of(Integer.valueOf(i)));
        epkxVar.copyOnWrite();
        eplc eplcVar4 = (eplc) epkxVar.instance;
        eplcVar4.j = b3 - 1;
        eplcVar4.b |= 64;
        int b4 = cptn.b(Optional.of(Integer.valueOf(i2)));
        epkxVar.copyOnWrite();
        eplc eplcVar5 = (eplc) epkxVar.instance;
        eplcVar5.k = b4 - 1;
        eplcVar5.b |= 128;
        epkxVar.copyOnWrite();
        eplc eplcVar6 = (eplc) epkxVar.instance;
        eplcVar6.c = eplbVar.g;
        eplcVar6.b |= 1;
        epkxVar.copyOnWrite();
        eplc eplcVar7 = (eplc) epkxVar.instance;
        eplcVar7.h = i3 - 1;
        eplcVar7.b |= 16;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            epkxVar.a((epld) it.next());
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eplc eplcVar8 = (eplc) epkxVar.build();
        eplcVar8.getClass();
        eolvVar2.at = eplcVar8;
        eolvVar2.d |= 16384;
        ((akxl) ffbrVar.b()).j(eoluVar);
    }
}
