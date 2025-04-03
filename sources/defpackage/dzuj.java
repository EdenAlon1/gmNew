package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuj extends dzvh {
    public final engw a;

    public dzuj(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzvh
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvh) {
            return enkr.h(this.a, ((dzvh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HorizontalLayoutButtons{verticalLayoutButtons=" + this.a.toString() + "}";
    }
}
