package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtv {
    private final ffbr a;
    private final ffbr b;

    public adtv(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Iterable, java.lang.Object] */
    public final void a(int i, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        if (!((alwa) this.b.b()).b()) {
            ((alwa) this.b.b()).a();
            return;
        }
        eoip eoipVar = (eoip) eoiq.a.createBuilder();
        eoipVar.copyOnWrite();
        eoiq eoiqVar = (eoiq) eoipVar.instance;
        eoiqVar.d = i - 1;
        eoiqVar.b |= 2;
        optional.isPresent();
        Object obj = optional.get();
        eoipVar.copyOnWrite();
        eoiq eoiqVar2 = (eoiq) eoipVar.instance;
        eoiqVar2.c = ((eoio) obj).k;
        eoiqVar2.b |= 1;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            eoipVar.copyOnWrite();
            eoiq eoiqVar3 = (eoiq) eoipVar.instance;
            eoiqVar3.e = ((eoik) obj2).m;
            eoiqVar3.b |= 4;
        }
        if (optional3.isPresent()) {
            ?? r3 = optional3.get();
            eoipVar.copyOnWrite();
            eoiq eoiqVar4 = (eoiq) eoipVar.instance;
            eygi eygiVar = eoiqVar4.f;
            if (!eygiVar.c()) {
                eoiqVar4.f = eyfy.mutableCopy(eygiVar);
            }
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                eoiqVar4.f.h(((eoih) it.next()).g);
            }
        }
        if (optional4.isPresent()) {
            Object obj3 = optional4.get();
            eoipVar.copyOnWrite();
            eoiq eoiqVar5 = (eoiq) eoipVar.instance;
            eoiqVar5.g = ((eoim) obj3).e;
            eoiqVar5.b |= 8;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_ADVANCED_FEEDBACK_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eoiq eoiqVar6 = (eoiq) eoipVar.build();
        eoiqVar6.getClass();
        eolvVar2.am = eoiqVar6;
        eolvVar2.d |= 32;
        ((akxl) this.a.b()).j(eoluVar);
    }
}
