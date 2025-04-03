package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdw {
    public final String a;
    public final List b;
    public final Pattern c;

    public cwdw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwdw)) {
            return false;
        }
        cwdw cwdwVar = (cwdw) obj;
        return ffkj.e(this.a, cwdwVar.a) && ffkj.e(this.b, cwdwVar.b) && ffkj.e(this.c, cwdwVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        return (hashCode * 31) + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "BasicSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ")";
    }

    public cwdw(String str, List list, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
    }

    public /* synthetic */ cwdw(byte[] bArr) {
        this("", ffel.a, null);
    }
}
