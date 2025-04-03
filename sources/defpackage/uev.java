package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uev extends ufp {
    private final String a;

    public uev(String str) {
        this.a = str;
    }

    @Override // defpackage.appw
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufp) {
            return this.a.equals(((ufp) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LocationTextContent{text=" + this.a + "}";
    }
}
