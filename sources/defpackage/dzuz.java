package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuz extends dzwc {
    public final engw a;

    public dzuz(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzwc
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzwc) {
            return enkr.h(this.a, ((dzwc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StackComponent{elements=" + this.a.toString() + "}";
    }
}
