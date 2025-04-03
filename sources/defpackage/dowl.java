package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowl extends dowm {
    public final String a;
    public final Map b;

    public dowl(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dowl)) {
            return false;
        }
        dowl dowlVar = (dowl) obj;
        return ffkj.e(this.a, dowlVar.a) && ffkj.e(this.b, dowlVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Url(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
