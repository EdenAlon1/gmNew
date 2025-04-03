package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apnf extends apok {
    private final engw a;

    public apnf(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.appy
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apok) {
            return enkr.h(this.a, ((apok) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BugleTombstoneContent{lines=" + this.a.toString() + "}";
    }
}
