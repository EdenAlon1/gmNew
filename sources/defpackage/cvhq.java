package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhq {
    private final int a;

    public cvhq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvhq) && this.a == ((cvhq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PairedWatchNode(connectionStatus=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "UNKNOWN" : "OFFLINE" : "ONLINE"));
        sb.append(")");
        return sb.toString();
    }

    public cvhq() {
        this(3);
    }
}
