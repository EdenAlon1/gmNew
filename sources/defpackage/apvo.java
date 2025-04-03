package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvo implements apvp {
    public final elfl a;
    public final int b;

    public apvo(elfl elflVar, int i) {
        this.a = elflVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apvo)) {
            return false;
        }
        apvo apvoVar = (apvo) obj;
        return ffkj.e(this.a, apvoVar.a) && this.b == apvoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Loading(future=" + this.a + ", limit=" + this.b + ")";
    }
}
