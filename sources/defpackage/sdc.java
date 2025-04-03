package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdc extends sdh {
    private final engw a;

    public sdc(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.sdh
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdh) {
            return enkr.h(this.a, ((sdh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SmartReplyRequest{messages=" + this.a.toString() + "}";
    }
}
