package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uej extends ufb {
    private final String a;

    public uej(String str) {
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
        if (obj instanceof ufb) {
            return this.a.equals(((ufb) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ContactTextContent{text=" + this.a + "}";
    }
}
