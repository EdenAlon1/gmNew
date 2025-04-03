package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aj implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final ac b;
    public final ag c;
    public final ag d;

    public aj(String str, ac acVar, ag agVar, ag agVar2) {
        this.a = str;
        this.b = acVar;
        this.c = agVar;
        this.d = agVar2;
    }

    @Deprecated
    public final int hashCode() {
        ac acVar = this.b;
        return acVar.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        ag agVar = this.c;
        String obj = this.b.toString();
        String concat = agVar == null ? "" : " ".concat(agVar.toString());
        ag agVar2 = this.d;
        String concat2 = agVar2 != null ? " ".concat(agVar2.toString()) : "";
        return this.a + ": " + obj + concat + concat2;
    }
}
