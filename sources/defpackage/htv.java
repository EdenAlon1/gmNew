package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htv {
    public final huh a;
    public final Integer b;

    public htv(huh huhVar, Integer num) {
        this.a = huhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htv)) {
            return false;
        }
        htv htvVar = (htv) obj;
        return ffkj.e(this.a, htvVar.a) && ffkj.e(this.b, htvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.a + ", groupOffset=" + this.b + ')';
    }
}
