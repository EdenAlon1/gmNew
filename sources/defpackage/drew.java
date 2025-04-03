package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drew extends drfa {
    public static final drev a = new drev();
    private final String b;

    public drew(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drew) && ffkj.e(this.b, ((drew) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TENOR|".concat(this.b);
    }
}
