package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aidr {
    public final String a;
    public final List b;
    public final Pattern c;
    public final ecri d;

    public aidr() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aidr)) {
            return false;
        }
        aidr aidrVar = (aidr) obj;
        return ffkj.e(this.a, aidrVar.a) && ffkj.e(this.b, aidrVar.b) && ffkj.e(this.c, aidrVar.c) && ffkj.e(this.d, aidrVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        int hashCode2 = ((hashCode * 31) + (pattern == null ? 0 : pattern.hashCode())) * 31;
        ecri ecriVar = this.d;
        return hashCode2 + (ecriVar != null ? ecriVar.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ", timer=" + this.d + ")";
    }

    public aidr(String str, List list, Pattern pattern, ecri ecriVar) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
        this.d = ecriVar;
    }

    public /* synthetic */ aidr(byte[] bArr) {
        this("", ffel.a, null, null);
    }
}
