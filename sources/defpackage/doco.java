package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doco implements docq {
    private final docy a;

    public doco(docy docyVar) {
        this.a = docyVar;
    }

    @Override // defpackage.docq
    public final docy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doco) && ffkj.e(this.a, ((doco) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalRichCardMedia(media=" + this.a + ")";
    }
}
