package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbk extends feao {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public ffbk(List list, AtomicInteger atomicInteger) {
        emxf.b(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((feao) it.next()).hashCode();
        }
        this.c = i;
    }

    @Override // defpackage.feao
    public final feak a(feal fealVar) {
        return ((feao) this.a.get((this.b.getAndIncrement() & Alert.DURATION_SHOW_INDEFINITELY) % this.a.size())).a(fealVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffbk)) {
            return false;
        }
        ffbk ffbkVar = (ffbk) obj;
        if (ffbkVar == this) {
            return true;
        }
        return this.c == ffbkVar.c && this.b == ffbkVar.b && this.a.size() == ffbkVar.a.size() && new HashSet(this.a).containsAll(ffbkVar.a);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        emwz a = emxa.a(ffbk.class);
        a.b("subchannelPickers", this.a);
        return a.toString();
    }
}
