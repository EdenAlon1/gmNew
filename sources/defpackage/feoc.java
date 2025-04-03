package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feoc {
    public List a;
    public int b;
    public int c;

    public feoc(List list) {
        this.a = list;
    }

    public final fdxd a() {
        return ((fdyw) this.a.get(this.b)).c;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((fdyw) this.a.get(this.b)).b.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}
