package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlx implements ellf {
    public final String a;
    public final esgx b;

    public wlx(String str, esgx esgxVar) {
        this.a = str;
        this.b = esgxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlx)) {
            return false;
        }
        wlx wlxVar = (wlx) obj;
        return ffkj.e(this.a, wlxVar.a) && this.b == wlxVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MagicRewriteToneClickEvent(draft=" + this.a + ", tone=" + this.b + ")";
    }
}
