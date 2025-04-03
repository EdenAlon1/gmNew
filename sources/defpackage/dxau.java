package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxau extends dxbe {
    private final dwqw a;

    public dxau(dwqw dwqwVar) {
        this.a = dwqwVar;
    }

    @Override // defpackage.dxbe
    public final dwqw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxbe) {
            return this.a.equals(((dxbe) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "InlineDownloadParams{inlineFileContent=" + this.a.toString() + "}";
    }
}
