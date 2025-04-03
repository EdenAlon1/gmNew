package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aids {
    public final String a;
    public final Pattern b;

    public aids() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aids)) {
            return false;
        }
        aids aidsVar = (aids) obj;
        return ffkj.e(this.a, aidsVar.a) && ffkj.e(this.b, aidsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Pattern pattern = this.b;
        return hashCode + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "QueryWithHighlightPattern(query=" + this.a + ", highlightPattern=" + this.b + ")";
    }

    public aids(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ aids(byte[] bArr) {
        this("", null);
    }
}
