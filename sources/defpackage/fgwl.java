package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwl implements Serializable {
    private static final long serialVersionUID = -1913059830016450169L;
    public final List a;

    public fgwl() {
        this(false);
    }

    public final void a(fgvi fgviVar) {
        this.a.remove(fgviVar);
    }

    public final void b(fgvi fgviVar) {
        String str = fgviVar.a;
        fgwl fgwlVar = new fgwl();
        for (fgvi fgviVar2 : this.a) {
            if (fgviVar2.a.equalsIgnoreCase(str)) {
                fgwlVar.c(fgviVar2);
            }
        }
        Iterator it = fgwlVar.a.iterator();
        while (it.hasNext()) {
            a((fgvi) it.next());
        }
        c(fgviVar);
    }

    public final void c(fgvi fgviVar) {
        if (fgviVar == null) {
            throw new IllegalArgumentException("Trying to add null Parameter");
        }
        this.a.add(fgviVar);
    }

    public final boolean equals(Object obj) {
        return obj instanceof fgwl ? fhox.a(this.a, ((fgwl) obj).a) : super.equals(obj);
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.a);
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(';');
            stringBuffer.append(it.next().toString());
        }
        return stringBuffer.toString();
    }

    public fgwl(boolean z) {
        if (z) {
            this.a = DesugarCollections.unmodifiableList(new ArrayList());
        } else {
            this.a = new CopyOnWriteArrayList();
        }
    }
}
