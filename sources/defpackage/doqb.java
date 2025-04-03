package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqb implements doqd, dnmw {
    public final List a;
    private final String b;

    public doqb(String str, List list) {
        this.b = str;
        this.a = list;
    }

    @Override // defpackage.dnmw
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doqb)) {
            return false;
        }
        doqb doqbVar = (doqb) obj;
        return ffkj.e(this.b, doqbVar.b) && ffkj.e(this.a, doqbVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "MultipleLines(id=" + this.b + ", lines=" + this.a + ")";
    }
}
