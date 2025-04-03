package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbg {
    final Collection a;
    final int b;

    public ffbg(fdyw fdywVar) {
        fdywVar.getClass();
        if (fdywVar.b.size() < 10) {
            this.a = fdywVar.b;
        } else {
            this.a = new HashSet(fdywVar.b);
        }
        Iterator it = fdywVar.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((SocketAddress) it.next()).hashCode();
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffbg)) {
            return false;
        }
        ffbg ffbgVar = (ffbg) obj;
        if (ffbgVar.b == this.b && ffbgVar.a.size() == this.a.size()) {
            return ffbgVar.a.containsAll(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
