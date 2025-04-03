package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsf {
    public final String a;
    public final ffix b;

    public dlsf(String str, ffix ffixVar) {
        ffixVar.getClass();
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlsf)) {
            return false;
        }
        dlsf dlsfVar = (dlsf) obj;
        return ffkj.e(this.a, dlsfVar.a) && ffkj.e(this.b, dlsfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibleCallback(onClickDescription=" + this.a + ", onClick=" + this.b + ")";
    }
}
