package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amtc {
    private final amtd a;
    private final cjeb b;

    public amtc(amtd amtdVar, cjeb cjebVar) {
        amtdVar.getClass();
        this.a = amtdVar;
        this.b = cjebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amtc)) {
            return false;
        }
        amtc amtcVar = (amtc) obj;
        return this.a == amtcVar.a && ffkj.e(this.b, amtcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cjeb cjebVar = this.b;
        return hashCode + (cjebVar == null ? 0 : cjebVar.hashCode());
    }

    public final String toString() {
        return "PalModeData(state=" + this.a + ", geminiConversationId=" + this.b + ")";
    }

    public /* synthetic */ amtc(amtd amtdVar) {
        this(amtdVar, null);
    }
}
