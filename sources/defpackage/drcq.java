package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcq {
    private final dreh a;

    public drcq(dreh drehVar) {
        this.a = drehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drcq) && ffkj.e(this.a, ((drcq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Identifier(gifStickerMediaIdentifier=" + this.a + ")";
    }
}
