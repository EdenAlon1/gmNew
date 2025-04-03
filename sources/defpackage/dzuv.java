package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuv extends dzvx {
    public final String a;
    public final dzvv b;

    public dzuv(String str, dzvv dzvvVar) {
        this.a = str;
        this.b = dzvvVar;
    }

    @Override // defpackage.dzvx
    public final dzvv a() {
        return this.b;
    }

    @Override // defpackage.dzvx
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvx) {
            dzvx dzvxVar = (dzvx) obj;
            if (this.a.equals(dzvxVar.b()) && this.b.equals(dzvxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StandaloneCard{jsonSource=" + this.a + ", stackCard=" + String.valueOf(this.b) + "}";
    }
}
