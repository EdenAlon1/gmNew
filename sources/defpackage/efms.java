package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efms {
    private int a = -1;

    public final int a(enhk enhkVar, int i, int i2, fajr fajrVar) {
        if ((fajrVar.c == 6 ? (fajw) fajrVar.d : fajw.a).g.size() != 0) {
            Iterator<E> it = (fajrVar.c == 6 ? (fajw) fajrVar.d : fajw.a).g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fajt fajtVar = (fajt) it.next();
                Iterator<E> it2 = fajtVar.b.iterator();
                while (it2.hasNext()) {
                    if (((Integer) it2.next()).intValue() == i2) {
                        fahc fahcVar = fajtVar.c;
                        if (fahcVar == null) {
                            fahcVar = fahc.a;
                        }
                        int a = fahb.a(fahcVar.b);
                        if (a == 0) {
                            a = 1;
                        }
                        int i3 = a - 2;
                        if (i3 == 2) {
                            fahc fahcVar2 = fajtVar.c;
                            if (fahcVar2 == null) {
                                fahcVar2 = fahc.a;
                            }
                            if (enhkVar.containsKey(fahcVar2.c)) {
                                fahc fahcVar3 = fajtVar.c;
                                if (fahcVar3 == null) {
                                    fahcVar3 = fahc.a;
                                }
                                this.a = ((Integer) enhkVar.get(fahcVar3.c)).intValue();
                            }
                        } else if (i3 == 3) {
                            this.a = i + 1;
                        }
                    }
                }
            }
        }
        return this.a;
    }
}
