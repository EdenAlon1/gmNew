package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drap {
    public final String a;
    public ffji b;

    public drap(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drap) && ffkj.e(this.a, ((drap) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CustomStickerRecord(id=" + this.a + ")";
    }
}
