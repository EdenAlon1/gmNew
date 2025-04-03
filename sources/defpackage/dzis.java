package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dzis extends dzrw {
    public final engw a;

    public dzis(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzrw
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzrw) {
            return enkr.h(this.a, ((dzrw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RichText{lines=" + this.a.toString() + "}";
    }
}
