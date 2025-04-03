package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeih {
    private final dktn a;
    private final diod b;

    public eeih(dktn dktnVar, diod diodVar) {
        this.a = dktnVar;
        this.b = diodVar;
    }

    public final eeig a(eeno eenoVar, eeji eejiVar) {
        HashSet hashSet = new HashSet();
        Iterator it = emye.d(",").g((String) dinu.b.a()).iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        return new eeim(eenoVar, this.a, this.b, eejiVar, enip.o(hashSet));
    }
}
