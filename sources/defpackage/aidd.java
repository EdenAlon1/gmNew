package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aidd {
    public final String a;
    public final List b;
    public final Pattern c;

    public aidd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aidd)) {
            return false;
        }
        aidd aiddVar = (aidd) obj;
        return ffkj.e(this.a, aiddVar.a) && ffkj.e(this.b, aiddVar.b) && ffkj.e(this.c, aiddVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        return (hashCode * 31) + (pattern == null ? 0 : pattern.hashCode());
    }

    public final String toString() {
        return "BasicSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ")";
    }

    public aidd(String str, List list, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
    }

    public /* synthetic */ aidd(byte[] bArr) {
        this("", ffel.a, null);
    }
}
