package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferk {
    public List a;
    public int b = 0;
    private final boolean c;

    public ferk(List list, boolean z) {
        this.c = z;
        d(list);
    }

    private static final List h(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((ferj) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((ferj) list2.get(i));
            }
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final SocketAddress b() {
        if (f()) {
            return ((ferj) this.a.get(this.b)).b;
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void c() {
        this.b = 0;
    }

    public final void d(List list) {
        List list2;
        list.getClass();
        if (this.c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < ((enou) list).c; i++) {
                fdyw fdywVar = (fdyw) list.get(i);
                for (int i2 = 0; i2 < fdywVar.b.size(); i2++) {
                    SocketAddress socketAddress = (SocketAddress) fdywVar.b.get(i2);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = false;
                        }
                        arrayList.add(new ferj(fdywVar.c, socketAddress));
                    } else {
                        if (bool == null) {
                            bool = true;
                        }
                        arrayList2.add(new ferj(fdywVar.c, socketAddress));
                    }
                }
            }
            list2 = (bool == null || !bool.booleanValue()) ? h(arrayList, arrayList2) : h(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < ((enou) list).c; i3++) {
                fdyw fdywVar2 = (fdyw) list.get(i3);
                for (int i4 = 0; i4 < fdywVar2.b.size(); i4++) {
                    arrayList3.add(new ferj(fdywVar2.c, (SocketAddress) fdywVar2.b.get(i4)));
                }
            }
            list2 = arrayList3;
        }
        this.a = list2;
        c();
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        this.b++;
        return f();
    }

    public final boolean f() {
        return this.b < this.a.size();
    }

    public final boolean g(SocketAddress socketAddress) {
        socketAddress.getClass();
        for (int i = 0; i < this.a.size(); i++) {
            if (((ferj) this.a.get(i)).b.equals(socketAddress)) {
                this.b = i;
                return true;
            }
        }
        return false;
    }
}
