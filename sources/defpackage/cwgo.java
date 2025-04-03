package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgo {
    public final String a;
    public final Pattern b;

    public cwgo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwgo)) {
            return false;
        }
        cwgo cwgoVar = (cwgo) obj;
        return ffkj.e(this.a, cwgoVar.a) && ffkj.e(this.b, cwgoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Pattern pattern = this.b;
        return hashCode + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "QueryWithHighlightPattern(query=" + this.a + ", highlightPattern=" + this.b + ")";
    }

    public cwgo(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ cwgo(byte[] bArr) {
        this("", null);
    }
}
