package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegd extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public fegd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fegd) && this.a == ((fegd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
