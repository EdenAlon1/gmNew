package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowk extends dowm {
    public final String a;
    private final String b = null;

    public dowk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dowk)) {
            return false;
        }
        dowk dowkVar = (dowk) obj;
        if (!ffkj.e(this.a, dowkVar.a)) {
            return false;
        }
        String str = dowkVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Data(data=" + this.a + ", baseUrl=null)";
    }
}
