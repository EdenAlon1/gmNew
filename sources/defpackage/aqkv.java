package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkv {
    public final String a;

    public aqkv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqkv) {
            return this.a.equals(((aqkv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
