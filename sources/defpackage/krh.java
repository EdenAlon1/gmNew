package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krh {
    final String a;
    final String b;
    final List c;

    public krh(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krh)) {
            return false;
        }
        krh krhVar = (krh) obj;
        return Objects.equals(this.a, krhVar.a) && Objects.equals(this.b, krhVar.b) && Objects.equals(this.c, krhVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
