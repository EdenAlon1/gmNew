package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egkk extends egkq {
    private final emxc a;
    private final emxc b;
    private final int c;

    public egkk(emxc emxcVar, int i, emxc emxcVar2) {
        this.a = emxcVar;
        this.c = i;
        this.b = emxcVar2;
    }

    @Override // defpackage.egkq
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egkq
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.egkq
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egkq) {
            egkq egkqVar = (egkq) obj;
            if (this.a.equals(egkqVar.b()) && this.c == egkqVar.c() && this.b.equals(egkqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "UriResource{uri=" + String.valueOf(this.a) + ", state=" + egdy.a(this.c) + ", event=" + String.valueOf(emxcVar) + "}";
    }
}
