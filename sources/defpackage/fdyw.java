package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyw {
    public static final fdxc a = new fdxc("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final fdxd c;
    private final int d;

    public fdyw(SocketAddress socketAddress) {
        this(socketAddress, fdxd.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdyw)) {
            return false;
        }
        fdyw fdywVar = (fdyw) obj;
        if (this.b.size() != fdywVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(fdywVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(fdywVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        fdxd fdxdVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + fdxdVar.toString() + "]";
    }

    public fdyw(SocketAddress socketAddress, fdxd fdxdVar) {
        this(Collections.singletonList(socketAddress), fdxdVar);
    }

    public fdyw(List list, fdxd fdxdVar) {
        emxf.b(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = unmodifiableList;
        fdxdVar.getClass();
        this.c = fdxdVar;
        this.d = unmodifiableList.hashCode();
    }
}
