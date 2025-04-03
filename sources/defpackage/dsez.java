package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsez {
    public final String a;
    public final int b = 3;

    public dsez(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsez)) {
            return false;
        }
        dsez dsezVar = (dsez) obj;
        if (!ffkj.e(this.a, dsezVar.a)) {
            return false;
        }
        int i = dsezVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 3;
    }

    public final String toString() {
        return "TenorApiConfiguration(apiKey=" + this.a + ", contentFilter=MEDIUM)";
    }
}
