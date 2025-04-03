package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkf extends elkr {
    public final fgrq a;
    public final boolean b;
    private final ecda c;

    public elkf(fgrq fgrqVar, ecda ecdaVar, boolean z) {
        this.a = fgrqVar;
        this.c = ecdaVar;
        this.b = z;
    }

    @Override // defpackage.elkr
    public final ecda a() {
        return this.c;
    }

    @Override // defpackage.elkr
    public final fgrq b() {
        return this.a;
    }

    @Override // defpackage.elkr
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elkr) {
            elkr elkrVar = (elkr) obj;
            if (this.a.equals(elkrVar.b()) && this.c.equals(elkrVar.a()) && this.b == elkrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConvertedTraceRecordWithMetadata{traceRecord=" + this.a.toString() + ", eventName=" + this.c.a + ", isEmpty=" + this.b + "}";
    }
}
