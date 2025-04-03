package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eveb extends euzy {
    public final euzw a;
    public final List b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public eveb(euzw euzwVar, List list) {
        this.a = euzwVar;
        this.b = list;
    }

    @Override // defpackage.euzy
    public final fdxk a(final evbl evblVar) {
        String str = evblVar.a().a;
        fdxk fdxkVar = (fdxk) this.c.get(evblVar);
        if (fdxkVar != null) {
            return fdxkVar;
        }
        fdxk fdxkVar2 = (fdxk) this.d.get(str);
        if (fdxkVar2 == null) {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h(evez.a(new ffbr() { // from class: evea
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    return engw.s(new evdt(eveb.this.a), new evgi());
                }
            }));
            if (((euzm) this.a).g == null) {
                engrVar.h(new evec());
            } else {
                engrVar.h(new evdr());
                engrVar.h(evez.a(new ffbr() { // from class: evdw
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return engw.r(new evdj());
                    }
                }));
            }
            engrVar.h(new evdv());
            engrVar.h(evez.a(new ffbr() { // from class: evdx
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    return engw.s(new evgp(), new evgo());
                }
            }));
            engrVar.h(evez.a(new ffbr() { // from class: evdy
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    int i2 = engw.d;
                    engr engrVar2 = new engr();
                    Iterator it = eveb.this.b.iterator();
                    while (it.hasNext()) {
                        engrVar2.h(((evaa) it.next()).a());
                    }
                    return engrVar2.g();
                }
            }));
            fdxkVar2 = fdxr.c(new eveq(str, this.a), engrVar.g());
            fdxk fdxkVar3 = (fdxk) this.d.putIfAbsent(str, fdxkVar2);
            if (fdxkVar3 != null) {
                fdxkVar2 = fdxkVar3;
            }
        }
        fdxk d = fdxr.d(fdxkVar2, evez.a(new ffbr() { // from class: evdz
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return engw.r(new eved(evbl.this));
            }
        }));
        fdxk fdxkVar4 = (fdxk) this.c.putIfAbsent(evblVar, d);
        return fdxkVar4 != null ? fdxkVar4 : d;
    }
}
